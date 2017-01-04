package com.example.saad.rxandroid;

import com.example.saad.rxandroid.data.remote.RetrofitClient;
import com.example.saad.rxandroid.data.remote.SOService;

/**
 * Created by saad on 1/4/17.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
