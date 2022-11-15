/*
    Creare un'interfaccia CurrencyConverter con un metodo converter
        - si occuperà di effettuare le conversioni tra valute
    Creare una classe EURConverter che implementa CurrencyConverter
        -1 USD = 0,97 EUR
 */

public class EURConverter implements CurrencyConverter{

    //Converte la quantità da EURO in DOLLARI
    @Override
    public double convert(double qt) {
        qt = qt * 0.97;
        return qt;
    }
}
