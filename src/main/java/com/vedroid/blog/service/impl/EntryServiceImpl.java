package com.vedroid.blog.service.impl;

import com.vedroid.blog.domain.Entry;
import com.vedroid.blog.exception.BlogException;
import com.vedroid.blog.exception.EntryNotFoundException;
import com.vedroid.blog.repository.EntryRepository;
import com.vedroid.blog.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntryServiceImpl extends BasicService implements EntryService {

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

    @Override
    public Entry findEntry(Long id) throws BlogException {
        Entry e = entryRepository.findOne(id);
        if (e == null) {
            throw new EntryNotFoundException(msg, id);
        }
        return e;
    }

}
