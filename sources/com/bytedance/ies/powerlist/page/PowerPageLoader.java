package com.bytedance.ies.powerlist.page;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import f.a.t;
import h.f.b.l;
import h.h;
import h.p;
import h.r;
import h.z;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.i;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;

public final class PowerPageLoader<T> implements k, com.bytedance.ies.powerlist.page.config.a<T>, am {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.powerlist.page.config.c f34324a;

    /* renamed from: b  reason: collision with root package name */
    public p<? extends T, ? extends T> f34325b;

    /* renamed from: c  reason: collision with root package name */
    public m<? super f<T>> f34326c;

    /* renamed from: d  reason: collision with root package name */
    public m<? super f<T>> f34327d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.ies.powerlist.page.config.d<T> f34328e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> f34329f;

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.b<h, z> f34330g;

    /* renamed from: h  reason: collision with root package name */
    private final bz f34331h = cd.a(null);

    /* renamed from: i  reason: collision with root package name */
    private f.a.b.b f34332i;

    /* renamed from: j  reason: collision with root package name */
    private final h f34333j;

    /* renamed from: k  reason: collision with root package name */
    private final h f34334k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.m f34335l;

    static {
        Covode.recordClassIndex(20507);
    }

    public final Handler b() {
        return (Handler) this.f34333j.getValue();
    }

    public final k c() {
        return (k) this.f34334k.getValue();
    }

    @Override // com.bytedance.ies.powerlist.page.config.a
    public final void e() {
        g();
    }

    static final class b extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34337a = new b();

        static {
            Covode.recordClassIndex(20509);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<k> {
        final /* synthetic */ PowerPageLoader this$0;

        static {
            Covode.recordClassIndex(20512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PowerPageLoader powerPageLoader) {
            super(0);
            this.this$0 = powerPageLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k(this.this$0.f34330g);
        }
    }

    public final void d() {
        com.bytedance.ies.powerlist.page.config.c cVar = this.f34324a;
        if (cVar == null) {
            l.a("config");
        }
        if (cVar.f34357b) {
            g();
        }
    }

    public final void f() {
        this.f34331h.o();
        this.f34332i.dispose();
        this.f34335l.getLifecycle().b(this);
    }

    private final void g() {
        m<? super f<T>> mVar = this.f34326c;
        if (mVar != null) {
            mVar.b((Throwable) null);
        }
        m<? super f<T>> mVar2 = this.f34327d;
        if (mVar2 != null) {
            mVar2.b((Throwable) null);
        }
        e eVar = e.Refresh;
        c().a(d.Loading, eVar, null);
        bz unused = i.a(this, null, null, new g(this, eVar, null), 3);
    }

    @Override // kotlinx.coroutines.am
    public final h.c.f a() {
        return com.bytedance.ies.powerlist.c.b.f34266a.plus(this.f34331h);
    }

    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerPageLoader f34338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34340c;

        static {
            Covode.recordClassIndex(20513);
        }

        public f(PowerPageLoader powerPageLoader, int i2, int i3) {
            this.f34338a = powerPageLoader;
            this.f34339b = i2;
            this.f34340c = i3;
        }

        public final void run() {
            if (this.f34339b <= PowerPageLoader.a(this.f34338a).f34356a && PowerPageLoader.a((m<?>) this.f34338a.f34326c) && this.f34338a.c().f34414a.f34398b.f34344a.f34401c == PowerPageState.Loaded) {
                this.f34338a.c(null);
            }
            if (this.f34340c - this.f34339b <= PowerPageLoader.a(this.f34338a).f34356a + 1 && PowerPageLoader.a((m<?>) this.f34338a.f34327d) && this.f34338a.c().f34414a.f34398b.f34345b.f34401c == PowerPageState.Loaded) {
                this.f34338a.d(null);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.page.config.a
    public final void a(T t) {
        c(t);
    }

    @Override // com.bytedance.ies.powerlist.page.config.a
    public final void b(T t) {
        d(t);
    }

    static final class a<T> implements f.a.d.f<com.bytedance.ies.powerlist.page.config.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerPageLoader f34336a;

        static {
            Covode.recordClassIndex(20508);
        }

        a(PowerPageLoader powerPageLoader) {
            this.f34336a = powerPageLoader;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.ies.powerlist.page.config.c cVar) {
            com.bytedance.ies.powerlist.page.config.c cVar2 = cVar;
            PowerPageLoader powerPageLoader = this.f34336a;
            l.a((Object) cVar2, "");
            powerPageLoader.f34324a = cVar2;
        }
    }

    public static final /* synthetic */ com.bytedance.ies.powerlist.page.config.c a(PowerPageLoader powerPageLoader) {
        com.bytedance.ies.powerlist.page.config.c cVar = powerPageLoader.f34324a;
        if (cVar == null) {
            l.a("config");
        }
        return cVar;
    }

    public static boolean a(m<?> mVar) {
        if (mVar == null || mVar.c() || mVar.b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void c(T t) {
        m<? super f<T>> mVar = this.f34326c;
        if (mVar != null) {
            mVar.b((Throwable) null);
        }
        e eVar = e.Prev;
        c().a(d.Loading, eVar, null);
        bz unused = i.a(this, null, null, new c(this, t, eVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    public final void d(T t) {
        m<? super f<T>> mVar = this.f34327d;
        if (mVar != null) {
            mVar.b((Throwable) null);
        }
        e eVar = e.Next;
        c().a(d.Loading, eVar, null);
        bz unused = i.a(this, null, null, new d(this, t, eVar, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.page.config.a
    public final void a(e eVar) {
        l.c(eVar, "");
        int i2 = j.f34413a[eVar.ordinal()];
        if (i2 == 1) {
            d(null);
        } else if (i2 == 2) {
            c(null);
        } else if (i2 == 3) {
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Object $cursor;
        final /* synthetic */ e $type;
        Object L$0;
        Object L$1;
        int label;
        private am p$;
        final /* synthetic */ PowerPageLoader this$0;

        static {
            Covode.recordClassIndex(20510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PowerPageLoader powerPageLoader, Object obj, e eVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = powerPageLoader;
            this.$cursor = obj;
            this.$type = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            c cVar = new c(this.this$0, this.$cursor, this.$type, dVar);
            cVar.p$ = (am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: com.bytedance.ies.powerlist.page.config.d<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            boolean z = true;
            if (i2 == 0) {
                r.a(obj);
                try {
                    this.L$0 = this.p$;
                    this.L$1 = this;
                    this.label = 1;
                    n nVar = new n(h.c.a.b.a(this), 1);
                    this.this$0.f34326c = nVar;
                    Object obj2 = this.$cursor;
                    if (obj2 == null) {
                        obj2 = this.this$0.f34325b.getFirst();
                    }
                    if (obj2 != null) {
                        this.this$0.f34328e.a(nVar, obj2);
                    }
                    obj = nVar.e();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e2) {
                    e2.printStackTrace();
                    return z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            if (fVar instanceof f.d) {
                List<com.bytedance.ies.powerlist.b.a> list = ((f.d) fVar).f34376d;
                if (list.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list = null;
                }
                if (list != null) {
                    this.this$0.f34329f.a(0, list);
                }
                PowerPageLoader powerPageLoader = this.this$0;
                powerPageLoader.f34325b = p.copy$default(powerPageLoader.f34325b, ((f.d) fVar).f34374b, null, 2, null);
                this.this$0.c().a(d.Loaded, this.$type, null);
            } else if (fVar instanceof f.c) {
                this.this$0.c().a(d.Error, this.$type, ((f.c) fVar).f34373b);
            } else if (fVar instanceof f.b) {
                List<com.bytedance.ies.powerlist.b.a> list2 = ((f.b) fVar).f34372b;
                if (list2.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.this$0.f34329f.a(0, list2);
                }
                this.this$0.c().a(d.End, this.$type, null);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Object $cursor;
        final /* synthetic */ e $type;
        Object L$0;
        Object L$1;
        int label;
        private am p$;
        final /* synthetic */ PowerPageLoader this$0;

        static {
            Covode.recordClassIndex(20511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PowerPageLoader powerPageLoader, Object obj, e eVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = powerPageLoader;
            this.$cursor = obj;
            this.$type = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            d dVar2 = new d(this.this$0, this.$cursor, this.$type, dVar);
            dVar2.p$ = (am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: com.bytedance.ies.powerlist.page.config.d<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            boolean z = true;
            if (i2 == 0) {
                r.a(obj);
                try {
                    this.L$0 = this.p$;
                    this.L$1 = this;
                    this.label = 1;
                    n nVar = new n(h.c.a.b.a(this), 1);
                    this.this$0.f34327d = nVar;
                    Object obj2 = this.$cursor;
                    if (obj2 == null) {
                        obj2 = this.this$0.f34325b.getSecond();
                    }
                    if (obj2 != null) {
                        this.this$0.f34328e.b(nVar, obj2);
                    }
                    obj = nVar.e();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e2) {
                    e2.printStackTrace();
                    return z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            boolean z2 = false;
            if (fVar instanceof f.d) {
                List<com.bytedance.ies.powerlist.b.a> list = ((f.d) fVar).f34376d;
                if (!list.isEmpty()) {
                    z2 = true;
                }
                if (!Boolean.valueOf(z2).booleanValue()) {
                    list = null;
                }
                if (list != null) {
                    this.this$0.f34329f.a(list);
                }
                PowerPageLoader powerPageLoader = this.this$0;
                powerPageLoader.f34325b = p.copy$default(powerPageLoader.f34325b, null, ((f.d) fVar).f34375c, 1, null);
                this.this$0.c().a(d.Loaded, this.$type, null);
            } else if (fVar instanceof f.c) {
                this.this$0.c().a(d.Error, this.$type, ((f.c) fVar).f34373b);
            } else if (fVar instanceof f.b) {
                List<com.bytedance.ies.powerlist.b.a> list2 = ((f.b) fVar).f34372b;
                if (list2.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.this$0.f34329f.a(list2);
                }
                this.this$0.c().a(d.End, this.$type, null);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ e $type;
        Object L$0;
        Object L$1;
        int label;
        private am p$;
        final /* synthetic */ PowerPageLoader this$0;

        static {
            Covode.recordClassIndex(20514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PowerPageLoader powerPageLoader, e eVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = powerPageLoader;
            this.$type = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            g gVar = new g(this.this$0, this.$type, dVar);
            gVar.p$ = (am) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    this.L$0 = this.p$;
                    this.L$1 = this;
                    this.label = 1;
                    n nVar = new n(h.c.a.b.a(this), 1);
                    this.this$0.f34327d = nVar;
                    this.this$0.f34328e.a(nVar);
                    obj = nVar.e();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e2) {
                    e2.printStackTrace();
                    return z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            if (fVar instanceof f.d) {
                this.this$0.f34329f.b(((f.d) fVar).f34376d);
                this.this$0.f34325b = new p<>(((f.d) fVar).f34374b, ((f.d) fVar).f34375c);
                this.this$0.c().a(d.Loaded, this.$type, new com.bytedance.ies.powerlist.page.a.a(((f.d) fVar).f34374b, ((f.d) fVar).f34375c));
            } else if (fVar instanceof f.c) {
                this.this$0.c().a(d.Error, this.$type, ((f.c) fVar).f34373b);
            } else if (fVar instanceof f.b) {
                this.this$0.f34329f.b(((f.b) fVar).f34372b);
                this.this$0.b().post(new Runnable(this) {
                    /* class com.bytedance.ies.powerlist.page.PowerPageLoader.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f34341a;

                    static {
                        Covode.recordClassIndex(20515);
                    }

                    {
                        this.f34341a = r1;
                    }

                    public final void run() {
                        this.f34341a.this$0.c().a(d.End, this.f34341a.$type, null);
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            f();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.page.h, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public PowerPageLoader(com.bytedance.ies.powerlist.page.config.d<T> dVar, t<com.bytedance.ies.powerlist.page.config.c> tVar, androidx.lifecycle.m mVar, com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> fVar, h.f.a.b<? super h, z> bVar) {
        l.c(dVar, "");
        l.c(tVar, "");
        l.c(mVar, "");
        l.c(fVar, "");
        l.c(bVar, "");
        this.f34328e = dVar;
        this.f34335l = mVar;
        this.f34329f = fVar;
        this.f34330g = bVar;
        f.a.b.b d2 = tVar.d(new a(this));
        l.a((Object) d2, "");
        this.f34332i = d2;
        this.f34325b = new p<>(null, null);
        this.f34333j = h.i.a((h.f.a.a) b.f34337a);
        this.f34334k = h.i.a((h.f.a.a) new e(this));
        l.c(this, "");
        dVar.f34367c = this;
        mVar.getLifecycle().a(this);
    }
}
