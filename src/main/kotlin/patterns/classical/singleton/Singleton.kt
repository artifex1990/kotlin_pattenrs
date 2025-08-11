package patterns.classical.singleton

object MyListSingleton : List<String> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<String> {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<String>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: String): Int {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: String): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<String> {
        TODO("Not yet implemented")
    }
}

data object MyListSingletonData : List<String> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<String> {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<String>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: String): Int {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: String): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<String> {
        TODO("Not yet implemented")
    }
}

/*
Classical in kotlin
*/
object Singleton {
    init {
        println("Singleton classic create")
    }

    fun doSomething() {
        println("Do something singleton")
    }
}

/*
by lazy
 */
class LazySingleton private constructor() {
    companion object {
        val instance: LazySingleton by lazy {
            println("Lazy initialization Singleton")
            LazySingleton()
        }
    }

    fun doSomething() {
        println("Lazy singleton do something")
    }
}

/*
Parametrize singleton
 */
class ParametrizeSingleton private constructor(private val config: String) {
    companion object {
        @Volatile
        private var instance: ParametrizeSingleton? = null

        fun getInstance(config: String): ParametrizeSingleton =
            instance ?: synchronized(this) {
                instance ?: ParametrizeSingleton(config).also { instance = it }
            }
    }

    fun doSomething() {
        println("By parametrize config: $config")
    }
}

/*
DI with Service locator lazy
 */
interface Service {
    fun doSomething()
}

class RealService(private val config: String) : Service {
    override fun doSomething() {
        println("Real service config: $config")
    }
}

object ServiceLocator {
    val service: Service by lazy { RealService("test") }
}