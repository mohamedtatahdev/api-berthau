package com.berthaudiere.berthau.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berthaudiere.berthau.data.entity.ActivitySheetEntity;

@Repository
public interface ActivitySheetRepository extends JpaRepository<ActivitySheetEntity, Long> {

}
