package goldmind.explorer.library;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/library")
public class LibController {

        @GetMapping("/")
        public String hello() {
            return "Hello World!";
        }

        @PostMapping("/getMeaning")
        public <T> ResponseEntity<String> getWordMeaning(@RequestBody String word) throws IOException, InterruptedException {

            // do a authentification request

            return new ResponseEntity<>("OK", HttpStatus.OK);
        }
}
