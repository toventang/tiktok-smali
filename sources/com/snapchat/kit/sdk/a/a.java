package com.snapchat.kit.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final dagger.a<MetricQueue<OpMetric>> f57055a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<EnumC1273a, Long> f57056b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(35554);
    }

    /* renamed from: com.snapchat.kit.sdk.a.a$a  reason: collision with other inner class name */
    public enum EnumC1273a {
        REVOKE,
        REFRESH,
        GRANT,
        FIREBASE_TOKEN_GRANT;

        static {
            Covode.recordClassIndex(35555);
        }
    }

    public a(dagger.a<MetricQueue<OpMetric>> aVar) {
        this.f57055a = aVar;
    }

    private static String b(String str) {
        return com.a.a("%s:login:%s", new Object[]{"1.12.0".replace('.', '_'), str});
    }

    public final synchronized void a(String str) {
        MethodCollector.i(6690);
        this.f57055a.get().push(com.snapchat.kit.sdk.core.metrics.a.a(b(str)));
        MethodCollector.o(6690);
    }

    public final synchronized void a(EnumC1273a aVar) {
        MethodCollector.i(6695);
        this.f57055a.get().push(com.snapchat.kit.sdk.core.metrics.a.a(b(aVar.toString().toLowerCase() + "TokenRequest")));
        this.f57056b.put(aVar, Long.valueOf(System.currentTimeMillis()));
        MethodCollector.o(6695);
    }

    public final synchronized void a(EnumC1273a aVar, boolean z) {
        MethodCollector.i(6856);
        MetricQueue<OpMetric> metricQueue = this.f57055a.get();
        if (z) {
            Long remove = this.f57056b.remove(aVar);
            if (remove != null) {
                metricQueue.push(com.snapchat.kit.sdk.core.metrics.a.a(b(aVar.toString().toLowerCase() + "TokenLatency"), System.currentTimeMillis() - remove.longValue()));
            }
            MethodCollector.o(6856);
            return;
        }
        metricQueue.push(com.snapchat.kit.sdk.core.metrics.a.a(b(aVar.toString().toLowerCase() + "TokenFailure")));
        MethodCollector.o(6856);
    }
}
