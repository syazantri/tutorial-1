package id.ac.ui.cs.advprog.eshop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EshopApplicationTests {
    @Test
    void contextLoads() {
        EshopApplication.main(new String[] {});
        assertThat(true).isTrue();
    }
}