package xyz.arnau.dragon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DragonApiApplication

fun main(args: Array<String>) {
	runApplication<DragonApiApplication>(*args)
}
