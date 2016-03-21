package net.paulacr.billshare.main;

import android.content.Context;
import android.support.design.widget.TextInputLayout;

import net.paulacr.billshare.R;
import net.paulacr.billshare.utils.Validators;

/**
 * Created by paularosa on 3/20/16.
 */
public class BillSharePresenter implements BillShareInterface.Presenter{

    private BillShareInterface.View view;
    private Validators validator;
    private Context context;

    public BillSharePresenter(BillShareInterface.View billShare, Context context) {
        this.view = billShare;
        this.context = context;
        validator = new Validators();
    }


    @Override
    public void valideField(String text, TextInputLayout inputLayout) {
        if(validator.isValidField(text)) {
            view.cleanFieldErrors(inputLayout);
        } else {
            view.setFieldErrors(inputLayout, context.getString(R.string.ErrorWrongFieldValue));
        }

    }

    @Override
    public void validateTaxValueField(String text, TextInputLayout inputLayout) {

    }

    @Override
    public long calculateBillShare(int numberOfPeople, long totalValue, long alredyPaidValue, float taxValue) {
        long calculatedValue = (long) (totalValue * (taxValue/100));
        return calculatedValue/ numberOfPeople;
    }
}
