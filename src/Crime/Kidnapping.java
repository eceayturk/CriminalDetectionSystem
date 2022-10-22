/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;

import Interfaces.*;


public class Kidnapping extends Crime implements Enmity{
    
 
    protected String[] enmity = new String[5];
    protected String[] lastPlace = new String[5];
    protected String place;
    protected String bloodSample;
    protected String hormoneLevel;
    protected String financial_situation;
    public static int bsRate,hlRate,lpRate,enRate,fsRate = 0;
    
    
    public Kidnapping(String suspectId, String suspect_name, String suspect_surname, String gender, int guilty_rate, String[] lastPlace,
            String bloodSample,String hormoneLevel,String financial_situation){
        super(suspectId,suspect_name,suspect_surname,gender,guilty_rate);
        this.lastPlace = lastPlace;
        this.bloodSample = bloodSample;
        this.hormoneLevel = hormoneLevel;
        this.financial_situation = financial_situation;
        
      

    }
    
    public Kidnapping(String victim_name, String victim_surname,String vic_gender, String[] enmity, String place,String financial_situation){
        super(victim_name,victim_surname,vic_gender);
        this.enmity = enmity;
        this.place = place;
        this.financial_situation = financial_situation;
    
    }
    
    public String getBloodSample(){
        return bloodSample;
    }
    
    public String writeBloodSample(){
        return ("\nFound in Blood: "+getBloodSample());
    }    
    
    public String getHormoneLevel(){
        return hormoneLevel;
    }
    
    public String writeHormoneLevel(){
        return ("Hormone Level: "+getHormoneLevel());
    }

    
    public static int bloodSample(String str){
        if(str.equalsIgnoreCase("Drug")){
            bsRate = 0;
            bsRate = bsRate +1;
        }
        else if(str.equalsIgnoreCase("Alcohol")){
            bsRate = 0;
            bsRate = bsRate +1;
        }
        else if(str.equalsIgnoreCase(" ")){
            bsRate = 0;
            bsRate = bsRate +0;
        }
        else{
            bsRate = 0;
            bsRate = bsRate +2;
        }
        return bsRate;
    }
    
    public static int hormoneLevel(String str){
        if(str.equalsIgnoreCase("At Reference Value")){
            hlRate = 0;
            hlRate = hlRate + 0;
        }
        else if(str.equalsIgnoreCase("Above the Reference Value")){
            hlRate = 0;
            hlRate = hlRate + 2;
        }
        return hlRate;
    }
    
    public static int comparePlace(String str,String[] lastPlace){
      if(str.equalsIgnoreCase(lastPlace[0])){
          lpRate = 0;
          lpRate = lpRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[1])){
          lpRate = 0;
          lpRate = lpRate + 3;
      } 
      else if(str.equalsIgnoreCase(lastPlace[2])){
          lpRate = 0;
          lpRate = lpRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[3])){
          lpRate = 0;
          lpRate = lpRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[4])){
          lpRate = 0;
          lpRate = lpRate + 3;
      }
      else{
          lpRate = 0;
      }
      
          return lpRate;
    }  
    
    public static int comparefinancialSit(String vtr, String str){
        if(vtr.equalsIgnoreCase("Rich")&&(str.equalsIgnoreCase("Poor"))){
            fsRate = 0;
            fsRate = fsRate +2;
        }
        else if(vtr.equalsIgnoreCase("Rich")&&(str.equalsIgnoreCase("Moderate"))){
            fsRate = 0;
            fsRate = fsRate +1;
        }
        else if(vtr.equalsIgnoreCase("Moderate")&&(str.equalsIgnoreCase("Poor"))){
            fsRate = 0;
            fsRate = fsRate +1;
        }
        else{
            fsRate = 0;
            fsRate = fsRate +0;
        }
        return fsRate;
    }
    
    public static int compareEnmity(String str,String[] enmity){
      if(str.equalsIgnoreCase(enmity[0])){
          enRate = 0;
          enRate = enRate + 3;
      }
      else if(str.equalsIgnoreCase(enmity[1])){
          enRate = 0;
          enRate = enRate + 3;
      } 
      else if(str.equalsIgnoreCase(enmity[2])){
          enRate = 0;
          enRate = enRate + 3;
      }
      else if(str.equalsIgnoreCase(enmity[3])){
          enRate = 0;
          enRate = enRate + 3;
      }
      else if(str.equalsIgnoreCase(enmity[4])){
          enRate = 0;
          enRate = enRate + 3;
      }
      else{
          enRate = 0;
      }
      
          return enRate;
    }     

    @Override
    public String writeEnmities(){
        return ("\n"+enmity[0]+"\n"+enmity[1]+"\n"+enmity[2]+"\n"+enmity[3]+"\n"+enmity[4]);
    }
 
    @Override
    public String toString(){
        return (super.toString());
    }

   @Override
    public String toStrings() {
       return(super.toStrings()+"\n");
    }
    
    @Override
    public String writeCrimes() {
        return ("These are Kidnapping Crimes\n");
    }
}