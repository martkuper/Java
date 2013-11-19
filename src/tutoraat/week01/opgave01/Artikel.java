public class Artikel {

    private String name;
    private float price;


    public Artikel(String aName, float aPrijs){
        name = aName;
        price = aPrijs;
    }
    
    public void setName(String aName){
        name = aName;
    }
    
    public void setPrice(float aPrice){
        price = aPrice;
    }
}