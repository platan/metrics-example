package metrics;


import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Servlet;

@ComponentScan
@EnableAutoConfiguration
@EnableMetrics
public class Application {

    @Autowired
    private MetricRegistry metricRegistry;

    @Bean
    public Servlet metrics() {
        return new MetricsServlet(metricRegistry);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}