package com.blp.addressbook;

class Contacts {
    private String firstName = " ";
    private String lastName = " ";
    private String address = " ";
    private String city = " ";
    private String state = " ";
    private int zip = 0;
    private long mobNum = 0;
    private String emailId = " ";

    Contacts(String firstName, String lastName, String address, String city, String state, int zip, long mobNum, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobNum = mobNum;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getMobNum() {
        return mobNum;
    }

    public void setMobNum(long mobNum) {
        this.mobNum = mobNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String toString() {
        String contactDetails = firstName + lastName + address + city + state + zip + mobNum + emailId;
        return contactDetails;
    }

    void display() {
        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);
        System.out.println("Address = " + address);
        System.out.println("City = " + city);
        System.out.println("State = " + state);
        System.out.println("Zip = " + zip);
        System.out.println("Mobile number = " + mobNum);
        System.out.println("Email-Id = " + emailId);
    }
}
