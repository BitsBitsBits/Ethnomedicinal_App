package com.example.ethnomedicinalapp.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofitClient;

    public static Retrofit getClient()
    {

        if (retrofitClient==null)
        {
            retrofitClient = new Retrofit.Builder()
                    .baseUrl("https://asia-east2-smooth-helper-347714.cloudfunctions.net/func2")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofitClient;
    }
}
