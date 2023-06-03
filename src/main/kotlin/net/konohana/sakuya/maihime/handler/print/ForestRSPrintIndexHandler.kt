package net.konohana.sakuya.maihime.handler.print

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.core.io.Resource
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

/**
 * ## Indexハンドラクラス
 * * ForestRS(栗州総線(鉤坂連絡移管))
 * * 乗車券発券画面
 */
@Component
class ForestRSPrintIndexHandler {
    @Value("classpath:/print/forestrs/index.html")
    private lateinit var forestRSPrintIndexHtml: Resource

    @Bean
    fun forestRSPrintIndexRoutes(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.GET("/flrs/print/**")) { get(it) }
    }

    @Suppress("UnusedPrivateMember")
    fun get(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(forestRSPrintIndexHtml)
    }
}
