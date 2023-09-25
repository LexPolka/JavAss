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

public class Credit {
    private String number;
    private String type;
    private Date expDate;
    private double amount;
    
    public Credit (String number, String type, Date expDate)
    {
        this.expDate = expDate;
        this.number = number;
        this.type = type;
    }
    
    public boolean authorized(String numberInput, String typeInput, Date expDateInput)
    {
        if (number != numberInput) return false;
        if (type != typeInput) return false;
        if (expDate != expDateInput) return false;
        
        else return true;
    }
    
}
