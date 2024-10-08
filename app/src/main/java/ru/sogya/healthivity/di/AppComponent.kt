package ru.sogya.healthivity.di

import com.yandex.yatagan.Component
import com.yandex.yatagan.Module
import javax.inject.Scope


@Component(modules = [AppModule::class])
interface AppComponent {

}

@Module
class AppModule {


}

@Scope
annotation class AppScope