package net.paulacr.billshare.main;

import android.support.design.widget.TextInputLayout;

/**
 * Created by paularosa on 3/20/16.
 */
public interface BillShareInterface {

    public interface Presenter {
        void valideField(String text, TextInputLayout inputLayout);
        void validateTaxValueField(String text, TextInputLayout inputLayout);
        long calculateBillShare(int numberOfPeople, long totalValue, long alredyPaidValue, float taxValue);
    }

    public interface View {
        void setupButterknife();
        void setupViews();
        void setupPresenter();
        void showSharedValue(String sharedValue);
        void setFieldErrors(TextInputLayout view, String message);
        void cleanFieldErrors(TextInputLayout textInputLayout);
    }
}
