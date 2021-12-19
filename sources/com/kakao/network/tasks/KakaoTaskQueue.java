package com.kakao.network.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KakaoTaskQueue extends AbstractTaskQueue {
    private static KakaoTaskQueue instance = new KakaoTaskQueue(Executors.newCachedThreadPool());

    public static KakaoTaskQueue getInstance() {
        return instance;
    }

    static {
        Covode.recordClassIndex(34406);
    }

    public KakaoTaskQueue(ExecutorService executorService) {
        super(executorService);
    }
}
