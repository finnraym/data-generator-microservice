package ru.egorov.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.egorov.datageneratormicroservice.model.Data;
import ru.egorov.datageneratormicroservice.model.test.DataTestOptions;
import ru.egorov.datageneratormicroservice.service.KafkaDataService;
import ru.egorov.datageneratormicroservice.service.TestDataService;
import ru.egorov.datageneratormicroservice.web.dto.DataDto;
import ru.egorov.datageneratormicroservice.web.dto.DataTestOptionsDto;
import ru.egorov.datageneratormicroservice.web.mapper.DataMapper;
import ru.egorov.datageneratormicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;
    private final TestDataService testDataService;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
