package com.ufrest;

import java.io.Serializable;

public class ResponseObject implements Serializable {
    private boolean success;
    private int responseCode;
    private Object data;
    private String message;

    public ResponseObject(boolean success, int responseCode, Object data, String message) {
        this.success = success;
        this.responseCode = responseCode;
        this.data = data;
        this.message = message;

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
