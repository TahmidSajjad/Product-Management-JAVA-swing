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
public class Data {
    
    private String ID, name, price, brand, category;
    
    public Data(String ID, String name, String price, String brand, String category)
    {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        
       
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public String getCategory(){
        return category;
    }
   
    
}
    

