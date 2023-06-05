package com.agn.homework7m3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agn.homework7m3.databinding.ItemUsersBinding

class UsersAdapter(
    var arrayListUsers: ArrayList<UsersModel>
) : RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(ItemUsersBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.onBind(arrayListUsers[position])
    }

    override fun getItemCount(): Int {
        return arrayListUsers.size
    }

    class UsersViewHolder(private val binding : ItemUsersBinding) : RecyclerView.ViewHolder(binding.root){

        fun onBind(users: UsersModel){
            binding.textView.text = users.name + " " + users.age.toString()
            binding.imageUser.setImageResource(users.img)
        }
    }
}