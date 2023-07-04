package com.illler.security.repository;

import com.illler.security.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

    @Query(value = "from Notice n where curdate() between noticBegDt and noticEndDt", nativeQuery = true)
    List<Notice> findAllActiveNotices();
}
