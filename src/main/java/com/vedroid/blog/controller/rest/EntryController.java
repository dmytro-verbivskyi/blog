package com.vedroid.blog.controller.rest;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.dto.EntryListOutDTO;
import com.vedroid.blog.dto.EntryOutDTO;
import com.vedroid.blog.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Service
@Path("/entry")
public class EntryController {

    private static int i = 0;

    @Autowired
    private EntryService entryService;

    @GET
    @Path("/create")
    public EntryOutDTO create() {
        Entry e = new Entry();
        e.setName("someName " + i++);
        e = entryService.create(e);

        return EntryOutDTO.convert(e);
    }

    @GET
    @Path("/findAll")
    public EntryListOutDTO findAll() {
        List<Entry> list = entryService.findAll();
        return EntryListOutDTO.convert(list);
    }

}
