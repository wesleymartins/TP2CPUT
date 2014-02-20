/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2cput.program1;

import com.tp2cput.program1.service.Program1Service;
import com.tp2cput.program1.service.Program1ServiceImpl;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TEST1 {
    
    public static Program1Service service;
    
    public TEST1() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void add() 
    {
        Assert.assertEquals(service.add(3,5),8);
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        
        service = new Program1ServiceImpl();
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
