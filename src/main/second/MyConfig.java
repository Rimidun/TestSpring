package main.second;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("main.second")
@EnableAspectJAutoProxy
public class MyConfig {
}
