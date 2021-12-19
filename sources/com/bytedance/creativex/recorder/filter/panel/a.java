package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.bytedance.creativex.recorder.filter.panel.c;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.util.List;
import java.util.NoSuchElementException;

public class a extends com.bytedance.ui_component.b<FilterPanelViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28299a = {new y(a.class, "context", "getContext()Landroid/app/Activity;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.filter.a.a f28300b;

    /* renamed from: c  reason: collision with root package name */
    final C0604a f28301c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28302d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.view.internal.d f28303e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.a.i f28304f;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f28305k;

    /* renamed from: l  reason: collision with root package name */
    private final h f28306l;

    /* renamed from: m  reason: collision with root package name */
    private final h f28307m;
    private final h.f.a.a<FilterPanelViewModel> n;
    private final com.bytedance.scene.group.b o;
    private final f p;
    private final int q;

    static {
        Covode.recordClassIndex(16613);
    }

    private final c f() {
        return (c) this.f28307m.getValue();
    }

    /* access modifiers changed from: package-private */
    public final e a() {
        return (e) this.f28306l.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FilterPanelViewModel> b() {
        return this.n;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.o;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.p;
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        c f2 = f();
        f2.a(new c.s(f2));
    }

    static final class b extends m implements h.f.a.a<c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(16615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            a aVar = this.this$0;
            return new c(aVar.getDiContainer(), aVar.a().f28228c, aVar.a().f28227b, aVar.f28304f, aVar.f28303e, aVar.f28301c.f28309b);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        c f2 = f();
        if (f2.f28316d) {
            com.ss.android.ugc.aweme.filter.view.internal.e eVar = f2.f28315c;
            if (eVar == null) {
                l.a("combiner");
            }
            eVar.c();
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.o.a(this.q, f(), "RecordFilterPanelScene");
    }

    static final class c extends m implements h.f.a.a<e> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(16616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            List<e> value = this.this$0.f28300b.getFilterSources().getValue();
            if (value != null) {
                for (T t : value) {
                    if (l.a((Object) t.f28226a, (Object) this.this$0.f28302d)) {
                        return t;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            l.b();
            return null;
        }
    }

    static final class d extends m implements h.f.a.a<FilterPanelViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(16617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FilterPanelViewModel invoke() {
            a aVar = this.this$0;
            return new FilterPanelViewModel((f) aVar.getDiContainer().a(f.class, (String) null), aVar.a().f28227b, aVar.a().f28229d.a(), aVar.f28301c.f28308a);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.a$a  reason: collision with other inner class name */
    public class C0604a {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.b<? super Activity, Boolean> f28308a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super c.C0605c, z> f28309b;

        static {
            Covode.recordClassIndex(16614);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        private C0604a() {
            this.f28308a = null;
            this.f28309b = null;
        }

        public /* synthetic */ C0604a(a aVar, byte b2) {
            this();
        }
    }

    public /* synthetic */ a(com.bytedance.scene.group.b bVar, f fVar, com.ss.android.ugc.aweme.filter.view.internal.d dVar, com.ss.android.ugc.aweme.filter.repository.a.i iVar, h.f.a.b bVar2) {
        this(bVar, fVar, R.id.dj5, "build_in", dVar, iVar, bVar2);
    }

    private a(com.bytedance.scene.group.b bVar, f fVar, int i2, String str, com.ss.android.ugc.aweme.filter.view.internal.d dVar, com.ss.android.ugc.aweme.filter.repository.a.i iVar, h.f.a.b<? super C0604a, z> bVar2) {
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(str, "");
        this.o = bVar;
        this.p = fVar;
        this.q = R.id.dj5;
        this.f28302d = str;
        this.f28303e = dVar;
        this.f28304f = iVar;
        this.f28305k = com.bytedance.o.b.a.a(getDiContainer(), Activity.class);
        this.f28300b = (com.bytedance.creativex.recorder.filter.a.a) getDiContainer().a(com.bytedance.creativex.recorder.filter.a.a.class, (String) null);
        this.f28306l = h.i.a(h.m.NONE, new c(this));
        this.f28307m = h.i.a(h.m.NONE, new b(this));
        this.n = new d(this);
        C0604a aVar = new C0604a(this, (byte) 0);
        this.f28301c = aVar;
        if (bVar2 != null) {
            bVar2.invoke(aVar);
        }
    }
}
