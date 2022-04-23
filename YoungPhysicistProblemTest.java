import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YoungPhysicistProblemTest {

    @Test
    void case_1 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -3, 0};
        int y[] = {2, -2, 0};
        int z[] = {-3, 5, 0};
        assertEquals( "YES", YoungPhysicistProblem.Check_Equillibrium(3, x, y, z));
    }

    @Test
    void case_2 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -1, 0};
        int y[] = {2, -2, 0};
        int z[] = {-3, 3, 0};
        assertEquals( "YES", YoungPhysicistProblem.Check_Equillibrium(3, x, y, z));
    }

    @Test
    void case_3 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -2, 0};
        int y[] = {2, -2, 0};
        int z[] = {-3, 8, 0};
        assertEquals( "NO", YoungPhysicistProblem.Check_Equillibrium(3, x, y, z));
    }

    @Test
    void case_4 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -2};
        int y[] = {2, -2};
        int z[] = {-3, 8};
        assertEquals( "NO", YoungPhysicistProblem.Check_Equillibrium(2, x, y, z));
    }

    @Test
    void case_5 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -2};
        int y[] = {2, -2};
        int z[] = {-3, 8};
        assertEquals( "N is out of range", YoungPhysicistProblem.Check_Equillibrium(0, x, y, z));
    }

    @Test
    void case_6 () {

        var YoungPhysicistProblem = new YoungPhysicistProblem();
        int x[] = {1, -2};
        int y[] = {2, -2};
        int z[] = {-3, 8};
        assertThrows( ArrayIndexOutOfBoundsException.class , () -> YoungPhysicistProblem.Check_Equillibrium(6, x, y, z));
    }



}