package com.snapchat.kit.sdk.core.metrics.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.d;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l.b;
import l.l;

public final class a implements MetricPublisher<OpMetric> {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57127a;

    /* renamed from: b  reason: collision with root package name */
    private final MetricsClient f57128b;

    /* renamed from: c  reason: collision with root package name */
    private final com.snapchat.kit.sdk.core.metrics.b.a f57129c;

    static {
        Covode.recordClassIndex(35605);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<d<OpMetric>> getPersistedEvents() {
        return this.f57129c.a(OpMetric.ADAPTER, this.f57127a.getString("unsent_operational_metrics", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<d<OpMetric>> list) {
        this.f57127a.edit().putString("unsent_operational_metrics", this.f57129c.a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<OpMetric> list, final MetricPublisher.PublishCallback publishCallback) {
        MetricsClient metricsClient = this.f57128b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (OpMetric opMetric : list) {
            if (opMetric.counter_metric != null) {
                arrayList.add(opMetric.counter_metric);
            } else if (opMetric.timer_metric != null) {
                arrayList2.add(opMetric.timer_metric);
            } else if (opMetric.level_metric != null) {
                arrayList3.add(opMetric.level_metric);
            }
        }
        metricsClient.postOperationalMetrics(new Metrics.Builder().counters(arrayList).timers(arrayList2).levels(arrayList3).build()).a(new l.d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35606);
            }

            @Override // l.d
            public final void a(b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // l.d
            public final void a(b<Void> bVar, l<Void> lVar) {
                if (lVar.f159305a.isSuccessful()) {
                    publishCallback.onSuccess();
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f159307c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    a(SharedPreferences sharedPreferences, MetricsClient metricsClient, com.snapchat.kit.sdk.core.metrics.b.a aVar) {
        this.f57127a = sharedPreferences;
        this.f57128b = metricsClient;
        this.f57129c = aVar;
    }
}
