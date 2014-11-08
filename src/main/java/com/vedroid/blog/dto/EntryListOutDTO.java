package com.vedroid.blog.dto;

import com.vedroid.blog.domain.Entry;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "entryList")
public class EntryListOutDTO {

    private List<EntryOutDTO> outDTOs = new ArrayList<>();

    public List<EntryOutDTO> getOutDTOs() {
        return outDTOs;
    }

    public void setOutDTOs(List<EntryOutDTO> outDTOs) {
        this.outDTOs = outDTOs;
    }

    public static EntryListOutDTO convert(List<Entry> list) {
        List<EntryOutDTO> outList = new ArrayList<>();

        for (Entry e : list) {
            outList.add(EntryOutDTO.convert(e));
        }

        EntryListOutDTO result = new EntryListOutDTO();
        result.setOutDTOs(outList);
        return result;
    }
}
