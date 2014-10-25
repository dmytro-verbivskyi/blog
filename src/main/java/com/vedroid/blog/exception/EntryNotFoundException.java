package com.vedroid.blog.exception;

import com.vedroid.blog.utils.MessageHelper;

public class EntryNotFoundException extends BlogException {

    public EntryNotFoundException(MessageHelper msg, Long requestedId) {
        super(msg, EntryNotFoundException.class.getName(), new Object[] {requestedId});
    }
}
