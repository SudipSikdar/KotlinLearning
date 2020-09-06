package self.learning.kotlin

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

    fun getFormattedName() = name.toLowerCase().capitalize()
}
object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.name
            EntityType.HELP -> TODO()
        }
        return when(type){
            EntityType.EASY ->Entity.Easy(id,name)
            EntityType.MEDIUM -> Entity.Medium(id,name)
            EntityType.HARD -> Entity.Hard(id,name)
            EntityType.HELP -> TODO()
        }
    }
}

sealed class Entity () {

    object Help: Entity() {
        val name ="Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String): Entity()

}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}