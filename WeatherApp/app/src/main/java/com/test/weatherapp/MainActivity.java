package com.test.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.test.weatherapp.retrofit.Api_serv;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();
    }

    private void getDataFromApi() {
        Api_serv.endpoint().getData().enqueue(new Callback<MainModel>() {
            @Override
            public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                if (response.isSuccessful()){
                    MainModel data = response.body();
                    Log.d(TAG, data.toString());
                }
            }

            @Override
            public void onFailure(Call<MainModel> call, Throwable t) {
                Log.d(TAG, t.toString());
            }
        });
    }
}