package study.behavioral.strategy;

/**
 * 과속 처리를 위한 정책(전략)
 * 
 * 경찰이 과속한 차를 단속한다고 가정하자
 * 
 * 과속한 차에 대해서 어떤 경찰에 따라서 보내거나, 딱지를 끊는 경우가 발생한다.
 * 
 * @author korigp21
 *
 */
public interface Strategy {
	
	public void processSpeeding(int speed);

}
