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

public class HeadDamageDeath extends Murder implements MuscleStrength {
    private int age_sus;
    private int age_vic;
    private double weight_sus;
    private double weight_vic;
    private double susWeaponWeight;
    private double crimeWeaponWeight;
    private int damageSize;
    private String weaponType;
    private double totalSusForce = totalForceCalc(age_sus,(weight_sus+susWeaponWeight));
    private double totalVicForce = totalForceCalc(age_vic,(weight_vic-damageSize)); 
    private static double force;
    public static int wwRate, cfRate = 0;

   
    
    
    public HeadDamageDeath(String suspectId, String suspect_name, String suspect_surname, String gender,
            String fingerprintMatchRate, int age_sus, double weight, String weaponType, double susWeaponWeight, double totalSusForce, 
            String hormoneLevel, String bloodSample,String suspect_phonenum, int guilty_rate){
        super(suspectId, suspect_name, suspect_surname, gender, fingerprintMatchRate, guilty_rate,bloodSample,hormoneLevel,suspect_phonenum);
        this.age_sus = age_sus;
        this.weaponType = weaponType;
        this.weight_sus = weight;
        this.susWeaponWeight = susWeaponWeight;
        this.totalSusForce = totalSusForce;
  
    
    }
    
    public HeadDamageDeath(String vic_name, String vic_surname, String gender, String[] logcalls,int age_vic, 
            String weaponType,int damageSize,double crimeWeaponWeight, double weight, double totalVicForce){
        super(vic_name,vic_surname,gender,logcalls);
        this.weight_vic = weight;
        this.age_vic = age_vic;
        this.damageSize = damageSize;
        this.totalVicForce = totalVicForce;
        this.weaponType = weaponType;
        this.crimeWeaponWeight = crimeWeaponWeight;
    }
    
    public static int compareweaponWeight(double crimeWeaponWeight,double susWeaponWeight){
        if(crimeWeaponWeight == susWeaponWeight){
            wwRate = 0;
            wwRate = wwRate+2;
        }
        else{
            wwRate = 0;
        }
        return wwRate;
    }
    
    public static double totalForceCalc(int age, double weight){
        if(age >= 18 && age <= 25){
             force = weight*MAX_YIELD;
             return force;
        }
        else if(age > 25 && age <=100){
             force = weight*(MAX_YIELD-(age-25));
             return force;
        }
        else{
            return 0;
        }
    }
      
    
    public static int compareForce(double totalSusForce, double totalVicForce ){
            if(totalVicForce < totalSusForce){
               cfRate = 0;
               cfRate = cfRate +3;
               
           }
           else if(totalVicForce >= totalSusForce) {
               cfRate = 0;
           }
       
       return cfRate;
    }
 
    @Override
    public String toString(){
        return (super.toString()+"\n"+ "Suspect Age: "+ age_sus+ "\nCrime Weapon: "+weaponType+ 
                 "\nSuspect's Weight: "+weight_sus+ "\nSuspect's Force: "
                +totalSusForce+ "\n"+ "Suspect's crime weapon's weight: "+ susWeaponWeight+"\n"+ 
                writeHormoneLevel()+writeBloodSample()+writePhoneNum()+"\n"+writeTotalRate()+"\n\n");
    }
    
    @Override
      public String toStrings(){
        return(writeCrimes()+super.toStrings()+ "\nVictim's age: "+age_vic+"\nLast 5 call logs: "+this.writeCallLogs()+
                "\nCrime's Weapon: "+weaponType+"\nHead Damage Size: "+damageSize+"\nCrime Weapon's Weight: "+crimeWeaponWeight+
                "\nVictim's weight: "+weight_vic+"\nVictim's Force: "+totalVicForce);
    }
    
    @Override
    public String writeCrimes() {
       return (super.writeCrimes()+"Here are assault 'With a Hard Object' crimes\n\n");
    }

 
}
