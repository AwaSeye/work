package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.Role;
import io.work.MapJeunesse.utils.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
