package Crime;

import Interfaces.WriteCallLogs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebrue
 */
public class NarcoticCrimes extends Crime implements WriteCallLogs{

    private int age_addict;
    private String[] logcalls = new String[5];
    private String[] persons = new String[5];
    private String addictLastSeenLocation;
    private String substance;
    private String susphoneNum;
    private String suspectLastSeenLocation;
    private String foundSubstance;
    private String foundInBlood;
    public static int cpnRate, cnRate, cllRate, fsRate, fibRate, ageRate = 0;
    
    
    public NarcoticCrimes(String suspectId,String sus_name,String sus_surname,String gender,int guilty_rate,
            String susphoneNum,String suspectLastSeenLocation,String foundSubstance,String foundInBlood){
        super(suspectId,sus_name,sus_surname,gender,guilty_rate);
        this.susphoneNum = susphoneNum;
        this.suspectLastSeenLocation = suspectLastSeenLocation;
        this.foundSubstance = foundSubstance;
        this.foundInBlood = foundInBlood;
        
    }
    public NarcoticCrimes(String addict_name,String addict_surname,String gender,int age_addict,
            String[] logcalls, String[] persons,String addictLastSeenLocation,String substance){
        super(addict_name,addict_surname,gender);
        this.age_addict = age_addict;
        this.logcalls = logcalls;
        this.persons = persons;
        this.addictLastSeenLocation = addictLastSeenLocation;
        this.substance = substance;
                
    }
    
     public static int comparePhoneNum(String str,String[] logcalls){
      if(str.equalsIgnoreCase(logcalls[0])){
          cpnRate = 0;
          cpnRate = cpnRate + 2;
      }
      else if(str.equalsIgnoreCase(logcalls[1])){
          cpnRate = 0;
          cpnRate = cpnRate + 2;
      } 
      else if(str.equalsIgnoreCase(logcalls[2])){
          cpnRate = 0;
          cpnRate = cpnRate + 2;
      }
      else if(str.equalsIgnoreCase(logcalls[3])){
          cpnRate = 0;
          cpnRate = cpnRate + 2;
      }
      else if(str.equalsIgnoreCase(logcalls[4])){
          cpnRate = 0;
          cpnRate = cpnRate + 2;
      }
      else{
          cpnRate = 0;
      }
      return cpnRate;
     }
     
     
       public static int compareName(String str,String[] persons){
      if(str.equalsIgnoreCase(persons[0])){
          cnRate = 0;
          cnRate = cnRate + 3;
      }
      else if(str.equalsIgnoreCase(persons[1])){
          cnRate = 0;
          cnRate = cnRate + 3;
      } 
      else if(str.equalsIgnoreCase(persons[2])){
          cnRate = 0;
          cnRate = cnRate + 3;
      }
      else if(str.equalsIgnoreCase(persons[3])){
          cnRate = 0;
          cnRate = cnRate + 3;
      }
      else if(str.equalsIgnoreCase(persons[4])){
          cnRate = 0;
          cnRate = cnRate + 3;
      }
      else{
          cnRate = 0;
      }
      return cnRate;
     }
       
       public static int compareLastLocation(String addict_loc, String sus_loc ){
           if(addict_loc.equalsIgnoreCase(sus_loc)){
               cllRate = 0;
               cllRate = cllRate + 4;
           }
           else{
               cllRate = 0;
           }
           return cllRate;
       }
    
     public static int foundSubstanceRate(){
         fsRate = 0;
         fsRate = fsRate + 5 ;
         return fsRate;  
     } 
     
     public static int foundInBloodRate(){
         fibRate = 0;
         fibRate = fibRate + 1;
         return fibRate;
     }
     
     public static int ageRate(int age){
         if(age <= 18){
         ageRate = 0;
         ageRate = ageRate + 1;
         }
         else{
             ageRate = 0;
         }
         return ageRate;
     }

    
    @Override
    public String toString(){
        return (super.toString()+"\n"+"Suspect's Phone Number: "+susphoneNum+"\nSuspect's Last Location: "+suspectLastSeenLocation+
        "\nWas the substance found on any property of the suspect? "+foundSubstance+
        "\nWas foreign substance found in the suspect's blood? "+foundInBlood+"\n"+writeTotalRate()+"\n\n");
    }
    
    @Override
    public String toStrings(){
        return (writeCrimes()+super.toStrings()+"\nAddict's Age: "+age_addict+"\nLast 5 call logs: "+this.writeCallLogs()+
                "\nLast 5 person s/he talked to face to face: "+this.writeTalkedPersons()+
                "\nAddict's Last Location: "+addictLastSeenLocation+"\nAddict's addiction: "+substance);
    }
    
    @Override
    public String writeCrimes() {
        return ("Here is the Narcotic Crimes\n");
    }

    @Override
    public String writeCallLogs() {
         return ("\n"+logcalls[0]+"\n"+logcalls[1]+"\n"+logcalls[2]+"\n"+logcalls[3]+"\n"+logcalls[4]);
    }
    public String writeTalkedPersons(){
        return ("\n"+persons[0]+"\n"+persons[1]+"\n"+persons[2]+"\n"+persons[3]+"\n"+persons[4]);
    }
    
}
