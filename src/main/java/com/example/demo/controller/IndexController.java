package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.TbUser;
import com.example.demo.entity.TbUserReq;
import com.example.demo.service.TbUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tbUser")
public class IndexController {
    @Autowired
    TbUserService tbUserService;

    @RequestMapping(value="/selectAll",method= RequestMethod.POST)
    @ResponseBody
    public PageInfo<TbUser> selectAll(@RequestBody TbUserReq tbUserReq){
        PageInfo<TbUser> pageInfo = tbUserService.selectAll(tbUserReq);
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println("jsonString:" + jsonString);
        return pageInfo;
    }

    @RequestMapping(value="/insert",method= RequestMethod.POST)
    @ResponseBody
    public int insert(TbUser tbUser){
        return tbUserService.insert(tbUser);
    }

}
