package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Assessmet_1_Controller {

 @RequestMapping("/Assessment_1_hi")

 public String sayHello(@RequestParam("cname") String name,Model m)

 {

 m.addAttribute("cname", name);

 return "Assessment_1_hi";

 }

 @RequestMapping("/xx")

 public String xx()

 {

 return "Assessment_1_xy";

 }

}