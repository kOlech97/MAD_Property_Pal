package com.example.madpropertypal3;

public class ReportModel {
    private int id;
    private String day, month, year, interest, offerPrice, expiryDay, expiryMonth, expiryYear, conditions, comments;

    //constructors


    public ReportModel() {
    }

    public ReportModel(int id, String day, String month, String year, String interest, String offerPrice, String expiryDay, String expiryMonth, String expiryYear, String conditions, String comments) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.interest = interest;
        this.offerPrice = offerPrice;
        this.expiryDay = expiryDay;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.conditions = conditions;
        this.comments = comments;

    }
    //tostring

    @Override
    public String toString() {
        return "ReportModel{" +
                "id=" + id +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", interest='" + interest + '\'' +
                ", offerPrice='" + offerPrice + '\'' +
                ", expiryDay='" + expiryDay + '\'' +
                ", expiryMonth='" + expiryMonth + '\'' +
                ", expiryYear='" + expiryYear + '\'' +
                ", conditions='" + conditions + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }





    //getts and setts


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getExpiryDay() {
        return expiryDay;
    }

    public void setExpiryDay(String expiryDay) {
        this.expiryDay = expiryDay;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


}
