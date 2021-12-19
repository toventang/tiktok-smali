package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class f<T, R> extends e<R> {
    public static final b q = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h.h f103036a = h.i.a((h.f.a.a) d.f103044a);

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.b<List<? extends T>, List<R>> f103037b = new c(this);

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super T, Boolean> f103038h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.b<? super List<? extends T>, ? extends List<? extends T>> f103039i;

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.b<? super R, Boolean> f103040j;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.b<? super List<? extends R>, ? extends List<? extends R>> f103041k;

    /* renamed from: l  reason: collision with root package name */
    public aa f103042l;

    /* renamed from: m  reason: collision with root package name */
    public aa f103043m;
    public int n = -1;
    volatile boolean o = true;
    public volatile boolean p;

    static {
        Covode.recordClassIndex(66052);
    }

    /* access modifiers changed from: protected */
    public abstract h.f.a.b<T, R> a();

    /* access modifiers changed from: protected */
    public abstract List<T> c();

    /* access modifiers changed from: protected */
    public abstract List<T> d();

    /* access modifiers changed from: package-private */
    public final f.a.b.a f() {
        return (f.a.b.a) this.f103036a.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66054);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean bI_() {
        return this.p;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean e() {
        return this.o;
    }

    static final class d extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103044a = new d();

        static {
            Covode.recordClassIndex(66056);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final /* synthetic */ class e extends h.f.b.j implements h.f.a.a<List<T>> {
        static {
            Covode.recordClassIndex(66057);
        }

        e(f fVar) {
            super(0, fVar, f.class, "loadInternal", "loadInternal()Ljava/util/List;", 0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return ((f) this.receiver).c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$f  reason: collision with other inner class name */
    static final /* synthetic */ class C2611f extends h.f.b.j implements h.f.a.a<List<T>> {
        static {
            Covode.recordClassIndex(66058);
        }

        C2611f(f fVar) {
            super(0, fVar, f.class, "loadMoreInternal", "loadMoreInternal()Ljava/util/List;", 0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return ((f) this.receiver).d();
        }
    }

    public final List<R> g() {
        return a(c());
    }

    public final List<R> h() {
        return a(d());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public boolean b() {
        if (this.p || this.f103042l == null || this.f103043m == null || !super.b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final void bG_() {
        if (b()) {
            a(false, (h.f.a.a) new e(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final void bH_() {
        if (b()) {
            a(true, (h.f.a.a) new C2611f(this));
        }
    }

    public static abstract class a<LOADER extends f<T, R>, T, R> {
        static {
            Covode.recordClassIndex(66053);
        }

        public abstract LOADER a();

        public abstract LOADER b();

        public final a<LOADER, T, R> a(int i2) {
            a().n = i2;
            return this;
        }

        public final a<LOADER, T, R> a(h.f.a.b<? super List<? extends T>, ? extends List<? extends T>> bVar) {
            l.d(bVar, "");
            a().f103039i = bVar;
            return this;
        }

        public final a<LOADER, T, R> b(h.f.a.b<? super R, Boolean> bVar) {
            l.d(bVar, "");
            a().f103040j = bVar;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f103046a;

        static {
            Covode.recordClassIndex(66060);
        }

        h(f fVar) {
            this.f103046a = fVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List<T> list = (List) obj;
            l.d(list, "");
            return this.f103046a.a(list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f103045a;

        static {
            Covode.recordClassIndex(66059);
        }

        g(h.f.a.a aVar) {
            this.f103045a = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v<java.util.List<T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.w
        public final void subscribe(v<List<T>> vVar) {
            l.d(vVar, "");
            try {
                vVar.a((List<T>) this.f103045a.invoke());
            } catch (Throwable th) {
                vVar.a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f103047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103048b;

        static {
            Covode.recordClassIndex(66061);
        }

        i(f fVar, boolean z) {
            this.f103047a = fVar;
            this.f103048b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<R> list = (List) obj;
            this.f103047a.p = false;
            f fVar = this.f103047a;
            l.b(list, "");
            fVar.a(list, this.f103048b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f103049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103050b;

        static {
            Covode.recordClassIndex(66062);
        }

        j(f fVar, boolean z) {
            this.f103049a = fVar;
            this.f103050b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f103049a.p = false;
            f fVar = this.f103049a;
            l.b(th, "");
            fVar.a(th, this.f103050b);
        }
    }

    static final class c extends m implements h.f.a.b<List<? extends T>, List<? extends R>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(66055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            List<T> list = (List) obj;
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                R invoke = this.this$0.a().invoke(t);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
            return arrayList;
        }
    }

    public final List<R> a(List<T> list) {
        boolean z;
        if (this.n <= 0 || list.size() < this.n) {
            z = false;
        } else {
            z = true;
        }
        this.o = z;
        return n.g((Collection) b(a(c(b(a(list, this.f103038h), this.f103039i), a()), this.f103040j), this.f103041k));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    private static <D> List<D> a(List<? extends D> list, h.f.a.b<? super D, Boolean> bVar) {
        Class<?> cls;
        StringBuilder sb = new StringBuilder("Start filtering ");
        if (bVar != null) {
            cls = bVar.getClass();
        } else {
            cls = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", sb.append(cls).append(" list size: ").append(list.size()).toString());
        if (bVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (bVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", "finish filtering " + bVar.getClass() + " list size: " + arrayList2.size());
        return arrayList2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    private static <D> List<D> b(List<? extends D> list, h.f.a.b<? super List<? extends D>, ? extends List<? extends D>> bVar) {
        Class<?> cls;
        List<D> list2;
        Class<?> cls2;
        StringBuilder sb = new StringBuilder("Start collating ");
        Integer num = null;
        if (bVar != null) {
            cls = bVar.getClass();
        } else {
            cls = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", sb.append(cls).append(" list size: ").append(list.size()).toString());
        if (bVar != null) {
            list2 = (List) bVar.invoke(list);
        } else {
            list2 = null;
        }
        StringBuilder sb2 = new StringBuilder("finish collating ");
        if (bVar != null) {
            cls2 = bVar.getClass();
        } else {
            cls2 = null;
        }
        StringBuilder append = sb2.append(cls2).append(" list size: ");
        if (list2 != null) {
            num = Integer.valueOf(list2.size());
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", append.append(num).toString());
        return list2 == null ? list : list2;
    }

    private static <D, F> List<F> c(List<? extends D> list, h.f.a.b<? super D, ? extends F> bVar) {
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", "Start converting list size: " + list.size());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object invoke = bVar.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("Loader", "finish converting list size: " + list.size());
        return arrayList;
    }

    private final void a(boolean z, h.f.a.a<? extends List<T>> aVar) {
        this.p = true;
        t a2 = t.a(new g(aVar));
        aa aaVar = this.f103042l;
        if (aaVar == null) {
            l.a("subscribeScheduler");
        }
        t<R> d2 = a2.b(aaVar).d(new h(this));
        aa aaVar2 = this.f103043m;
        if (aaVar2 == null) {
            l.a("observeScheduler");
        }
        f.a.b.b a3 = d2.a(aaVar2).a(new i(this, z), new j(this, z));
        f().a();
        f().a(a3);
    }
}
