package sanaebadi.info.viewbinding.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import sanaebadi.info.viewbinding.R
import sanaebadi.info.viewbinding.databinding.FragmentMainBinding
import sanaebadi.info.viewbinding.databinding.FragmentSecondBinding
import sanaebadi.info.viewbinding.ui.utils.Const

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        binding.webview.loadUrl(Const.WEB_URI)

        return binding.root
    }

}
