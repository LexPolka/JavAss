/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
public class Cart {
    private int cartID;
    private double totalPrice;
    
    private int lastCartID;
    
    public Cart (String cartID, double totalPrice)
    {
        this.cartID = lastCartID;
        this.totalPrice = totalPrice;
        
        lastCartID++;
    }
    
    public int getCartID()
    {
        return this.cartID;
    }
    public double getTotalPrice()
    {
        return this.totalPrice;
    }
    
    public void setCartID(int newCartID)
    {
        this.cartID = newCartID;
    }
    public void setTotalPrice(double newTotalPrice)
    {
        this.totalPrice = newTotalPrice;
    }
}
