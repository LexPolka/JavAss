/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Order {
    protected String orderID;
    protected Date orderDate;
    protected String orderDesc;
    
    //calculation
    protected double subTotal;
    protected double total;
    
    private static int numOrderID= 1001;
    private static int tax = 5;
    
    public Order(double cartTotal)
    {
        this.subTotal = cartTotal;
        numOrderID++;
    }
    
    public Order (double cartTotal, String orderID, String orderStatus, String orderDesc)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        
        this.orderID = "O" + numOrderID;
        this.orderDate = date;
        this.orderDesc = orderDesc;
        numOrderID++;
    }
    
    //Functions
    @Override
    public String toString()
    {
        this.total = this.subTotal * 1.05;
        
        return String.format(
                """
                        == Processing Order... ==
                    Order ID            : %s
                    Order Date          : %s
                    Order Desc          :
                        %s
                    ---------------------------------
                
                    Sub Total           : %.2f
                    Tax 5%
                    Total (After Tax)   : %.2f
                                        """, this.orderID, this.orderDate, this.orderDesc, this.subTotal, this.total);
    }
    
    public String getOrderID()
    {
        this.orderID = "O" + numOrderID;
        numOrderID++;
        return orderID;
    }
    
    public Date getOrderDate()
    {
        return this.orderDate;
    }
    public String getOrderDesc()
    {
        return this.orderDesc;
    }
    
    public void setOrderID(String newOrderID)
    {
        this.orderID = newOrderID;
    }
    public void setOrderDate(Date newOrderDate)
    {
        this.orderDate = newOrderDate;
    }
    public void setOrderDesc(String newOrderDesc)
    {
        this.orderDesc = newOrderDesc;
    }
}
