package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface MetricPublisher<T> {

    public interface PublishCallback {
        static {
            Covode.recordClassIndex(35601);
        }

        void onNetworkError();

        void onServerError(Error error);

        void onSuccess();
    }

    static {
        Covode.recordClassIndex(35600);
    }

    List<d<T>> getPersistedEvents();

    void persistMetrics(List<d<T>> list);

    void publishMetrics(List<T> list, PublishCallback publishCallback);
}
