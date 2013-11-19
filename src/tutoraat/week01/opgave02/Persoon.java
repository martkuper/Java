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
        BSN = aBSN;
        firstName = aFirstName;
        lastName = aLastName;
        gender = aGender;
        setBirthDate(aDay, aMonth, aYear);
    }

    /**
     * Getter voor de geboortedatum
     * @return Geboortedatum
     */
    public String getGeboorteDatum(){
        String temp;
        if(bDay == 0 && bMonth == 0 && bYear == 0){
            temp = "Onbekend";
        }else{
            temp = bDay + "/" + bMonth + "/" + bYear;
        }

        return temp;
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
            return true;

        }else if(Arrays.asList(monthsWith31Days).contains(aMonth) && aDay != 31){

            invalidDate();
            return true;

        }else if(aMonth == 2 && aDay != 28){

            invalidDate();
            return true;

        }else{

            bDay = aDay;
            bMonth = aMonth;
            bYear = aYear;
            return true;

        }
    }
}