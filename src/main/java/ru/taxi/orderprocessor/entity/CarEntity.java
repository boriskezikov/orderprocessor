package ru.taxi.orderprocessor.entity;

import ru.taxi.orderprocessor.enums.PriorityClass;

public class CarEntity extends BaseEntity {

    private String model;

    private String number;

    private String color;

    private PriorityClass carClass;

}
