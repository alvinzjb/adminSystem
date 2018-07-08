package com.njust.serviceImpl;

import com.njust.QueryVO.CustomerVO;
import com.njust.mapper.CustomerMapper;
import com.njust.pojo.Customer;
import com.njust.service.CustomerService;
import com.njust.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    //依赖注入
    @Autowired
    private CustomerMapper customerMapper;
    public Page<Customer> selectCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel) {
            //根据封装的信息进行用户的插查询
        CustomerVO customervo = new CustomerVO();
        //判断用户名称
        if(custName!=null){
            customervo.setCustName(custName);
        }
        //判断用户级别
        if(custLevel!=null){
            customervo.setCustLevel(custLevel);
        }
        //判断用户公司
        if(custIndustry!=null){
            customervo.setCustIndustry(custIndustry);
        }
        //判断用来源
        if(custSource!=null){
            customervo.setCustSource(custSource);
        }
        //当前页
         customervo.setStart((page-1)*rows);
        //每页数
        customervo.setRows(rows);
        //查询用户总信息数
        List<Customer> customers = customerMapper.selectAllCustomer(customervo);
        //查询用户总条数
        Integer count = customerMapper.selectCustomerListCount(customervo);
     Page<Customer>  result = new Page<Customer>();
         result.setPage(page);
         result.setRows(customers);
         result.setSize(rows);
         result.setTotal(count);
        return result;
    }
}
