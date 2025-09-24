package com.agrosupport.api.post.infrastructure.persistence.jpa.repositories;

import com.agrosupport.api.post.domain.model.aggregates.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAdvisor_Id(Long advisorId);
    List<Post> findAllByOrderByUpdatedAtDesc();
}
