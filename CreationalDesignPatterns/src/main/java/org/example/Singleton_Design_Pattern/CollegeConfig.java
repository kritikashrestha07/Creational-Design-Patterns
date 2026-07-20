package org.example.Singleton_Design_Pattern;

public class CollegeConfig {

    private static CollegeConfig instance;

    private String collegeName;
    private String systemVersion;

    private CollegeConfig() {
        this.collegeName = "ABC College";
        this.systemVersion = "1.0";
    }

    public static CollegeConfig getInstance() {
        if (instance == null) {
            instance = new CollegeConfig();
        }
        return instance;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}
