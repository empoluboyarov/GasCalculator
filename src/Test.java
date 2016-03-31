/**
 * Created by Evgeniy on 31.03.2016.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Относительная плотность при 0.685 = "+ BaseCounts.relativDensity(0.685));

        System.out.println("Коэффициент сжимаемости при "+ BaseCounts.compressibilityFactor(21,65,0.685));

        System.out.println("Геометрический объем  "+ BaseCounts.supplyOfGas(21.2,56,0.686,10000,1420));

        System.out.println();

        System.out.println();


    }
}
