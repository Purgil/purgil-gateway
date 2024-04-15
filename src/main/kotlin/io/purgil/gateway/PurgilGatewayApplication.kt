package io.purgil.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PurgilGatewayApplication

fun main(args: Array<String>) {
	runApplication<PurgilGatewayApplication>(*args)
}
