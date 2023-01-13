package com.example.mapper;

import com.example.dto.OrganizationDto;
import com.example.xml.ItemXml;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@SuppressWarnings("SpellCheckingInspection")
@Mapper
public interface OrganizationMapper {

  OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);

  @Mappings({
      @Mapping(source = "objname", target = "objectName"),
      @Mapping(source = "idobj", target = "objectId"),
      @Mapping(source = "objcode", target = "objectCode"),

  })
  OrganizationDto map(final ItemXml itemXml);
}
