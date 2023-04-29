package com.example.pixel_effect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android5kt.Effects
import com.example.pixel_effect.databinding.ActivityHomeBinding

class Home_Activity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imginpic.setImageURI(MainActivity.uri)


        var effectclick = object : Effectclick {
            override fun ClickEffect(pos: Int) {

                when (pos) {

                    0 -> Effects.applyEffectNone(binding.imginpic)
                    1 -> Effects.applyEffect1(binding.imginpic)
                    2 -> Effects.applyEffect2(binding.imginpic)
                    3 -> Effects.applyEffect3(binding.imginpic)
                    4 -> Effects.applyEffect4(binding.imginpic)
                    5 -> Effects.applyEffect5(binding.imginpic)
                    6 -> Effects.applyEffect6(binding.imginpic)
                    7 -> Effects.applyEffect7(binding.imginpic)
                    8 -> Effects.applyEffect8(binding.imginpic)
                    9 -> Effects.applyEffect9(binding.imginpic)
                    10 -> Effects.applyEffect10(binding.imginpic)
                    11 -> Effects.applyEffect11(binding.imginpic)
                    12 -> Effects.applyEffect12(binding.imginpic)
                    13 -> Effects.applyEffect13(binding.imginpic)
                    14 -> Effects.applyEffect14(binding.imginpic)
                    15 -> Effects.applyEffect15(binding.imginpic)
                    16 -> Effects.applyEffect16(binding.imginpic)
                    17 -> Effects.applyEffect17(binding.imginpic)
                    18 -> Effects.applyEffect18(binding.imginpic)
                    19 -> Effects.applyEffect19(binding.imginpic)
                    20 -> Effects.applyEffect20(binding.imginpic)
                    21 -> Effects.applyEffect21(binding.imginpic)
                    22 -> Effects.applyEffect22(binding.imginpic)


                }
            }


        }

        binding.FilterList.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.FilterList.adapter = EffectsAdepter(effectclick)

    }
}