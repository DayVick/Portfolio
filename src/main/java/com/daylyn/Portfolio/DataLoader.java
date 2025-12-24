package com.daylyn.Portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    @Override
    public void run(String... args) throws Exception {
        // Clear existing data
        projectRepository.deleteAll();
        
        // Add sample projects
        projectRepository.save(new Project(
            "Portfolio Website",
            "Full-stack portfolio site built with Java Spring Boot and React",
            "Java, Spring Boot, React, AWS",
             "https://github.com/DayVick/portfolio"
        ));
        
        System.out.println("Sample data loaded!");
    }
}