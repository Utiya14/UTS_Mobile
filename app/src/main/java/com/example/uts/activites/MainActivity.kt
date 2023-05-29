package com.example.uts.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts.Adapter.ItemsAdapter
import com.example.uts.Domain.ItemsDomain
import com.example.uts.R

class MainActivity : AppCompatActivity() {
    private lateinit var adapterPopuler: ItemsAdapter
    private lateinit var recyclerViewPopuler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val itemsArrayList = ArrayList<ItemsDomain>()

        itemsArrayList.add(
            ItemsDomain(
                "Aksi",
                "17 Mei 2023",
                "Fast X",
                "Musuh dari masa lalu kini menghampiri Dom (Vin Diesel) dan keluarganya.\n" +
                        "Dante (Jason Momoa) putra gembong narkoba Hernan Reyes (Joaquim de Almeida)\n" +
                        "yang dihancurkan Dom dan kelompoknya di seri kelima kini datang\n" +
                        "dan berusaha balas dendam atas kematian sang ayah.",
                "fastx",
                "2 Jam 21 menit",
                13
            )
        )
        itemsArrayList.add(
            ItemsDomain(
                "Aksi", "9 Juni 2023", "Transformers: Rise of the Beasts", "m.\n" +
                        ".\n" +
                        ".\n" +
                        "..", "transformer", "2 Jam 7 menit", 13
            )
        )
        itemsArrayList.add(
            ItemsDomain(
                "Drama", "8 September 2010", "Sang Pencerah", "m.\n" +
                        ".\n" +
                        ".\n" +
                        "..", "sangpencerah", "1 Jam 52 menit", 13
            )
        )
        itemsArrayList.add(
            ItemsDomain(
                "Horor", "28 September 2017", "Pengabdi Setan", "l.\n" +
                        ".\n" +
                        ".\n" +
                        "..", "pengabdisetan", "1 Jam 47 menit", 13
            )
        )
        itemsArrayList.add(
            ItemsDomain(
                "Komedi", "29 Januari 2014", "Comic 8", "..\n" +
                        ".\n" +
                        ".\n" +
                        "..", "comic8", "1 Jam 30 menit", 17
            )
        )

        recyclerViewPopuler = findViewById(R.id.viewPopuler)
        recyclerViewPopuler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        adapterPopuler = ItemsAdapter(itemsArrayList)

        recyclerViewPopuler.adapter = adapterPopuler
    }
}
