package com.example.safearg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation

class AFragment : Fragment() {
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText:EditText=view.findViewById(R.id.edittext)
        val btn:Button=view.findViewById(R.id.btn)
        navController=Navigation.findNavController(view)
        btn.setOnClickListener {
            val name =editText.text.toString()
            val action=AFragmentDirections.moveFromAToB(name)
            navController.navigate(action)
        }

    }

}