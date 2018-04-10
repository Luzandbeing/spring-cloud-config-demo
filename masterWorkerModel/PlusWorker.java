package masterWorkerModel;

public class PlusWorker extends Worker{
	
	public Object handle(Object input) {
		int i = (Integer) input;
		return i * i * i;
	}
}
