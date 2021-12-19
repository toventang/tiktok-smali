package com.ss.android.ugc.aweme.ftc.l.a;

import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.c.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends j<c> implements com.bytedance.o.a, c {

    /* renamed from: a  reason: collision with root package name */
    public final c f98692a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.scene.group.b f98693b;

    /* renamed from: c  reason: collision with root package name */
    public final i f98694c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f98695d;

    /* renamed from: e  reason: collision with root package name */
    private final h f98696e;

    /* renamed from: f  reason: collision with root package name */
    private final h f98697f;

    /* renamed from: g  reason: collision with root package name */
    private final h f98698g;

    /* renamed from: h  reason: collision with root package name */
    private final f f98699h;

    /* renamed from: i  reason: collision with root package name */
    private final int f98700i;

    /* renamed from: j  reason: collision with root package name */
    private final List<com.ss.android.ugc.gamora.recorder.n.b> f98701j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.n.b f98702k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<z> f98703l;

    static {
        Covode.recordClassIndex(62769);
    }

    private final f c() {
        return (f) this.f98698g.getValue();
    }

    public final k<Boolean> a() {
        return (k) this.f98696e.getValue();
    }

    public final g b() {
        return (g) this.f98697f.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ c getApiComponent() {
        return this.f98692a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98699h;
    }

    static final class e extends m implements h.f.a.a<k<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f98706a = new e();

        static {
            Covode.recordClassIndex(62775);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k<Boolean> invoke() {
            return new k();
        }
    }

    static final class c extends m implements h.f.a.a<f> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f(this.this$0.f98694c, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.l.a.d.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(62773);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.a(false);
                    return z.f158842a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$d  reason: collision with other inner class name */
    static final class C2398d extends m implements h.f.a.a<g> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2398d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0.f98694c, this.this$0.a());
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        h.f.a.a<z> aVar = this.f98703l;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f98694c.a(this.f98701j);
        this.f98694c.b(this.f98702k);
        this.f98693b.a(this.f98700i, b(), "FTCToolbarScene");
        this.f98695d.d().a(this, new a(this));
        this.f98695d.a().a(this, new b(this));
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.c
    public final void a(int i2) {
        this.f98694c.a(i2);
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98704a;

        static {
            Covode.recordClassIndex(62770);
        }

        a(d dVar) {
            this.f98704a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98704a.a().a((Boolean) obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.c
    public final void a(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        l.d(bVar, "");
        this.f98694c.a(bVar);
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98705a;

        static {
            Covode.recordClassIndex(62771);
        }

        b(d dVar) {
            this.f98705a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f98705a.f98693b.e(this.f98705a.b());
            } else {
                this.f98705a.f98693b.d(this.f98705a.b());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.c
    public final void a(List<? extends com.ss.android.ugc.gamora.recorder.n.b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f98694c.a());
        arrayList.addAll(list);
        this.f98694c.a(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.c
    public final void b(List<? extends com.ss.android.ugc.gamora.recorder.n.b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f98694c.a());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f98694c.a(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.c
    public final void a(boolean z) {
        if (com.bytedance.scene.ktx.b.a(this.f98693b) != null) {
            com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f98693b);
            if (a2 == null) {
                l.b();
            }
            if (z) {
                if (b().z()) {
                    this.f98693b.d(b());
                }
                if (!com.ss.android.ugc.aweme.scene.a.a(a2, c())) {
                    f c2 = c();
                    f.a aVar = new f.a();
                    aVar.f42752a = true;
                    aVar.f42754c = new com.bytedance.scene.a.a.b();
                    a2.b(c2, aVar.b());
                }
            } else if (!b().z()) {
                this.f98693b.e(b());
            }
        }
    }

    public /* synthetic */ d(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, List list, com.ss.android.ugc.gamora.recorder.n.b bVar2, h.f.a.a aVar, int i2) {
        this(bVar, fVar, list, bVar2, aVar, i2, new e());
    }

    private d(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, List<com.ss.android.ugc.gamora.recorder.n.b> list, com.ss.android.ugc.gamora.recorder.n.b bVar2, h.f.a.a<z> aVar, int i2, i iVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(list, "");
        l.d(iVar, "");
        this.f98693b = bVar;
        this.f98699h = fVar;
        this.f98700i = R.id.dj5;
        this.f98701j = list;
        this.f98702k = bVar2;
        this.f98703l = aVar;
        this.f98694c = iVar;
        this.f98695d = (com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null);
        this.f98692a = this;
        this.f98696e = i.a((h.f.a.a) e.f98706a);
        this.f98697f = i.a((h.f.a.a) new C2398d(this));
        this.f98698g = i.a((h.f.a.a) new c(this));
        iVar.a(i2);
    }
}
