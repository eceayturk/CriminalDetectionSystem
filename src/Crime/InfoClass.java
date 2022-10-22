/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;


import Crime.*;
import java.util.ArrayList;

public class InfoClass {
   public static ArrayList <Crime> victimList = new ArrayList<>();
   public static ArrayList <Crime> suspectList = new ArrayList<>();
   
   
   
   public static ArrayList<Crime> getVictimList(){
       return victimList;
   }
   
   public static ArrayList<Crime> getSustpectList(){
       return suspectList;   
   }
   
   public static void addVictim(Crime vic){
       victimList.add(vic);
   }
   
   public static void addSuspect(Crime sus){
       suspectList.add(sus);
   }
   
   public static boolean deleteSuspect(String str){
      String id = str;
      for(int i = 0; i < suspectList.size(); i++){
           if(id == suspectList.get(i).getSuspectId()){
               suspectList.remove(i);
               return true;
   }
      }
      return false;
   }
     public static boolean deleteVictim(String str){
     
      for(int i = 0; i < victimList.size(); i++){
           if(str.equalsIgnoreCase(victimList.get(i).getVictimName())){
               victimList.remove(i);
               return true;
            }
      }
      return false;
   }

   
   public static String getAllSuspect(){
       String result = "";
       
       for( int i = 0; i < suspectList.size(); i++){
           result += suspectList.get(i).toString() + "\n";
           
       }
       return result;
   }
   
    public static String getAllVictim(){
       String result = "";
       
       for( int i = 0; i < victimList.size(); i++){
           result += victimList.get(i).toStrings() + "\n";
           
       }
       return result;
   }
      public static Crime searchSuspect(String id){
       for(int i=0; i <suspectList.size(); i++)
        {
            Crime cd = suspectList.get(i);
            if(cd.getSuspectId(id)){
                suspectList.get(i);
                return cd;
            }
        } 
       return null;
    }
      
      public static Crime findGuilty(){
          int max = 0;
          for(int i = 0; i < suspectList.size(); i++){
              if(suspectList.get(i).getTotalGuiltyRate() >= suspectList.get(max).getTotalGuiltyRate())
                  max = i;
          }
                return suspectList.get(max);
      }

  }
   
   
   
   
   
   
   

