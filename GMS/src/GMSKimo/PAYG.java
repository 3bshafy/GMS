/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GMSKimo;

/**
 *
 * @author user
 */ // pay as you go member 
public class PAYG extends Member{ 
    
   private double daily_Pay;
   
   public PAYG(){
       // empty constructor
   }

   public PAYG(String Fname, String phoneNumber, String email,String gender, int age,double daily_pay,int ID,String MemberShipType)
   {
       super(Fname,phoneNumber,email,gender,age,ID,MemberShipType);
       this.daily_Pay = daily_pay;
   }
   
    public double getDaily_Pay() {
        return daily_Pay;
    }

    public void setDaily_Pay(double daily_Pay) {
        this.daily_Pay = daily_Pay;
    }
    
    // overrided methods
   
   @Override
    public double Total_Payment()
    {
        return daily_Pay;
    }
   
   @Override
    public void display_memberINFO(int ID)
    {
        super.display_memberINFO(ID); // reusability to use the base method
        System.out.println("Total payament :"+daily_Pay);
    }
}

