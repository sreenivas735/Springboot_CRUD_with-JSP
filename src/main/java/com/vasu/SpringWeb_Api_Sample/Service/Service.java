package com.vasu.SpringWeb_Api_Sample.Service;


import com.vasu.SpringWeb_Api_Sample.Model.Company;
import com.vasu.SpringWeb_Api_Sample.Repository.companyrepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    companyrepository repository;

    public List<Company> getalldata() {
        return repository.findAll();
    }

    public String adddata(Company company) {
        repository.save(company);
        return "successfully added";
    }

    public Optional<Company> getdatabyid(int id) {
        return repository.findById(id);
    }

    public String updatedata(Company company) {
        repository.save(company);
        return "data updated successfully";
    }

    public String deletedatabyid(int id) {
        repository.deleteById(id);
        return id + " data deleted successfully";
    }

    public String deletealldata() {
        repository.deleteAll();
        return "all data deleted successfully";
    }
}
