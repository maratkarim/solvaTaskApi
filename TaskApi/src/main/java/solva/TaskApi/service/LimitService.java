package solva.TaskApi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import solva.TaskApi.dto.LimitDto;
import solva.TaskApi.entites.Limits;
import solva.TaskApi.mapper.LimitMapper;
import solva.TaskApi.repository.LimitRep;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LimitService {
    private final LimitRep limitRep;
    private final LimitMapper limitMapper;
    public void setLimit(Limits.Category category, BigDecimal newLimit){
        Limits limits = new Limits();

        limits.setMonthLimit(newLimit);
        limits.setCategory(category);
        limits.setLocalDateTime(LocalDateTime.now());

        limitRep.save(limits);
    }

    public List<LimitDto> getAllLimits(){
        List<Limits> limits = limitRep.findAll();
        List<LimitDto> limitDtos = new ArrayList<>();

        for(Limits l:limits){
            limitDtos.add(limitMapper.toDto(l));
        }

        return limitDtos;
    }
}
