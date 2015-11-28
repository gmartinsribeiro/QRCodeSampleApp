package com.gmartinsribeiro.qrcodereader.controller;

import retrofit.Callback;
import retrofit.http.POST;

/**
 * Created by Gonçalo Martins Ribeiro on 20-08-2015.
 */
public interface AptoideAPI {
    @POST("/listApps")
    void getAllApps(Callback<String> response);
}
