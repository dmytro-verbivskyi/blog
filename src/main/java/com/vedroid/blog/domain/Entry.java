package com.vedroid.blog.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ENTRIES")
@SequenceGenerator(initialValue = 1, name = "idgen", sequenceName = "entityentriesseq")
public class Entry extends Identifiable {

    @Basic
    @Column(name = "NAME", nullable = false)
    @NotNull()
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
