import java.util.Arrays;

/**
 * Class voor personen
 * 
 * @author Mart Kuper
 * @version 1.0
 * Last edit 19-11-2013
 */
  

public class Persoon { 
 
    private int BSN; 
    private String firstName;
    private String lastName;
    private int bDay;
    private int bMonth;
    private int bYear;
    private char gender;
    private String sGender;
    private int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};

    /**
     * Maak een persoon met de gegeven waarden
     *
     * @param aBSN  Je burgerservicenummer
     * @param aFirstName Je voornaam
     * @param aLastName Je achternaam
     * @param aDay Je geboortedag
     * @param aMonth Je geboortemaand
     * @param aYear Je geboortejaar
     * @param aGender Je geslacht
     */
   public Persoon(int aBSN, String aFirstName, String aLastName, int aDay, int aMonth, int aYear, char aGender){
        gender = aGender;
        setBSN(aBSN);
        setFirstName(aFirstName);
        setLastName(aLastName);
        setGender(aGender);
        setBirthDate(aDay, aMonth, aYear);
    }

    /**
     * Zet je geboortedag, maand en jaar op 0.
     */
    private void invalidDate(){
        bDay = 0;
        bMonth = 0;
        bYear = 0;
    }

    /**
     * Setter voor burgerservicenummer
     */
    public void setBSN(int aBSN){
        BSN = aBSN;
    }

    /**
     * Setter voor voornaam
     */
    public void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    /**
     * Setter voor achternaam
     */
    public void setLastName(String aLastName){
        lastName = aLastName;
    }

    /**
     * Methode om je geboortedatum te veranderen
     * aan de hand van de ingevoerden dag, maand en jaar
     *
     * @param aDay Je geboortedag
     * @param aMonth Je geboortemaand
     * @param aYear Je geboortejaar
     */
    public boolean setBirthDate(int aDay, int aMonth, int aYear){
        if(aDay < 1 || aMonth < 1 || aMonth > 12 || aYear < 1900 || aYear > 2100){

            invalidDate();
            return false;

        }else if(Arrays.asList(monthsWith31Days).contains(aMonth) && aDay > 31){

            invalidDate();
            return false;

        }else if(!(Arrays.asList(monthsWith31Days).contains(aMonth)) && aDay >= 31){

            invalidDate();
            return false;

        }else if(aMonth == 2 && aDay > 28){

            invalidDate();
            return false;

        }else{

            bDay = aDay;
            bMonth = aMonth;
            bYear = aYear;
            return true; 

        }
    }

    /**
     * Setter voor geslacht
     */
    public void setGender(char aGender){

        if(aGender == 'm'){
            sGender = "Man";
        }else if(aGender == 'f' || aGender == 'v'){
            sGender = "Vrouw";
        }
    }



    /**
     * Getter voor burgerservicenummer
     * @return Burgerservicenummer
     */
    public String getBSN(){
        return "Je burgerservicenummer is " + BSN;
    }

    /**
     * Getter voor voornaam
     * @return Voornaam
     */
    public String getFirstName(){
        return "Je voornaam is " + firstName;
    }

    /**
     * Getter voor achternaam
     * @return Achternaam
     */
    public String getLastName(){
        return "Je achternaam is " + lastName;
    }

    /**
     * Getter voor de geboortedatum
     * @return Geboortedatum
     */
    public String getBirthDate(){
        String temp;
        if(bDay == 0 && bMonth == 0 && bYear == 0){
            temp = "Onbekend";
        }else{
            temp = bDay + "/" + bMonth + "/" + bYear;
        }

        return temp;
    }

    /**
     * Getter voor geslacht
     * @return Geslacht
     */
    public String getsGender(){

    }

}