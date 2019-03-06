package petmanagement.petmanagement;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import petmanagement.petmanagement.entity.*;
import petmanagement.petmanagement.mapper.*;
import petmanagement.petmanagement.service.*;

@SpringBootApplication
@MapperScan("petmanagement.petmanagement.mapper")
public class PetmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetmanagementApplication.class, args);
    }

}
