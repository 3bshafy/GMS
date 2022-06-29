package GMSKimo;

import java.util.Scanner;



public class GMSLog {

    public static void mainCaller (int x) {  
        
    if (x == 10)
    {
        main(null); 
    }
}
    
    public static void main(String[] args) {
        //Instantiating objects
        Scanner cin1 = new Scanner(System.in);
        //System Admins
        ADMIN []admins = new ADMIN[3];
        admins[0] = new ADMIN("Mazen@admin" , "admin1");
        admins[1] = new ADMIN("Karim@admin" , "admin2");
        admins[2] = new ADMIN("S3fan@admin" , "admin3");
        //System Employee
        EMPLOYEE []emps = new EMPLOYEE[4];
        emps[0] = new EMPLOYEE("Ali@emp" , "employee1");
        
        
        
        //Variables
        //username&password validation variables
        String USRchck ;
        String PASSchck ;
        //loging as admin or employee choice
        String ASchck ;
        //validating admin data
        boolean isAdminValid = true ;
        //validating employee data
        boolean isEmpValid = true ;
        boolean ChoiceValid = true ;
        //system loop variable for admin or employee menu
        boolean sysloop = true;
       
        Scanner input = new Scanner(System.in);
        
        //Loging to GMS
        System.out.println("Welcome to GMS...!");
        System.out.println("************************************");
        System.out.println("Login As an (1)Adimn / (2)Employee...");
        System.out.print("Enter Choice Number : ");
        
        while(ChoiceValid)
        {
            
            ASchck = cin1.next();
            System.out.println("************************************");
            //Validating user input if admin chosen
            if(ASchck.equals("1"))
            {
                while(isAdminValid)
                {
                    System.out.println("Please Enter Admin's Username & Password.... ");
                    System.out.print("Username : ");
                    USRchck = cin1.next();
                    System.out.println("");
                    System.out.print("Password : ");
                    PASSchck= cin1.next();
                    System.out.println("");
                    for(int i=0 ; i<4 ; i++){
                        if(i!=3){
                            if(admins[i].USRname.equals(USRchck) && admins[i].PASSwrd.equals(PASSchck)){
                                System.out.println("Welcome, Administrator!");
            // SYstem loop ********************************
            while(sysloop)
        {
           // Inner Menu ************************************
           System.out.println("\nWhat would you like to do?\n************************************\nAdd a trainer: 1\nEdit a trainer: 2\nDisplay trainer info: 3"
                   + "\nDelete a trainer:  4\nAdd a  training class: 5\nDisplay  training class info: 6\nAssign Trainer to Training Class: 7\nEdit a training class: 8"
                   + "\nDelete a class: 9" + "\nAssign Trainer to a member: 10\nDisplay All Members Info : 11\nDisplay all members in a specific membership: 12\nView members in a certain class: 13\nLog out: 14\n************************************");
           int choice = input.nextInt();
            System.out.println("************************************");
           // Inner menu loop **************************************
           switch (choice)
           {
               case 1:
                   admins[i].addTrainer();
                   break;
               case 2:
                   admins[i].editTrainer();
                   break;
               case 3:
                   admins[i].displayTrainer();
                   break;
               case 4:
                   admins[i].deleteTrainer();
                   break;
               case 5:
                   admins[i].addClass();
                   break;
               case 6:
                   admins[i].displayClass();
                   break;
               case 7:
                   admins[i].assignTrainer();
                    break;
               case 8:
                   admins[i].editClass();
                   break;
                case 9:   
                   admins[i].deleteClass();
                   break;
                case 10:
                   admins[i].assignTrainerToMember();
                   break;
                case 11:
                    admins[i].DisplayAll();
                    break;
                case 12:
                    emps[i].MemberType();
                    break;  
                case 13:
                    admins[i].MemberClass();
                    break;                
                case 14:
                       mainCaller(10);
           }
            
        }
                            }
                        }
                        else 
                        {
                            System.out.println("Invalid Username or Password...");
                            System.out.println("Please Re-enter Username & Password ");
                        }
                    }
                }
            }
        //taking user input if employee chosen
            else if(ASchck.equals("2"))
            {
                while(isEmpValid)
                {
                    System.out.println("Please Enter Employee's Username & Password.... ");
                    System.out.print("Username : ");
                    USRchck = cin1.next();
                    System.out.println("");
                    System.out.print("Password : ");
                    PASSchck= cin1.next();
                    System.out.println("");
                    for(int i=0 ; i<5 ; i++)
                    {
                        if(i!=4)
                        {
                            if(emps[i]==null)
                            {
                                continue;
                            }
                            else if(emps[i].USRname.equals(USRchck) && emps[i].PASSwrd.equals(PASSchck))
                            {
                                System.out.println("Welcome Employee");
                                
                                while (sysloop)
                                {
                                    System.out.println("\nWhat do you want to do?\n************************************\nAdd member : 1\nEdit member : 2\nDelete member : 3\nDisplay member info : 4\nAssign Member to Class : 5\nDisplay All members Info : 6\nDisplay All Members under specific Membership type : 7\nDisplay All Members under specfic class : 8\nLog out : 9\n************************************");
                                    
                                    int choice = input.nextInt();
                                    System.out.println("************************************");
                                    switch (choice)
                                    {
                                        case 1 : 
                                            emps[i].addMember();
                                            break;
                                        case 2 :
                                            System.out.println("Enter Member ID : ");
                                            int IDchck = input.nextInt();
                                            emps[i].editMebmber(IDchck);
                                            break;
                                        case 3 :
                                            emps[i].deleteMember();
                                            break;
                                        case 4 :
                                            System.out.println("Enter Member ID : ");
                                            IDchck = input.nextInt();
                                            emps[i].display_memberINFO(IDchck);
                                            break;                                       
                                        case 5 :                                           
                                            emps[i].assignMemberToClass();
                                            break;
                                        case 6:
                                            emps[i].DisplayAll();
                                            break;
                                        case 7:
                                            emps[i].MemberType();
                                           break;
                                        case 8:
                                            emps[i].MemberClass();
                                            break;
                                        case 9:
                                             mainCaller(10);
                                             
                                            
                                           
                                    }
                                }
                            }
                        }
                        else 
                        {
                            System.out.println("Invalid Username or Password...");
                            System.out.println("Please Re-enter Username & Password ");

                        }
                    }
                }

            }
            else{
                System.out.println("Please Enter Valid Choice...");
            }
            
          
        }
    }
}