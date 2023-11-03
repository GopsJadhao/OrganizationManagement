package com.OrganizationManagement.repository;

import com.OrganizationManagement.entity.SubOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuborganizationRepository extends JpaRepository<SubOrganization, Long> {
}
