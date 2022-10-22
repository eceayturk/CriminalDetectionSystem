/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;


import PhysicalFeatures.*;

public class DrowningDeath extends Murder {

    private String weaponType;
    private PhysicalFeatures feature; 
 
    
    

    public DrowningDeath(String suspectId, String suspect_name, String suspect_surname, String gender,
            String fingerprintMatchRate, int age_sus, double height, double weight, String weaponType,double sus_strength,
            String hormoneLevel, String bloodSample,String suspect_phonenum, int guilty_rate){
        super(suspectId, suspect_name, suspect_surname, gender, fingerprintMatchRate, guilty_rate,bloodSample,hormoneLevel,suspect_phonenum);
        
        this.weaponType = weaponType;
        
        feature = new PhysicalFeatures(age_sus,height,weight,sus_strength);
  
       


    }
    public DrowningDeath(String vic_name, String vic_surname, String gender, String[] logcalls, int age_vic,
            String weaponType,double height, double weight,double vic_strength ){
        super(vic_name,vic_surname,gender,logcalls);
        
        this.weaponType = weaponType;
        
        feature = new PhysicalFeatures(height,age_vic,weight,vic_strength);
    }

    @Override
    public String toString(){
        return (super.toString()+"\n"+feature.toString() +"\nCrime Weapon: "+weaponType+ "\n"+
                feature.writeSusMuscle()+"\n"+writeHormoneLevel()+writeBloodSample()+writePhoneNum()+"\n"+ writeTotalRate()+"\n\n");
    }
    
    
    @Override
    public String toStrings(){
        return(writeCrimes()+super.toStrings()+ feature.toStrings()+
                "\nCrime's Weapon: "+weaponType+"\nLast 5 call logs: "+writeCallLogs()+
               feature.writeVicMuscle());
    }

    @Override
    public String writeCrimes() {
       return (super.writeCrimes()+"Here is the Drowning Case\n\n");
    }
    
 
}
    
