package ru.leonid.springCrudApp.files.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.leonid.springCrudApp.files.entities.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
