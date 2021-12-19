package com.snapchat.kit.sdk.creative;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.a.b;
import com.snapchat.kit.sdk.creative.a.c;
import dagger.a.f;

public final class a implements CreativeComponent {

    /* renamed from: a  reason: collision with root package name */
    private SnapKitComponent f57276a;

    /* renamed from: b  reason: collision with root package name */
    private javax.a.a<MetricQueue<OpMetric>> f57277b;

    /* renamed from: c  reason: collision with root package name */
    private javax.a.a<b> f57278c;

    static {
        Covode.recordClassIndex(35816);
    }

    /* renamed from: com.snapchat.kit.sdk.creative.a$a  reason: collision with other inner class name */
    public static final class C1274a {

        /* renamed from: a  reason: collision with root package name */
        public SnapKitComponent f57279a;

        static {
            Covode.recordClassIndex(35817);
        }

        private C1274a() {
        }

        public /* synthetic */ C1274a(byte b2) {
            this();
        }
    }

    static class b implements javax.a.a<MetricQueue<OpMetric>> {

        /* renamed from: a  reason: collision with root package name */
        private final SnapKitComponent f57281a;

        static {
            Covode.recordClassIndex(35818);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // javax.a.a
        public final /* synthetic */ MetricQueue<OpMetric> get() {
            return f.a(this.f57281a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }

        b(SnapKitComponent snapKitComponent) {
            this.f57281a = snapKitComponent;
        }
    }

    @Override // com.snapchat.kit.sdk.creative.CreativeComponent
    public final com.snapchat.kit.sdk.creative.c.b getMediaFactory() {
        return new com.snapchat.kit.sdk.creative.c.b(this.f57278c.get());
    }

    @Override // com.snapchat.kit.sdk.creative.CreativeComponent
    public final com.snapchat.kit.sdk.creative.api.a getApi() {
        return new com.snapchat.kit.sdk.creative.api.a((Context) f.a(this.f57276a.context(), "Cannot return null from a non-@Nullable component method"), (String) f.a(this.f57276a.clientId(), "Cannot return null from a non-@Nullable component method"), (String) f.a(this.f57276a.redirectUrl(), "Cannot return null from a non-@Nullable component method"), this.f57278c.get(), (MetricQueue) f.a(this.f57276a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method"), new com.snapchat.kit.sdk.creative.a.a((com.snapchat.kit.sdk.core.metrics.c.a) f.a(this.f57276a.kitEventBaseFactory(), "Cannot return null from a non-@Nullable component method")), (KitPluginType) f.a(this.f57276a.kitPluginType(), "Cannot return null from a non-@Nullable component method"), this.f57276a.sdkIsFromReactNativePlugin());
    }

    private a(C1274a aVar) {
        this.f57276a = aVar.f57279a;
        b bVar = new b(aVar.f57279a);
        this.f57277b = bVar;
        this.f57278c = dagger.a.b.a(new c(bVar));
    }

    public /* synthetic */ a(C1274a aVar, byte b2) {
        this(aVar);
    }
}
