package com.statickev.financeappdemo.Entity;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private Image profilePicture;
    private final Wallet wallet;
    private double target;
    private String quotes;
    private final ArrayList<YearlyReport> userReports;

    public User(String firstName, String lastName, Image profilePicture, double target, String quotes) {
        setFirstName(firstName);
        setLastName(lastName);
        setProfilePicture(profilePicture);
        setTarget(target);
        setQuotes(quotes);
        wallet = new Wallet();
        userReports = new ArrayList<YearlyReport>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.length() == 0) throw new IllegalArgumentException("Name can't be empty!");
        else if (firstName.contains(" ")) throw new IllegalArgumentException("First name can't contain whitespace!");
        else this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException{
        if (firstName.length() == 0) throw new IllegalArgumentException("Name can't be empty!");
        else if (lastName.contains(" ")) throw new IllegalArgumentException("First name can't contain whitespace!");
        else this.lastName = lastName;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        if (profilePicture == null) this.profilePicture = new Image("/Assets/Images/Image_defaultProfile.png");
        this.profilePicture = profilePicture;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) throws IllegalArgumentException{
        if (target <= 0) throw new IllegalArgumentException("Target must be greater than 0!");
        else this.target = target;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

}
