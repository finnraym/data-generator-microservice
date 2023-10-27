package ru.egorov.datageneratormicroservice.service;

import ru.egorov.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
