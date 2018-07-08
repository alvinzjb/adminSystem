package com.njust.controller;

import com.njust.pojo.Customer;
import com.njust.pojo.Dictionary;
import com.njust.service.CustomerService;
import com.njust.service.DictionaryService;
import com.njust.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
    //依赖注入
    @Autowired
    private CustomerService customerService;
    @Autowired
    private DictionaryService dictionaryService;
    @RequestMapping("/list.action")
    public String CustomerList(@RequestParam(defaultValue ="1") Integer page,
                               @RequestParam(defaultValue = "5") Integer rows,
                               @RequestParam String custName,
                               @RequestParam String custSource,
                               @RequestParam String custIndustry,
                               @RequestParam String custLevel,Model model) {
        Page<Customer> customerPage = customerService.selectCustomerList(page, rows, custName, custSource, custIndustry, custLevel);
        model.addAttribute("customerPage", customerPage);
        //客户来源下拉框
        List<Dictionary> fromType =  dictionaryService.selectDictionaryByTypeCode("002");
        //客户公司下拉框
        List<Dictionary> industryType =  dictionaryService.selectDictionaryByTypeCode("001");
        //客户级别下拉框
        List<Dictionary> levelType =  dictionaryService.selectDictionaryByTypeCode("006");
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);
        return "customer";
    }

}
