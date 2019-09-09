import animal.Dog;
import animal.air.Bird;
import human.Trainer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrainerTest {

    Trainer trainer;
    Dog dog;
    Bird bird;

    @Before
    public void before(){
        trainer = new Trainer();
        dog = new Dog("Fido");
        bird = new Bird();
    }

    @Test
    public void canTeach() {
        assertEquals("Bark!", trainer.teach(dog));
    }

     @Test
     public void canTeachBird() {
       assertEquals("Tweet Tweet", trainer.trainBird(bird));
     }
}
