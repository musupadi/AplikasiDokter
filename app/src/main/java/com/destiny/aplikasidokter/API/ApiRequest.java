package com.destiny.aplikasidokter.API;

import com.destiny.aplikasidokter.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {

    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseModel> registeruser(@Field("username") String username,
                                  @Field("password") String password,
                                     @Field("nama") String nama,
                                     @Field("umur") String umur);

    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseModel> loginuser(@Field("username") String username,
                                     @Field("password") String password);
}
