package net.konohana.sakuya.maihime.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.ResourceHandlerRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer

@Configuration
class StaticPageConfig : WebFluxConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/request/lilie/")
            .addResourceLocations("classpath:/request/hrgi/")
            .addResourceLocations("classpath:/request/hnki/")
            .addResourceLocations("classpath:/print/lilie/")
            .addResourceLocations("classpath:/print/hrgi/")
            .addResourceLocations("classpath:/print/hnki/")
    }
}
