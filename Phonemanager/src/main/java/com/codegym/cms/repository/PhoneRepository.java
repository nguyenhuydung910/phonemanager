package com.codegym.cms.repository;

import com.codegym.cms.model.Phone;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {
}
