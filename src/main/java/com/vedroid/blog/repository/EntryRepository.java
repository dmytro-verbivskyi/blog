package com.vedroid.blog.repository;

import com.vedroid.blog.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface EntryRepository extends JpaRepository<Entry, Long> {
    String dbName = "Entry"; // className must be equals to com.vedroid.blog.domain.Entry

    @Modifying
    @Transactional
    @Query("DELETE FROM " + dbName)
    void deleteAllFromTable();
}
