package com.bytedance.assem.arch.viewModel;

import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.f.b.ad;
import h.f.b.l;
import h.h;
import h.r;
import h.w;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.g;
import kotlinx.coroutines.z;

public abstract class AssemViewModel<S extends j> extends ac implements m {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<i> f25684a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f25685b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25686c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.assem.arch.core.d f25687d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.assem.arch.core.e f25688e;

    /* renamed from: f  reason: collision with root package name */
    public g<S> f25689f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.m<Object, ? super S, ? extends Object> f25690g;

    /* renamed from: h  reason: collision with root package name */
    public Object f25691h;

    /* renamed from: i  reason: collision with root package name */
    public Object f25692i;

    /* renamed from: j  reason: collision with root package name */
    private S f25693j;

    /* renamed from: k  reason: collision with root package name */
    private final e f25694k = new e(bL_());

    /* renamed from: l  reason: collision with root package name */
    private final boolean f25695l;

    /* renamed from: m  reason: collision with root package name */
    private final h f25696m = h.i.a(h.m.NONE, c.f25699a);
    private final h n = h.i.a((h.f.a.a) b.f25698a);
    private final SparseArray<com.bytedance.assem.arch.a.a<?>> o = new SparseArray<>();

    static {
        Covode.recordClassIndex(14962);
    }

    private final am g() {
        return (am) this.f25696m.getValue();
    }

    private final f.a.b.a h() {
        return (f.a.b.a) this.n.getValue();
    }

    public final am aH_() {
        return (am) this.f25694k.getValue();
    }

    public void c() {
    }

    /* access modifiers changed from: protected */
    public abstract S f();

    public boolean bL_() {
        return this.f25695l;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25697a = new a();

        static {
            Covode.recordClassIndex(14963);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25698a = new b();

        static {
            Covode.recordClassIndex(14964);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    public final g<S> d() {
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        return gVar;
    }

    public final S e() {
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        return gVar.a();
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        WeakReference<i> weakReference = this.f25684a;
        if (weakReference == null) {
            l.a("lifecycleRef");
        }
        i iVar = weakReference.get();
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static final class c extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25699a = new c();

        static {
            Covode.recordClassIndex(14965);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            z a2 = cu.a();
            Looper mainLooper = Looper.getMainLooper();
            l.a((Object) mainLooper, "");
            return new d(a2.plus(kotlinx.coroutines.android.c.a(a.a(mainLooper), "fast-main")));
        }
    }

    public AssemViewModel() {
        l.c(this, "");
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        com.bytedance.assem.arch.core.d dVar = this.f25687d;
        if (dVar != null) {
            dVar.a();
        }
        com.bytedance.assem.arch.core.e eVar = this.f25688e;
        if (eVar != null) {
            eVar.a();
        }
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o.get(i2);
        }
        am aH_ = aH_();
        bz bzVar = (bz) aH_.a().get(bz.f159061c);
        if (bzVar != null) {
            bzVar.o();
            am g2 = g();
            bz bzVar2 = (bz) g2.a().get(bz.f159061c);
            if (bzVar2 != null) {
                bzVar2.o();
                h().a();
                g<S> gVar = this.f25689f;
                if (gVar == null) {
                    l.a("vmDispatcher");
                }
                gVar.b();
                super.onCleared();
                WeakReference<i> weakReference = this.f25684a;
                if (weakReference == null) {
                    l.a("lifecycleRef");
                }
                weakReference.clear();
                return;
            }
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(g2)).toString());
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(aH_)).toString());
    }

    public final f.a.b.b a(f.a.b.b bVar) {
        l.c(bVar, "");
        h().a(bVar);
        return bVar;
    }

    static final class d extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ h.f.a.b $task;
        int label;
        private am p$;

        static {
            Covode.recordClassIndex(14966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h.f.a.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.$task = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            d dVar2 = new d(this.$task, dVar);
            dVar2.p$ = (am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.$task.invoke(this.p$);
                return h.z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final <OPT extends com.bytedance.assem.arch.a.d> void a(com.bytedance.assem.arch.a.a<OPT> aVar) {
        l.c(aVar, "");
        SparseArray<com.bytedance.assem.arch.a.a<?>> sparseArray = this.o;
        sparseArray.put(sparseArray.size(), aVar);
    }

    public final void b(h.f.a.b<? super S, h.z> bVar) {
        l.c(bVar, "");
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        gVar.b(bVar);
    }

    public final void c(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        gVar.c(bVar);
    }

    public final void d(h.f.a.b<? super am, h.z> bVar) {
        l.c(bVar, "");
        g.b(g(), (h.c.f) null, new d(bVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<S, S> {
        final /* synthetic */ h.f.a.m $callback;
        final /* synthetic */ Object $item;
        final /* synthetic */ List $payloads;
        final /* synthetic */ Object $reducer;

        static {
            Covode.recordClassIndex(14968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Object obj, Object obj2, h.f.a.m mVar, List list) {
            super(1);
            this.$reducer = obj;
            this.$item = obj2;
            this.$callback = mVar;
            this.$payloads = list;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            Object obj2 = this.$reducer;
            if (obj2 != null) {
                Object invoke = ((h.f.a.m) ad.b(obj2, 2)).invoke(obj, this.$item);
                h.f.a.m mVar = this.$callback;
                if (mVar != null) {
                    mVar.invoke(this.$item, this.$payloads);
                }
                return invoke;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<S, S> {
        final /* synthetic */ h.f.a.b $reducer;
        final /* synthetic */ AssemViewModel this$0;

        static {
            Covode.recordClassIndex(14967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AssemViewModel assemViewModel, h.f.a.b bVar) {
            super(1);
            this.this$0 = assemViewModel;
            this.$reducer = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            Object invoke = this.$reducer.invoke(obj);
            if (!(this.this$0.f25690g == null || this.this$0.f25691h == null || this.this$0.f25692i == null)) {
                AssemViewModel assemViewModel = this.this$0;
                h.f.a.m<Object, ? super S, ? extends Object> mVar = assemViewModel.f25690g;
                if (mVar == null) {
                    l.a();
                }
                Object obj2 = this.this$0.f25691h;
                if (obj2 == null) {
                    l.a();
                }
                assemViewModel.f25691h = mVar.invoke(obj2, invoke);
                Object obj3 = this.this$0.f25692i;
                if (obj3 != null) {
                    h.f.a.b bVar = (h.f.a.b) ad.b(obj3, 1);
                    Object obj4 = this.this$0.f25691h;
                    if (obj4 == null) {
                        l.a();
                    }
                    bVar.invoke(obj4);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            return invoke;
        }
    }

    public final void a(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        gVar.a(new e(this, bVar));
    }

    public final void a(WeakReference<i> weakReference) {
        l.c(weakReference, "");
        this.f25684a = weakReference;
    }

    public final void a(g<S> gVar, h.f.a.b<? super S, ? extends S> bVar) {
        l.c(gVar, "");
        l.c(bVar, "");
        if (this.f25693j == null) {
            this.f25693j = (S) ((j) bVar.invoke(f()));
            gVar.a(aH_());
            S s = this.f25693j;
            if (s != null) {
                gVar.a(s);
                this.f25689f = gVar;
                c();
                this.f25685b = true;
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final void a(Object obj, List<? extends Object> list, Object obj2, h.f.a.m<Object, ? super List<? extends Object>, h.z> mVar) {
        l.c(obj2, "");
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        gVar.a(new f(obj2, obj, mVar, list));
    }

    public final <T> void a(h.k.k<S, ? extends com.bytedance.assem.arch.extensions.f<? extends T>> kVar, k<p<com.bytedance.assem.arch.extensions.f<T>>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.a<h.z> aVar, h.f.a.b<? super T, h.z> bVar2) {
        l.c(kVar, "");
        l.c(kVar2, "");
        g<S> gVar = this.f25689f;
        if (gVar == null) {
            l.a("vmDispatcher");
        }
        gVar.a(kVar, kVar2, a.f25697a, bVar, aVar, bVar2);
    }

    public static /* synthetic */ void a(AssemViewModel assemViewModel, h.k.k kVar, k kVar2, h.f.a.b bVar, h.f.a.a aVar, h.f.a.b bVar2, int i2) {
        k kVar3 = kVar2;
        h.f.a.b bVar3 = bVar;
        h.f.a.a aVar2 = aVar;
        if ((i2 & 2) != 0) {
            kVar3 = l.a(false);
        }
        h.f.a.b bVar4 = null;
        if ((i2 & 4) != 0) {
            bVar3 = null;
        }
        if ((i2 & 8) != 0) {
            aVar2 = null;
        }
        if ((i2 & 16) == 0) {
            bVar4 = bVar2;
        }
        assemViewModel.a(kVar, kVar3, bVar3, aVar2, bVar4);
    }
}
