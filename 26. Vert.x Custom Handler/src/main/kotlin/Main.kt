import io.netty.handler.codec.http.HttpResponseStatus
import io.vertx.core.AbstractVerticle
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.BodyHandler

fun main(args: Array<String>) {
    val vertx = Vertx.vertx()
    vertx.deployVerticle(Verticle())
}

class Verticle: AbstractVerticle() {
    override fun start() {
        val server = vertx.createHttpServer()
        val router = Router.router(vertx)

        router.route().handler(CustomHandler.create())
        router.route().handler(BodyHandler.create())

        router.post("/").handler { ctx ->
            println(ctx.request().getFormAttribute("form"))

            ctx.response().setStatusCode(HttpResponseStatus.CREATED.code()).end()
            ctx.response().close()
        }

        server.requestHandler(router::accept).listen(80)
    }
}

interface CustomHandler: Handler<RoutingContext> {
    companion object {
        fun create(): CustomHandlerImpl {
            return CustomHandlerImpl()
        }
    }
}

class CustomHandlerImpl: CustomHandler {
    override fun handle(ctx: RoutingContext) {
        println("[Log] ${ctx.request().host()}, ${ctx.request().uri()}")
    }
}
