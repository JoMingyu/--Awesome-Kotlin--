import io.netty.handler.codec.http.HttpResponseStatus
import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import io.vertx.core.http.HttpMethod
import io.vertx.ext.web.Router

class Verticle : AbstractVerticle() {
    override fun start() {
        val server = vertx.createHttpServer()
        val router = Router.router(vertx)

        router.route(HttpMethod.GET, "/get-test").handler { ctx ->
            println(ctx.request().host())
            println(ctx.request().getParam("test_p"))

            ctx.response().setStatusCode(HttpResponseStatus.OK.code()).end()
            ctx.response().close()
        }

        router.route(HttpMethod.POST, "/post-test").handler { ctx ->
            println(ctx.request().host())
            println(ctx.request().getParam("test_p"))
            println(ctx.request().getFormAttribute("test_f"))

            ctx.response().setStatusCode(HttpResponseStatus.CREATED.code()).end()
            ctx.response().close()
        }

        server.requestHandler(router::accept).listen(80)
    }
}

fun main(args: Array<String>) {
    val vertx = Vertx.vertx()
    vertx.deployVerticle(Verticle())
}
