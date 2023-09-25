/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.util.Date;

public class Order {
    private String orderID;
    private String orderStatus;
    private Date orderDate;
    private String orderDesc;
    
    public Order (String orderID, String orderStatus, Date orderDate, String orderDesc)
    {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.orderDesc = orderDesc;
    }
    
    public String getOrderID()
    {
        return this.orderID;
    }
    public String getOrderStatus()
    {
        return this.orderStatus;
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
    public void setOrderStatus(String newOrderStatus)
    {
        this.orderStatus = newOrderStatus;
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
