package com.jpatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jpatest.model.Test;

@Component
public interface TestRepository extends JpaRepository<Test, Long> {

}
