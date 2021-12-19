package com.bytedance.android.live.liveinteract.multilive.anchor.c;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.c;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class e extends com.bytedance.android.live.liveinteract.platform.common.e.a {
    @c(a = "LAYOUT_MANAGER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.anchor.f.e f11610a;

    /* renamed from: b  reason: collision with root package name */
    private final h f11611b = i.a((h.f.a.a) b.f11613a);

    /* renamed from: d  reason: collision with root package name */
    private final a f11612d;

    public interface a {
        static {
            Covode.recordClassIndex(6307);
        }

        long g(String str);

        boolean h(String str);

        boolean i(String str);

        int j(String str);

        int k(String str);
    }

    static {
        Covode.recordClassIndex(6306);
    }

    private final HashMap<n, com.bytedance.android.live.liveinteract.platform.common.e.a> a() {
        return (HashMap) this.f11611b.getValue();
    }

    static final class b extends m implements h.f.a.a<HashMap<n, com.bytedance.android.live.liveinteract.platform.common.e.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11613a = new b();

        static {
            Covode.recordClassIndex(6308);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<n, com.bytedance.android.live.liveinteract.platform.common.e.a> invoke() {
            return new HashMap();
        }
    }

    public e(a aVar) {
        l.d(aVar, "");
        this.f11612d = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.e.a
    public final void a(LiveCore.InteractConfig interactConfig) {
        super.a(interactConfig);
        Collection<com.bytedance.android.live.liveinteract.platform.common.e.a> values = a().values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().a(interactConfig);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<? extends Region> list) {
        n nVar;
        l.d(list, "");
        if (this.f11610a == null) {
            com.bytedance.android.live.liveinteract.api.c.e.f10014a.b(this);
        }
        com.bytedance.android.live.liveinteract.multilive.anchor.f.e eVar = this.f11610a;
        if (eVar == null || (nVar = eVar.b()) == null) {
            nVar = n.FLOATING;
        }
        com.bytedance.android.live.liveinteract.platform.common.e.a aVar = a().get(nVar);
        if (aVar == null) {
            int i4 = f.f11614a[nVar.ordinal()];
            if (i4 == 1) {
                aVar = new b(this.f11612d);
            } else if (i4 == 2) {
                aVar = new a(this.f11612d);
            } else if (i4 == 3) {
                aVar = new d(this.f11612d);
            } else if (i4 != 4) {
                aVar = new g(this.f11612d);
            } else {
                aVar = new c(this.f11612d);
            }
            a().put(nVar, aVar);
            aVar.a(this.f11918c);
        }
        String mixStream = aVar.mixStream(i2, i3, list);
        l.b(mixStream, "");
        return mixStream;
    }
}
