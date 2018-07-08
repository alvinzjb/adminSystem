package com.njust.mapper;

import com.njust.pojo.SystemInfo;
import com.njust.pojo.SystemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInfoMapper {
    int countByExample(SystemInfoExample example);

    int deleteByExample(SystemInfoExample example);

    int deleteByPrimaryKey(Long trainOnlyid);

    int insert(SystemInfo record);

    int insertSelective(SystemInfo record);

    List<SystemInfo> selectByExample(SystemInfoExample example);

    SystemInfo selectByPrimaryKey(Long trainOnlyid);

    int updateByExampleSelective(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByExample(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByPrimaryKeySelective(SystemInfo record);

    int updateByPrimaryKey(SystemInfo record);
}