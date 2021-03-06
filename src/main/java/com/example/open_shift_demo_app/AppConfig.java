package com.example.open_shift_demo_app;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class AppConfig {

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(paths())
                .build()
                .apiInfo(apiInfo());
    }

    private Predicate<String> paths() {

        // 仕様書生成対象のURLパスを指定する
        return Predicates.and(
                Predicates.not(Predicates.containsPattern("/hogehoge-view")),
                Predicates.or(
                        Predicates.containsPattern("/calendar/*")));
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Open Shift Demo Web API",              // title
                "Open Shift を試すためのデモアプリ",    // description
                "0.0.1",                                // version
                "",                                     // terms of service url
                "Hiroaki Ohwada",                             // created by
                "",                     // license
                "");                                    // license url
        return apiInfo;
    }

}
