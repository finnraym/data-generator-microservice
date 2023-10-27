package ru.egorov.datageneratormicroservice.service;

import ru.egorov.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);
}
