package org.zerock.spring.mapper;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Select;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


public interface TimeMapper {
@Select("select now()")
String getTime();
}
