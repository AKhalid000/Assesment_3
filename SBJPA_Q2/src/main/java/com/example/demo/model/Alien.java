package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Alien {

@Id

 private int cid;

 private int cname;

 private int ph;
 
 private int ad;
 
 private int login;
 
 private int pass;
 

 public int getCid() {

 return cid;

 }

 public void setCid(int cid) {

 this.cid = cid;

 }

 public int getCname() {

 return cname;

 }

 public void setCname(int cname) {

 this.cname = cname;

 }

 public int getPh() {

 return ph;

 }

 public void setPh(int ph) {

 this.ph = ph;

 }
 
 public int getAd() {

 return ad;

 }

 public void setAd(int ad) {

 this.ad = ad;

 }
 
 public int getLogin() {

 return login;

 }
 public void setLogin(int login) {

 this.login = login;

 }
 public int getPass() {

 return pass;

 }

 public void setPass(int pass) {

 this.pass = pass;

 }

 @Override

 public String toString() {

 return "Alien [cid=" + cid + ", cname=" + cname + ", ph=" + ph + " , ad=" + ad + " , login=" + login + ", pass=" + pass + "]";

 }

}

