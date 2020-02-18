package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.uninorte.hojadevida.databinding.FragmentMainBinding
import com.uninorte.hojadevida.model.UserPersonalModel
import com.uninorte.hojadevida.util.StringUtils


/**
 * A simple [Fragment] subclass.
 */
    class MainFragment : Fragment(), View.OnClickListener {

    private lateinit var user: UserPersonalModel
    lateinit var mBinding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main, container, false)
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        user = arguments!!.getParcelable("data")!!
        view.findViewById<TextView>(R.id.textView).text= user.name
        view.findViewById<TextView>(R.id.textView2).text = user.Estado
        view.findViewById<TextView>(R.id.textView3).text = StringUtils.formatAge(user.edad)
        view.findViewById<ImageView>(R.id.imageView).setImageResource(user.imagen)

    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
