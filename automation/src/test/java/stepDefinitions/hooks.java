package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before
    public void netBankingSetup(){
        System.out.println("setup entries in Netbanking database");
    }
    @Before
    public void mortgageSetup(){
        System.out.println("setup entries in Mortgage database");

    }
    @After
    public void teardown(){
        System.out.println("setup entries in Mortgage database");

    }
    
}
