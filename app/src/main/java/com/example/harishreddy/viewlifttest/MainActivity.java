package com.example.harishreddy.viewlifttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.harishreddy.viewlifttest.model.Feed;
import com.example.harishreddy.viewlifttest.network.ServiceAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://www.snagfilms.com/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        ServiceAPI client = retrofit.create(ServiceAPI.class);
        Call<Feed> feedCall = client.getFeed();

        feedCall.enqueue(new Callback<Feed>() {
            @Override
            public void onResponse(Call<Feed> call, Response<Feed> response) {
                Log.d("Response",response.toString());
            }

            @Override
            public void onFailure(Call<Feed> call, Throwable t) {
                Log.i("Failure",t.toString());
            }
        });


    }
}
