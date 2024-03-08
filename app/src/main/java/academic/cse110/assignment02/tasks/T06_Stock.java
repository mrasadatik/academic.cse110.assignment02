/*

UML (Unified Modeling Language) Diagram of this program:
+----------------------------------------+
|                 Stock                  |
+----------------------------------------+
| - symbol: String                       |
| - name: String                         |
| - previousClosingPrice: double         |
| - currentPrice: double                 |
+----------------------------------------+
| + Stock(symbol: String, name: String)  |
| + getPreviousClosingPrice(): double    |
| + setPreviousClosingPrice(double)      |
| + getCurrentPrice(): double            |
| + setCurrentPrice(double)              |
| + getSymbol(): String                  |
| + getName(): String                    |
| + getChangePercent(): double           |
+----------------------------------------+

+----------------------------------------+
|               T06_Stock                |
+----------------------------------------+
| + runStockDetails()                    |
+----------------------------------------+

*/

package academic.cse110.assignment02.tasks;

class Stock {
    @SuppressWarnings("FieldMayBeFinal")
    private String symbol;
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}

/**
 *
 * @author mrasadatik
 */
public class T06_Stock {
    public static void displayStockDetails() {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        
        oracleStock.setPreviousClosingPrice(34.5);
        
        oracleStock.setCurrentPrice(34.35);
        
        System.out.println("Stock Symbol: " + oracleStock.getSymbol());
        System.out.println("Stock Name: " + oracleStock.getName());
        System.out.println("Previous Closing Price: $" + oracleStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + oracleStock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + oracleStock.getChangePercent() + "%");
    }
}
