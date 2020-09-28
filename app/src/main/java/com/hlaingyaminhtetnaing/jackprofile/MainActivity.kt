package com.hlaingyaminhtetnaing.jackprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.jackprofile.adapter.JackAdapter
import com.hlaingyaminhtetnaing.jackprofile.model.Jack
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jacklist=ArrayList<Jack>()
        jacklist.add(Jack(R.drawable.ic_wishlist,"My Wishlist"))
        jacklist.add(Jack(R.drawable.ic_credit_card,"My Followed Sellers"))
        jacklist.add(Jack(R.drawable.ic_purchase,"My Purchased Item"))
        jacklist.add(Jack(R.drawable.ic_voucher,"My Coupons"))
        jacklist.add(Jack(R.drawable.ic_credit_card,"My Cards Wallet"))
        jacklist.add(Jack(R.drawable.ic_voucher,"Exp Points"))
        jacklist.add(Jack(R.drawable.ic_wishlist,"My Given Feedbacks"))
        jacklist.add(Jack(R.drawable.ic_document,"Searched History"))
        jacklist.add(Jack(R.drawable.ic_wishlist,"Events & Calender"))

        var jackAdapter = JackAdapter(jacklist)
        txtRecycler.layoutManager= GridLayoutManager(this,3)
        txtRecycler.adapter = jackAdapter
    }
}