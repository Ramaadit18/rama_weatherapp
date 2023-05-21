package com.test.weatherapp.retrofit;

import com.test.weatherapp.MainModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_endpointData {
    //Mengambil data forecast dari API
    @GET("forecast?latitude=-7.98&longitude=112.63&daily=weathercode&current_weather=true&timezone=auto")
    //Memanggil method getData() untuk mengambil data yang nantinya akan diolah
    Call<MainModel> getData();
}
