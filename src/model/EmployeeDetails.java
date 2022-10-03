package model;

import java.util.ArrayList;

/**
 *
 * @author jurreyyahfirdawsmohammad
 */
public class EmployeeDetails {
    
    private ArrayList<Directory> details;
    
    public EmployeeDetails () {
        
        this.details = new ArrayList<Directory>();
        
    }

    public ArrayList<Directory> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Directory> details) {
        this.details = details;
    }
    
    
 public Directory addnewemployees(){
    
    Directory newEmployees = new Directory();
    details.add(newEmployees);
    return newEmployees;
}    
 
 public void deleteEmployee(Directory directory){
     details.remove(directory);
 }
 
 public void updateEmployee(Directory directory, int index){
        details.set(index, directory);
        
    }
 public ArrayList<Directory> searchEmployee(String key)
    {
        ArrayList<Directory> searchEmployee = new ArrayList();
        for(Directory directory: details)
        {
            if(directory.getName().equals(key))
            {
                if(directory.getName()!=null)
                {
                    searchEmployee.add(directory);
                }
            }
        }
        return searchEmployee;
    }    

    public ArrayList<Directory> searchEmployeeID(int key)
    {
        ArrayList<Directory> searchEmployeeID = new ArrayList();
        for(Directory directory: details)
        {
            if(directory.getEmployeeID()== (key))
            {
           
                searchEmployeeID.add(directory);
               
            }
        }
        return searchEmployeeID;
    }        

    public ArrayList<Directory> searchPositionTitle(String title)
    {
        ArrayList<Directory> searchPositionTitle = new ArrayList();
        for(Directory directory: details)
        {
            if(directory.getPositionTitle().equals(title))
            {
           
                searchPositionTitle.add(directory);
               
            }
        }
        return searchPositionTitle;
    }        
    
}
