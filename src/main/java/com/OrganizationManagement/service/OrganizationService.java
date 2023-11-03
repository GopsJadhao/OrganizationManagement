package com.OrganizationManagement.service;

import com.OrganizationManagement.entity.Organization;
import com.OrganizationManagement.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization getOrganizationById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization updateOrganization(Long id, Organization organization) {
        if (organizationRepository.existsById(id)) {
            organization.setId(id);
            return organizationRepository.save(organization);
        }
        return null; // Handle error or throw an exception
    }

    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}
