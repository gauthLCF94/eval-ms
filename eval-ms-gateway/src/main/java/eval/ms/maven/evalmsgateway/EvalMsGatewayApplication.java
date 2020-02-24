package eval.ms.maven.evalmsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EvalMsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvalMsGatewayApplication.class, args);
	}

}
