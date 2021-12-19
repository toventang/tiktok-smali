package com.bytedance.assem.arch.b;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class q implements j, com.bytedance.tiktok.proxy.a<com.bytedance.tiktok.proxy.d, Object>, com.bytedance.tiktok.proxy.d {

    /* renamed from: a  reason: collision with root package name */
    public v<? extends com.bytedance.tiktok.proxy.d> f25431a;

    /* renamed from: b  reason: collision with root package name */
    public h.k.c<? extends v<? extends com.bytedance.tiktok.proxy.d>> f25432b;

    /* renamed from: c  reason: collision with root package name */
    boolean f25433c = true;

    /* renamed from: d  reason: collision with root package name */
    public int f25434d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final n f25435e = new n(this);

    /* renamed from: f  reason: collision with root package name */
    public boolean f25436f;

    /* renamed from: g  reason: collision with root package name */
    public Object f25437g;

    /* renamed from: h  reason: collision with root package name */
    n f25438h = z.f25504a;

    /* renamed from: i  reason: collision with root package name */
    m f25439i = m.Silent;

    /* renamed from: j  reason: collision with root package name */
    private ad f25440j;

    /* renamed from: k  reason: collision with root package name */
    private final af f25441k = new af();

    /* renamed from: l  reason: collision with root package name */
    private final h.h f25442l = h.i.a((h.f.a.a) h.f25446a);

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArrayList<q> f25443m = new CopyOnWriteArrayList<>();
    private Object n;
    private h.f.a.a<Integer> o;
    private final Queue<h.f.a.a<z>> p = new LinkedList();
    private volatile boolean q;
    private final f.a.l.b<b> r;
    private final ConcurrentHashMap<h.k.c<?>, Object> s;
    private final ConcurrentHashMap<h.k.c<?>, AssemViewModel<?>> t;

    static {
        Covode.recordClassIndex(14790);
    }

    /* access modifiers changed from: package-private */
    public final Handler i() {
        return (Handler) this.f25442l.getValue();
    }

    @Override // com.bytedance.assem.arch.b.j
    public final Object a() {
        return this.f25437g;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final f.a.l.b<b> b() {
        return this.r;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final h.f.a.a<Integer> c() {
        return this.o;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final Object d() {
        return this.n;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final ad e() {
        return this.f25440j;
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this.f25431a;
    }

    @Override // androidx.lifecycle.m
    public final /* bridge */ /* synthetic */ androidx.lifecycle.i getLifecycle() {
        return this.f25435e;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return this.f25441k;
    }

    @Override // com.bytedance.tiktok.proxy.g
    public final boolean h() {
        return this.f25433c;
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q $child;

        static {
            Covode.recordClassIndex(14802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(q qVar) {
            super(0);
            this.$child = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$child.f();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25447a;

        static {
            Covode.recordClassIndex(14803);
        }

        j(h.f.a.a aVar) {
            this.f25447a = aVar;
        }

        public final void run() {
            this.f25447a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f25435e.a(i.a.ON_CREATE);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f25435e.a(i.a.ON_DESTROY);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ v $host$inlined;
        final /* synthetic */ i $this_apply$inlined;
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, q qVar, v vVar) {
            super(0);
            this.$this_apply$inlined = iVar;
            this.this$0 = qVar;
            this.$host$inlined = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            u.a(this.$host$inlined, new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.arch.b.q.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(14798);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.$this_apply$inlined.a(this.this$0.this$0.f25437g);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f25435e.a(i.a.ON_RESUME);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f25435e.a(i.a.ON_STOP);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f25446a = new h();

        static {
            Covode.recordClassIndex(14801);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ v $host$inlined;
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(14792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar, v vVar) {
            super(0);
            this.this$0 = qVar;
            this.$host$inlined = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.$host$inlined.f25474k) {
                this.this$0.a(new h.f.a.a<z>(this) {
                    /* class com.bytedance.assem.arch.b.q.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(14793);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.$host$inlined.z();
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f25445a;

        static {
            Covode.recordClassIndex(14795);
        }

        c(q qVar) {
            this.f25445a = qVar;
        }

        public final void run() {
            v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25445a.f25431a;
            if (vVar != null) {
                vVar.x();
                vVar.f25476m = true;
            }
            this.f25445a.f25436f = true;
        }
    }

    public final void j() {
        v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25431a;
        if (!(vVar instanceof i)) {
            vVar = null;
        }
        i iVar = (i) vVar;
        if (iVar != null) {
            iVar.a();
        }
        this.f25431a = null;
        Iterator<T> it = this.f25443m.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public q() {
        f.a.l.b<b> a2 = f.a.l.b.a(new b(a.Default, null));
        l.a((Object) a2, "");
        this.r = a2;
        a2.c().d(new f.a.d.f<b>(this) {
            /* class com.bytedance.assem.arch.b.q.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f25444a;

            static {
                Covode.recordClassIndex(14791);
            }

            {
                this.f25444a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(b bVar) {
                boolean z;
                i.b bVar2;
                boolean z2;
                m mVar;
                boolean z3;
                v<? extends com.bytedance.tiktok.proxy.d> vVar;
                v<? extends com.bytedance.tiktok.proxy.d> vVar2;
                k kVar;
                v<? extends com.bytedance.tiktok.proxy.d> vVar3;
                v<? extends com.bytedance.tiktok.proxy.d> vVar4;
                n nVar;
                k kVar2;
                Boolean bool;
                Boolean bool2;
                i.b bVar3;
                n nVar2;
                b bVar4 = bVar;
                q qVar = this.f25444a;
                l.a((Object) bVar4, "");
                if (l.a(qVar.f25432b, com.bytedance.assem.arch.extensions.j.f25650e) && (kVar2 = com.bytedance.assem.arch.extensions.j.f25647b) != null) {
                    StringBuilder append = new StringBuilder("fireData, state: ").append(qVar.f25438h).append(", fireReason: ").append(bVar4).append(", hostInternal: ").append(qVar.f25431a).append(", isViewCreated: ");
                    v<? extends com.bytedance.tiktok.proxy.d> vVar5 = qVar.f25431a;
                    if (vVar5 != null) {
                        bool = Boolean.valueOf(vVar5.f25473j);
                    } else {
                        bool = null;
                    }
                    StringBuilder append2 = append.append(bool).append(", isFirstReused: ");
                    v<? extends com.bytedance.tiktok.proxy.d> vVar6 = qVar.f25431a;
                    if (vVar6 != null) {
                        bool2 = Boolean.valueOf(vVar6.f25475l);
                    } else {
                        bool2 = null;
                    }
                    StringBuilder append3 = append2.append(bool2).append(",  lifecycle: ");
                    v<? extends com.bytedance.tiktok.proxy.d> vVar7 = qVar.f25431a;
                    if (vVar7 == null || (nVar2 = vVar7.f25546d) == null) {
                        bVar3 = null;
                    } else {
                        bVar3 = nVar2.a();
                    }
                    kVar2.a("AssemList", append3.append(bVar3).toString());
                }
                a aVar = bVar4.f25422a;
                if (aVar == a.HostBind || aVar == a.HostDetach) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!l.a(bVar4.f25423b, qVar.f25431a)) || z) {
                    v<? extends com.bytedance.tiktok.proxy.d> vVar8 = qVar.f25431a;
                    if (vVar8 == null || (nVar = vVar8.f25546d) == null) {
                        bVar2 = null;
                    } else {
                        bVar2 = nVar.a();
                    }
                    if (bVar2 == i.b.RESUMED && (vVar4 = qVar.f25431a) != null && vVar4.f25473j) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aVar == a.HostBind) {
                        if (z2) {
                            aVar = a.HostResume;
                        } else {
                            aVar = a.HostStop;
                        }
                    }
                    qVar.f25438h = qVar.f25438h.a(aVar);
                    m mVar2 = qVar.f25439i;
                    if (!l.a(qVar.f25438h, o.f25429a) || (vVar3 = qVar.f25431a) == null || !vVar3.f25474k) {
                        mVar = m.Silent;
                    } else {
                        mVar = m.Active;
                    }
                    if (mVar2 != mVar || mVar == m.Active) {
                        qVar.f25439i = mVar;
                        if (qVar.f25439i == m.Active) {
                            if (l.a(qVar.f25432b, com.bytedance.assem.arch.extensions.j.f25650e) && (kVar = com.bytedance.assem.arch.extensions.j.f25647b) != null) {
                                kVar.a("AssemList", "fireData onResume, proxy: ".concat(String.valueOf(qVar)));
                            }
                            if (bVar4.f25422a != a.HostResume || ((vVar2 = qVar.f25431a) != null && vVar2.f25475l)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            qVar.f25433c = z3;
                            v<? extends com.bytedance.tiktok.proxy.d> vVar9 = qVar.f25431a;
                            if (vVar9 != null) {
                                vVar9.f25475l = false;
                            }
                            v<? extends com.bytedance.tiktok.proxy.d> vVar10 = qVar.f25431a;
                            if (vVar10 != null) {
                                if (!(vVar10 instanceof i)) {
                                    vVar = null;
                                } else {
                                    vVar = vVar10;
                                }
                                i iVar = (i) vVar;
                                if (iVar != null && (!z3) && !(iVar instanceof h)) {
                                    com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
                                    e eVar = new e(iVar, qVar, vVar10);
                                    if (lVar == null || !lVar.a(3, null, eVar)) {
                                        qVar.i().post(new r(eVar));
                                    }
                                }
                                qVar.a(new f(qVar));
                            }
                        } else if (qVar.f25439i == m.Silent && mVar2 == m.Active) {
                            qVar.a(new g(qVar));
                        }
                    }
                }
            }
        });
        this.s = new ConcurrentHashMap<>();
        this.t = new ConcurrentHashMap<>();
    }

    private final void l() {
        if (this.f25435e.a().compareTo((Enum) i.b.CREATED) < 0) {
            a(new b(this));
            if (!this.f25436f) {
                if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                    com.bytedance.assem.arch.extensions.j.a(true).execute(new c(this));
                } else {
                    v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25431a;
                    if (vVar != null) {
                        vVar.x();
                        vVar.f25476m = true;
                    }
                    this.f25436f = true;
                }
            }
            if (!this.f25443m.isEmpty()) {
                Iterator<T> it = this.f25443m.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void f() {
        k kVar;
        this.q = true;
        if (l.a(this.f25432b, com.bytedance.assem.arch.extensions.j.f25650e) && (kVar = com.bytedance.assem.arch.extensions.j.f25647b) != null) {
            kVar.a("AssemList", "onHostAttached, proxy: ".concat(String.valueOf(this)));
        }
        this.r.onNext(new b(a.HostAttach, this.f25431a));
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        int i2 = 0;
        for (T t2 : this.f25443m) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            T t3 = t2;
            if (com.bytedance.assem.arch.extensions.j.f25648c) {
                i iVar = new i(t3);
                if (lVar == null || !lVar.a(2, Integer.valueOf(i2), iVar)) {
                    i().post(new r(iVar));
                }
            } else {
                t3.f();
            }
            i2 = i3;
        }
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void g() {
        k kVar;
        this.q = false;
        if (l.a(this.f25432b, com.bytedance.assem.arch.extensions.j.f25650e) && (kVar = com.bytedance.assem.arch.extensions.j.f25647b) != null) {
            kVar.a("AssemList", "onHostDetached, proxy: ".concat(String.valueOf(this)));
        }
        this.r.onNext(new b(a.HostDetach, null));
        Iterator<T> it = this.f25443m.iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    public final void k() {
        if (!this.f25443m.isEmpty()) {
            Iterator<T> it = this.f25443m.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        }
        a(new d(this));
        this.p.clear();
        this.s.clear();
        this.t.clear();
        this.f25441k.a();
        i().removeCallbacksAndMessages(null);
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("Position=");
        h.f.a.a<Integer> aVar = this.o;
        String str = null;
        if (aVar != null) {
            num = aVar.invoke();
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(", Proxy@").append(Integer.toHexString(hashCode())).append('(').append("host@");
        v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25431a;
        if (vVar != null) {
            str = Integer.toHexString(vVar.hashCode());
        }
        return append.append(str).append(",state:").append(this.f25435e.a()).append(')').toString();
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void a(ad adVar) {
        this.f25440j = adVar;
    }

    private void a(List<? extends Object> list) {
        v<? extends com.bytedance.tiktok.proxy.d> vVar;
        k kVar;
        v<? extends com.bytedance.tiktok.proxy.d> vVar2 = this.f25431a;
        if (vVar2 != null) {
            if (!(vVar2 instanceof i)) {
                vVar = null;
            } else {
                vVar = vVar2;
            }
            i iVar = (i) vVar;
            l();
            vVar2.y();
            if (iVar != null) {
                iVar.b(this.f25437g);
            }
            if (list != null && !list.isEmpty()) {
                list = new ArrayList<>();
                list.addAll(list);
            }
            for (Map.Entry<h.k.c<?>, Object> entry : this.s.entrySet()) {
                AssemViewModel<?> assemViewModel = this.t.get(entry.getKey());
                if (assemViewModel != null) {
                    assemViewModel.a((AssemViewModel) this.f25437g, (Object) list, (List) entry.getValue(), (Object) ((h.f.a.m<Object, ? super List<? extends Object>, z>) null));
                }
            }
            if (iVar != null) {
                vVar2.f25474k = iVar.c(this.f25437g);
                if (!vVar2.f25474k) {
                    vVar2.a(new a(this, vVar2));
                }
            }
            this.r.onNext(new b(a.HostBind, vVar2));
            if (l.a(this.f25432b, com.bytedance.assem.arch.extensions.j.f25650e) && (kVar = com.bytedance.assem.arch.extensions.j.f25647b) != null) {
                kVar.a("AssemList", "onHostBind, proxy: ".concat(String.valueOf(this)));
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void a(v<? extends com.bytedance.tiktok.proxy.d> vVar) {
        T t2;
        l.c(vVar, "");
        Iterator<T> it = this.f25443m.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (l.a(t2.f25432b, ab.a(vVar.getClass()))) {
                break;
            }
        }
        T t3 = t2;
        if (t3 == null) {
            t3 = new q();
            this.f25443m.add(t3);
        }
        t3.a(vVar, this.f25437g, null, (h.f.a.b) h.f.b.ad.b(this.n, 1), this.o);
    }

    public final void a(h.f.a.a<z> aVar) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        l.a((Object) mainLooper, "");
        if (l.a(currentThread, mainLooper.getThread())) {
            aVar.invoke();
        } else {
            i().post(new j(aVar));
        }
    }

    public final void a(int i2, Object obj) {
        l.c(obj, "");
        this.f25437g = obj;
        Iterator<T> it = this.f25443m.iterator();
        while (it.hasNext()) {
            it.next().a(i2, obj);
        }
    }

    @Override // com.bytedance.assem.arch.b.j
    public final <VM extends AssemViewModel<S>, S extends com.bytedance.assem.arch.viewModel.j, ITEM> void a(VM vm, h.f.a.m<? super S, ? super ITEM, ? extends S> mVar) {
        l.c(vm, "");
        l.c(mVar, "");
        h.k.c<?> a2 = ab.a(vm.getClass());
        if (!this.s.containsKey(a2)) {
            this.s.put(a2, mVar);
            this.t.put(a2, vm);
        }
    }

    public final <T extends v<? extends com.bytedance.tiktok.proxy.d>, ITEM> void a(T t2, ITEM item, List<? extends Object> list, h.f.a.b<? super ITEM, z> bVar, h.f.a.a<Integer> aVar) {
        l.c(t2, "");
        this.f25437g = item;
        this.f25431a = null;
        if (this.f25432b == null) {
            this.f25432b = ab.a(t2.getClass());
        }
        t2.n = this;
        this.f25431a = t2;
        this.n = bVar;
        this.o = aVar;
        a(list);
        a(t2, this, item, list, bVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.b.q */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends v<? extends com.bytedance.tiktok.proxy.d>, ITEM> void a(T t2, q qVar, ITEM item, List<? extends Object> list, h.f.a.b<? super ITEM, z> bVar, h.f.a.a<Integer> aVar) {
        T t3;
        List<com.bytedance.assem.arch.core.a> t4 = t2.t();
        if (t4 != null) {
            for (T t5 : t4) {
                if (t5 != null) {
                    T t6 = t5;
                    Iterator<T> it = qVar.f25443m.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it.next();
                        if (l.a(t3.f25432b, ab.a(t6.getClass()))) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (t7 == null) {
                        t7 = new q();
                        t7.f25432b = ab.a(t6.getClass());
                        qVar.f25443m.add(t7);
                    }
                    t6.n = t7;
                    t7.f25431a = t6;
                    t7.f25437g = item;
                    t7.n = this.n;
                    t7.o = aVar;
                    t7.a(list);
                    if (t6.u()) {
                        a(t6, t7, item, list, bVar, aVar);
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
