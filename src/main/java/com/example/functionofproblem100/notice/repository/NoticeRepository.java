package com.example.functionofproblem100.notice.repository;

import com.example.functionofproblem100.notice.entity.Notice;
import com.example.functionofproblem100.notice.model.NoticeDeleteInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Optional<List<Notice>> findByIdIn(List<Long> idList);
}
