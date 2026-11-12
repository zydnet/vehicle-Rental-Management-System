package devanshia.vms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleRentalApplication.class, args);
        System.out.println("==========================================================");
        System.out.println("🚗 Devanshia Fleet Platform - Unit 4 REST Backend Running");
        System.out.println("🌐 Web Dashboard: http://localhost:8081");
        System.out.println("📡 REST Endpoints: http://localhost:8081/api/vehicles");
        System.out.println("==========================================================");
    }
}
