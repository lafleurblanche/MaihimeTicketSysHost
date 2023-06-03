package net.konohana.sakuya.maihime.handler.request

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
 * * HRGI(柊交通鉄道部)
 * * 乗車券要求画面
 */
@Component
class HrgiRequestIndexHandler {
    @Value("classpath:/request/hrgi/index.html")
    private lateinit var hrgiRequestIndexHtml: Resource

    @Bean
    fun hrgiRequestIndexRoutes(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.GET("/hiiragi/request/**")) { get(it) }
    }

    @Suppress("UnusedPrivateMember")
    fun get(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(hrgiRequestIndexHtml)
    }
}
