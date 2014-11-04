package com.vedroid.blog.exception;

import com.vedroid.blog.utils.MessageHelper;

public class BlogException extends Exception {

    protected String messageCode;

    public BlogException() {

    }

    public BlogException(MessageHelper msg, String code, Object[] objects) {
        super(msg.getMessage(code, objects));
        this.messageCode = code;
    }

    public String getMessageCode() {
        return messageCode;
    }
}
