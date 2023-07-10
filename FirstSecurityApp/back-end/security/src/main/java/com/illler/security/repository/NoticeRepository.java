package com.illler.security.repository;

import com.illler.security.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

    @Query(value = "SELECT n FROM Notice n WHERE CURRENT_DATE BETWEEN n.noticeBegDt AND n.noticeEndDt")
    List<Notice> findAllActiveNotices();

}
