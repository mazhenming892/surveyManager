package com.cby.repository;

import com.cby.entity.MyBonus;
import com.cby.entity.MyPoint;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ma on 2017/6/6.
 */
public interface MyBonusRepository extends JpaRepository<MyBonus,Integer> {
    public MyBonus findByUserId(String userId);
}
