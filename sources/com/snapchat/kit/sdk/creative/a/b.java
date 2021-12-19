package com.snapchat.kit.sdk.creative.a;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f57282a = "1.12.0".replace('.', '_');

    /* renamed from: b  reason: collision with root package name */
    private final MetricQueue<OpMetric> f57283b;

    static {
        Covode.recordClassIndex(35820);
    }

    public b(MetricQueue<OpMetric> metricQueue) {
        this.f57283b = metricQueue;
    }

    private static String b(String str) {
        return a.a("%s:creative:%s", new Object[]{f57282a, str});
    }

    public final synchronized void a(String str) {
        MethodCollector.i(2119);
        this.f57283b.push(com.snapchat.kit.sdk.core.metrics.a.a(b(str)));
        MethodCollector.o(2119);
    }

    public final synchronized void a(String str, long j2) {
        MethodCollector.i(2122);
        this.f57283b.push(com.snapchat.kit.sdk.core.metrics.a.a(b(str), j2));
        MethodCollector.o(2122);
    }
}
