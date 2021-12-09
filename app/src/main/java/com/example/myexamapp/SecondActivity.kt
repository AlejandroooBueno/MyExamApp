package com.example.myexamapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    private lateinit var backActivity: ImageButton
    private lateinit var callActivity: Button


    lateinit var condRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backActivity = findViewById(R.id.imageButtonBack)
        backActivity.setOnClickListener {
            val mainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(mainActivityIntent)
        }


        callActivity = findViewById(R.id.call_button)
        callActivity.setOnClickListener {
            val phoneNumberUri = Uri.parse("tel:+78123935114")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneNumberUri)
            startActivity(callIntent)
        }


        val condList: List<Cond> = listOf(
            Cond(
                "Lessar: \n" +
                        " 1. LS-HE07KRA2 - площадь помещения до 21 м2.\n" +
                        " 2. LS-HE09KRA2 - площадь помещения до 26 м2.\n" +
                        " 3. LS-HE12KRA2 - площадь помещения до 32 м2.", R.drawable.essar
            ),
            Cond(
                "Daikin: \n" +
                        " 1. FTXP20L/RX2 - площадь помещения до 25 м2.\n" +
                        " 2. FTXP25L/RX2 - площадь помещения до 30 м2.\n" +
                        " 3. FTXP30L/RX3 - площадь помещения до 35 м2.", R.drawable.daikin
            ),
            Cond(
                "Mitsubishi: \n" +
                        " 1. MSZ-AP20VGK - площадь помещения до 20 м2.\n" +
                        " 2. MSZ-AP25VGK - площадь помещения до 25 м2.\n" +
                        " 3. MSZ-AP35VGK - площадь помещения до 35 м2.", R.drawable.mitsubishi
            )
        )
        condRecyclerView = findViewById(R.id.cond_recycler_view)

        condRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        condRecyclerView.adapter = CondAdapter(condList)


    }
}