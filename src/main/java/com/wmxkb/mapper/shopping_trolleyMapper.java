package com.wmxkb.mapper;


import com.wmxkb.entity.shopping_trolley;
import com.wmxkb.entity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 让springboot识别为mapper
@Mapper
public interface shopping_trolleyMapper {
    // 方法名要和xml文件id一致
    public int add(String waterType, Double price, Integer count , String userid);

    public shopping_trolley selectBywaterType(String waterType);

    public int updateCount(Integer count, String waterType, String userid);

    public List<shopping_trolley> selectByUserid(String userid);

    public int deleteItem(String waterType, String userid);

    public int deleteAll(String userid);
}
