package ru.leskovets.moneytracker;

/**
 * Created by yuril on 08.07.2017.
 */

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.leskovets.moneytracker.API.LSApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LSApp extends Application {

    public LSApi api;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();

        final OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.HEADERS : HttpLoggingInterceptor.Level.NONE))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://stavimdveri.getsandbox.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        api = retrofit.create(LSApi.class);
    }

    public LSApi api() {
        return api;
    }

}