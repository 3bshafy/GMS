package GMSKimo;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EMPLOYEE  extends STAFF{
    String USRname ;
    String PASSwrd ;
    
    public EMPLOYEE(String USRname , String PASSwrd){
        
        this.USRname = USRname ;
        this.PASSwrd = PASSwrd ;
    }
     Scanner input = new Scanner(System.in);
     
    public void addMember()
    {
       // Input member info
       System.out.println("Enter name :");
        String name = input.next();
        int ID = 0;
        boolean ValidID = true;
        while (ValidID)
        {
            try{
                System.out.println("ID :");
                ID = input.nextInt();
                ValidID = false;
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();
            } 
            
        }
        System.out.println("Phone number :");
        String PhoneNumber = input.next();
        System.out.println("Email :");
        String Email = input.next();
        System.out.println("Gender :");
        String gender = input.next();
        int age = 0 ; 
        boolean ValidAge = true;
        while (ValidAge)
        {
            try{
                System.out.println("Age :");
                age = input.nextInt();
                ValidAge = false; 
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();
            }       
        }
        
        System.out.println("What is the type of membership ?");
        String membershipType = input.next();
       
        boolean bomm = true ;
        while(bomm)
        {

        for(int i=0 ; i<20 ; i++){    
        if(members[i]== null){ 
        if( membershipType.equals("daily")) // a daily pay member is created
        {
            System.out.println("Enter daily pay :");
            double daily_pay = input.nextDouble();
            members[i]=new PAYG(name,PhoneNumber,Email,gender,age,daily_pay,ID,membershipType);
            bomm = false;
            System.out.println("Member Added Succesfully....!");
            System.out.println("************************************");
            break;
        }
        else if(membershipType.equals("month"))
        {
            System.out.println("Enter monthly pay :");
            double monthly_pay = input.nextDouble();
            members[i] = new OpenMembership(ID,name,PhoneNumber,Email,gender,age,monthly_pay,membershipType);
            bomm = false;
            System.out.println("Member Added Succesfully....!");
            System.out.println("************************************");
            break;
        }
        else if(membershipType.equals("6month"))
        {
            System.out.println("Enter half year pay :");
            double half_year_pay = input.nextDouble();
            members[i] = new TermMembership(ID,name,PhoneNumber,Email,gender,age,half_year_pay,membershipType);
            bomm = false;
            System.out.println("Member Added Succesfully....!");
            System.out.println("************************************");
            break;
        }
        else 
        {
            System.out.println("Invalid memberShip");
        }
        bomm = false;
        }
        else 
            continue;
         break;
        }
        
       
      
     }
    }
    

    public void display_memberINFO(int ID)
    {
       for(int i = 0; i < 20; i++)
       {
           if(members[i] == null)
           {
               continue;
           }
           else if(members[i].ID == ID)
            {
                if(members[i].getMemberShipType().equalsIgnoreCase("daily")){
                    members[i].display_memberINFO(ID);
                }
                else if(members[i].getMemberShipType().equalsIgnoreCase("month")){
                    members[i].display_memberINFO(ID);
                }
                else if(members[i].getMemberShipType().equalsIgnoreCase("6month")){
                    members[i].display_memberINFO(ID);
                }
            break;
             
            }
       }
    
    } 
      public void deleteMember()
    {
        int d_ID = 0;
        boolean IDValid = true; 
        while(IDValid)
        {
            try{
                System.out.print("Enter Member ID: ");
                d_ID = input.nextInt();
                IDValid = false;
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();
            } 
            
        }
        for(int i = 0; i < 5; i++)
        {
            if(members[i] == null){
            if(i == 4)
            {
               
               
               System.out.println("\nMember does not exist!");
            }
               else
               {
                   continue;
               }
            }
            
         else if(members[i].ID == d_ID)
            {
                members[i] = null;
                System.out.println("Member Deleted Succesfully....!");
                System.out.println("************************************");
                break;
            }
        }
    }
  
    public void editMebmber(int ID)
    {
         for(int i = 0; i < 20; i++)
        {
            if(members[i] == null)
           {
               continue;
           }
            else if(members[i].ID == ID)
            {
                // set First name      
                System.out.println("Enter new Name: ");
                String Fname = input.next();
                members[i].setFname(Fname);
                // set ID
                System.out.println("Enter new ID: ");
                int newID = input.nextInt();
                members[i].setID(newID);
                // set MEmbershiptype
                System.out.println("Enter new MemberShiptype: ");
                String MemberShipType = input.next();
                members[i].setMemberShipType(MemberShipType);
                System.out.println("Enter new gender: ");
                String gender=input.next();
                members[i].setGender(gender);
                System.out.println("Enter new age: ");
                int age=input.nextInt();
                members[i].setAge(age);
                System.out.println("Enter Phone number: ");
                String PhoneNumber=input.next();
                members[i].setPhoneNumber(PhoneNumber);
                System.out.println("Enter new email: ");
                String email=input.next();
                members[i].setEmail(email);
                System.out.println("Member Edited Successfully......!");
                System.out.println("************************************");
            }
            else{
                System.out.println("Member ID Does Not Exist !");
                System.out.println("************************************");
            }
        }
    
    } 
    
    public void assignMemberToClass()
    {
        int ID = 0; 
        boolean IDValid = true; 
        while (IDValid)
        {
            try{
                System.out.print("\nEnter member ID: ");
                ID = input.nextInt();
                IDValid = false;
                }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();
            }
        }       
                
                
        int ClassID = 0 ; 
        boolean ValidID = true; 
        while (ValidID){
            try{
                
                   System.out.print("\nEnter Class ID: ");
                   ClassID = input.nextInt();
                   ValidID = false;
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();
            } 
            
        }
        for(int i = 0; i<20; i++)
        {
            for(int j = 0; j<5; j++)
            {
                // Making sure class and member exist
                if(classes[j] == null || members[i] == null)
                    {
                      
                         continue;
                       
                    }
                
               // checking if class and member and ID are correct
                else if(members[i].ID == ID && classes[j].classID == ClassID)
                    {
                        // checking if member has a class assigned - K IS Classes of Member
                        for(int k = 0; k<5; k++)
                        {
                            if(members[i].c[k] == null)
                            {
                                if(k == 0)
                                {
                                  // Members in CLASS -Loop
                                    for(int a = 0; a < 5; a++)
                                    {
                                        if(classes[j].members[a] == null){
                                            classes[j].members[a] = members[i];
                                            members[i].c[k] = classes[j]; 
                                            System.out.println("\nMember succesfully assigned to the Training class!");
                                            break;
                                        }
                                        else if(a == 4){
                                            System.out.println("\nClass is full of members!");
                                        }
                                    
                                
                                    }
                                }
                                else
                                {
                                    // Another Members in class in case first class for member is assigned to check for time
                                    for(int b = 0; b < k; b++)
                                    {
                                       
                                        if( classes[j].starttime != members[i].c[b].starttime && b == k-1)
                                        {
                                            // 
                                            for(int a = 0; a < k; a++)
                                    {
                                        if(classes[j].members[a] == null){
                                    classes[j].members[a] = members[i];
                                    members[i].c[k] = classes[j]; 
                                    System.out.println("\nMember succesfully assigned to the Training class!");
                                    break;
                                        }
                                        else if(a == 4){
                                            System.out.println("\nClass is full of members!");
                                        }
                                        
                                    }
                                        }

                                        else if(b == k-1)
                                        {
                                            System.out.println("Member has a class assigned at the same time of the class you are trying to assign!");
                                        }
                                    }
                                }
                                    
                                 
                                        
                            break;
                            }
                        }
                            
                        
                    }


                
            }
            
        }
    }
       
        
        
    }
    
    

