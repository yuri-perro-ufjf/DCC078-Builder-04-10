import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerBuilderTest {

    @Test
    void shouldBeReturnExceptionForNullPlayerHP(){
        try{

        PlayerBuilder playerBuilder = new PlayerBuilder();
        Player player = playerBuilder.setArmor(10)
                .setPower(100)
                .build();
        fail();
        } catch(IllegalArgumentException e){
            assertEquals("Invalid HP value!", e.getMessage());
        }
    }

    @Test
    void shouldBeReturnExceptionForInvalidPlayerHp(){
        try{

            PlayerBuilder playerBuilder = new PlayerBuilder();
            Player player = playerBuilder.setHp(-20.0)
                    .setArmor(10)
                    .setPower(100)
                    .build();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("HP value cannot be zero or negative!", e.getMessage());
        }
    }

    @Test
    void shouldBeReturnValidPlayer() {
        PlayerBuilder playerBuilder = new PlayerBuilder();
        Player player = playerBuilder.setHp(20.0)
                        .setArmor(10)
                        .setPower(100)
                        .build();

        assertNotNull(player);
    }
}