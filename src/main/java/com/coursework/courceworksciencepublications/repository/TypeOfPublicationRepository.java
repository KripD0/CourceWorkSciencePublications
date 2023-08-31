package com.coursework.courceworksciencepublications.repository;

import com.coursework.courceworksciencepublications.model.entity.TypeOfPublication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfPublicationRepository extends JpaRepository<TypeOfPublication, Long> {
}
