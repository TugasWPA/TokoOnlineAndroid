package com.example.tokoonline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tokoonline.R
import com.example.tokoonline.adapter.AdapterProduk
import com.example.tokoonline.adapter.AdapterSlider
import com.example.tokoonline.model.Produk
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var vpSlider:ViewPager
    lateinit var rvProduk:RecyclerView
    lateinit var rvProdukTerlaris:RecyclerView
    lateinit var rvElektronik:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvElektronik = view.findViewById(R.id.rv_elektronik)
        rvProdukTerlaris = view.findViewById(R.id.rv_produkTerlaris)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvProdukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvProdukTerlaris.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduk(arrElektronik)
        rvElektronik.layoutManager = layoutManager3

        return view
    }
    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "HP Core i3"
        p1.harga = "Rp 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "HP Envy 13 aq0019tx"
        p2.harga = "Rp 15.000.000"
        p2.gambar = R.drawable.hp_envy_13_aq0019tx

        val p3 = Produk()
        p3.nama = "HP Pavilion 13 an0006na"
        p3.harga = "Rp 25.000.000"
        p3.gambar = R.drawable.hp_pavilion_13_an0006na

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrElektronik: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "HP Core i3"
        p1.harga = "Rp 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "HP Envy 13 aq0019tx"
        p2.harga = "Rp 15.000.000"
        p2.gambar = R.drawable.hp_envy_13_aq0019tx

        val p3 = Produk()
        p3.nama = "HP Pavilion 13 an0006na"
        p3.harga = "Rp 25.000.000"
        p3.gambar = R.drawable.hp_pavilion_13_an0006na

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrProdukTerlaris: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "HP Core i3"
        p1.harga = "Rp 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "HP Envy 13 aq0019tx"
        p2.harga = "Rp 15.000.000"
        p2.gambar = R.drawable.hp_envy_13_aq0019tx

        val p3 = Produk()
        p3.nama = "HP Pavilion 13 an0006na"
        p3.harga = "Rp 25.000.000"
        p3.gambar = R.drawable.hp_pavilion_13_an0006na

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}