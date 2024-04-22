package Models;

import androidx.recyclerview.widget.RecyclerView;

public class Popularitems {

    private String PopularitemesName;
    private int PopularitemsImage;
    private String PopularitemsDesc;
    private String PopularitemPrice;
    private String PopularitemDesc2;


    public Popularitems(String productName, String productDesc , int productImage , String popularitemPrice, String popularitemDesc2) {
        this. PopularitemesName = productName;
        this.PopularitemsDesc = productDesc;
        this.PopularitemsImage = productImage;
        this.PopularitemPrice = popularitemPrice;
        this.PopularitemDesc2 = popularitemDesc2;
    }
    public String getPopularitemesName() {return PopularitemesName;}
    public int getPopularitemsImage() {return PopularitemsImage;}
    public String getPopularitemsDesc() {return PopularitemsDesc;}
    public String getPopularitemPrice() {return PopularitemPrice;}
    public String getPopularitemDesc2() {return PopularitemDesc2;}

}
