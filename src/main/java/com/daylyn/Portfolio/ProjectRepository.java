package com.daylyn.Portfolio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // That's it! JpaRepository gives us findAll(), save(), delete(), etc. for free
}