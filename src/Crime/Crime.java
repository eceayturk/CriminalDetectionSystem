/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;

/**
 *
 * @author ebrue
 */
public abstract class Crime {
   protected String victim_name;
   protected String victim_surname;
   protected String vic_gender;
   protected String suspectId;
   protected String suspect_name;
   protected String suspect_surname;
   protected String sus_gender;
   protected int guilty_rate;
   
   public Crime(String victim_name,String victim_surname,String vic_gender){
       this.vic_gender = vic_gender;
       this.victim_name = victim_name;
       this.victim_surname = victim_surname;
   }
 
   
  public Crime(String suspectId,String suspect_name,String suspect_surname,String sus_gender,int guilty_rate){
      this.sus_gender = sus_gender;
      this.suspectId = suspectId;
      this.suspect_name = suspect_name;
      this.suspect_surname = suspect_surname;
      this.guilty_rate = guilty_rate;

  }
  public abstract String writeCrimes();
  
    public String getSuspectGender(){
       return sus_gender;
  }
    public String getSuspectName(){
       return suspect_name;
  }
    public String getSuspectSurname(){
       return suspect_surname;
  }
     public String getSuspectId(){
       return suspectId;
  }

  
     public boolean getSuspectId(String suspectId){
        if(this.suspectId.equals(suspectId))
            return true;
        else
            return false;                            
     }

   public String getVictimName(){
       return victim_name;
       
   }
   public String getVictimSurname(){
       return victim_surname;
   }
   public String getVictimGender(){
       return vic_gender;
   }
   public int getTotalGuiltyRate(){
       return guilty_rate;
   }
      public String writeTotalRate(){
       return("\nTotal Rate: "+ getTotalGuiltyRate());
   }
   
   public  String toString(){
       return("Suspect ID: "+suspectId+"\nSuspect Name: "+suspect_name+"\nSuspect Surname: "+suspect_surname+"\nGender: "+sus_gender);
   }
   public String toStrings(){
       return("Victim Name: "+victim_name+"\nVictim Surname: "+victim_surname+"\nVictim's gender: "+vic_gender);
   }
    
    
    
    

   
   
       
}
