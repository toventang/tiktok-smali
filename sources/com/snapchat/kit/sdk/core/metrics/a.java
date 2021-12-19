package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final long f57125a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final int f57126b = ((int) TimeUnit.MILLISECONDS.toNanos(1));

    static {
        Covode.recordClassIndex(35604);
    }

    private static Timestamp a() {
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp.Builder builder = new Timestamp.Builder();
        long j2 = f57125a;
        return builder.seconds(Long.valueOf(currentTimeMillis / j2)).nanos(Integer.valueOf(((int) (currentTimeMillis % j2)) * f57126b)).build();
    }

    public static OpMetric a(String str) {
        return new OpMetric.Builder().counter_metric(new CounterMetric.Builder().name(str).count(1L).timestamp(a()).build()).build();
    }

    public static OpMetric a(String str, long j2) {
        return new OpMetric.Builder().timer_metric(new TimerMetric.Builder().name(str).latency_millis(Long.valueOf(j2)).timestamp(a()).build()).build();
    }
}
