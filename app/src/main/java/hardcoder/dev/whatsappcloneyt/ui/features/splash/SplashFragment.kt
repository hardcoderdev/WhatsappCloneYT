package hardcoder.dev.whatsappcloneyt.ui.features.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hardcoder.dev.whatsappcloneyt.R
import hardcoder.dev.whatsappcloneyt.databinding.FragmentSplashBinding
import hardcoder.dev.whatsappcloneyt.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    private val viewModel by viewModel<SplashViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}