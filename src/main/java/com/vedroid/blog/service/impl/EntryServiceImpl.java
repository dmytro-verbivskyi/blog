package com.vedroid.blog.service.impl;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.repository.EntryRepository;
import com.vedroid.blog.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Override
    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    @Override
    public Entry create(Entry input) {
        return entryRepository.save(input);
    }

}
