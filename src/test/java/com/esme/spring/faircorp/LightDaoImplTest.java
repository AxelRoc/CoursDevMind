package com.esme.spring.faircorp;

import com.esme.spring.faircorp.model.LightDaoCustom;
import com.esme.spring.faircorp.model.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan


public class LightDaoImplTest {

    @Autowired
    LightDaoCustom lightDaoCustom;

    @Test
    public void shouldFindOnLights() {
                assertThat(lightDaoCustom.findOnLights())
                .hasSize(1)
                .extracting("id", "status")
                .containsExactly(tuple(-1L, Status.ON));
    }
}