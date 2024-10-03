package com.example.st_reg.enums;

public enum Departments {
    CSE("1", "Computer"),
    EEE("2", "Electrical"),
    BBA("3", "Business");

    private String code;
    private String fullName;

    Departments(String code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }
}
