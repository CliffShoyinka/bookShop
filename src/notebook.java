public class notebook extends products{

    private String brand;
    private String sheet;

    public notebook(int id, String name, String price, int stock, String brand, String sheet) {
        super(id, name, price, stock);
        this.brand = brand;
        this.sheet = sheet;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }
}
