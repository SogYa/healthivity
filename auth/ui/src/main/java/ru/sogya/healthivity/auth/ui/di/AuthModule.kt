package ru.sogya.healthivity.auth.ui.di

import androidx.lifecycle.ViewModel
import com.yandex.yatagan.Binds
import com.yandex.yatagan.IntoMap
import com.yandex.yatagan.Module
import ru.sogya.healthivity.auth.ui.enter.EnterVM
import ru.sogya.healthivity.core.ui.di.ViewModelKey

@Module(includes = [AuthVMModule::class])
class AuthModule {

}

internal abstract class AuthVMModule {
    @Binds
    @IntoMap
    @ViewModelKey(EnterVM::class)
    abstract fun bindsEnterViewModel(viewModel: EnterVM): ViewModel
}