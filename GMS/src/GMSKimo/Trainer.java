/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GMSKimo;

/**
 *
 * @author hp
 */
public class Trainer extends STAFF {
    TClass trainclass[] = new TClass[5];
    Member trainees[] = new Member[5];
    String name, lastname;
    int monthlypay;
    int ID = 0;
    

   // CONSTRUCTOR **********************************************
    
    public Trainer() {
    }

    public Trainer(String name, String lastname, int monthlypay, int ID) {
        this.name = name;
        this.lastname = lastname;
        this.monthlypay = monthlypay;
        this.ID = ID;
    }

  // EDITER **************************************************
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMonthlypay(int monthlypay) {
        this.monthlypay = monthlypay;
    }

    // VIEW TRAINER ********************************************
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getMonthlypay() {
        return monthlypay;
    }

    public int getID() {
        return ID;
    }

    
    
    
}
