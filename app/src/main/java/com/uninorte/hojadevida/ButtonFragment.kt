package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.uninorte.hojadevida.R.*
import com.uninorte.hojadevida.R.id.*
import com.uninorte.hojadevida.databinding.FragmentMainBinding
import com.uninorte.hojadevida.model.UserPersonalModel
import kotlinx.android.synthetic.main.activity_main.*

/**
 * A simple [Fragment] subclass.
 */
class ButtonFragment : Fragment(),View.OnClickListener {
    lateinit var navController: NavController
    lateinit var userPersonalModel: UserPersonalModel
    lateinit var userPersonalModel2: UserPersonalModel
    lateinit var userPersonalModel3: UserPersonalModel
    lateinit var mBinding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(layout.fragment_button, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        userPersonalModel = UserPersonalModel("Juanita Perez",20,"Estudiando", 2, mipmap.honoree_avatar)
        userPersonalModel2 = UserPersonalModel("Fernando Jimeno",35,"No estudiando", 42, mipmap.asmund_kahoot_avatar)
        userPersonalModel3 = UserPersonalModel("laura Viloria",50,"Jugando", 12, mipmap.daria_trans)
        view.findViewById<Button>(R.id.button_Fernando).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_Juanita).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_Laura).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){


            R.id.button_Juanita -> {
                val bundle = bundleOf("data" to userPersonalModel)
                val NF = MainFragment()
                val fragmentManager = activity!!.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.buttonFragment, NF)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
                //navController.navigate(R.id.action_buttonFragment_to_mainFragment)
            }
            button_Fernando -> {
                val bundle = bundleOf("data" to userPersonalModel2)
                navController.navigate(R.id.action_buttonFragment_to_mainFragment)
            }
            R.id.button_Laura -> {
                val bundle = bundleOf("data" to userPersonalModel3)
                navController.navigate(R.id.action_buttonFragment_to_mainFragment)
            }

        }
    }


}
