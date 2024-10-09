package ru.sogya.healthivity.di

import com.yandex.yatagan.Component
import com.yandex.yatagan.Module
import ru.sogya.healthivity.auth.ui.di.AuthModule
import ru.sogya.healthivity.core.ui.di.ViewModelFactoryModule
import javax.inject.Scope


@Component(modules = [AppModule::class, ViewModelFactoryModule::class, AuthModule::class])
interface AppComponent {

}

@Module
class AppModule {


}

@Scope
annotation class AppScope