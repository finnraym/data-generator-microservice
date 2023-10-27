package ru.egorov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.egorov.datageneratormicroservice.model.test.DataTestOptions;
import ru.egorov.datageneratormicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
