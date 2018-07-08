package com.njust.mapper;

import com.njust.QueryVO.CustomerVO;
import com.njust.pojo.Customer;
import com.njust.pojo.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    //按条件进行查询，查询用户信息
    List<Customer> selectAllCustomer(CustomerVO customervo);
    //按条件进行查询，查询用户总数
    Integer selectCustomerListCount(CustomerVO customervo);
}