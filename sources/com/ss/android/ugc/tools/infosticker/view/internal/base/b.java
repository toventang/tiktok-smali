package com.ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.view.widget.b.e;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class b<DATA> implements com.ss.android.ugc.tools.infosticker.view.a.b<DATA> {

    /* renamed from: a  reason: collision with root package name */
    private Map<DATA, ? extends h.p<? extends com.ss.android.ugc.tools.h.a.c, Integer>> f149549a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.l.g<h.p<List<DATA>, Integer>> f149550b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.m f149551c;

    /* renamed from: d  reason: collision with root package name */
    public final c f149552d;

    /* renamed from: e  reason: collision with root package name */
    protected View f149553e;

    /* renamed from: f  reason: collision with root package name */
    protected RecyclerView f149554f;

    /* renamed from: g  reason: collision with root package name */
    protected com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> f149555g;

    /* renamed from: h  reason: collision with root package name */
    protected com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> f149556h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.tools.view.widget.a.g f149557i;

    /* renamed from: j  reason: collision with root package name */
    final f.a.l.g<am<DATA, Integer, com.ss.android.ugc.tools.h.a.c>> f149558j;

    /* renamed from: k  reason: collision with root package name */
    final f.a.l.g<DATA> f149559k;

    /* renamed from: l  reason: collision with root package name */
    final f.a.l.g<DATA> f149560l;

    /* renamed from: m  reason: collision with root package name */
    public final f.a.l.g<Integer> f149561m;
    public final f.a.l.g<h.p<DATA, Integer>> n;
    public final f.a.l.g<h.p<DATA, Integer>> o;
    public final f.a.l.g<com.ss.android.ugc.tools.h.a.c> p;
    int q;
    public final h.f.a.q<DATA, Integer, com.ss.android.ugc.tools.h.a.c, z> r;
    public final Context s;
    final com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> t;
    public final com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> u;
    private final ViewGroup v;
    private final int w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    static {
        Covode.recordClassIndex(98472);
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, h.f.a.q<? super DATA, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, z> qVar);

    /* access modifiers changed from: protected */
    public abstract void a(RecyclerView.ViewHolder viewHolder, int i2, DATA data, com.ss.android.ugc.tools.h.a.c cVar, Integer num);

    public int b(int i2) {
        return i2;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.h x() {
        return null;
    }

    public androidx.lifecycle.m c() {
        return this.f149551c;
    }

    public int d() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(98491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.cD_();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149584a;

        static {
            Covode.recordClassIndex(98499);
        }

        s(b bVar) {
            this.f149584a = bVar;
        }

        public final void run() {
            this.f149584a.v();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final void cD_() {
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar = this.t;
        if (eVar != null) {
            eVar.f();
        }
    }

    public final void u() {
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar = this.t;
        if (eVar != null) {
            eVar.g();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f149565a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.m<? super com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a>, ? super h.f.a.a<z>, z> f149566b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.b<? super RecyclerView, z> f149567c;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.b<? super RecyclerView.ViewHolder, z> f149568d;

        static {
            Covode.recordClassIndex(98476);
        }

        private c() {
            this.f149565a = false;
            this.f149566b = null;
            this.f149567c = null;
            this.f149568d = null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class k extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(98488);
        }

        k(b bVar) {
            super(0, bVar, b.class, "onLoadMoreTriggered", "onLoadMoreTriggered()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar = ((b) this.receiver).t;
            if (eVar != null) {
                eVar.g();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<am<DATA, Integer, com.ss.android.ugc.tools.h.a.c>> f() {
        f.a.t<am<DATA, Integer, com.ss.android.ugc.tools.h.a.c>> c2 = this.f149558j.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<DATA> g() {
        f.a.t<DATA> c2 = this.f149559k.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<DATA> h() {
        f.a.t<DATA> c2 = this.f149560l.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<h.p<DATA, Integer>> i() {
        f.a.t<h.p<DATA, Integer>> c2 = this.n.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<Integer> j() {
        f.a.t<Integer> c2 = this.f149561m.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<h.p<List<DATA>, Integer>> k() {
        f.a.t<h.p<List<DATA>, Integer>> c2 = this.f149550b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final View l() {
        View view = this.f149553e;
        if (view == null) {
            h.f.b.l.a("contentView");
        }
        return view;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<com.ss.android.ugc.tools.h.a.c> n() {
        f.a.t<com.ss.android.ugc.tools.h.a.c> c2 = this.p.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    /* access modifiers changed from: protected */
    public final View o() {
        View view = this.f149553e;
        if (view == null) {
            h.f.b.l.a("contentView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView p() {
        RecyclerView recyclerView = this.f149554f;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> q() {
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = this.f149555g;
        if (bVar == null) {
            h.f.b.l.a("pageStateView");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> r() {
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar = this.f149556h;
        if (bVar == null) {
            h.f.b.l.a("dataAdapter");
        }
        return bVar;
    }

    public final void s() {
        t();
        a(c());
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public final f.a.t<List<h.p<DATA, Integer>>> m() {
        f.a.t<List<h.p<DATA, Integer>>> c2 = this.o.c(500, TimeUnit.MILLISECONDS).a(o.f149579a).c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.tools.view.widget.a.g, com.ss.android.ugc.tools.infosticker.view.internal.base.b$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.recyclerview.widget.RecyclerView.a<androidx.recyclerview.widget.RecyclerView.ViewHolder> w() {
        /*
            r3 = this;
            boolean r0 = r3.y
            java.lang.String r2 = "dataAdapter"
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.tools.infosticker.view.internal.base.b$b r1 = new com.ss.android.ugc.tools.infosticker.view.internal.base.b$b
            com.ss.android.ugc.tools.view.widget.a.b<com.bytedance.jedi.arch.am<DATA, com.ss.android.ugc.tools.h.a.c, java.lang.Integer>> r0 = r3.f149556h
            if (r0 != 0) goto L_0x000f
            h.f.b.l.a(r2)
        L_0x000f:
            r1.<init>(r3, r0)
            r3.f149557i = r1
        L_0x0014:
            return r1
        L_0x0015:
            com.ss.android.ugc.tools.view.widget.a.b<com.bytedance.jedi.arch.am<DATA, com.ss.android.ugc.tools.h.a.c, java.lang.Integer>> r1 = r3.f149556h
            if (r1 != 0) goto L_0x0014
            h.f.b.l.a(r2)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.infosticker.view.internal.base.b.w():androidx.recyclerview.widget.RecyclerView$a");
    }

    public void t() {
        View a2 = a(this.v);
        this.f149553e = a2;
        if (a2 == null) {
            h.f.b.l.a("contentView");
        }
        RecyclerView a3 = a(a2);
        h.f.a.b<? super RecyclerView, z> bVar = this.f149552d.f149567c;
        if (bVar != null) {
            bVar.invoke(a3);
        }
        this.f149554f = a3;
        View view = this.f149553e;
        if (view == null) {
            h.f.b.l.a("contentView");
        }
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b2 = b(view);
        h.f.a.m<? super com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a>, ? super h.f.a.a<z>, z> mVar = this.f149552d.f149566b;
        if (mVar != null) {
            mVar.invoke(b2, new n(this));
        }
        this.f149555g = b2;
        this.f149556h = new a();
        RecyclerView recyclerView = this.f149554f;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        recyclerView.setAdapter(w());
        RecyclerView.h x2 = x();
        if (x2 != null) {
            RecyclerView recyclerView2 = this.f149554f;
            if (recyclerView2 == null) {
                h.f.b.l.a("recyclerView");
            }
            recyclerView2.b(x2);
        }
    }

    public final void v() {
        if (this.z) {
            RecyclerView recyclerView = this.f149554f;
            if (recyclerView == null) {
                h.f.b.l.a("recyclerView");
            }
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                ArrayList arrayList = new ArrayList();
                int c2 = c(linearLayoutManager.k());
                int c3 = c(linearLayoutManager.m());
                if (c2 < c3 && c2 <= c3) {
                    int i2 = c2;
                    while (true) {
                        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar = this.f149556h;
                        if (bVar == null) {
                            h.f.b.l.a("dataAdapter");
                        }
                        am amVar = (am) h.a.n.b((List) bVar.a(), i2);
                        if (amVar != null) {
                            arrayList.add(amVar.f39387a);
                        }
                        if (i2 == c3) {
                            break;
                        }
                        i2++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f149550b.onNext(v.a(arrayList, Integer.valueOf(c2)));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b
    public void b() {
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar = this.t;
        if (eVar != null) {
            eVar.b().removeObservers(c());
            eVar.c().removeObservers(c());
            eVar.d().removeObservers(c());
        }
        com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar = this.u;
        if (kVar != null) {
            kVar.j().removeObservers(c());
            kVar.k().removeObservers(c());
            kVar.l().removeObservers(c());
        }
    }

    /* access modifiers changed from: package-private */
    public final class a extends com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> {
        static {
            Covode.recordClassIndex(98474);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            h.f.b.l.d(viewHolder, "");
            am amVar = (am) a(i2);
            b.this.a(viewHolder, i2, amVar.f39387a, amVar.f39388b, amVar.f39389c);
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(7101);
            h.f.b.l.d(viewGroup, "");
            b bVar = b.this;
            RecyclerView.ViewHolder a3 = bVar.a(viewGroup, bVar.r);
            h.f.a.b<? super RecyclerView.ViewHolder, z> bVar2 = b.this.f149552d.f149568d;
            if (bVar2 != null) {
                bVar2.invoke(a3);
            }
            try {
                if (a3.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(a3.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = a3.getClass().getName();
            MethodCollector.o(7101);
            return a3;
        }
    }

    public static final class l extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149577a;

        static {
            Covode.recordClassIndex(98489);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f149577a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            this.f149577a.f149561m.onNext(Integer.valueOf(i2));
            if (i2 == 0) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int c2 = this.f149577a.c(linearLayoutManager.k());
                    am amVar = (am) h.a.n.b((List) this.f149577a.r().a(), c2);
                    if (amVar != null) {
                        this.f149577a.n.onNext(v.a(amVar.f39387a, Integer.valueOf(c2)));
                    }
                }
                this.f149577a.v();
            }
            b bVar = this.f149577a;
            if (bVar.f149552d.f149565a) {
                if (i2 == 0) {
                    com.facebook.imagepipeline.e.h c3 = com.facebook.drawee.a.a.c.c();
                    h.f.b.l.b(c3, "");
                    if (c3.d()) {
                        com.facebook.drawee.a.a.c.c().c();
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        com.facebook.drawee.a.a.c.c().b();
                    }
                } else if (bVar.q == 2) {
                    com.facebook.drawee.a.a.c.c().b();
                } else {
                    com.facebook.imagepipeline.e.h c4 = com.facebook.drawee.a.a.c.c();
                    h.f.b.l.b(c4, "");
                    if (c4.d()) {
                        com.facebook.drawee.a.a.c.c().c();
                    }
                }
                bVar.q = i2;
            }
        }
    }

    public static final class m implements RecyclerView.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149578a;

        static {
            Covode.recordClassIndex(98490);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(b bVar) {
            this.f149578a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f149578a.p();
            int d2 = RecyclerView.d(view);
            am amVar = (am) h.a.n.b((List) this.f149578a.r().a(), this.f149578a.c(d2));
            if (amVar != null) {
                this.f149578a.o.onNext(v.a(amVar.f39387a, Integer.valueOf(d2 + 1)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.b$b  reason: collision with other inner class name */
    public final class C4038b extends com.ss.android.ugc.tools.view.widget.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149564a;

        static {
            Covode.recordClassIndex(98475);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.g
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            h.f.b.l.d(viewGroup, "");
            return this.f149564a.b(viewGroup);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4038b(b bVar, RecyclerView.a<RecyclerView.ViewHolder> aVar) {
            super(aVar, (byte) 0);
            h.f.b.l.d(aVar, "");
            this.f149564a = bVar;
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.g
        public final void a(RecyclerView.ViewHolder viewHolder, com.ss.android.ugc.tools.view.widget.b.a aVar) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(aVar, "");
            this.f149564a.a(viewHolder, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149573a;

        static {
            Covode.recordClassIndex(98482);
        }

        g(b bVar) {
            this.f149573a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.a.g gVar;
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null && (gVar = this.f149573a.f149557i) != null) {
                gVar.setState(aVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements u<Map<DATA, ? extends h.p<? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149574a;

        static {
            Covode.recordClassIndex(98483);
        }

        h(b bVar) {
            this.f149574a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Map<DATA, ? extends h.p<? extends com.ss.android.ugc.tools.h.a.c, Integer>> map = (Map) obj;
            if (map != null) {
                this.f149574a.a(map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements u<com.bytedance.jedi.arch.d<? extends List<? extends DATA>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149575a;

        static {
            Covode.recordClassIndex(98484);
        }

        i(b bVar) {
            this.f149575a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.jedi.arch.d dVar = (com.bytedance.jedi.arch.d) obj;
            if (dVar != null) {
                dVar.a(new h.f.a.b<List<? extends DATA>, z>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.i.AnonymousClass1 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(98485);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        List<T> list = (List) obj;
                        h.f.b.l.d(list, "");
                        b bVar = this.this$0.f149575a;
                        for (T t : list) {
                            bVar.f149559k.onNext(t);
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements u<com.bytedance.jedi.arch.d<? extends List<? extends DATA>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149576a;

        static {
            Covode.recordClassIndex(98486);
        }

        j(b bVar) {
            this.f149576a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.jedi.arch.d dVar = (com.bytedance.jedi.arch.d) obj;
            if (dVar != null) {
                dVar.a(new h.f.a.b<List<? extends DATA>, z>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.j.AnonymousClass1 */
                    final /* synthetic */ j this$0;

                    static {
                        Covode.recordClassIndex(98487);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        List<T> list = (List) obj;
                        h.f.b.l.d(list, "");
                        b bVar = this.this$0.f149576a;
                        for (T t : list) {
                            bVar.f149560l.onNext(t);
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f149580a = new p();

        static {
            Covode.recordClassIndex(98493);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f149581a = new q();

        static {
            Covode.recordClassIndex(98494);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, AnonymousClass1.f149582a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<TextView, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(98477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TextView textView) {
            TextView textView2 = textView;
            h.f.b.l.d(textView2, "");
            textView2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f149569a;

                static {
                    Covode.recordClassIndex(98478);
                }

                {
                    this.f149569a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f149569a.this$0.u();
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements u<List<? extends DATA>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149570a;

        static {
            Covode.recordClassIndex(98479);
        }

        e(b bVar) {
            this.f149570a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<? extends DATA> list = (List) obj;
            if (list != null) {
                this.f149570a.a(list);
            }
            this.f149570a.p().post(new Runnable(this) {
                /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f149571a;

                static {
                    Covode.recordClassIndex(98480);
                }

                {
                    this.f149571a = r1;
                }

                public final void run() {
                    this.f149571a.f149570a.p.onNext(com.ss.android.ugc.tools.h.a.c.DOWNLOAD_SUCCESS);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149572a;

        static {
            Covode.recordClassIndex(98481);
        }

        f(b bVar) {
            this.f149572a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null) {
                this.f149572a.a(aVar2);
                if (aVar2 == com.ss.android.ugc.tools.view.widget.b.a.ERROR) {
                    this.f149572a.p.onNext(com.ss.android.ugc.tools.h.a.c.DOWNLOAD_FAILED);
                }
            }
        }
    }

    static final class o<T> implements f.a.d.k<List<h.p<? extends DATA, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f149579a = new o();

        static {
            Covode.recordClassIndex(98492);
        }

        o() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(98496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, new h.f.a.q<TextView, TextView, TextView, z>(this) {
                /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(98497);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    h.f.b.l.d(textView4, "");
                    h.f.b.l.d(textView5, "");
                    h.f.b.l.d(textView6, "");
                    textView4.setText(R.string.h2z);
                    textView5.setText(R.string.h2y);
                    textView6.setText(R.string.h35);
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.r.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f149583a;

                        static {
                            Covode.recordClassIndex(98498);
                        }

                        {
                            this.f149583a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f149583a.this$0.this$0.cD_();
                        }
                    });
                    return z.f158842a;
                }
            });
        }
    }

    public View a(ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(this.s), R.layout.b4i, viewGroup, this.x);
        h.f.b.l.b(a2, "");
        return a2;
    }

    public RecyclerView a(View view) {
        h.f.b.l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.eb9);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(d(), 1, false);
        recyclerView.setItemViewCacheSize(d());
        h.f.b.l.b(recyclerView, "");
        recyclerView.setLayoutManager(gridLayoutManager);
        return recyclerView;
    }

    public int c(int i2) {
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar = this.f149556h;
        if (bVar == null) {
            h.f.b.l.a("dataAdapter");
        }
        if (i2 < bVar.getItemCount()) {
            return i2;
        }
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar2 = this.f149556h;
        if (bVar2 == null) {
            h.f.b.l.a("dataAdapter");
        }
        if (bVar2.getItemCount() == 0) {
            return 0;
        }
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar3 = this.f149556h;
        if (bVar3 == null) {
            h.f.b.l.a("dataAdapter");
        }
        return bVar3.getItemCount() - 1;
    }

    public RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        d dVar = new d(this);
        h.f.b.l.d(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(com.ss.android.ugc.tools.view.widget.b.a.LOADING, e.a.f150375a);
        linkedHashMap.put(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, new e.b());
        linkedHashMap.put(com.ss.android.ugc.tools.view.widget.b.a.ERROR, new e.c(dVar));
        com.ss.android.ugc.tools.view.widget.b.d dVar2 = new com.ss.android.ugc.tools.view.widget.b.d(context, linkedHashMap, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
        dVar2.setLayoutParams(new RecyclerView.j(-1, context.getResources().getDimensionPixelSize(R.dimen.ts)));
        return new com.ss.android.ugc.tools.view.widget.a.h(dVar2);
    }

    public void a(androidx.lifecycle.m mVar) {
        LiveData<com.bytedance.jedi.arch.d<List<DATA>>> l2;
        LiveData<com.bytedance.jedi.arch.d<List<DATA>>> k2;
        LiveData<Map<DATA, h.p<com.ss.android.ugc.tools.h.a.c, Integer>>> j2;
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar;
        LiveData<com.ss.android.ugc.tools.view.widget.b.a> d2;
        LiveData<com.ss.android.ugc.tools.view.widget.b.a> c2;
        LiveData<List<DATA>> b2;
        h.f.b.l.d(mVar, "");
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar2 = this.t;
        if (!(eVar2 == null || (b2 = eVar2.b()) == null)) {
            b2.observe(mVar, new e(this));
        }
        com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar3 = this.t;
        if (!(eVar3 == null || (c2 = eVar3.c()) == null)) {
            c2.observe(mVar, new f(this));
        }
        if (!(!this.y || (eVar = this.t) == null || (d2 = eVar.d()) == null)) {
            d2.observe(mVar, new g(this));
        }
        com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar = this.u;
        if (!(kVar == null || (j2 = kVar.j()) == null)) {
            j2.observe(mVar, new h(this));
        }
        com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar2 = this.u;
        if (!(kVar2 == null || (k2 = kVar2.k()) == null)) {
            k2.observe(mVar, new i(this));
        }
        com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar3 = this.u;
        if (!(kVar3 == null || (l2 = kVar3.l()) == null)) {
            l2.observe(mVar, new j(this));
        }
        com.ss.android.ugc.tools.view.widget.a.g gVar = this.f149557i;
        if (gVar != null) {
            gVar.f150354d = new k(this);
        }
        RecyclerView recyclerView = this.f149554f;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        recyclerView.a(new l(this));
        RecyclerView recyclerView2 = this.f149554f;
        if (recyclerView2 == null) {
            h.f.b.l.a("recyclerView");
        }
        recyclerView2.a(new m(this));
    }

    public com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        h.f.b.l.d(view, "");
        Map a2 = ag.a(v.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, p.f149580a), v.a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, q.f149581a), v.a(com.ss.android.ugc.tools.view.widget.b.a.ERROR, new r(this)));
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        com.ss.android.ugc.tools.view.widget.b.d dVar = new com.ss.android.ugc.tools.view.widget.b.d(context, a2, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View view2 = this.f149553e;
        if (view2 == null) {
            h.f.b.l.a("contentView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(dVar);
        return dVar;
    }

    public void a(com.ss.android.ugc.tools.view.widget.b.a aVar) {
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = this.f149555g;
        if (bVar == null) {
            h.f.b.l.a("pageStateView");
        }
        bVar.setState(aVar);
    }

    public final void a(List<? extends DATA> list) {
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t2 : list) {
            h.p<com.ss.android.ugc.tools.h.a.c, Integer> a2 = c.a(this.f149549a, t2);
            arrayList.add(new am(t2, a2.getFirst(), a2.getSecond()));
        }
        ArrayList arrayList2 = arrayList;
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar = this.f149556h;
        if (bVar == null) {
            h.f.b.l.a("dataAdapter");
        }
        List<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> a3 = bVar.a();
        if (arrayList2.size() <= a3.size() || !(!a3.isEmpty())) {
            com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar2 = this.f149556h;
            if (bVar2 == null) {
                h.f.b.l.a("dataAdapter");
            }
            bVar2.a(arrayList2);
        } else {
            List f2 = h.a.n.f(a3, arrayList2.subList(0, a3.size()));
            if (!f2.isEmpty()) {
                Iterator it = f2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h.p pVar = (h.p) it.next();
                    if (!h.f.b.l.a((Object) ((am) pVar.component1()).f39387a, (Object) ((am) pVar.component2()).f39387a)) {
                        break;
                    }
                }
            }
            com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar3 = this.f149556h;
            if (bVar3 == null) {
                h.f.b.l.a("dataAdapter");
            }
            List subList = arrayList2.subList(a3.size(), arrayList2.size());
            if (subList != null) {
                int size = bVar3.f150339b.size();
                bVar3.f150339b.addAll(subList);
                bVar3.notifyItemRangeInserted(size, subList.size());
            }
        }
        RecyclerView recyclerView = this.f149554f;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        recyclerView.post(new s(this));
    }

    public final void a(Map<DATA, ? extends h.p<? extends com.ss.android.ugc.tools.h.a.c, Integer>> map) {
        this.f149549a = map;
        com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar = this.f149556h;
        if (bVar == null) {
            h.f.b.l.a("dataAdapter");
        }
        int i2 = 0;
        for (T t2 : bVar.a()) {
            h.p a2 = v.a(t2.f39388b, t2.f39389c);
            h.p<com.ss.android.ugc.tools.h.a.c, Integer> a3 = c.a(map, t2.f39387a);
            if (!h.f.b.l.a(a2, a3)) {
                com.ss.android.ugc.tools.view.widget.a.b<am<DATA, com.ss.android.ugc.tools.h.a.c, Integer>> bVar2 = this.f149556h;
                if (bVar2 == null) {
                    h.f.b.l.a("dataAdapter");
                }
                bVar2.a(new am<>(t2.f39387a, a3.getFirst(), a3.getSecond()), i2);
            }
            i2++;
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder, com.ss.android.ugc.tools.view.widget.b.a aVar) {
        h.f.b.l.d(viewHolder, "");
        h.f.b.l.d(aVar, "");
        View view = viewHolder.itemView;
        if (!(view instanceof com.ss.android.ugc.tools.view.widget.b.d)) {
            view = null;
        }
        com.ss.android.ugc.tools.view.widget.b.d dVar = (com.ss.android.ugc.tools.view.widget.b.d) view;
        if (dVar != null) {
            dVar.setState(aVar);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.q<DATA, Integer, com.ss.android.ugc.tools.h.a.c, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(98500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(b bVar) {
            super(3);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Object obj, Integer num, com.ss.android.ugc.tools.h.a.c cVar) {
            int intValue = num.intValue();
            h.f.b.l.d(cVar, "");
            this.this$0.f149558j.onNext(new am<>(obj, Integer.valueOf(intValue), cVar));
            return z.f158842a;
        }
    }

    public /* synthetic */ b(Context context, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.e eVar, com.ss.android.ugc.tools.infosticker.view.internal.k kVar, ViewGroup viewGroup, h.f.a.b bVar) {
        this(context, mVar, eVar, kVar, viewGroup, 2, false, true, true, bVar);
    }

    public b(Context context, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.e<DATA> eVar, com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar, ViewGroup viewGroup, int i2, boolean z2, boolean z3, boolean z4, h.f.a.b<? super c, z> bVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(mVar, "");
        this.s = context;
        this.f149551c = mVar;
        this.t = eVar;
        this.u = kVar;
        this.v = viewGroup;
        this.w = i2;
        this.x = z2;
        this.y = z3;
        this.z = true;
        c cVar = new c((byte) 0);
        this.f149552d = cVar;
        this.f149549a = ag.a();
        f.a.l.c cVar2 = new f.a.l.c();
        h.f.b.l.b(cVar2, "");
        this.f149558j = cVar2;
        f.a.l.c cVar3 = new f.a.l.c();
        h.f.b.l.b(cVar3, "");
        this.f149559k = cVar3;
        f.a.l.c cVar4 = new f.a.l.c();
        h.f.b.l.b(cVar4, "");
        this.f149560l = cVar4;
        f.a.l.c cVar5 = new f.a.l.c();
        h.f.b.l.b(cVar5, "");
        this.f149561m = cVar5;
        f.a.l.c cVar6 = new f.a.l.c();
        h.f.b.l.b(cVar6, "");
        this.n = cVar6;
        f.a.l.c cVar7 = new f.a.l.c();
        h.f.b.l.b(cVar7, "");
        this.f149550b = cVar7;
        f.a.l.c cVar8 = new f.a.l.c();
        h.f.b.l.b(cVar8, "");
        this.o = cVar8;
        f.a.l.c cVar9 = new f.a.l.c();
        h.f.b.l.b(cVar9, "");
        this.p = cVar9;
        this.q = -1;
        this.r = new t(this);
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        cVar2.g(800, TimeUnit.MILLISECONDS).d(new f.a.d.f<am<DATA, Integer, com.ss.android.ugc.tools.h.a.c>>(this) {
            /* class com.ss.android.ugc.tools.infosticker.view.internal.base.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f149562a;

            static {
                Covode.recordClassIndex(98473);
            }

            {
                this.f149562a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                am amVar = (am) obj;
                com.ss.android.ugc.tools.infosticker.view.internal.k<DATA> kVar = this.f149562a.u;
                if (kVar != null) {
                    kVar.a(amVar.f39387a);
                }
            }
        });
    }
}
