/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;


public class WithAGunDeath extends Murder{
    private String crimeGunSerialNum;
    private String suspectGunSerialNum;
    private String crimeBulletDiameter;
    private String suspectBulletDiameter;
    public static int csnRate,cbdRate = 0;
   
    
    
    public WithAGunDeath(String suspectId, String suspect_name, String suspect_surname, String gender,
            String fingerprintMatchRate,String suspectGunSerialNum, String suspectBulletDiameter, 
            String hormoneLevel, String bloodSample,String suspect_phonenum, int guilty_rate){
        super(suspectId, suspect_name, suspect_surname, gender, fingerprintMatchRate, guilty_rate,bloodSample,hormoneLevel,suspect_phonenum);
        this.suspectGunSerialNum = suspectGunSerialNum;
        this.suspectBulletDiameter = suspectBulletDiameter;



    }
    
    public WithAGunDeath(String vic_name, String vic_surname, String gender, String[] logcalls,
            String crimeGunSerialNum, String crimeBulletDiameter){
        super(vic_name,vic_surname,gender,logcalls);
        this.crimeBulletDiameter = crimeBulletDiameter;
        this.crimeGunSerialNum = crimeGunSerialNum;
    }

    public static int compareSerialNum(String crimeGunSerialNum, String suspectGunSerialNum){
     if(crimeGunSerialNum.equalsIgnoreCase(suspectGunSerialNum)){
        csnRate = 0;
        csnRate = csnRate + 5;
    }
    else{
        csnRate = 0;
    }
        return csnRate;
    }
    
    public static int compareBulletDiameter(String crimeBulletDiameter, String suspectBulletDiameter){
      if(crimeBulletDiameter.equalsIgnoreCase(suspectBulletDiameter)){
        cbdRate = 0;
        cbdRate = cbdRate +3;
      }
      else{
        cbdRate = 0;
      }
      
        return cbdRate;
    }
    
    @Override
    public String toString(){
        return (super.toString()+"\n"+ "Suspect's Gun Serial Number: "+suspectGunSerialNum+
                "\nSuspect's Gun's Bullet Diameter: "+suspectBulletDiameter+"\n"+ 
                writeHormoneLevel()+writeBloodSample()+writePhoneNum()+ "\n"+writeTotalRate()+"\n\n");
    }

    
    @Override
     public String toStrings(){
        return(writeCrimes()+super.toStrings()+"\nLast 5 call logs: "+writeCallLogs()+"\nCrime Gun Serial Number: "+
                crimeGunSerialNum+"\nCrime Gun's Bullet Diameter: "+crimeBulletDiameter);
    }
    
    @Override
    public String writeCrimes(){
        return (super.writeCrimes()+"Here is the Crimes Commited With A Gun\n\n");
    }
    


   

  
}
