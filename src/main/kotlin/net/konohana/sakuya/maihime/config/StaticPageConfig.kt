package net.konohana.sakuya.maihime.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.ResourceHandlerRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer

@Configuration
class StaticPageConfig : WebFluxConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/request/argw/")
            .addResourceLocations("classpath:/request/lilie/")
            .addResourceLocations("classpath:/request/hrgi/")
            .addResourceLocations("classpath:/request/hnki/")
            .addResourceLocations("classpath:/request/kirisame")
            .addResourceLocations("classpath:/request/forestrs/")
            .addResourceLocations("classpath:/request/forestkg/")
            .addResourceLocations("classpath:/print/forestrs/")
            .addResourceLocations("classpath:/print/lilie/")
            .addResourceLocations("classpath:/print/hrgi/")
            .addResourceLocations("classpath:/print/hnki/")
            .addResourceLocations("classpath:/print/kirisame")
    }
}
