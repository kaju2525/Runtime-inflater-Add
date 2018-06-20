package com.example.pune.demo.model
import com.google.gson.annotations.SerializedName





data class ResponseModel(
    @SerializedName("result") val result: List<Result>
)

data class Result(
    @SerializedName("date") val date: String,
    @SerializedName("ride") val ride: List<Ride>
)

data class Ride(
    @SerializedName("pickup_location_address") val pickupLocationAddress: String,
    @SerializedName("drop_location_address") val dropLocationAddress: String,
    @SerializedName("avatar") val avatar: String
)


/*

{
    "result": [
    {
        "date": "16 January 2018",
        "ride": [
        {
            "pickup_location_address": "New Delhi",
            "drop_location_address": "Noida",
            "avatar": "https://www.culturalindia.net/iliimages/patna%20sahib.jpg"
        },
        {
            "pickup_location_address": "Patna",
            "drop_location_address": "Gaya",
            "avatar": "http://1.bp.blogspot.com/-o0hUxLV35Ks/U_1w96Btm0I/AAAAAAAAACw/12GVg5Rne-U/s1600/Buddha%2BSmriti%2BPark.jpg"
        },
        {
            "pickup_location_address": "Pune",
            "drop_location_address": "Mumbia",
            "avatar": "http://media7.trover.com/T/5503440ee9ae42012c000094/fixedw_large_4x.jpg"
        }
        ]
    },
    {
        "date": "05 March 2018",
        "ride": [
        {
            "pickup_location_address": "Kolkata",
            "drop_location_address": "New Delhi",
            "avatar": "https://media-cdn.tripadvisor.com/media/photo-s/05/5f/99/bd/mrpramod-thapa.jpg"
        },
        {
            "pickup_location_address": "Mohani",
            "drop_location_address": "Sasaram",
            "avatar": "http://1.bp.blogspot.com/-o0hUxLV35Ks/U_1w96Btm0I/AAAAAAAAACw/12GVg5Rne-U/s1600/Buddha%2BSmriti%2BPark.jpg"
        }
        ]
    },
    {
        "date": "02 April 2018",
        "ride": [
        {
            "pickup_location_address": "Banglore",
            "drop_location_address": "Chenni",
            "avatar": "https://static-collegedunia.com/public/college_data/images/appImage/25417_NITPATNA.jpg"
        },
        {
            "pickup_location_address": "Gujrat",
            "drop_location_address": "Pune",
            "avatar": "http://www.unificloud.in/wp-content/uploads/2017/03/3-UnifiCloud-Web-Design-in-Patna-Advertising-SEO-Domain-Hosting-Flight-Hotels-Cruise-Rental-Cars.jpg"
        },
        {
            "pickup_location_address": "Mumbia",
            "drop_location_address": "Satna",
            "avatar": "http://1.bp.blogspot.com/-o0hUxLV35Ks/U_1w96Btm0I/AAAAAAAAACw/12GVg5Rne-U/s1600/Buddha%2BSmriti%2BPark.jpg"
        },
        {
            "pickup_location_address": "New Delhi",
            "drop_location_address": "Agra",
            "avatar": "http://saharapackers.com/images/patna.jpg"
        },
        {
            "pickup_location_address": "Rachi",
            "drop_location_address": "Agra",
            "avatar": "http://www.unificloud.in/wp-content/uploads/2017/03/UnifiCloud-Web-Design-in-Patna-Advertising-SEO-Domain-Hosting-Flight-Hotels-Cruise-Rental-Cars-1.jpg"
        }
        ]
    }
    ]
}*/
