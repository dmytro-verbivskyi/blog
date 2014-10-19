package com.vedroid.blog.service;

import com.vedroid.blog.domain.Entry;

import java.util.List;

public interface EntryService {

    public List<Entry> findAll();

    Entry create(Entry input);
}
