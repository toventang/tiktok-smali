package com.kakao.network.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class AbstractTaskQueue implements ITaskQueue {
    private ExecutorService executor;

    static {
        Covode.recordClassIndex(34401);
    }

    public AbstractTaskQueue(ExecutorService executorService) {
        this.executor = executorService;
    }

    @Override // com.kakao.network.tasks.ITaskQueue
    public <T> Future<T> addTask(KakaoResultTask<T> kakaoResultTask) {
        return this.executor.submit(kakaoResultTask.getCallable());
    }
}
