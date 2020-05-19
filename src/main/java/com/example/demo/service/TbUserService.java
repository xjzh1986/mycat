package com.example.demo.service;


import com.example.demo.entity.TbUser;
import com.example.demo.entity.TbUserReq;
import com.example.demo.mapper.TbUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class TbUserService {
    @Autowired
    TbUserMapper tbUserMapper;

    public int insert(TbUser tbUser){
        return tbUserMapper.insert(tbUser);
    }

    public TbUser selectByPrimaryKey(Long id){
        return tbUserMapper.selectByPrimaryKey(id);
    }

    public PageInfo<TbUser> selectAll(TbUserReq tbUserReq){

        PageHelper.startPage(tbUserReq.getPageNumber(),tbUserReq.getPageSize());
        List<TbUser> list = tbUserMapper.selectAll();
        PageInfo<TbUser> pageInfo = new PageInfo<TbUser>(list);
        return pageInfo;
    }


}
