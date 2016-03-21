package net.paulacr.billshare.main;

/**
 * Created by paularosa on 3/20/16.
 */
public class BillShareModel {

    private int peopleNumber;
    private long totalValue;
    private long alreadyPaidValue;
    private float taxService;
    private long sharedBillValue;

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(long totalValue) {
        this.totalValue = totalValue;
    }

    public long getAlreadyPaidValue() {
        return alreadyPaidValue;
    }

    public void setAlreadyPaidValue(long alreadyPaidValue) {
        this.alreadyPaidValue = alreadyPaidValue;
    }

    public float getTaxService() {
        return taxService;
    }

    public void setTaxService(float taxService) {
        this.taxService = taxService;
    }

    public long getSharedBillValue() {
        return sharedBillValue;
    }

    public void setSharedBillValue(long sharedBillValue) {
        this.sharedBillValue = sharedBillValue;
    }
}
