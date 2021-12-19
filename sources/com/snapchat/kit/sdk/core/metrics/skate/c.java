package com.snapchat.kit.sdk.core.metrics.skate;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.f;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.m;
import java.util.TimeZone;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f57224a;

    /* renamed from: b  reason: collision with root package name */
    public final d f57225b;

    /* renamed from: c  reason: collision with root package name */
    final MetricQueue<SkateEvent> f57226c;

    /* renamed from: d  reason: collision with root package name */
    public final com.snapchat.kit.sdk.b.c f57227d;

    /* renamed from: e  reason: collision with root package name */
    final m f57228e;

    /* renamed from: f  reason: collision with root package name */
    final SnapKitInitType f57229f;

    /* renamed from: g  reason: collision with root package name */
    final KitPluginType f57230g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f57231h;

    static {
        Covode.recordClassIndex(35776);
    }

    public c(f fVar, d dVar, MetricQueue<SkateEvent> metricQueue, m mVar, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z) {
        this(fVar, dVar, metricQueue, mVar, new com.snapchat.kit.sdk.b.c(TimeZone.getTimeZone("GMT-8")), snapKitInitType, kitPluginType, z);
    }

    private c(f fVar, d dVar, MetricQueue<SkateEvent> metricQueue, m mVar, com.snapchat.kit.sdk.b.c cVar, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z) {
        this.f57224a = fVar;
        this.f57225b = dVar;
        this.f57226c = metricQueue;
        this.f57228e = mVar;
        this.f57227d = cVar;
        this.f57229f = snapKitInitType;
        this.f57230g = kitPluginType;
        this.f57231h = z;
    }
}
