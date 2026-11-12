package devanshia.vms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleManagementApplication.class, args);
        System.out.println("=====================================================================");
        System.out.println("🚗 Devanshia Fleet Platform is running");
        System.out.println("🌐 Web Application: http://localhost:8081");
        System.out.println("📖 Swagger API Documentation: http://localhost:8081/swagger-ui/index.html");
        System.out.println("=====================================================================");
    }
}
