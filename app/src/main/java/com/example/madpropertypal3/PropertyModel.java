package com.example.madpropertypal3;

public class PropertyModel {
    private int id;
    private String propertyName;
    private String propertyType;
    private String propertyLeaseType;
    private String propertyLocation;
    private String propertySize;
    private String propertyAmenities;
    private String propertyDescription;
    private String propertyBedrooms;
    private String propertybathrooms;
    private String propertyPrice;
    private String propertyDoors;
    private String propertyWindows;



    public PropertyModel() {
    }

    public PropertyModel(int id, String propertyName, String propertyType, String propertyLeaseType, String propertyLocation, String propertySize, String propertyAmenities, String propertyDescription, String propertyBedrooms, String propertybathrooms , String propertyPrice, String propertyDoors, String propertyWindows) {
        this.id = id;
        this.propertyName = propertyName;
        this.propertyType = propertyType;
        this.propertyLeaseType = propertyLeaseType;
        this.propertyLocation = propertyLocation;
        this.propertySize = propertySize;
        this.propertyAmenities = propertyAmenities;
        this.propertyDescription = propertyDescription;
        this.propertyBedrooms = propertyBedrooms;
        this.propertybathrooms = propertybathrooms;
        this.propertyPrice = propertyPrice;
        this.propertyDoors = propertyDoors;
        this.propertyWindows = propertyWindows;
    }

    @Override
    public String toString() {
        return "PropertyModel{" +
                "id=" + id +
                ", propertyName='" + propertyName + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", propertyLeaseType='" + propertyLeaseType + '\'' +
                ", propertyLocation='" + propertyLocation + '\'' +
                ", propertySize='" + propertySize + '\'' +
                ", propertyAmenities='" + propertyAmenities + '\'' +
                ", propertyDescription='" + propertyDescription + '\'' +
                ", propertyBedrooms=" + propertyBedrooms +
                ", propertybathrooms=" + propertybathrooms +
                ", propertyPrice=" + propertyPrice +
                ", propertyDoors=" + propertyDoors +
                ", propertyWindows=" + propertyWindows +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyLeaseType() {
        return propertyLeaseType;
    }

    public void setPropertyLeaseType(String propertyLeaseType) {
        this.propertyLeaseType = propertyLeaseType;
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public String getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(String propertySize) {
        this.propertySize = propertySize;
    }

    public String getPropertyAmenities() {
        return propertyAmenities;
    }

    public void setPropertyAmenities(String propertyAmenities) {
        this.propertyAmenities = propertyAmenities;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public String getPropertyBedrooms() {
        return propertyBedrooms;
    }

    public void setPropertyBedrooms(String propertyBedrooms) {
        this.propertyBedrooms = propertyBedrooms;
    }

    public String getPropertybathrooms() {
        return propertybathrooms;
    }

    public void setPropertybathrooms(String propertybathrooms) {
        this.propertybathrooms = propertybathrooms;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getPropertyDoors() {
        return propertyDoors;
    }

    public void setPropertyDoors(String propertyDoors) {
        this.propertyDoors = propertyDoors;
    }

    public String getPropertyWindows() {
        return propertyWindows;
    }

    public void setPropertyWindows(String propertyWindows) {
        this.propertyWindows = propertyWindows;
    }
}
