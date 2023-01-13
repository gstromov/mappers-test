package com.example.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.example.xml.ItemXml;
import lombok.val;
import org.junit.jupiter.api.Test;

@SuppressWarnings("SpellCheckingInspection")
class OrganizationMapperTest {

  @Test
  public void test1() {
    val itemXml = new ItemXml()
        .setIdobj("10010001")
        .setObjcode("10010001")
        .setObjname("Функциональный блок подразделения");

    val dto = OrganizationMapper.INSTANCE.map(itemXml);

    assertEquals(dto.getObjectName(), itemXml.getObjname());
  }
}
