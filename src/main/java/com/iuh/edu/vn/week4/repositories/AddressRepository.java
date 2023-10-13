package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Address findAddressById(String id);

    List<Address> getTopByCity(int top, String city);
}