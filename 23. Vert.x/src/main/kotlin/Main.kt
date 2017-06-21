import io.netty.handler.codec.http.HttpResponseStatus
import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx

class Verticle : AbstractVerticle() {
    override fun start() {
        val server = vertx.createHttpServer()

        server.requestHandler { req ->
            println(req.absoluteURI())
            println(req.host())
            println(req.method())

            val response = req.response()
            response.setStatusCode(HttpResponseStatus.OK.code())
            response.end("Hello")
            response.close()
        }.listen(80)
    }
}

fun main(args: Array<String>) {
    var vertx = Vertx.vertx()
    vertx.deployVerticle(Verticle())
}
