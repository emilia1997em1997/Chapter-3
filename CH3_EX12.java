//Class INVOICE
public class CH3_EX12 {
    private String PartNumber;

    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String partNumber) {
        PartNumber = partNumber;
    }

    private String PartDescription;

    public String getPartDescription() {
        return PartDescription;
    }

    public void setPartDescription(String partDescription) {
        PartDescription = partDescription;
    }

    private int QuantityofItemPurshed;

    public int getQuantityofItemPurshed() {
        return QuantityofItemPurshed;
    }

    public void setQuantityofItemPurshed(int quantityofItemPurshed) {
        QuantityofItemPurshed = quantityofItemPurshed;
    }

    private double PriceperItem;

    public double getPriceperItem() {
        return PriceperItem;
    }

    public void setPriceperItem(double priceperItem) {
        PriceperItem = priceperItem;
    }
    public double getInvoiceAmount () {
        double calculateTotalAmount;
        calculateTotalAmount = QuantityofItemPurshed * PriceperItem;
        return calculateTotalAmount;
    }

}
