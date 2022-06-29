package GMSKimo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class STAFF {
    //Trainers Data
    static Trainer trainers[] = new Trainer[5];
    static TClass classes[] = new TClass[5];
    static Member members[] = new Member[20];
    Scanner input = new Scanner(System.in);
    
    public void DisplayAll(){
        for(int i=0 ; i<20 ; i++){
            if(members[i]==null){
                continue;
            }
            else{
                if(members[i].getMemberShipType().equalsIgnoreCase("daily")){
                     members[i].display_memberINFO(members[i].getID());
                }
                else if(members[i].getMemberShipType().equalsIgnoreCase("month")){
                    members[i].display_memberINFO(members[i].getID());
                }
                else if(members[i].getMemberShipType().equalsIgnoreCase("6month")){
                    members[i].display_memberINFO(members[i].getID());
                }
             System.out.println("************************************");
            }
        }
    }
    public void MemberType(){
        System.out.println("\n(1) Daily / (2) Monthly / (3) 6 Months");
        int choice = 0; 
        boolean ValidChoice = true; 
        while (ValidChoice)
        {
            try{
                System.out.println("\nEnter Membership Type: ");
                choice = input.nextInt();
                ValidChoice = false;
            }
            catch (InputMismatchException exp)
            {
                   System.out.println("Invalid Input, please try again");
                   input.next();
            }
            
        }
        for(int i=0 ; i<20 ; i++){
            if(members[i]== null){
                continue;
            }
            else{
                switch(choice){
                    case 1 :                    
                    if(members[i].getMemberShipType().equalsIgnoreCase("daily")){
                        System.out.println("Name: " + members[i].getFname());
                        System.out.println("Email: "+members[i].getEmail() );
                        System.out.println("phonenumber: " +members[i].getPhoneNumber());
                        System.out.println("ID: " + members[i].getID());
                        System.out.println("gender: " + members[i].getGender());
                        System.out.println("age: "+members[i].getAge());
                        System.out.println("Membershiptype: " + members[i].getMemberShipType());
                        System.out.println("************************************");
                    }
                    break;

                    case 2 :                    
                    if(members[i].getMemberShipType().equalsIgnoreCase("month")){
                        System.out.println("Name: " + members[i].getFname());
                        System.out.println("Email: "+members[i].getEmail() );
                        System.out.println("phonenumber: " +members[i].getPhoneNumber());
                        System.out.println("ID: " + members[i].getID());
                        System.out.println("gender: " + members[i].getGender());
                        System.out.println("age: "+members[i].getAge());
                        System.out.println("Membershiptype: " + members[i].getMemberShipType());
                        System.out.println("************************************");
                    }
                    break;

                    case 3 :                    
                    if(members[i].getMemberShipType().equalsIgnoreCase("6month")){
                        System.out.println("Name: " + members[i].getFname());
                        System.out.println("Email: "+members[i].getEmail() );
                        System.out.println("phonenumber: " +members[i].getPhoneNumber());
                        System.out.println("ID: " + members[i].getID());
                        System.out.println("gender: " + members[i].getGender());
                        System.out.println("age: "+members[i].getAge());
                        System.out.println("Membershiptype: " + members[i].getMemberShipType());
                        System.out.println("************************************");
                    }
                    break;
                }
            }
        }
        System.out.println("Action Completed!");
        System.out.println("************************************");
    }
    
    public void MemberClass(){
    int CID = 0; 
        boolean ValidCID = true; 
        while(ValidCID)
        {
            try{
                System.out.println("\nPlease enter Class ID you would like to view members in: ");
                CID = input.nextInt();
                ValidCID = false;
            }
            catch (InputMismatchException exp)
                    {
                   System.out.println("Invalid Input, please try again");
                   input.next();
                    }
        }
    System.out.println("************************************");
    for(int i=0 ; i<5 ; i++){
            if(classes[i]==null){
                continue;
            }
            else if(classes[i].classID == CID){
                for(int j = 0; j < 5; j++){
                    if(classes[i].members[j] == null){
                        continue;
                    }
                    else{
                        System.out.println("\n" + classes[i].members[j].getFname());
                        System.out.println("************************************");
                    }
                }
                
            }
            
            
            
            
            
            else{
             
                System.out.println("Name: " + members[i].getFname());
             System.out.println("Email: "+members[i].getEmail() );
             System.out.println("phonenumber: " +members[i].getPhoneNumber());
             System.out.println("ID: " + members[i].getID());
             System.out.println("gender: " + members[i].getGender());
             System.out.println("age: "+members[i].getAge());
             System.out.println("Membershiptype: " + members[i].getMemberShipType());
             System.out.println("************************************");
            }
        }
    
        System.out.println("Action Completed!");
        System.out.println("************************************");
    }
}
