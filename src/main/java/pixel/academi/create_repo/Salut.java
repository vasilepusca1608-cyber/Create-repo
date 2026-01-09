package pixel.academi.create_repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salut {

        @GetMapping("/salut")
        public String salut() {
            return "Salut lume!";

    }
}
