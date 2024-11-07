package com.vasu.SpringWeb_Api_Sample.Controller;


import com.vasu.SpringWeb_Api_Sample.Model.Company;
import com.vasu.SpringWeb_Api_Sample.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class controller {


    @Autowired
    Service service;


    @PostMapping("/adddata")
    public String adddata(@RequestBody Company company) {
        return service.adddata(company);
    }

    @GetMapping("/getdata/{id}")
    public Optional<Company> getdatabyid(@PathVariable int id) {
        return service.getdatabyid(id);
    }

    @GetMapping("/getalldata")
    public List<Company> getalldata() {
        return service.getalldata();
    }

    @PutMapping("/update")
    public String updatedata(@RequestBody Company company) {
        return service.updatedata(company);
    }

    @DeleteMapping("/delete/{id}")
    public String deletedatabyid(@PathVariable int id) {
        return service.deletedatabyid(id);
    }

    @DeleteMapping("/deleteall")
    public String deletealldata() {
        return service.deletealldata();
    }


    @GetMapping("/webpage")
    public String getwebpage() {
        return "index";
    }


}
