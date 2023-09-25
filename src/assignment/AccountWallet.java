/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
public class AccountWallet {
    protected int walletID;
    protected double walletAmount;
    
    private int lastID;
    
    public AccountWallet(double walletAmount)
    {
        this.walletID = lastID;
        this.walletAmount = walletAmount;
        
        lastID++;
    }
    
    public double checkBalance()
    {
        return walletAmount;
    }
    
    public int getID()
    {
        return walletID;
    }
    
    public void setAmount(double amount)
    {
        this.walletAmount = amount;
    }
    
    public void decrease(double amount)
    {
        this.walletAmount -= amount;
    }
    
    public void increase(double amount)
    {
        this.walletAmount += amount;
    }
}
