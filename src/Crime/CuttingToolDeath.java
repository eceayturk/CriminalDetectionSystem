
package Crime;



import PhysicalFeatures.*;

public class CuttingToolDeath extends Murder{
    

    private String weaponType;
    private double crimeToolArea;
    private double susCrimeToolArea;
    private PhysicalFeatures feature; 
    public static int ctaRate = 0;
   


    public CuttingToolDeath(String suspectId, String suspect_name, String suspect_surname, String gender,
            String fingerprintMatchRate, int age_sus, double height, double weight, String weaponType, double sus_strength, 
            double susCrimeToolArea, String hormoneLevel, String bloodSample,String suspect_phonenum, int guilty_rate){
        super(suspectId, suspect_name, suspect_surname, gender, fingerprintMatchRate, guilty_rate,bloodSample,hormoneLevel,suspect_phonenum);
        this.weaponType = weaponType;
        this.susCrimeToolArea = susCrimeToolArea;
  
        feature = new PhysicalFeatures(age_sus,height,weight,sus_strength);

    }
    
    public CuttingToolDeath(String vic_name, String vic_surname, String gender, String[] logcalls,int age_vic, 
            String weaponType,double height, double weight, double vic_strength, double crimeToolArea ){
        super(vic_name,vic_surname,gender,logcalls);

        this.crimeToolArea = crimeToolArea;
        this.weaponType = weaponType;
        
        feature = new PhysicalFeatures(height,age_vic,weight,vic_strength);

    }
    

    
        public static int compareCrimeArea(double crimeToolArea, double susCrimeToolArea){
        if(crimeToolArea == susCrimeToolArea){
            ctaRate = 0;
            ctaRate = ctaRate + 3;
        }
        else{
            ctaRate = 0;
        }
        
        return ctaRate;
    }
    
    
    @Override
    public String toString(){
        return (super.toString()+"\n"+feature.toString() +"\nCrime Weapon: "+weaponType+"\n"+ "Suspect's crime tool area: "+ susCrimeToolArea+"\n"+ 
                feature.writeSusMuscle()+writeHormoneLevel()+writeBloodSample()+writePhoneNum()+"\n"+writeTotalRate()+"\n\n");
    }
     
   
    
    public String toStrings(){
        return(writeCrimes()+super.toStrings()+feature.toStrings()+"\nLast 5 call logs: "+writeCallLogs()+
                "\nCrime's Weapon: "+weaponType+"\n"+feature.writeVicMuscle() + "\nSurface area of the wound: "+ crimeToolArea);
    }
    
    @Override
    public String writeCrimes() {
       return (super.writeCrimes()+"Here is the Crimes Commited With Cutting Tool\n\n");
    }

}

    
    
    
    
    
    
    
    
    
    
 