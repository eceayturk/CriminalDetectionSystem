/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;

/**
 *
 * @author ebrue
 */

import Interfaces.*;
import PhysicalFeatures.*;

public class AdultKidnapping extends Kidnapping implements WriteCallLogs{

    public static int cpnRate,dbRate = 0;
    private String[] logcalls = new String[5];
    private String vic_phone;

           
    
    
    private PhysicalFeatures feature;

 
    
    public AdultKidnapping(String suspectId, String suspect_name, String suspect_surname, String gender,
            int age_sus, double height, double weight,double sus_strength,String[] logcalls,
            String hormoneLevel, String bloodSample, int guilty_rate, String[] lastPlace, String financial_situation){
        super(suspectId, suspect_name, suspect_surname, gender,guilty_rate,lastPlace,bloodSample,hormoneLevel,financial_situation);

        this.logcalls=logcalls;
        feature = new PhysicalFeatures(age_sus,height,weight,sus_strength);
  
        


    }
    
     public AdultKidnapping(String vic_name, String vic_surname, String gender, int age_vic,
            double height, double weight,double vic_strength, String[] enmity, String vic_phone, String place,
            String financial_situation){
        super(vic_name,vic_surname,gender,enmity,place,financial_situation);

        this.vic_phone = vic_phone;
        feature = new PhysicalFeatures(height,age_vic,weight,vic_strength);
        
        

    }

     public static int comparePhoneNum(String str,String[] logcalls){
      if(str.equalsIgnoreCase(logcalls[0])){
          cpnRate = 0;
          cpnRate = cpnRate + 1;
      }
      else if(str.equalsIgnoreCase(logcalls[1])){
          cpnRate = 0;
          cpnRate = cpnRate + 1;
      } 
      else if(str.equalsIgnoreCase(logcalls[2])){
          cpnRate = 0;
          cpnRate = cpnRate + 1;
      }
      else if(str.equalsIgnoreCase(logcalls[3])){
          cpnRate = 0;
          cpnRate = cpnRate + 1;
      }
      else if(str.equalsIgnoreCase(logcalls[4])){
          cpnRate = 0;
          cpnRate = cpnRate + 1;
      }
      else{
          cpnRate = 0;
      }
     
     return cpnRate;
    }
     
     public static int debt(){
        dbRate = 0;
        return dbRate = dbRate + 2;
    }

    
    public String writeLastPlace(){
         return ("\n"+lastPlace[0]+"\n"+lastPlace[1]+"\n"+lastPlace[2]+"\n"+lastPlace[3]+"\n"+lastPlace[4]);
    }
    
     
      @Override
    public String toString(){
        return (super.toString()+"\n"+feature.toString() +feature.writeSusMuscle() +
                "\nLast 5 call logs: "+this.writeCallLogs()+"\n"+writeBloodSample()+"\n"+writeHormoneLevel()+ "\n5 place s/he went"+writeLastPlace()+
                "\nFinancial Situation: "+ financial_situation+writeTotalRate()+"\n\n");

    }

    @Override
    public String writeCallLogs(){
        return ("\n"+logcalls[0]+"\n"+logcalls[1]+"\n"+logcalls[2]+"\n"+logcalls[3]+"\n"+logcalls[4]);
    }
   
   
    
    @Override
    public String toStrings(){
        return(writeCrimes()+super.toStrings()+feature.toStrings()+feature.writeVicMuscle()+"\nPhone Number: "+vic_phone+"\nLast place: "
                +place+"\nHis/Her Enmity's: "+writeEnmities()+"\nFinancial Situation: "+financial_situation);
    }
    
    @Override
    public String writeCrimes() {
       return (super.writeCrimes()+"Here is the Adult Kidnapping Case\n\n");
    }
}