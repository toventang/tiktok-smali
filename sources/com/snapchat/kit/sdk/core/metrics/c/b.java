package com.snapchat.kit.sdk.core.metrics.c;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.b.a;
import com.snapchat.kit.sdk.core.metrics.d;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import java.io.IOException;
import java.util.List;
import l.l;

public final class b implements MetricPublisher<ServerEvent> {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57163a;

    /* renamed from: b  reason: collision with root package name */
    private final i f57164b;

    /* renamed from: c  reason: collision with root package name */
    private final MetricsClient f57165c;

    /* renamed from: d  reason: collision with root package name */
    private final a f57166d;

    static {
        Covode.recordClassIndex(35621);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<d<ServerEvent>> getPersistedEvents() {
        return this.f57166d.a(ServerEvent.ADAPTER, this.f57163a.getString("unsent_analytics_events", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<d<ServerEvent>> list) {
        this.f57163a.edit().putString("unsent_analytics_events", this.f57166d.a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<ServerEvent> list, final MetricPublisher.PublishCallback publishCallback) {
        this.f57165c.postAnalytics(new ServerEventBatch.Builder().server_events(list).max_sequence_id_on_instance(Long.valueOf(this.f57164b.f57183b)).build()).a(new l.d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.c.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35622);
            }

            @Override // l.d
            public final void a(l.b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // l.d
            public final void a(l.b<Void> bVar, l<Void> lVar) {
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

    b(SharedPreferences sharedPreferences, i iVar, MetricsClient metricsClient, a aVar) {
        this.f57163a = sharedPreferences;
        this.f57164b = iVar;
        this.f57165c = metricsClient;
        this.f57166d = aVar;
    }
}
