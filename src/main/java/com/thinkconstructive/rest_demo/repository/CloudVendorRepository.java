package com.thinkconstructive.rest_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkconstructive.rest_demo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}