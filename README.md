Reproduce issue with lost updates on maps with ElementCollections using eclipselink.

See failing test in `AttributeRepositoryTest.should_persist_attribute_with_same_value` on eclipselink branch.

`hibernate` branch shows that this use case is working using hibernate.

http://stackoverflow.com/questions/36720969/eclipselink-jpa-update-entity-with-embeddedcollection-and-map-does-not-insert
