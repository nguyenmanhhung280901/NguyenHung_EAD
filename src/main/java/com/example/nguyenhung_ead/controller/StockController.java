package com.example.nguyenhung_ead.controller;

import com.example.nguyenhung_ead.entity.StockEntity;
import com.example.nguyenhung_ead.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StockController {

    @Autowired
    StockService stockService;


    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<StockEntity> stocks = stockService.getAllStock();
        model.addAttribute("stocks", stocks);
        return "index";
    }
}
