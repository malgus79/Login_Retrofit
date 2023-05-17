package com.cursosandroidant.loginretrofit.retrofit

import com.cursosandroidant.loginretrofit.Constants
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface LoginService {
    @Headers("Content-Type: application/json")
    @POST(Constants.API_PATH + Constants.LOGIN_PATH)
    //para esta fun se debe crear un modelo especial para pasarle los parametros (UserInfo)
    //y se devuelve una llamada (LoginResponse):
    fun login(@Body data: UserInfo): Call<LoginResponse>

    @POST(Constants.API_PATH + Constants.LOGIN_PATH)
    suspend fun loginUser(@Body data: UserInfo): LoginResponse

    @POST(Constants.API_PATH + Constants.REGISTER_PATH)
    suspend fun registerUser(@Body data: UserInfo) : RegisterResponse
}