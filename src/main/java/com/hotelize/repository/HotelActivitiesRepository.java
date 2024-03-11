package com.hotelize.repository;

import com.hotelize.domain.HotelActivities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelActivitiesRepository extends JpaRepository<HotelActivities, Long> {
}
