package com.njust.service;

import com.njust.QueryVO.CustomerVO;
import com.njust.pojo.Customer;
import com.njust.utils.Page;

public interface CustomerService {
    public Page<Customer> selectCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);

}
