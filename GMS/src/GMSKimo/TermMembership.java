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
public class TermMembership extends Member{
    
    double halfYear_Pay;
    
    
    public TermMembership(){
        
    }
    
    public TermMembership(int ID,String Fname, String phoneNumber, String email,String gender, int age,double halfYear_Pay,String MemberShipType)
    {
        super(Fname,phoneNumber,email,gender,age,ID,MemberShipType);
        this.halfYear_Pay = halfYear_Pay;
   
    }
    
    public void setHalfYear_Pay(double halfYear_Pay) {
        this.halfYear_Pay = halfYear_Pay;
    }

    public double getHalfYear_Pay() {
        return halfYear_Pay;
    }
    
    // overrided methods

    @Override
    public double Total_Payment()
    {
        return halfYear_Pay;
    }
    
    @Override
    public void display_memberINFO(int ID)
    {
        super.display_memberINFO(ID);
        System.out.println("Half Year Payment : "+halfYear_Pay);
    }
    
}
