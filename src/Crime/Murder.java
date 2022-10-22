/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;

import Interfaces.*;




public class Murder extends Crime implements WriteCallLogs{
   protected String bloodSample;
   protected String hormoneLevel;
   protected String suspect_phonenum;
   protected String fingerprintMatchRate;
   public static int rate,bsRate,hlRate,cwRate,cpnRate = 0;
  

  protected String[] logcalls = new String[5];
 

    public Murder(String suspectId, String suspect_name, String suspect_surname, String gender, String fingerprintMatchRate, int guilty_rate,
            String bloodSample,String hormoneLevel,String suspect_phonenum){
        super(suspectId,suspect_name,suspect_surname,gender,guilty_rate);
        this.fingerprintMatchRate = fingerprintMatchRate;
        this.bloodSample = bloodSample;
        this.hormoneLevel = hormoneLevel;
        this.suspect_phonenum = suspect_phonenum;

    }
    
    public Murder(String victim_name, String victim_surname,String vic_gender, String[] logcalls){
        super(victim_name,victim_surname,vic_gender);
        this.logcalls = logcalls;
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
    
    public String getPhoneNum(){
        return suspect_phonenum;
    }
    
    public String writePhoneNum(){
        return ("\nSuspect's Phone Number: "+getPhoneNum());
    }
      public static int FingerprintRate(String fingerprintMatchRate) {
        if(fingerprintMatchRate.equalsIgnoreCase("0")){
            rate = 0;
        }
        else if(fingerprintMatchRate.equalsIgnoreCase("25")){
            rate = 0;
            rate = rate +1; 
        }
        else if(fingerprintMatchRate.equalsIgnoreCase("50")){
            rate = 0;
            rate = rate +2;
            
        }
        else if (fingerprintMatchRate.equalsIgnoreCase("75")){
            rate = 0;
            rate = rate +3;
        }
        else if(fingerprintMatchRate.equalsIgnoreCase("100")){
            rate = 0;
            rate = rate +4;
        }
        return rate;
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
    
    public static int crimeWeapon(){
        cwRate = 0;
        return cwRate = cwRate + 2;
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
    
    @Override
    public String writeCallLogs(){
        return ("\n"+logcalls[0]+"\n"+logcalls[1]+"\n"+logcalls[2]+"\n"+logcalls[3]+"\n"+logcalls[4]);
    }

    @Override
    public String writeCrimes() {
        return ("These are Murder Crimes\n");
    }
   @Override
    public String toString(){
        return (super.toString()+"\n"+"Fingerprint Match Rate: "+fingerprintMatchRate);
    }

   @Override
    public String toStrings() {
       return(super.toStrings()+"\n");
    }
}

    
