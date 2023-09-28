package Program3;

public class Delivery {
	private Long over;
	private Long ball;
	private Long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}

	public void displayDeliveryDetails() {
		System.out.println( "Delivery Details: over:" + over + ", ball:" + ball + ", runs:" + runs + ", batsman:" + batsman + ", bowler:"
				+ bowler + ", nonStriker:" + nonStriker );
	}
	

}
