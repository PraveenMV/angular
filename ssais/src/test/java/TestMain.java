import java.text.DecimalFormat;

public class TestMain {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("#");		
		System.out.println(format.format(Math.round(4545.654)));

	}
}
