/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author prach
 */
public class VitalSignsHistory {
    
    
    ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
        history=new ArrayList<VitalSigns>();
    }    
    
    public VitalSigns addNewVitals(){
        VitalSigns newVS=new VitalSigns();
        history.add(newVS);
        return newVS;
        
    }
    public void removeVitalSigns(VitalSigns vs){
        history.remove(vs);
    }
    public ArrayList<VitalSigns> getHistory(){
        
        return history;
    }
    
}
