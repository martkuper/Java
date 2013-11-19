import java.util.Arrays;

public class Persoon {

    private int BSN;
    private String firstName;
    private String lastName;
    private int bDay;
    private int bMonth;
    private int bYear;
    private char gender;
    private int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};

    public Persoon(int aBSN, String aFirstName, String aLastName, int aBDay, int aMDay, int aYDay, char aGender){



    }

    private void invalidDate(){
        bDay = 0;
        bMonth = 0;
        bYear = 0;
    }

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
