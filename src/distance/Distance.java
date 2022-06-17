package distance;

public class Distance {
		int area;
		int distances;
		public static void main(String[] args) {
			Distance sai = new Distance();
			String x= sai.calDistnc("banjarahills TO secunderabad :", 40, 40);
			System.out.println(" print the total distance= " +x);

		}
		public String calDistnc(String location, int S, int T) {
			String ps = (location)+(S*T);
			return ps;
		}
	}
