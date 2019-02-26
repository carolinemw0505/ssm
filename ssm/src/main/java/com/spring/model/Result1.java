package com.spring.model;

import java.io.Serializable;
import java.util.Objects;

public class Result1 implements Serializable {
    private int resultCode=0;

    private String message="";

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "Result1{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}