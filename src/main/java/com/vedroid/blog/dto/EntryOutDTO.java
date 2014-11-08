package com.vedroid.blog.dto;

import com.vedroid.blog.domain.Entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "entry")
public class EntryOutDTO {

    private Long id;

    private String name;

    public static EntryOutDTO convert(Entry e) {
        EntryOutDTO out = new EntryOutDTO();
        out.setId(e.getId());
        out.setName(e.getName());
        return out;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
