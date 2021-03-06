package com.hcl.activity.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.activity.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer>{
	List<Activity> findAllByCode(Integer code);
}
