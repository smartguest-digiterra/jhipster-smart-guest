package com.digiterra.jhipstersmartguest.repository;

import com.digiterra.jhipstersmartguest.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
