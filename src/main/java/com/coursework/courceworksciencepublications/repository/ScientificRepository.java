package com.coursework.courceworksciencepublications.repository;

import com.coursework.courceworksciencepublications.model.entity.Scientific;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScientificRepository extends JpaRepository<Scientific, Long> {
}