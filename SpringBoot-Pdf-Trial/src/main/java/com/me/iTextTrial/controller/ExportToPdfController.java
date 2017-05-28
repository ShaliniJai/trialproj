package com.me.iTextTrial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.me.iTextTrial.service.ProfSumService;


@Controller
public class ExportToPdfController {

    @Autowired
    ProfSumService profSumService;

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download(Model model) {
        model.addAttribute("profSum", profSumService.getProfSumData());
        return "";
    }


}
