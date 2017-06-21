import io.netty.handler.codec.DefaultHeaders
import org.jetbrains.ktor.routing.*
import org.jetbrains.ktor.application.*
import org.jetbrains.ktor.host.*
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.logging.CallLogging
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.request.MultiPartData
import org.jetbrains.ktor.response.*

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, 80) {
        install(CallLogging)
        routing {
            get("/") {
                call.respondText("Hello")
            }

            post("/post-test") {
                val multipart = call.request.receive<MultiPartData>()

                println(call.parameters)
                println(call.parameters["par1"])

                call.response.header("test-header", "abc")
                call.response.status(HttpStatusCode.Created)
                call.respond("")
            }
        }
    }

    server.start(wait = true)
}
