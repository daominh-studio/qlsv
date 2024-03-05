package com.example.firebase;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIservice {
    String DOMAIN = "http://192.168.1.57:3000/";

    @GET("/api/list")
    Call<List<SinhVien>> getSinhVien();

    @POST("/api/addSinhVien")
    Call<List<SinhVien>> addSinhVien(@Body SinhVien sinhVien);
    @PUT("/api/updateSinhVien/{id}")
    Call<List<SinhVien>> updateSinhVien(@Path("id") String id, @Body SinhVien sinhVien);
    @DELETE("/api/deleteSinhVien/{id}")
    Call<List<SinhVien>> deleteSinhVien(@Path("id") String id);
}
