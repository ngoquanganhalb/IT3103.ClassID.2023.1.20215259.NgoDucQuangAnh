/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quang
 */
// tạo mảng itemOrdered có kiểu dl của DigitalViddis, private-> chi co class Cart moi dc quyen truy cap
public class Cart {
    private int qtyOrdered=0;
    private int itemCount=0;
    private float bill=0;

    public int getItemCount() {
        return itemCount;
    }

    public float getBill() {
        return bill;
    }

    public DigitalVideoDisc[] getItemOrdered() {
        return itemOrdered;
    }
    //getter and setter
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemCount<MAX_NUMBERS_ORDERED)
        {   
            itemOrdered[itemCount]= disc;
            itemCount++;
            qtyOrdered++;
            System.out.println("San pham"+disc.getTitle()+"da duoc them vao gio");
            
        }
        else System.out.println("Khong the them,gio hang da day");
    }
    
    //remove 
   
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {   boolean found = false;
        for(int i=0;i<itemCount;i++) // itemOrederd: 1 [2] 3 4 5 -> 1 3 4 5 5 -> xoa disc cuoi
        {
            if(itemOrdered[i]== disc)
            {
                for(int j=i;j<itemCount-1;j++){
                    itemOrdered[j]=itemOrdered[j+1];
                }
                itemOrdered[itemCount]=null;
                itemCount--;
                qtyOrdered--;
                System.out.println("San pham"+disc.getTitle()+"da xoa thanh cong");
                found = true;
                break;
                
            }
    
        }
        if (!found) {
         System.out.println("San pham " + disc.getTitle() + " khong thay trong gio.");
        }
            
            
    }
    
    //totalcost
    public float totalCost()
    {
        for(int i=0;i<itemCount;i++)
        {
            bill+=itemOrdered[i].getCost();
        }
        return bill;
    }
    
    /*
        Cart cart1 = new Cart();
        // Add item to cart
        cart.addDigitalVideoDisc(disc1);
        // Calculate total cost
        cart.totalCost();
        // Get the total cost
        float totalCost = cart.getBill();
        System.out.println("Total cost: " + totalCost);
    */
}
