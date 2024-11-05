 interface BaseConverter {
    double convert(double value);
    class CelsiusConverter implements BaseConverter {
        public double convertToKelvin(double celsius) {
            return celsius + 273.15;
        }
        public double convertToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        } @Override
        public double convert(double value) {
            // This method can be implemented if needed
            return 0; }
    } // Misol uchun foydalanish:
    public class Main { public static void main(String[] args) {
        CelsiusConverter converter = new CelsiusConverter();
        double celsiusValue = 25; double kelvinValue = converter.convertToKelvin(celsiusValue);
        double fahrenheitValue = converter.convertToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + "°C = " + kelvinValue + "K");
        System.out.println(celsiusValue + "°C = " + fahrenheitValue + "°F"); }
        }
}
