package com.vasu.SpringWeb_Api_Sample.Repository;

import com.vasu.SpringWeb_Api_Sample.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface companyrepository extends JpaRepository<Company, Integer> {

}
