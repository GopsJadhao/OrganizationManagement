package com.OrganizationManagement.controller;

import com.OrganizationManagement.entity.SubOrganization;
import com.OrganizationManagement.service.SuborganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suborganizations")
public class SubOrganizationController {

    @Autowired
    private SuborganizationService suborganizationService;

    @GetMapping
    public List<SubOrganization> getAllSuborganizations() {
        return suborganizationService.getAllSuborganizations();
    }

    @GetMapping("/{id}")
    public SubOrganization getSuborganizationById(@PathVariable Long id) {
        return suborganizationService.getSuborganizationById(id);
    }

    @PostMapping
    public SubOrganization createSuborganization(@RequestBody SubOrganization suborganization) {
        return suborganizationService.createSuborganization(suborganization);
    }

    @PutMapping("/{id}")
    public SubOrganization updateSuborganization(@PathVariable Long id, @RequestBody SubOrganization suborganization) {
        return suborganizationService.updateSuborganization(id, suborganization);
    }

    @DeleteMapping("/{id}")
    public void deleteSuborganization(@PathVariable Long id) {
        suborganizationService.deleteSuborganization(id);
    }
}
