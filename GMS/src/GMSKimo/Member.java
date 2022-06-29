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
public abstract class Member {
    
    private String Fname; // full name of the member 
    private String phoneNumber;
    private String email;
    private String gender;
    private int age;
    int ID;
    private String MemberShipType; // daily or monthly or half-year 
    Trainer t = new Trainer();
    TClass[] c = new TClass[5];
    
    public Member(){ // empty constructor
        
    }

    public Member(String Fname, String phoneNumber, String email,String gender, int age,int ID,String MemberShipType) {
        this.Fname = Fname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.MemberShipType = MemberShipType;
    }

    
    // getters of the attributes
    
    
    public String getMemberShipType() {
        return MemberShipType;
    }

    public int getID() {
        return ID;
    }

    public String getFname() {
        return Fname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //
    
    // setters of the attributes

    public void setMemberShipType(String MemberShipType) {
        this.MemberShipType = MemberShipType;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //
    
    public void display_memberINFO(int ID) 
    {
        System.out.println("Name : "+Fname);
        System.out.println("ID :"+ID);
        System.out.println("phone number :"+phoneNumber);
        System.out.println("Email : "+email);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
        System.out.println("MemberShip Type :"+MemberShipType);
       
    }
    
    public abstract double Total_Payment(); // abstract method to calculate total paymnet depend 
                                            // on the type of membership.
    
}

