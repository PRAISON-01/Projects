package SerDeJson;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomJsonEncoderTest {

    @Test
    public void testThatCanSerialiseToJson() {
        Product product = new Product();
        product.setName("Nokia3310");
        product.setPrice(BigDecimal.valueOf(2000));
        product.setDescription("Survived WWII in Hitlers Pocket");
        product.setQuantity(1);


        String json = CustomJsonEncoder.serializeToJson(product);
        String expected = "{\"name\": \"Nokia3310\",\"price\":\" 2000\"\"description \", \"Survived WWII in Hitlers Pocket\", \"quantity \": 1}";
        assertEquals(expected, json);


    }
}
