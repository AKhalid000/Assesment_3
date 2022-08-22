package com.example.demo.controller;





import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;

import com.example.demo.model.Alien;

@RestController

public class AlienController

{

 @Autowired

 AlienRepo repo;

 /*

 * @RequestMapping("/") public String home() { return "home.jsp"; }

 */

 @PostMapping(path="/alien",consumes= {"application/json"})

 public Alien addAlien(@RequestBody Alien alien)

 {

 repo.save(alien);

 return alien;

 }

 @GetMapping(path="/aliens")

 public List<Alien> getAliens()

 {

 return repo.findAll();

 }

 @RequestMapping("/alien/{cid}")

 public Optional<Alien> getAlien(@PathVariable("cid")int cid)

 {

 return repo.findById(cid);

 }

 @DeleteMapping("/alien/{cid}")

 public String deleteAlien(@PathVariable int cid)

 {

 Alien a = repo.getOne(cid);

 repo.delete(a);

 return "deleted";

 }

 @PutMapping(path="/alien",consumes= {"application/json"})

 public Alien saveOrUpdateAlien(@RequestBody Alien alien)

 {

 repo.save(alien);

 return alien;

 }

}







