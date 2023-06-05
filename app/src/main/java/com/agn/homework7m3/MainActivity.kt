package com.agn.homework7m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agn.homework7m3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UsersAdapter
    var arrayList: ArrayList<UsersModel> = ArrayList()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            fillRecicler()
            binding.reciclerView.adapter = adapter
        }

        private fun fillRecicler() {
            arrayList.add(UsersModel("Victor",34,R.drawable.person_first_img))
            arrayList.add(UsersModel("Maikl",23,R.drawable.person_second_img))
            arrayList.add(UsersModel("Trevor",54,R.drawable.person_third_img))
            arrayList.add(UsersModel("Niki",43,R.drawable.persont_forth_img))
            arrayList.add(UsersModel("Jane",25,R.drawable.person_fifth_img))
            arrayList.add(UsersModel("Albert",26,R.drawable.person_six_img))
            arrayList.add(UsersModel("Aleks",32,R.drawable.person_seven_img))
            arrayList.add(UsersModel("Miki",28,R.drawable.person_eight_img))
            arrayList.add(UsersModel("Layla",22,R.drawable.person_nine_img))
            adapter = UsersAdapter(arrayList)
            binding.reciclerView.adapter
        }
    }
