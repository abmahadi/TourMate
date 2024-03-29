package com.anik.example.tourmate.ModelClass;

public class User {
    private String userName;
    private String userEmail;
    private String userProfileImage;
    private String userCoverImage;
    private int userTotalTours;
    private String userLocation;

    public User() {
    }

    public User(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public User(String userName, String userEmail, String userProfileImage, String userCoverImage) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userProfileImage = userProfileImage;
        this.userCoverImage = userCoverImage;
    }

    public User(String userName, String userEmail, String userProfileImage, String userCoverImage, int userTotalTours) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userProfileImage = userProfileImage;
        this.userCoverImage = userCoverImage;
        this.userTotalTours = userTotalTours;
    }

    public User(String userName, String userEmail, String userProfileImage, String userCoverImage, int userTotalTours, String userLocation) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userProfileImage = userProfileImage;
        this.userCoverImage = userCoverImage;
        this.userTotalTours = userTotalTours;
        this.userLocation = userLocation;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public String getUserCoverImage() {
        return userCoverImage;
    }

    public int getUserTotalTours() {
        return userTotalTours;
    }

    public String getUserLocation() {
        return userLocation;
    }
}
