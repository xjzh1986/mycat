package com.example.demo.mapper;

import com.example.demo.entity.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
}