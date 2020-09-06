package self.learning.kotlin

interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

fun main() {
    val provider = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "new info provider"

        fun getSessionId() = "Id"
    }
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("is not a session info provider")

    } else {
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}
