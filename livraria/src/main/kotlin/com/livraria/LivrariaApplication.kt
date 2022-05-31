package com.livraria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LivrariaApplication

fun main(args: Array<String>) {
	runApplication<LivrariaApplication>(*args)
}
