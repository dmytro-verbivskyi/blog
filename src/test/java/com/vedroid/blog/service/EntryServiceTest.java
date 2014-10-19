package com.vedroid.blog.service;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.util.InMemoryDBTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EntryServiceTest extends InMemoryDBTest {

    @Test
    public void firstTest() {
        String testName = "Michael";
        Entry contact = new Entry();
        contact.setName(testName);

        entryService.create(contact);

        List<Entry> entries = entryService.findAll();
        Assert.assertNotNull(entries);
        Assert.assertEquals(1, entries.size());
        Assert.assertEquals(testName, entries.get(0).getName());
    }

}
