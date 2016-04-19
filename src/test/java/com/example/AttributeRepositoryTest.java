package com.example;

import static org.assertj.core.api.BDDAssertions.then;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AttributeRepositoryTest {

    @Autowired
    private AttributeRepository attributeRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void should_persist_attribute_with_same_value() {
        Attribute name = new Attribute("name");

        name.getAttributes().put(1, new AttributeValue("1"));
        name.getAttributes().put(2, new AttributeValue("2"));

        name = attributeRepository.saveAndFlush(name);

        name.getAttributes().put(3, new AttributeValue("2"));
        name.getAttributes().put(4, new AttributeValue("4"));

        name = attributeRepository.saveAndFlush(name);

        entityManager.clear();

        then(attributeRepository.findOne(name.getId()).getAttributes()).hasSize(4);
    }
}