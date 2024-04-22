package Models;

public class Features {

    private String FeaturesName;
    private int FeaturesImage;
    private String FeaturesDelivary;
    private String FeaturesTime;
    private String FeaturesPrice;
    private String FeaturesDesc;


    public Features(String productName, String FeaturesDelivary, String FeaturesTime, int productImage, String FeaturesPrice, String FeaturesDesc) {
        this.FeaturesName = productName;
        this.FeaturesDelivary = FeaturesDelivary;
        this.FeaturesTime = FeaturesTime;
        this.FeaturesImage = productImage;
        this.FeaturesPrice = FeaturesPrice;
        this.FeaturesDesc = FeaturesDesc;
    }
    public String getFeaturesName() {return FeaturesName;}
    public int getFeaturesImage() {return FeaturesImage;}
    public String getFeaturesDelivary() {return FeaturesDelivary;}
    public String getFeaturesTime() {return FeaturesTime;}
    public String getFeaturesPrice() {return FeaturesPrice;}
    public String getFeaturesDesc() {return FeaturesDesc;}
}
