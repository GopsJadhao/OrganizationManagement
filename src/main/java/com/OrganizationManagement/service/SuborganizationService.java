package com.OrganizationManagement.service;

import com.OrganizationManagement.entity.SubOrganization;
import com.OrganizationManagement.repository.SuborganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuborganizationService {
    @Autowired
    private SuborganizationRepository suborganizationRepository;

    public List<SubOrganization> getAllSuborganizations() {
        return suborganizationRepository.findAll();
    }

    public SubOrganization getSuborganizationById(Long id) {
        return suborganizationRepository.findById(id).orElse(null);
    }

    public SubOrganization createSuborganization(SubOrganization suborganization) {
        return suborganizationRepository.save(suborganization);
    }

    public SubOrganization updateSuborganization(Long id, SubOrganization suborganization) {
        if (suborganizationRepository.existsById(id)) {
            suborganization.setId(id);
            return suborganizationRepository.save(suborganization);
        }
        return null;
    }

    public void deleteSuborganization(Long id) {
        suborganizationRepository.deleteById(id);
    }
}
