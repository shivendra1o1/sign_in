package com.example.appsign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment


class fragmentsign_in:Fragment(R.layout.fragmentsign_in){
    private lateinit var myButton: ImageButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragmentsign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myButton = view.findViewById(R.id.btnArrowright)
        val fragment = fragmentlog_in()
        myButton.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerview,fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }
}




