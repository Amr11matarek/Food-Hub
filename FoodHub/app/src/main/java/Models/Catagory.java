package Models;

public class Catagory {

    private String CatagoryName;
    private int CatagoryImage;


    public Catagory(String productName, int productImage) {
        this.CatagoryName = productName;
        this.CatagoryImage = productImage;
    }
    public String getCatagoryName() {
        return CatagoryName;
    }
    public int getCatagoryImage() {return CatagoryImage;}
}
