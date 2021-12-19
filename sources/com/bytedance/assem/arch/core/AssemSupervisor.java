package com.bytedance.assem.arch.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AssemSupervisor implements k {

    /* renamed from: h  reason: collision with root package name */
    public static final a f25527h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f25528a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<h.k.c<? extends a>, k> f25529b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public View f25530c;

    /* renamed from: d  reason: collision with root package name */
    public final m f25531d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f25532e;

    /* renamed from: f  reason: collision with root package name */
    public final d f25533f;

    /* renamed from: g  reason: collision with root package name */
    public final e f25534g;

    /* renamed from: i  reason: collision with root package name */
    private final Map<h.k.c<? extends a>, a> f25535i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final h f25536j = i.a((h.f.a.a) d.f25538a);

    static {
        Covode.recordClassIndex(14870);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14871);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AssemSupervisor a(m mVar, Context context, d dVar, e eVar) {
            l.c(mVar, "");
            l.c(dVar, "");
            l.c(eVar, "");
            return new AssemSupervisor(mVar, context, dVar, eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25537a;

        static {
            Covode.recordClassIndex(14872);
        }

        b(h.f.a.a aVar) {
            this.f25537a = aVar;
        }

        public final void run() {
            this.f25537a.invoke();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25538a = new d();

        static {
            Covode.recordClassIndex(14874);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final androidx.lifecycle.i a() {
        androidx.lifecycle.i lifecycle = this.f25531d.getLifecycle();
        l.a((Object) lifecycle, "");
        return lifecycle;
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a $assem;
        final /* synthetic */ AssemSupervisor this$0;

        static {
            Covode.recordClassIndex(14875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AssemSupervisor assemSupervisor, a aVar) {
            super(0);
            this.this$0 = assemSupervisor;
            this.$assem = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            i.b a2 = this.this$0.a().a();
            l.a((Object) a2, "");
            AssemSupervisor.a(a2, this.$assem);
            this.$assem.f25544b = false;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a $assem;
        final /* synthetic */ boolean $isLazy;
        final /* synthetic */ AssemSupervisor this$0;

        static {
            Covode.recordClassIndex(14873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AssemSupervisor assemSupervisor, boolean z, a aVar) {
            super(0);
            this.this$0 = assemSupervisor;
            this.$isLazy = z;
            this.$assem = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.$isLazy) {
                this.this$0.a().b(this.this$0);
                this.this$0.a().a(this.this$0);
                return z.f158842a;
            }
            a aVar = this.$assem;
            if (aVar == null) {
                return null;
            }
            i.b a2 = this.this$0.a().a();
            l.a((Object) a2, "");
            AssemSupervisor.a(a2, aVar);
            return z.f158842a;
        }
    }

    private final void c() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f25528a;
        ArrayList<a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f25545c || t2.f25544b) {
                arrayList.add(t);
            }
        }
        for (a aVar : arrayList) {
            i.b bVar = i.b.STARTED;
            l.a((Object) aVar, "");
            a(bVar, aVar);
        }
    }

    private final void d() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f25528a;
        ArrayList<a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f25545c || t2.f25544b) {
                arrayList.add(t);
            }
        }
        for (a aVar : arrayList) {
            i.b bVar = i.b.RESUMED;
            l.a((Object) aVar, "");
            a(bVar, aVar);
        }
    }

    private final void e() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f25528a;
        ArrayList<a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f25545c || t2.f25544b) {
                arrayList.add(t);
            }
        }
        for (a aVar : arrayList) {
            i.b bVar = i.b.STARTED;
            l.a((Object) aVar, "");
            a(bVar, aVar);
        }
    }

    private final void f() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f25528a;
        ArrayList<a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f25545c || t2.f25544b) {
                arrayList.add(t);
            }
        }
        for (a aVar : arrayList) {
            i.b bVar = i.b.CREATED;
            l.a((Object) aVar, "");
            a(bVar, aVar);
        }
    }

    public final void b() {
        for (T t : this.f25528a) {
            i.b bVar = i.b.DESTROYED;
            l.a((Object) t, "");
            a(bVar, t);
        }
        this.f25533f.a();
        this.f25534g.a();
        this.f25528a.clear();
        this.f25535i.clear();
        this.f25529b.clear();
        a().b(this);
        a((View) null);
    }

    public final void a(View view) {
        if (view == null) {
            view = null;
        } else if (this.f25530c != null) {
            throw new IllegalArgumentException("Duplicate attach the assems to root view on the same layer.".toString());
        }
        this.f25530c = view;
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        if (a().a().compareTo((Enum) i.b.DESTROYED) > 0) {
            if (!this.f25528a.contains(aVar)) {
                this.f25528a.add(aVar);
                aVar.a(this);
                aVar.a(this.f25531d);
                this.f25535i.put(ab.a(aVar.getClass()), aVar);
                if (!aVar.f25545c) {
                    l.c(new e(this, aVar), "");
                } else {
                    aVar.f25544b = true;
                }
            } else {
                throw new IllegalStateException("This assem has already existed.".toString());
            }
        }
    }

    public final void a(boolean z, a aVar) {
        c cVar = new c(this, z, aVar);
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        l.a((Object) mainLooper, "");
        if (l.a(currentThread, mainLooper.getThread())) {
            cVar.invoke();
        } else {
            ((Handler) this.f25536j.getValue()).post(new b(cVar));
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        switch (g.f25570b[aVar.ordinal()]) {
            case 1:
                CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f25528a;
                ArrayList<a> arrayList = new ArrayList();
                for (T t : copyOnWriteArrayList) {
                    if (!t.f25545c) {
                        arrayList.add(t);
                    }
                }
                for (a aVar2 : arrayList) {
                    i.b bVar = i.b.CREATED;
                    l.a((Object) aVar2, "");
                    a(bVar, aVar2);
                }
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            case 4:
                e();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                f();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                b();
                return;
            default:
                return;
        }
    }

    public static void a(i.b bVar, a aVar) {
        l.c(bVar, "");
        l.c(aVar, "");
        int i2 = g.f25569a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (aVar.f25546d.a().compareTo((Enum) i.b.RESUMED) >= 0) {
                            aVar.k();
                        }
                        if (aVar.f25546d.a().compareTo((Enum) i.b.STARTED) >= 0) {
                            aVar.m();
                        }
                        if (aVar.f25546d.a().compareTo((Enum) i.b.CREATED) >= 0) {
                            aVar.o();
                        }
                    }
                } else if (aVar.f25546d.a().compareTo((Enum) i.b.RESUMED) < 0) {
                    if (aVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        aVar.as_();
                    }
                    if (aVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                        aVar.g();
                    }
                    aVar.bP_();
                }
            } else if (aVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                if (aVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                    aVar.as_();
                }
                aVar.g();
            } else if (aVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                aVar.k();
            }
        } else if (aVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
            aVar.as_();
        } else {
            if (aVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                aVar.k();
            }
            if (aVar.f25546d.a().compareTo((Enum) i.b.CREATED) > 0) {
                aVar.m();
            }
        }
    }

    public AssemSupervisor(m mVar, Context context, d dVar, e eVar) {
        l.c(mVar, "");
        l.c(dVar, "");
        l.c(eVar, "");
        this.f25531d = mVar;
        this.f25532e = context;
        this.f25533f = dVar;
        this.f25534g = eVar;
    }
}
