package Articles;

public class Articles {
    String code;
    String name;
    String desc;
    double priceS;
    double priceP;
    int quantity;

    public Articles(String code, String name, String desc, double priceP, double priceS, int quantity) {
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.priceP = priceP;
        this.priceS = priceS;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPriceS() {
        return priceS;
    }

    public String getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPriceP() {
        return priceP;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPriceS(double priceS) {
        this.priceS = priceS;
    }

    public void setPriceP(double priceP) {
        this.priceP = priceP;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
