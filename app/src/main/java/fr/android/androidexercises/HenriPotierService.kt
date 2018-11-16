package fr.android.androidexercises

import retrofit2.http.GET
import retrofit2.Call


interface HenriPotierService {
    // TODO Method GET books which return a List<Book>

    @GET("books")
    fun listBooks(): Call<Array<Book>>

}
