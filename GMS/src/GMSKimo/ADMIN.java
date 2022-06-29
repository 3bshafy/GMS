package GMSKimo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ADMIN extends STAFF{
    String USRname ;
    String PASSwrd ;
    
    public ADMIN(String USRname , String PASSwrd){
        
        this.USRname = USRname ;
        this.PASSwrd = PASSwrd ;
    }
    Scanner input = new Scanner(System.in);
   
   // Trainer Management *************************************************************88
   public void addTrainer()
    {
         // Input trainer info
         System.out.print("Enter First Name: ");
         String name = input.next();
         System.out.print("\nEnter Last Name: ");
         String lname = input.next();
           int mp = 0;
       boolean IntValid = true ;
       while (IntValid){
           try{
               System.out.print("\nEnter Monthly Pay: ");
               mp = input.nextInt();
               IntValid = false; 
           }
           catch (InputMismatchException exp)
           {
               System.out.println("Invalid Input, please try again");
               input.next();
           }  
       }
       
       
       
       int ID = 0;
       boolean IntValidID = true;
       while (IntValidID){
       try{
       System.out.print("\nAssign ID: ");
       ID = input.nextInt();
       IntValidID = false; 
       }
       catch (InputMismatchException exp)
           {
               System.out.println("Invalid Input, please try again");
               input.next();
           }  
       
       }
         Trainer t = new Trainer(name, lname, mp, ID);
         // Checking if coach exist 
         for(int i = 0; i < 5; i++){
            if(trainers[i] == null){
               trainers[i] = t;
               System.out.println("************************************");
               System.out.println("\nTrainer successfuly added!");
               System.out.println("************************************");
               break;
           }
          
       }
     }
    public void displayTrainer()
    {
        int ID = 0;
        boolean IDValid = true;
        while (IDValid)
        {
            try{
                          System.out.print("Enter Trainer ID: ");
                        ID = input.nextInt();
                        IDValid = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();

               }  
        }
        for(int i = 0; i < 5; i++)
       {
           if(trainers[i] == null)
           {
                if(i == 4)
                {
               System.out.println("\nTrainer does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }
           else if(trainers[i].ID == ID)
            {
             System.out.println("\nName: " + trainers[i].getName() + " " + trainers[i].getLastname());
             System.out.println("ID: " + trainers[i].getID());
             System.out.println("Monthly pay: " + trainers[i].getMonthlypay());
             System.out.println("************************************");
             break;
             
            }          
            
       }
       
    }
    public void editTrainer()
    {      
        int ID = 0;
        boolean IDValid = true;
        while (IDValid)
        {
            try{
                          System.out.print("Enter Trainer ID: ");
                        ID = input.nextInt();
                        IDValid = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();

               }  
        }
         for(int i = 0; i < 5; i++)
        {
            if(trainers[i] == null)
           {
               if(i == 4)
                {
               System.out.println("\nTrainer does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }
            else if(trainers[i].ID == ID)
            {
                // set First name      
               System.out.print("\nEnter new First Name: ");
               String name = input.next();
               trainers[i].setName(name);
               // set Last name
               System.out.print("\nEnter new Last Name: ");
               String lname = input.next();
               trainers[i].setLastname(lname);
               // set Monthly pay
                boolean MPValid = true;
               int mp = 0 ;
               while (MPValid)
               {
                   try{
                         System.out.print("\nEnter new Monthly Pay: ");
                         mp = input.nextInt();
                         trainers[i].setMonthlypay(mp);
                         MPValid = false; 
                   }
                   catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();

                     } 
               }
               System.out.println("\nTrainer successfuly edited!");
               System.out.println("************************************");
               break;
            }
            
        }
       
    }
    public void deleteTrainer()
    {
         int ID = 0;
        boolean IDValid = true;
        while (IDValid)
        {
            try{
                          System.out.print("Enter Trainer ID: ");
                        ID = input.nextInt();
                        IDValid = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();

               }  
        }
        for(int i = 0; i < 4; i++)
        {
            if(trainers[i] == null)
           {
               if(i == 4)
                {
               System.out.println("\nTrainer does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }   
            
            else if(trainers[i].ID == ID)
            {
                trainers[i] = null;
                System.out.println("\nTrainer successfuly deleted");
                System.out.println("************************************");
                break;
            }
           
        }
    }
    // Class Management *****************************************************************
    public void addClass()
    {
        // Input class info
       System.out.print("Enter Class Name: ");
       String name = input.next();
       int stime = 0;
       boolean ValidSTime = true; 
       while (ValidSTime)
       {
           try{
                System.out.print("\nEnter Start Time(Using 24Hour format): ");
                stime = input.nextInt();
                ValidSTime = false; 
           }
           catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();
               }  
       }
       
       
       int etime = 0; 
       boolean ValidETime = true;
       while(ValidETime)
       {
           try{
                System.out.print("\nEnter End Time(Using 24Hour format): ");
                etime = input.nextInt();
                ValidETime = false; 
           }
           catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();
               } 
       }
       
       
       
        int ID = 0;
        boolean IDValid = true;
        while (IDValid)
        {
            try{
                        System.out.print("\nAssign Class ID: ");
                        ID = input.nextInt();
                        IDValid = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();
               }  
        }
       TClass c = new TClass(name, stime, etime, ID);
       // Checking if class exist then assign 
       for(int i = 0; i < 5; i++){
           if(classes[i] == null){
               classes[i] = c;
               System.out.println("\nTraining class successfuly added!");
               System.out.println("************************************");
               break;
           }
          
       }
    }
    // Display Class Info 
    public void displayClass()
    {
       int ID = 0;
        boolean IDValid = true;
        while (IDValid)
        {
            try{
                        System.out.print("Enter Class ID you would like to display: ");
                        ID = input.nextInt();
                        IDValid = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();

               }  
        }
        for(int i = 0; i < 5; i++)
       {
           if(classes[i] == null)
           {
               if(i == 4)
                {
               System.out.println("\nTraining class does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }
           else if(classes[i].classID == ID)
            {
             System.out.println("\nClass Name: " + classes[i].getName());
             System.out.println("Class ID: " + classes[i].getClassID());
             System.out.println("Start Time: " + classes[i].getStarttime() + " End Time: " + classes[i].getEndtime());
             System.out.println("Trainer Name: " + classes[i].getTrainername());
             System.out.println("************************************");
             // lsa na2es display members
             
             
             break;
             
            }
            
       }
        System.out.println("Action Completed!");
        System.out.println("************************************");
    }
    // Assign trainer to class
    public void assignTrainer()
    {
        int ID = 0;
        boolean ValidID = true; 
        while(ValidID)
        {
            try{
                 System.out.print("Enter Trainer ID: ");
                 ID = input.nextInt();
                 ValidID = false;
            }
            catch (InputMismatchException exp)
               {
                   System.out.println("Invalid Input, please try again");
                   input.next();

               }
                    
        }       
                
                int ClassID = 0;
                boolean IDValid = true;
                
                while (IDValid)
                {
                    try{
                    System.out.print("\nEnter Class ID: ");
                    ClassID = input.nextInt();
                    IDValid = false;
                    }
                    catch (InputMismatchException exp)
                    {
                        System.out.println("Invalid Input, please try again");
                        input.next();
                    }
                }
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                // Making sure class and trainer exist
                if(classes[j] == null || trainers[i] == null)
                    {
                        continue;
                    }
               // checking if class and trainer and ID are correct
                else if(trainers[i].ID == ID && classes[j].classID == ClassID)
                    {
                        // checking if trainer has a class assigned
                        for(int k = 0; k<5; k++)
                        {
                            if(trainers[i].trainclass[k] == null)
                            {
                                if(k == 0)
                                {
                                    classes[j].trainername = trainers[i].name;
                                    trainers[i].trainclass[k] = classes[j]; 
                                    System.out.println("\nTrainer succesfully assigned to the Training class!");
                                    System.out.println("************************************");
                                    break;
                                }
                                else
                                {
                                    for(int a = 0; a < k; a++)
                                    {
                                       
                                        if( classes[j].starttime != trainers[i].trainclass[a].starttime && a == k-1)
                                        {
                                        classes[j].trainername = trainers[i].name;
                                        trainers[i].trainclass[k] = classes[j]; 
                                        System.out.println("\nTrainer succesfully assigned to the Training class!");
                                        System.out.println("************************************");
                                        break;
                                        }

                                        else if(a == k-1)
                                        {
                                            System.out.println("Trainer has a class assigned at the same time of the class you are trying to assign!");
                                            System.out.println("************************************");
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
    // Edit Class
    public void editClass()
    {
        int ID = 0; 
        boolean IDValid = true; 
        while(IDValid)
        {
            try{
            System.out.print("Enter Class ID you would like to edit: ");
            ID = input.nextInt();
            IDValid = false;
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();

                    } 
            
        } 
        for(int i = 0; i < 5; i++)
        {
            if(classes[i] == null)
           {
                if(i == 4)
                {
               System.out.println("\nTraining class does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }
            else if(classes[i].classID == ID)
            {
                // set Class name      
               System.out.print("\nEnter new Class Name: ");
               String name = input.next();
               classes[i].setName(name);
               // set Start time
               System.out.print("\nEnter new Start Time: ");
               int stime = input.nextInt();
              classes[i].setStarttime(stime);
               // set End time
               System.out.print("\nEnter new End Time: ");
               int mp = input.nextInt();
               classes[i].setEndtime(mp);
               System.out.println("\nTraining class successfuly edited!");
               System.out.println("************************************");
       
            }
        }
       
    }
    // Delete class
    public void deleteClass()
    {
       int ID = 0; 
        boolean IDValid = true; 
        while(IDValid)
        {
            try{
            System.out.print("Enter Class ID you would like to delete: ");
            ID = input.nextInt();
            IDValid = false;
            }
            catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();

                    } 
            
        }
                 
        for(int i = 0; i < 5; i++)
        {
            if(classes[i] == null)
           {
               if(i == 4)
                {
               System.out.println("\nTraining class does not exist!");
               System.out.println("************************************");
                }
               else
               {
                   continue;
               }
           }
               else if(classes[i].classID == ID)
            {
                classes[i] = null;
                System.out.println("\nTraining class successfuly deleted!");
                System.out.println("************************************");
                break;
            }
        }
    }
    // Assign Trainer to member!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void assignTrainerToMember()
    {
       int TID = 0;
       boolean ValidID = true;
       while (ValidID)
       {
           try{
                System.out.print("Enter Trainer ID: ");
                TID = input.nextInt();
                ValidID = false;
           }
           catch (InputMismatchException exp)
           {
                        System.out.println("Invalid Input, please try again");
                        input.next();

           } 
       }
       
       int MID = 0;
       boolean MIDValid = true; 
       
       while (MIDValid){
           try{
                System.out.print("\nEnter Member ID: ");
                MID = input.nextInt();
                MIDValid = false;
           }
           catch (InputMismatchException exp){
                        System.out.println("Invalid Input, please try again");
                        input.next();

                     } 
           
       }
       for(int i = 0; i < 5; i++)
       {
           boolean f = false;
           for(int j = 0; j < 5; j++)
           {    
               if(trainers[i] == null || members[j] == null)
               {
                   if(i==4 && j == 4)
                    {
                        System.out.println("Trainer or Member does not exist!");
                        System.out.println("************************************");
                    }
                   else{continue;}
               }
               else if(trainers[i].ID == TID && members[j].ID == MID)
               {
                  members[j].t = trainers[i]; 
                  System.out.println("\nTrainer successfuly assigned to Member!");
                  System.out.println("************************************");
                  f = true;
                  break;
               }
               
           }
           if(f==true){
              break;
           }
       }
       
       
                  
    }
    
}

