/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhysicalFeatures;


import Interfaces.*;


/**
 *
 * @author ebrue
 */
public class PhysicalFeatures implements MuscleStrength {
    protected int age_sus;
    protected int age_vic;
    protected double height_sus;
    protected double weight_sus;
    protected double height_vic;
    protected double weight_vic;
    protected static double power;
    public static int cmsRate = 0;
    protected double sus_strength = CalcMuscleStrength(age_sus,height_sus,weight_sus);
    protected double vic_strength = CalcMuscleStrength(age_vic,height_vic,weight_vic);
    
    
 public PhysicalFeatures(int age_sus, double height_sus, double weight_sus,double sus_strength){
    this.age_sus = age_sus;
    this.height_sus = height_sus;
    this.weight_sus = weight_sus;
    this.sus_strength = sus_strength;
 }
 public PhysicalFeatures(double height_vic, int age_vic,double weight_vic,double vic_strength){
     this.age_vic = age_vic;
     this.height_vic = height_vic;
     this.weight_vic = weight_vic;
     this.vic_strength = vic_strength;
 }
 
 public double getSusMuscle(){
     return sus_strength;
 }
 public String writeSusMuscle(){
     return ("\nSuspect's Muscles Strength: "+getSusMuscle());
 }
 public double getVicMuscle(){
     return vic_strength;
 }
 public String writeVicMuscle(){
     return ("\nVictim's Muscle Strength: "+getVicMuscle());
 }
 
 
 public static double CalcMuscleStrength(int age,double height, double weight) {
            if(age >= 18 && age <= 25){
             power = (weight/(height*height))*MAX_YIELD;
             return power;
        }
        else if(age > 25 && age <=100){
             power = (weight/(height*height))*(MAX_YIELD-(age-25));
             return power;
        }
        else{
            return 0;
        }
    }

        public static int compareMuscleStrenght(double vic_strength, double sus_strength ){
            if(vic_strength < sus_strength){
               cmsRate = 0;
               cmsRate = cmsRate +1;
               
           }
           else if(vic_strength >= sus_strength) {
               cmsRate = 0;
           }
       
       return cmsRate;
    }

 public String toString(){
     return ("Suspect Age: "+ age_sus+"\nSuspect's Height: "+height_sus+ "\nSuspect's Weight: "+weight_sus);
 }
  public String toStrings(){
     return ("Victim's age: "+age_vic+"\nVictim's height: "+height_vic+ "\nVictim's weight: "+weight_vic);
 }
    
}
