package com.snapchat.kit.sdk.core.metrics.skate;

import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.MetricSampleRate;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import l.b;
import l.b.a;
import l.b.o;

public interface SkateClient {
    static {
        Covode.recordClassIndex(35772);
    }

    @o(a = "/v1/sdk/metrics/skate")
    b<MetricSampleRate> postSkateEvents(@a ServerEventBatch serverEventBatch);
}
