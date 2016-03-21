package net.paulacr.billshare.utils;

/**
 * Created by paularosa on 3/20/16.
 */
public class Validators {

    public Validators() {

    }

    public boolean isEmptyField(String value) {
        return value.isEmpty();
    }

    private void validateValueField() {

    }

    public boolean isValidField(String value) {
        return !isEmptyField(value) && !value.equalsIgnoreCase("");
    }


}
