package com.coursework.courceworksciencepublications.repository;

import com.coursework.courceworksciencepublications.model.entity.ThemeOfPublication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeOfPublicationRepository extends JpaRepository<ThemeOfPublication, Long> {
}
