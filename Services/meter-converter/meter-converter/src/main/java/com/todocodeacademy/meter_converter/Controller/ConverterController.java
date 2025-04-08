package com.todocodeacademy.meter_converter.Controller;

import com.todocodeacademy.meter_converter.Service.IConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {

    @Autowired
    private IConverterService convServ;

    @GetMapping("/meters/{meters}")
    public Double convertCentimeters(@PathVariable Double meters){
        return convServ.convertCentimeters(meters);
    }



}
