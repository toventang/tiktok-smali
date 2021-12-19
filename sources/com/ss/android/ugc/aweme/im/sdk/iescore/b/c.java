package com.ss.android.ugc.aweme.im.sdk.iescore.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.g.b;
import com.bytedance.ies.im.core.api.g.e;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.ss.android.ugc.aweme.common.net.f;
import com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi;
import com.ss.android.ugc.aweme.utils.fe;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c implements com.bytedance.ies.im.core.api.d.c, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final c f102811a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f102812b = h.i.a((h.f.a.a) a.f102813a);

    private static CopyOnWriteArraySet<b> b() {
        return (CopyOnWriteArraySet) f102812b.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(358, new g(c.class, "onNetworkEvent", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<CopyOnWriteArraySet<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102813a = new a();

        static {
            Covode.recordClassIndex(65917);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<b> invoke() {
            return new CopyOnWriteArraySet(new LinkedHashSet());
        }
    }

    static {
        Covode.recordClassIndex(65916);
        c cVar = new c();
        f102811a = cVar;
        EventBus.a(EventBus.a(), cVar);
    }

    @Override // com.bytedance.ies.im.core.api.d.c
    public final boolean a() {
        return fe.a(d.a());
    }

    @Override // com.bytedance.ies.im.core.api.d.c
    public final void a(b bVar) {
        l.d(bVar, "");
        b().add(bVar);
    }

    @r
    public final void onNetworkEvent(f fVar) {
        com.bytedance.ies.im.core.api.g.c cVar;
        e eVar;
        l.d(fVar, "");
        if (fe.a(d.a())) {
            cVar = com.bytedance.ies.im.core.api.g.c.CONNECTED;
        } else {
            cVar = com.bytedance.ies.im.core.api.g.c.DISCONNECTED;
        }
        int i2 = fVar.f76473a;
        if (i2 == 1) {
            eVar = e.MOBILE;
        } else if (i2 != 2) {
            eVar = e.UNKNOWN;
        } else {
            eVar = e.WIFI;
        }
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            it.next().a(new com.bytedance.ies.im.core.api.g.d(cVar, eVar));
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.c
    public final void a(com.bytedance.ies.im.core.api.g.a<Request> aVar, com.bytedance.im.core.a.a.b<Response> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        PlatformApi.f102795a.a(aVar, bVar);
    }

    @Override // com.bytedance.ies.im.core.api.d.c
    public final void a(boolean z, com.bytedance.im.core.a.a.b<com.bytedance.ies.im.core.api.f.d> bVar) {
        l.d(bVar, "");
        PlatformApi.f102795a.a(z, bVar);
    }
}
