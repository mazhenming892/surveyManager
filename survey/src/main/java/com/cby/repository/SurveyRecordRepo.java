package com.cby.repository;

import com.cby.entity.SurveyRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ma on 2017/6/20.
 */
public interface SurveyRecordRepo extends JpaRepository<SurveyRecord,Integer>{
    public List<SurveyRecord> findByUserId(String userId);
}
