/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crime;

/**
 *
 * @author ebrue
 */
public class ChildKidnapping extends Kidnapping {
    public static int dbRate,spRate,hsRate = 0;
    private int age_sus;
    private int age_vic;
    private String stuff_place;
    
    
   
    
    public ChildKidnapping(String suspectId, String suspect_name, String suspect_surname, String gender,
            String hormoneLevel, String bloodSample, int guilty_rate, String[] lastPlace, String financial_situation,int age_sus){
        super(suspectId, suspect_name, suspect_surname, gender,guilty_rate,lastPlace,bloodSample,hormoneLevel,financial_situation);
        this.age_sus=age_sus;
  
    }
    
    public ChildKidnapping(String vic_name, String vic_surname, String gender, String[] enmity, String place,
            String financial_situation,String stuff_place,int age_vic){
        super(vic_name,vic_surname,gender,enmity,place,financial_situation);
        this.stuff_place=stuff_place;
        this.age_vic=age_vic;
    }
    
    public static int compareStuffPlace(String str,String[] lastPlace){
      if(str.equalsIgnoreCase(lastPlace[0])){
          spRate = 0;
          spRate = spRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[1])){
          spRate = 0;
          spRate = spRate + 3;
      } 
      else if(str.equalsIgnoreCase(lastPlace[2])){
          spRate = 0;
          spRate = spRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[3])){
          spRate = 0;
          spRate = spRate + 3;
      }
      else if(str.equalsIgnoreCase(lastPlace[4])){
          spRate = 0;
          spRate = spRate + 3;
      }
      else{
          spRate = 0;
      }
     
     return spRate;
    }    
     public static int debt(){
        dbRate = 0;
        return dbRate = dbRate + 2;
    }
     
      public static int history(){
        hsRate = 0;
        return hsRate = hsRate + 2;
    }
     
     public String writeLastPlace(){
         return ("\n"+lastPlace[0]+"\n"+lastPlace[1]+"\n"+lastPlace[2]+"\n"+lastPlace[3]+"\n"+lastPlace[4]);
    }
     
    @Override
     public String writeCrimes() {
       return (super.writeCrimes()+"Here is the Child Kidnapping Case\n\n");
    }
     
     
      @Override
    public String toString(){
        return (super.toString()+"\n"+ "Suspect Age: "+ age_sus+"\n"+
                writeBloodSample()+"\n"+writeHormoneLevel()+ "\n5 place s/he went"+writeLastPlace()+
                "\nFinancial Situation: "+ financial_situation+writeTotalRate()+"\n\n");

    }
    
    @Override
    public String toStrings(){
        return(writeCrimes()+super.toStrings()+ "Victim's age: "+age_vic+"\nLast place: "
                +place+"\nHis/Her Enmity's: "+writeEnmities()+"\nFinancial Situation: "+financial_situation);
    }
    
}
