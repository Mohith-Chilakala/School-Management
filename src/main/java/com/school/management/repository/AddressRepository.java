package com.school.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.data.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {}
