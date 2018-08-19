package databaseproducts;

public class Product {

    private int id;
    private String name;
    private float price;
    private byte[] picture;
    private String addDate;
    public Product(int pid,String pname,float pprice,String pAddDate,byte[] pImg ){
        this.id=pid;
        this.name=pname;
        this.price=pprice;
        this.addDate=pAddDate;
        this.picture=pImg;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddDate() {
        return addDate;
    }

    public byte[] getPicture() {
        return picture;
    }

    public float getPrice() {
        return price;
    }
}
