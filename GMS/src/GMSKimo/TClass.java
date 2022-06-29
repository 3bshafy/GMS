/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GMSKimo;


public class TClass {
    String name;
    int starttime, endtime, classID;
    String trainername;
    Member members[] = new Member[5];

    public TClass(String name, int starttime, int endtime, int classID) {
        this.name = name;
        this.starttime = starttime;
        this.endtime = endtime;
        this.classID = classID;
       
    }
    

    public String getName() {
        return name;
    }

    public int getStarttime() {
        return starttime;
    }

    public int getEndtime() {
        return endtime;
    }

    public int getClassID() {
        return classID;
    }

    public String getTrainername() {
        return trainername;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }
    
    
    
}
