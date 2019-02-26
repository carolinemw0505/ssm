package com.spring.model;

import java.io.Serializable;
import java.util.Objects;

public class Result implements Serializable {
    private int resultCode=0;

    private String result1="";

    private String message="";

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getResult1() {
        return result1;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result1 = (Result) o;
        return getResultCode() == result1.getResultCode() &&
                Objects.equals(getResult1(), result1.getResult1()) &&
                Objects.equals(getMessage(), result1.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResultCode(), getResult1(), getMessage());
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", result1='" + result1 + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}