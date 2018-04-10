package masterWorkerModel;

import java.util.Map;
import java.util.Set;

public class TestModel {
	
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		Master master = new Master(new PlusWorker(), 5);
		for (int i = 1; i <= 100; i++) {
			master.submit(i);
		}
		master.execute();
		int re = 0 ;
		Map<String,Object> resultMap = master.getResultMap();
		while(true) {
			Set<String> keys = resultMap.keySet();
			String key = null;
			for(String k : keys) {
				key = k;
				break;
			}
			Integer i = null;
			if(key != null) {
				i = (Integer) resultMap.get(key);
			}
			if(i != null) {
				 re += i;
			}
			if(key != null) {
				resultMap.remove(key);
			}
			if(master.isComplete() && resultMap.size() == 0) {
				break;
			}
		}
		System.out.println(re);
		System.out.println("run time :" + (System.currentTimeMillis() - startTime));
	}

}
