package solva.TaskApi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solva.TaskApi.service.ExchangeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange")
public class ExchangeApi {
    private final ExchangeService exchangeService;

    @PostMapping(value = "/daily-rate")
    public ResponseEntity<String> updateDailyRate(){
        exchangeService.updateDaily();
        return ResponseEntity.ok("That's right, all the json data is in the console");
    }
}
