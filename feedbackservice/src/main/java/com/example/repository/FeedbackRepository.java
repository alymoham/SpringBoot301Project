package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import com.example.entity.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long>{

}
