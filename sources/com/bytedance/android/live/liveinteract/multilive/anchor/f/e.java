package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.multilive.c.p;
import com.bytedance.android.live.liveinteract.multilive.c.q;
import com.bytedance.android.live.liveinteract.multilive.e.b;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

@f(a = "LAYOUT_MANAGER")
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f11647a;

    /* renamed from: b  reason: collision with root package name */
    public b f11648b;
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11649c;

    /* renamed from: d  reason: collision with root package name */
    public final DataChannel f11650d;

    /* renamed from: e  reason: collision with root package name */
    private final h f11651e = i.a((h.f.a.a) a.f11652a);

    static {
        Covode.recordClassIndex(6335);
    }

    public final List<View> a() {
        return (List) this.f11651e.getValue();
    }

    static final class a extends m implements h.f.a.a<ArrayList<View>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11652a = new a();

        static {
            Covode.recordClassIndex(6337);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<View> invoke() {
            return new ArrayList();
        }
    }

    public final n b() {
        n c2;
        b bVar = this.f11648b;
        if (bVar == null || (c2 = bVar.c()) == null) {
            return n.NORMAL;
        }
        return c2;
    }

    public final void a(View view) {
        l.d(view, "");
        b bVar = this.f11648b;
        if (bVar != null) {
            bVar.a(view);
        }
        a().remove(view);
    }

    public e(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11650d = dataChannel;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        dataChannel.a(this, q.class, new h.f.a.b<p, z>(this) {
            /* class com.bytedance.android.live.liveinteract.multilive.anchor.f.e.AnonymousClass1 */
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(6336);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(p pVar) {
                p pVar2 = pVar;
                l.d(pVar2, "");
                this.this$0.a(pVar2.f11772a);
                return z.f158842a;
            }
        });
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this, null);
    }

    public final void a(n nVar) {
        n nVar2;
        com.bytedance.android.live.liveinteract.multilive.e.a aVar;
        b bVar;
        int i2;
        MethodCollector.i(7576);
        l.d(nVar, "");
        b bVar2 = this.f11648b;
        if (bVar2 != null) {
            bVar2.m();
        }
        b bVar3 = this.f11648b;
        if (bVar3 != null) {
            nVar2 = bVar3.c();
        } else {
            nVar2 = null;
        }
        if (nVar2 == nVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11649c;
            if (aVar2 == null) {
                l.a("mDataHolder");
            }
            aVar2.a(nVar);
            MethodCollector.o(7576);
            return;
        }
        for (T t : a()) {
            if (t instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                t.setAdjustParent(true);
            }
        }
        b bVar4 = this.f11648b;
        if (bVar4 != null) {
            ViewGroup viewGroup = this.f11647a;
            if (viewGroup == null) {
                l.a("mContentView");
            }
            bVar4.b(viewGroup);
        }
        int i3 = f.f11653a[nVar.ordinal()];
        if (i3 == 1) {
            aVar = new b(this.f11650d);
        } else if (i3 == 2) {
            aVar = new a(this.f11650d);
        } else if (i3 == 3) {
            aVar = new d(this.f11650d);
        } else if (i3 == 4) {
            aVar = new c(this.f11650d);
        } else if (i3 != 5) {
            MethodCollector.o(7576);
            return;
        } else {
            aVar = new h(this.f11650d);
        }
        ViewGroup viewGroup2 = this.f11647a;
        if (viewGroup2 == null) {
            l.a("mContentView");
        }
        aVar.a(viewGroup2);
        for (T t2 : a()) {
            ViewParent parent = t2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(t2);
            }
            boolean z = t2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a;
            if (z) {
                i2 = g.a.f14199a.b(t2.getInteractId());
            } else {
                i2 = 0;
            }
            int a2 = aVar.a(t2, i2);
            if (z) {
                t2.setPosInMultiLive(a2);
                t2.setAdjustParent(false);
            }
        }
        this.f11648b = aVar;
        if (a().isEmpty() && (bVar = this.f11648b) != null) {
            bVar.p();
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11649c;
        if (aVar3 == null) {
            l.a("mDataHolder");
        }
        aVar3.a(nVar);
        this.f11650d.c(com.bytedance.android.live.liveinteract.multilive.c.b.class, nVar);
        MethodCollector.o(7576);
    }
}
