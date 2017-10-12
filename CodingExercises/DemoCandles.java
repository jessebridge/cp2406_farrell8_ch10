public class DemoCandles {
    public static void main(String[] args) {
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        candle1.setColor("blue");
        candle1.setHeight(5);
        candle1.setPrice();
        candle2.setColor("red");
        candle2.setHeight(15);
        candle2.setPrice();
        candle2.setScent("blueberry");
        System.out.println("The candle is " + candle1.getColor() + " and is " + candle1.getHeight()+ " inches tall and costs " + candle1.getPrice());
        System.out.println("The cande is " + candle2.getColor() + " and is " + candle2.getHeight() + " inches tall and costs " + candle2.getPrice() + " and smells like " + candle2.getScent());
    }
}
