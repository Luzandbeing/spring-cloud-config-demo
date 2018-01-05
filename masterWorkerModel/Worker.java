package masterWorkerModel;

import java.util.Map;
import java.util.Queue;

public class Worker implements Runnable {

	// 任务队列 用于取得子任务
	protected Queue<Object> workQueue;
	// 子任务处理结果集
	protected Map<String, Object> resultMap;

	// 子任务的处理逻辑，具体实现由相应的子类实现，这里不做具体实现
	public Object handle(Object input) {
		return input;
	}

	@Override
	public void run() {
		while (true) {
			Object task = workQueue.poll();
			if (task == null) {
				break;
			}
			Object taskResult = handle(task);
			resultMap.put(Integer.toString(task.hashCode()), taskResult);
		}

	}

	public void setWorkQueue(Queue<Object> workQueue) {
		this.workQueue = workQueue;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

}
