package com.arms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arms.domain.entity.Micropost;

@Repository
public interface MicropostRepository extends JpaRepository<Micropost, Integer> {
	
}