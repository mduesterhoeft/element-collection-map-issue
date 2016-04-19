package com.example;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Embeddable
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AttributeValue {

    @NonNull
    private String name;
}
