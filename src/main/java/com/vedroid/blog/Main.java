package com.vedroid.blog;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.service.EntryService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();

        EntryService entryService = ctx.getBean(EntryService.class);

        Entry contact = new Entry();
        contact.setName("Michael");

        entryService.create(contact);

        List<Entry> entries = entryService.findAll();
        if (entries.size() != 1) {
            throw new Exception("RED ALERT");
        }
    }
}
