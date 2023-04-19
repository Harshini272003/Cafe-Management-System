/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author shars
 */
public class tables {
    public static void main(String args[])
    {
        try
        {
          //String usertable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(20),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email));";
          //String adminDetails="insert into user values(2,'Admin','admin123@gmail.com','1234567890','Chennai','admin','What is your favourite color?','Purple','true')";
          //String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200)) ";
          //String billTable="create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
          //String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
          
          //DbOperations.setDataOrDelete(usertable, "User Table Created Successfully!");
          //DbOperations.setDataOrDelete(adminDetails, "Admin Details added Successfully!");
          //DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully!");
          //DbOperations.setDataOrDelete(productTable, "Category Table Created Successfully!");
          //DbOperations.setDataOrDelete(billTable, "Category Table Created Successfully!");
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
