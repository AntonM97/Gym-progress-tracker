package cc.hiknomore.gym_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.hiknomore.gym_progress.model.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
    Optional<Person> findByEmail(String email);
}