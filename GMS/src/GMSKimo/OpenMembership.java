/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GMSKimo;

/**
 *
 * @author user
 */
public class OpenMembership extends Member{
    
    double monthly_Pay;
    
    
    public OpenMembership(){
        // empty constructor
    }
    
    public OpenMembership(int ID,String Fname, String phoneNumber, String email,String gender, int age,double monthly_Pay,String MemberShipType)
    {
        super(Fname,phoneNumber,email,gender,age,ID,MemberShipType);
        this.monthly_Pay = monthly_Pay;
    }

    public double getMonthly_Pay() {
        return monthly_Pay;
    }


    public void setMonthly_Pay(double monthly_Pay) {
        this.monthly_Pay = monthly_Pay;
    }

    // overrided methods
    
    @Override
    public double Total_Payment()
    {
        return monthly_Pay;
    }
    
    @Override
    public void display_memberINFO(int ID)
    {
        super.display_memberINFO(ID);
        System.out.println("Monthly payment : "+monthly_Pay);
    }
}

