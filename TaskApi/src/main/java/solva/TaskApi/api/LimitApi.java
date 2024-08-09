package solva.TaskApi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import solva.TaskApi.dto.LimitDto;
import solva.TaskApi.service.LimitService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class LimitApi {

    private final LimitService limitService;

    @GetMapping(value = "/getLimits")
    public List<LimitDto> getLimits(){
        List<LimitDto> limitDtoList = limitService.getAllLimits();
        return limitDtoList;
    }

    @PostMapping(value = "/newLimit")
    public void setLimit(@RequestBody LimitDto limitDto){
        limitService.setLimit(limitDto.getCategory(), limitDto.getMonthLimit());
    }

}
