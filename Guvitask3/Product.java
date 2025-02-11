package Guvitask3;

//Product class implementing Taxable
class Product2 implements Taxable {
 private int pid;
 private double price;
 private int quantity;
 
 public Product2(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }
 
 
 public double calcTax() {
     return price * SALES_TAX;
 }
}
