package com.vedroid.blog.util;

import com.vedroid.blog.repository.EntryRepository;
import com.vedroid.blog.service.EntryService;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:/app-context.xml"})
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class InMemoryDBTest {

    @Autowired
    protected EntryRepository entryRepository;

    @Autowired
    protected EntryService entryService;

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {
        entryRepository.deleteAllFromTable();
    }
}
