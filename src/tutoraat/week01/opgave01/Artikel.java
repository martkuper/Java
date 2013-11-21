public class Artikel {

    private String name;
    private float price;

    /**
     * Constructor
     *
     * @param aName
     * @param aPrijs
     */
    public Artikel(String aName, float aPrijs){
        name = aName;
        price = aPrijs;
    }

    /**
     * Setter voor de naam
     *
     * @param aName
     */
    public void setName(String aName){
        name = aName;
    }

    /**
     * Setter voor de prijs
     *
     * @param aPrice
     */
    public void setPrice(float aPrice){
        price = aPrice;
    }

    /**
     * Getter voor de naam
     *
     * @return naam
     */
    public String getName(){
        return "Naam " + name;
    }

    /**
     * Getter voor de prijs
     *
     * @return
     */
    public String getPrice(){
        return "Prijs " + price;
    }

    /**
     * Methode om de naam en prijs naar het scherm te printen
     *
     */
    public void drukAf(){
        System.out.println(getName());
        System.out.println(getPrice());
    }
}