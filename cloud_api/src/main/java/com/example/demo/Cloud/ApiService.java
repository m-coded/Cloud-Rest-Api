package com.example.demo.Cloud;

import com.example.demo.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/CloudVendor")

public class ApiService
{

   CloudVendor  CloudVendor;
@GetMapping("Vendor")
    public CloudVendor getCloudVendorinformation(String Vendor) {


        return  CloudVendor;

        //new CloudVendor("A1", "JOHN" ,

            //    "N023","098474985");/
    }

    @PostMapping
    private String createcloudvendordetails(@RequestBody CloudVendor CloudVendor){
      this.CloudVendor = CloudVendor;
      return " sent sucessfully";
    }
       @PutMapping
     private String updatecloudvendordetails(@RequestBody CloudVendor CloudVendor){
      this.CloudVendor = CloudVendor;
      return " updated sucessfully";
    }
      @DeleteMapping({"VendorId"})
     private String deletecloudvendordetails(String VendorId){
      this.CloudVendor = null;
      return " Deleted sucessfully";
    }

}
