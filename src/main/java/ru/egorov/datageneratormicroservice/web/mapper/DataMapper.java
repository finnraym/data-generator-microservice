package ru.egorov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.egorov.datageneratormicroservice.model.Data;
import ru.egorov.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
