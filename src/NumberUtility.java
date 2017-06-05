import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility<T extends Comparable<T>> {

	public String toPercent(T input){
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(input);
	}
	
	public String toCurrency(T input){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(input);
	}
	
	public String setDecimals(T input, int digits){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(digits);
		return number.format(input);
	}
	
	public double randBetween(T a, T b){
		Random r = new Random();
		if( b.compareTo(a) >= 0){
			double test = r.nextDouble() * Double.valueOf(String.valueOf(b));
			if (Double.valueOf(String.valueOf(test)) >= Double.valueOf(String.valueOf(a))){
				return test;
			}
			else{
				return randBetween(a, b);
			}
		}
		else{
			double test = r.nextDouble() * Double.valueOf(String.valueOf(a));
			if (Double.valueOf(String.valueOf(test)) >= Double.valueOf(String.valueOf(b))){
				return test;
			}
			else{
				return randBetween(a, b);
			}
		}
	}
	
	public T max(T a, T b){
		if (a.compareTo(b) > 0){
			return a;
		}
		else{
			return b;
		}
	}
	
	public T min(T a, T b){
		if (a.compareTo(b) < 0){
			return a;
		}
		else{
			return b;
		}
	}
}
