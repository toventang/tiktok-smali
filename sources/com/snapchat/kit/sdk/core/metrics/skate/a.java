package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.MetricSampleRate;
import com.snapchat.kit.sdk.core.config.f;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.c.i;
import com.snapchat.kit.sdk.core.metrics.d;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l.b;
import l.l;

public final class a implements MetricPublisher<SkateEvent> {

    /* renamed from: a  reason: collision with root package name */
    final f f57212a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f57213b;

    /* renamed from: c  reason: collision with root package name */
    private final i f57214c;

    /* renamed from: d  reason: collision with root package name */
    private final SkateClient f57215d;

    /* renamed from: e  reason: collision with root package name */
    private final com.snapchat.kit.sdk.core.metrics.b.a f57216e;

    static {
        Covode.recordClassIndex(35773);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<d<SkateEvent>> getPersistedEvents() {
        try {
            return this.f57216e.a(SkateEvent.ADAPTER, this.f57213b.getString("com.snapchat.kit.sdk.core.metrics.skate.unsentSkateEvents", null));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<d<SkateEvent>> list) {
        this.f57213b.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.unsentSkateEvents", this.f57216e.a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<SkateEvent> list, final MetricPublisher.PublishCallback publishCallback) {
        ArrayList arrayList = new ArrayList();
        for (SkateEvent skateEvent : list) {
            arrayList.add(new ServerEvent.Builder().event_data(new ServerEventData.Builder().skate_event(skateEvent).build()).build());
        }
        this.f57215d.postSkateEvents(new ServerEventBatch.Builder().server_events(arrayList).max_sequence_id_on_instance(Long.valueOf(this.f57214c.f57183b)).build()).a(new l.d<MetricSampleRate>() {
            /* class com.snapchat.kit.sdk.core.metrics.skate.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35774);
            }

            @Override // l.d
            public final void a(b<MetricSampleRate> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // l.d
            public final void a(b<MetricSampleRate> bVar, l<MetricSampleRate> lVar) {
                try {
                    if (lVar.f159305a.isSuccessful()) {
                        T t = lVar.f159306b;
                        if (!(t == null || t.rate == null)) {
                            f fVar = a.this.f57212a;
                            double doubleValue = t.rate.doubleValue();
                            if (f.b(doubleValue)) {
                                fVar.f57100a.edit().putFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", (float) doubleValue).apply();
                            }
                        }
                        publishCallback.onSuccess();
                        return;
                    }
                    publishCallback.onServerError(new Error(lVar.f159307c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    a(f fVar, SharedPreferences sharedPreferences, i iVar, SkateClient skateClient, com.snapchat.kit.sdk.core.metrics.b.a aVar) {
        this.f57212a = fVar;
        this.f57213b = sharedPreferences;
        this.f57214c = iVar;
        this.f57215d = skateClient;
        this.f57216e = aVar;
    }
}
