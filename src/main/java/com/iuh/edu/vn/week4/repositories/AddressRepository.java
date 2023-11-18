package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
