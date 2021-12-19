package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.SnapKitStorySnapViews;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import l.b;
import l.b.a;
import l.b.o;

public interface MetricsClient {
    static {
        Covode.recordClassIndex(35603);
    }

    @o(a = "/v1/sdk/metrics/business")
    b<Void> postAnalytics(@a ServerEventBatch serverEventBatch);

    @o(a = "/v1/sdk/metrics/operational")
    b<Void> postOperationalMetrics(@a Metrics metrics);

    @o(a = "/v1/stories/app/view")
    b<Void> postViewEvents(@a SnapKitStorySnapViews snapKitStorySnapViews);
}
