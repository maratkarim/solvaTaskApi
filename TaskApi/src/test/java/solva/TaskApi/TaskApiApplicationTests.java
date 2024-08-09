package solva.TaskApi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import solva.TaskApi.dto.LimitDto;
import solva.TaskApi.entites.Limits;
import solva.TaskApi.mapper.LimitMapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
class TaskApiApplicationTests {
	@Autowired
	private LimitMapper limitMapper;

	@Test
	void compareDtoandModel() {
		Limits limits = new Limits();
		limits.setCategory(Limits.Category.SERVICES);
		limits.setMonthLimit(BigDecimal.valueOf(1500));
		limits.setLocalDateTime(LocalDateTime.now());

		LimitDto limitDto = limitMapper.toDto(limits);

		Assertions.assertEquals(limits.getMonthLimit(), limitDto.getMonthLimit());
		Assertions.assertEquals(limits.getCategory(), limitDto.getCategory());

	}

}
