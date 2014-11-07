package com.vedroid.blog.service;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.exception.BlogException;

import java.util.List;

public interface EntryService {

    List<Entry> findAll();

    Entry create(Entry input);

    Entry findEntry(Long id) throws BlogException;

}
