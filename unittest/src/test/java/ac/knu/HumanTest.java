package ac.knu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {



    @Test
    public void 이름에_헬로우를_붙여_반환한다(){
        Human human = new Human();
        String result = human.displayName("David");
        assertEquals("Hi David", result);


    }
}
