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
    
    public AccountWallet()
    {
        
    }
    
    public AccountWallet(double walletAmount)
    {
        this.walletID = lastID;
        this.walletAmount = walletAmount;
        
        lastID++;
    }
    
    @Override
    public String toString()
    {
        return String.format
        ("=================================================================="
        + "\n           Welcome to Account Wallet Top-Up!"
        + "\nID      : " + walletID
        + "\nBalance : RM " + walletAmount
        + "\n==================================================================");
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
