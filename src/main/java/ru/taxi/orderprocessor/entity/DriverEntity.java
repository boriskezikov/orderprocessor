package ru.taxi.orderprocessor.entity;

public class DriverEntity extends BaseEntity {

    private String firstName;
    private String secondName;

    private String licenseNumber;
    private Integer drivingExp;

    private DriverStatus status;
    private CarEntity car;

    private boolean terminated;

    public enum DriverStatus {
        FREE, ORDER_IN_PROGRESS, OFFLINE
    }


}
