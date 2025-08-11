package functional

import patterns.classical.singleton.LazySingleton
import patterns.classical.singleton.ParametrizeSingleton
import patterns.classical.singleton.ServiceLocator
import patterns.classical.singleton.Singleton

fun singletonsRun() {
    /*
    Singletons
     */
    Singleton.doSomething()

    /*
    Lazy singleton
     */
    LazySingleton.instance.doSomething()

    /*
    Parametrize singleton
     */
    ParametrizeSingleton.getInstance("test").doSomething()

    /*
    Service locator
     */
    ServiceLocator.service.doSomething()
}