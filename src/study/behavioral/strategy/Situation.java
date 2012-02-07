package study.behavioral.strategy;

/**
 * 생성자에 어떤 경찰이 오는지에 따라서 과속처리 사항이 달라진다.
 * @author korigp21
 *
 */
public class Situation {
	
	private Strategy strategy;
	 
	public Situation(Strategy strategy){
		this.strategy = strategy;
	}
 
	public void handleByPolice(int speed){
		this.strategy.processSpeeding(speed);
	}
	
}
