package com.example.pixel_effect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.android5kt.Effects

class EffectsAdepter(effectclick: Effectclick) :
    RecyclerView.Adapter<EffectsAdepter.EffectHolder>() {

    var click = effectclick

    class EffectHolder(itemview: View) : ViewHolder(itemview) {


        var imgEffect = itemview.findViewById<ImageView>(R.id.imgeffect)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EffectHolder {

        return EffectHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.effect_item, parent, false)
        )

    }

    override fun getItemCount(): Int {

        return 23
    }

    override fun onBindViewHolder(holder: EffectHolder, position: Int) {

        Glide.with(holder.itemView.context).load(MainActivity.uri).into(holder.imgEffect)
        when (position) {

            0 -> Effects.applyEffectNone(holder.imgEffect)
            1 -> Effects.applyEffect1(holder.imgEffect)
            2 -> Effects.applyEffect2(holder.imgEffect)
            3 -> Effects.applyEffect3(holder.imgEffect)
            4 -> Effects.applyEffect4(holder.imgEffect)
            5 -> Effects.applyEffect5(holder.imgEffect)
            6 -> Effects.applyEffect6(holder.imgEffect)
            7 -> Effects.applyEffect7(holder.imgEffect)
            8 -> Effects.applyEffect8(holder.imgEffect)
            9 -> Effects.applyEffect9(holder.imgEffect)
            10 -> Effects.applyEffect10(holder.imgEffect)
            11 -> Effects.applyEffect11(holder.imgEffect)
            12 -> Effects.applyEffect12(holder.imgEffect)
            13 -> Effects.applyEffect13(holder.imgEffect)
            14 -> Effects.applyEffect14(holder.imgEffect)
            15 -> Effects.applyEffect15(holder.imgEffect)
            16 -> Effects.applyEffect16(holder.imgEffect)
            17 -> Effects.applyEffect17(holder.imgEffect)
            18 -> Effects.applyEffect18(holder.imgEffect)
            19 -> Effects.applyEffect19(holder.imgEffect)
            20 -> Effects.applyEffect20(holder.imgEffect)
            21 -> Effects.applyEffect21(holder.imgEffect)
            22 -> Effects.applyEffect22(holder.imgEffect)


        }

        holder.itemView.setOnClickListener {
            click.ClickEffect(position)
        }

    }
}