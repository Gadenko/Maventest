import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MavenTestTest {

    @Test
    void peopleInTheStore_whenBigger_ShouldReturnTrue(){
        assertEquals(60, MavenTest.alarmStufe("grün"));
    }

    @Test
    void peopleInTheStore_whenLess_ShouldReturnFalse(){

        assertEquals(30, MavenTest.alarmStufe("gelb"));

    }
    @Test
    void peopleInTheStore_whenToMuch_ShouldReturnStop(){

        assertEquals(0, MavenTest.alarmStufe("rot"));

    }
}