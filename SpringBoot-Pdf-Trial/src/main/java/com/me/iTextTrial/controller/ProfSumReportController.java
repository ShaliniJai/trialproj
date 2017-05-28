package com.me.iTextTrial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.iTextTrial.bean.ProfSum;
import com.me.iTextTrial.service.ProfSumService;

import java.util.List;

@RestController
public class ProfSumReportController {

    @Autowired
    ProfSumService profSumService;

    @RequestMapping(value = "/profsum", method = RequestMethod.GET)
    public List<ProfSum> viewHome() {
        return profSumService.getProfSumData();
    }
}
