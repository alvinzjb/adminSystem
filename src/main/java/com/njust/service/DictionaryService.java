package com.njust.service;

import com.njust.pojo.Dictionary;

import java.util.List;

public interface DictionaryService {
    public List<Dictionary> selectDictionaryByTypeCode(String typeCode);
}
