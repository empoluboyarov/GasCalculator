import java.util.List;

/**
 * Created by Evgeniy on 31.03.2016.
 */
public class Test {
    public static void main(String[] args) {

       System.out.println(DewPoint.calcDP(14.3,51.6));

        System.out.println(PressureConverter.convertPressure(51.2,PressureType.MPA,PressureType.KGF));

    }
}
