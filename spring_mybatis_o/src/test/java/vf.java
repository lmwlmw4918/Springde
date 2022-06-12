import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.annotation.ValidationAnnotationUtils;
@RunWith(SpringJUnit4ClassRunner.class)
public class vf {

    enum Color{
        RED,
        BLUE,
        YELLOW;
    }
    @Test
    public void cd(){

        Color po = Color.BLUE;

        System.out.println(po);
        switch (po){
            case RED -> System.out.println("红色");
            case BLUE -> System.out.println("蓝色");
            case YELLOW-> System.out.println("绿色");

        }
        Color[] values = Color.values();
        for (Color value : values) {
            System.out.println(value);
        }
    }
}
