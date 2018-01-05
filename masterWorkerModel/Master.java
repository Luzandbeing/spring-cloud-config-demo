package masterWorkerModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 用来理解并行设计模式之 work-master模式
 * 
 * @author beinglee
 * @since 2017-12-19
 *
 */
public class Master {
	// 任务队列
	protected Queue<Object> workQueue = new ConcurrentLinkedQueue<>();
	// 子任务处理结果集
	protected Map<String, Object> resultMap = new ConcurrentHashMap<>();
	// worker进程队列
	protected Map<String, Thread> threadMap = new HashMap<>();

	public Master(Worker worker, int workerCount) {
		worker.setWorkQueue(workQueue);
		worker.setResultMap(resultMap);
		for (int i = 0; i < workerCount; i++) {
			threadMap.put(Integer.toString(i), new Thread(worker, Integer.toString(i)));
		}
	}

	// 提交一个子任务
	public void submit(Object obj) {
		workQueue.add(obj);
	}

	// 是否所有的子任务都结束啦
	public boolean isComplete() {
		for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
			if (entry.getValue().getState() != Thread.State.TERMINATED) {
				return false;
			}
		}
		return true;
	}

	// 返回子结果集
	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	// 执行所有worker进程 进行处理
	public void execute() {
		for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
			entry.getValue().start();
		}
	}

}
