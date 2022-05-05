package com.example.actitvity2

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.actitvity2.data.entities.Email

class BuzonAdapter(private val context: Context,private val emails:List<Email>) : RecyclerView.Adapter<BuzonAdapter.ViewHolder>(){

    private val layoutInflater = LayoutInflater.from(context)
    inner class ViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){
        val letterId = itemView!!.findViewById<TextView>(R.id.txt_Circle_itemEmailLayout)
        val txtUser = itemView!!.findViewById<TextView>(R.id.txt_user_ItemEmailLayout)
        val txtInfo = itemView!!.findViewById<TextView>(R.id.txt_info_ItemEmailLayout)
        val txtResume = itemView!!.findViewById<TextView>(R.id.txt_resume_ItemEmailLayout)
        var idEmail = 0
        init {
            itemView!!.setOnClickListener{
                val intent =  Intent(context,ShowEmailActivity::class.java)
                intent.putExtra(INDEX_EMAL,idEmail)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_email_list,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val email = emails[position]
        val letter = email.User[0].toString()
        when(letter){
            in listOf<String>("A","B","C","D","E","F")-> holder.letterId.background = ContextCompat.getDrawable(context,R.drawable.text_view_circle_yellowblue)
            in listOf<String>("G","H","I")-> holder.letterId.background = ContextCompat.getDrawable(context,R.drawable.text_view_circle_blueshadow)
            in listOf<String>("J","K","L","M","N","O")-> holder.letterId.background = ContextCompat.getDrawable(context,R.drawable.text_view_circle_vinotinto)
            in listOf<String>("P","Q")-> holder.letterId.background = ContextCompat.getDrawable(context,R.drawable.text_view_circle_greelight)
            in listOf<String>("R","S","T","U")-> holder.letterId.background = ContextCompat.getDrawable(context,R.drawable.text_view_circle_green)
        }
        holder.letterId.text = letter
        holder.txtUser.text = email.User
        holder.txtInfo.text = email.Info
        holder.txtResume.text = email.Resume
        holder.idEmail = email.id


    }

    override fun getItemCount(): Int {
        return emails.size
    }
}