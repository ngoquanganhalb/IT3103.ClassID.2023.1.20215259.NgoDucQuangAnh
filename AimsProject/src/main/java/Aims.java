/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quang
 */
public class Aims {
    public  static void main(String[] args){
        // create newcart
        Cart cart1 =new Cart();
        //create dvd and add to cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("LM10", "Argentina", "Director1", 100f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("CR7", "Portugal", "Director1", 200f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Matinez", "Argentina", "Director1", 300f);
        
        cart1.addDigitalVideoDisc(dvd1);
      
        cart1.addDigitalVideoDisc(dvd3);
        //removeru
        cart1.removeDigitalVideoDisc(dvd2);
        
    
        //printf cost
        System.out.println("Cai gia phai tra la:");
        System.out.println(cart1.totalCost());
    }
}
