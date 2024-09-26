package com.gabrielferreira.planets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanetsAdapter : RecyclerView.Adapter<PlanetsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planets_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //dados: guardar is dados
        holder.sobre(PlanetData("Terra", "O unico Planeta com vida!"))
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun sobre(planetData: PlanetData) {
            view.findViewById<TextView>(R.id.title).text = planetData.name
            view.findViewById<TextView>(R.id.description).text = planetData.description

        }

    }


}
