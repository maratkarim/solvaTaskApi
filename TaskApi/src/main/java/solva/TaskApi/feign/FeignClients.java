package solva.TaskApi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "service-client", url = "${feign.service.url}")
public interface FeignClients {
    @GetMapping("/query")
    String fetchDailyFXData(@RequestParam("function") String function,
                            @RequestParam("from_symbol") String fromSymbol,
                            @RequestParam("to_symbol") String toSymbol,
                            @RequestParam("apikey") String apiKey);
}
