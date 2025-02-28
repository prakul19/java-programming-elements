public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double conversionFactor = 1.609344; // 1 mile = 1.609344 kilometers

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(conversionFactor, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

