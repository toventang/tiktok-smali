package com.kakao.network.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

public interface ITaskQueue {
    static {
        Covode.recordClassIndex(34402);
    }

    <T> Future<T> addTask(KakaoResultTask<T> kakaoResultTask);
}
