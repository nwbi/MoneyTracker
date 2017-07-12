package ru.leskovets.moneytracker.API;

import android.text.TextUtils;

/**
 * Created by yuril on 08.07.2017.
 */

public class Result {
    String status;

    public boolean isSuccess() {
        return TextUtils.equals(status, "success");
    }
}
