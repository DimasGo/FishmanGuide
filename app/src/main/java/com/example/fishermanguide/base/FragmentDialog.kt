package com.example.fishermanguide.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.fishermanguide.R

class FragmentDialog:  DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.dialog_fragment, container, false)
        var ChangHistory = rootView.findViewById<Button>(R.id.buttonChange)
        var AddNetwork = rootView.findViewById<Button>(R.id.buttonAdd_Network)
        var DeleteButton = rootView.findViewById<Button>(R.id.buttonDelete)

        return rootView
    }
}