package com.example.pune.demo.restservices
import com.example.pune.demo.model.ResponseModel
import io.reactivex.Observable
import retrofit2.http.GET


interface APIService {


     @GET("/springkarun/pusauli_data/master/inflater.json")
    fun getData(): Observable<ResponseModel>




  /*  @POST("/categrory_details.php")
    @FormUrlEncoded
    fun getCategrory(@Field("category_id") catg_name: String): Observable<ResponseModel>

*/

    /*@Headers("Content-Type: application/json")
    @POST("/immigration/api/verifyOtp")
    fun verifyOtp(@Body body: Map<String, String>): Call<ResponseModel>

    @Headers("Content-Type: application/json")
    @POST("/immigration/api/resendOtp")
    fun resendOtp(@Body body: Map<String, String>): Call<ResponseModel>


    @Multipart
    @POST("/immigration/api/updateProfile")
    fun postImage(@Header ("accessToken") accessToken:String,
                  @Part image: MultipartBody.Part,
                  @Part("firstName") firstName: String,
                  @Part("lastName") lastName: String,
                  @Part("contact") contact: String,
                  @Part("countryCode") countryCode: String
                 ): Call<ResponseModel>


*/


/*

    @get:GET("/avatar_1.json")
    val avatar1: Call<JSONObject>

    @FormUrlEncoded
    @POST("/")
    fun Save(@Field("answer") name:String,
             @Field("Date") Date:String):Call<JSONObject>
*/


}