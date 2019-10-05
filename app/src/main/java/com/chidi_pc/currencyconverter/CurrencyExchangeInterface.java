package com.chidi_pc.currencyconverter;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyExchangeInterface {

    @GET("latest?access_key=283c7d6a918d1e9bd1cd7bdc4a52c5e1&format=1")
    Call<CurrencyExchange>loadCurrencyExchange();

}
