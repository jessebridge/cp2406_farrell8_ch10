public class Candle {
    public String color;
    public int height;
    public double price;

    public String getColor() {
        return color;
    }

    public int getHeight(){
        return height;
    }
    public double getPrice(){
        return price;
    }

    public void setColor(String c){
        color = c;
    }
    public void setHeight(int h){
        height = h;
    }
    public void setPrice(){
        price = height * 2;
    }
}
