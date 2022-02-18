package hardcoder.dev.whatsappcloneyt.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<BINDING : ViewBinding>(
    private val inflateBinding: (LayoutInflater, ViewGroup?, Boolean) -> BINDING
) : Fragment() {

    protected var binding: BINDING? = null
        private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflateBinding.invoke(inflater, container, false).also { binding = it }.root

    private fun requireBinding() = checkNotNull(binding)

    fun binding(bindScope: BINDING.() -> Unit) = requireBinding().apply(bindScope)
}