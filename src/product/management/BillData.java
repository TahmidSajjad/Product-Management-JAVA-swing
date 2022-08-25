/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.management;

/**
 *
 * @author Tahmid Sajjad
 */
public class BillData {
    
    private String ID, customer_name, date, payment;
    
    public BillData(String ID, String customer_name, String date, String payment)
    {
        this.ID = ID;
        this.customer_name = customer_name;
        this.date = date;
        this.payment = payment;
        
       
    }
    public String getID(){
        return ID;
    }
    public String getCustomerName(){
        return customer_name;
    }
    public String getDate(){
        return date;
    }
    public String getPayment(){
        return payment;
    }
    
}
