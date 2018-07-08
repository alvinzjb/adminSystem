package com.njust.serviceImpl;

import com.njust.mapper.DictionaryMapper;
import com.njust.pojo.Dictionary;
import com.njust.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private  DictionaryMapper dictionaryMapper;
    public List<Dictionary> selectDictionaryByTypeCode(String typeCode) {
        List<Dictionary> dictionaries = dictionaryMapper.selectBaseDictionary(typeCode);
        return dictionaries ;
    }
}
