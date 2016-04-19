package com.example;

import static lombok.AccessLevel.PRIVATE;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Embeddable
@RequiredArgsConstructor
@NoArgsConstructor(access = PRIVATE)
@Data
public class AttributeValue {

    //private String id = UUID.randomUUID().toString();

    @NonNull
    private String name;
}
