package ru.leskovets.moneytracker.API;

import retrofit2.http.POST;
import ru.leskovets.moneytracker.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
/**
 * Created by yuril on 08.07.2017.
 */

public interface LSApi {

//    @GET("auth")
//    in future

    @Headers("Content-Type: application/json")
    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

    @Headers("Content-Type: application/json")
    @POST("items/add")
    Call<AddResult> add(@Query("name") String name, @Query("price") int price, @Query("type") String type);

    @Headers("Content-Type: application/json")
    @POST("items/remove")
    Call<Result> remove(@Query("id") int id);
}
