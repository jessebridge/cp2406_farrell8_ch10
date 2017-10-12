public class ItemSold {
    public int invoiceNumber;
    public String description;
    public double price;

    public void setDescription(String d) {
       description = d;
    }
    public void setInvoiceNumber(int n){
        invoiceNumber = n;
    }
    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }
}
