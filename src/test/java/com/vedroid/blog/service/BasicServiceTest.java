package com.vedroid.blog.service;

import com.vedroid.blog.exception.EntryNotFoundException;
import com.vedroid.blog.util.InMemoryDBTest;
import org.junit.Assert;
import org.junit.Test;

public class BasicServiceTest extends InMemoryDBTest {

    @Test
    public void messagesAvailable() {
        String m = msg.getMessage(EntryNotFoundException.class.getName());
        Assert.assertEquals("Entry with id: {0} not found.", m);
    }

    @Test
    public void checkExceptionMessageAndCode() {
        EntryNotFoundException e = new EntryNotFoundException(msg, 77L);

        Assert.assertEquals("com.vedroid.blog.exception.EntryNotFoundException", e.getMessageCode());
        Assert.assertEquals("Entry with id: 77 not found.", e.getMessage());
    }

    @Test
    public void messageNotFound() {
        String m = msg.getMessage("noneExistingMessage");
        Assert.assertEquals("Message by code:[noneExistingMessage] was not found in your locale properties file.", m);
    }

}
