package com.agrosupport.api.appointment.infrastructure.persistence.jpa.repositories;

import com.agrosupport.api.appointment.domain.model.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByAdvisor_Id(Long advisorId);
    List<Review> findByFarmer_Id(Long farmerId);
    Optional<Review> findByAdvisor_IdAndFarmer_Id(Long advisorId, Long farmerId);
}
