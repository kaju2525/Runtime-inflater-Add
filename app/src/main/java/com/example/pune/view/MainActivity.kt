package com.example.pune.view


import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.pune.demo.R
import com.example.pune.demo.model.Result
import com.example.pune.demo.restservices.APIService
import com.example.pune.demo.restservices.ApiUtils
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*


class MainActivity : AppCompatActivity(){



    private val TAG = MainActivity::class.java.simpleName
    private var apiServices: APIService? = null
    private lateinit var context: Context
    private lateinit var list: ArrayList<Result>
    private lateinit var recyclerView:RecyclerView
    private lateinit var mAdapter:mAdapters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this@MainActivity
        apiServices = ApiUtils.apiService

        initJson()
        initViews()
    }


    private fun initViews() {
        recyclerView = findViewById(R.id.recy_categroies)
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager

    }


    private fun initJson() {

        apiServices!!.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result ->
                            Log.d(TAG, "Response JSON = ${Gson().toJson(result.result)}")

                            list = ArrayList(result.result)
                            mAdapter = mAdapters(list)
                            recyclerView.adapter = mAdapter

                        },
                        { error ->
                            Log.d(TAG, "ERROR ${error.message}")
                        }
                )
    }


}
