package atu.ie.oop_exam_summer_50;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class OopExamSummer50Application<Input> {

    public static void main(String[] args) {
        SpringApplication.run(OopExamSummer50Application.class, args);
    }

    public class reservationId{
@PutMapping("validate/{id}")
        Input validate(
                @PathVariable @Positive Long id,
                @RequestParam ("query") @NotEmpty String query,
                @Valid @RequestBody Input input){
    return input;
}

    }
@ComponentScan

    public class studentemail{
@PutMapping("validate/{email}")
Input validate(
        @PathVariable @Positive Long email,
        @RequestParam ("query") @NotEmpty String query,
        @Valid @RequestBody Input input){
    return input;
}
}


    }

}

