package com.hotelize.repository;

import com.hotelize.domain.HotelPromotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelPromotionRepository extends JpaRepository<HotelPromotion, Long> {
}
