package com.bytedance.assem.arch.b;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.i;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.am;

public final class s implements j, com.bytedance.tiktok.proxy.a<com.bytedance.tiktok.proxy.d, Object>, com.bytedance.tiktok.proxy.d {

    /* renamed from: a  reason: collision with root package name */
    public v<? extends com.bytedance.tiktok.proxy.d> f25449a;

    /* renamed from: b  reason: collision with root package name */
    public h.k.c<? extends v<? extends com.bytedance.tiktok.proxy.d>> f25450b;

    /* renamed from: c  reason: collision with root package name */
    public int f25451c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final n f25452d = new n(this);

    /* renamed from: e  reason: collision with root package name */
    public boolean f25453e;

    /* renamed from: f  reason: collision with root package name */
    public final List<s> f25454f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public Object f25455g;

    /* renamed from: h  reason: collision with root package name */
    public final Queue<h.f.a.a<z>> f25456h = new LinkedList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f25457i = true;

    /* renamed from: j  reason: collision with root package name */
    private ad f25458j;

    /* renamed from: k  reason: collision with root package name */
    private final af f25459k = new af();

    /* renamed from: l  reason: collision with root package name */
    private final h f25460l = i.a((h.f.a.a) d.f25466a);

    /* renamed from: m  reason: collision with root package name */
    private Object f25461m;
    private h.f.a.a<Integer> n;
    private final Map<h.k.c<?>, Object> o = new LinkedHashMap();
    private final Map<h.k.c<?>, AssemViewModel<?>> p = new LinkedHashMap();
    private final f.a.l.b<b> q;

    static {
        Covode.recordClassIndex(14805);
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void f() {
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void g() {
    }

    public final Handler i() {
        return (Handler) this.f25460l.getValue();
    }

    @Override // com.bytedance.assem.arch.b.j
    public final Object a() {
        return this.f25455g;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final f.a.l.b<b> b() {
        return this.q;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final h.f.a.a<Integer> c() {
        return this.n;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final Object d() {
        return this.f25461m;
    }

    @Override // com.bytedance.assem.arch.b.j
    public final ad e() {
        return this.f25458j;
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this.f25449a;
    }

    @Override // androidx.lifecycle.m
    public final /* bridge */ /* synthetic */ androidx.lifecycle.i getLifecycle() {
        return this.f25452d;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return this.f25459k;
    }

    @Override // com.bytedance.tiktok.proxy.g
    public final boolean h() {
        return this.f25457i;
    }

    public final void a(List<? extends Object> list) {
        i.b bVar;
        n nVar;
        v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25449a;
        if (vVar == null || (nVar = vVar.f25546d) == null || (bVar = nVar.a()) == null) {
            bVar = i.b.RESUMED;
        }
        if (bVar.compareTo((Enum) i.b.CREATED) >= 0 && this.f25452d.a().compareTo((Enum) i.b.CREATED) >= 0) {
            v<? extends com.bytedance.tiktok.proxy.d> vVar2 = this.f25449a;
            i iVar = null;
            if (!(vVar2 instanceof i)) {
                vVar2 = null;
            }
            i iVar2 = (i) vVar2;
            if (iVar2 != null) {
                iVar2.b(this.f25455g);
            }
            if (list != null && !list.isEmpty()) {
                list = new ArrayList<>();
                list.addAll(list);
            }
            Map<h.k.c<?>, Object> map = this.o;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<h.k.c<?>, Object> entry : this.o.entrySet()) {
                    AssemViewModel<?> assemViewModel = this.p.get(entry.getKey());
                    if (assemViewModel != null) {
                        assemViewModel.a(this.f25455g, list, entry.getValue(), new a(assemViewModel, this, list));
                    }
                }
            } else if (this.f25449a instanceof i) {
                if (!l.a(Looper.myLooper(), Looper.getMainLooper())) {
                    i().post(new b(this, list));
                } else if (list == null || list.isEmpty()) {
                    v<? extends com.bytedance.tiktok.proxy.d> vVar3 = this.f25449a;
                    if (vVar3 instanceof i) {
                        iVar = vVar3;
                    }
                    i iVar3 = iVar;
                    if (iVar3 != null) {
                        iVar3.a(this.f25455g);
                    }
                } else {
                    v<? extends com.bytedance.tiktok.proxy.d> vVar4 = this.f25449a;
                    if (vVar4 instanceof i) {
                        iVar = vVar4;
                    }
                    i iVar4 = (i) iVar;
                    if (iVar4 != null) {
                        iVar4.a(this.f25455g, list);
                    }
                }
            }
        }
    }

    private final void k() {
        this.f25452d.a(i.b.INITIALIZED);
    }

    static final class d extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25466a = new d();

        static {
            Covode.recordClassIndex(14811);
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

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f25462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f25463b;

        static {
            Covode.recordClassIndex(14808);
        }

        b(s sVar, List list) {
            this.f25462a = sVar;
            this.f25463b = list;
        }

        public final void run() {
            boolean z;
            List list = this.f25463b;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            i iVar = null;
            if (z) {
                v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25462a.f25449a;
                if (vVar instanceof i) {
                    iVar = vVar;
                }
                i iVar2 = (i) iVar;
                if (iVar2 != null) {
                    iVar2.a(this.f25462a.f25455g);
                    return;
                }
                return;
            }
            v<? extends com.bytedance.tiktok.proxy.d> vVar2 = this.f25462a.f25449a;
            if (vVar2 instanceof i) {
                iVar = vVar2;
            }
            i iVar3 = iVar;
            if (iVar3 != null) {
                iVar3.a(this.f25462a.f25455g, this.f25463b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f25464a;

        static {
            Covode.recordClassIndex(14809);
        }

        c(s sVar) {
            this.f25464a = sVar;
        }

        public final void run() {
            v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25464a.f25449a;
            if (vVar != null) {
                vVar.x();
            }
            v<? extends com.bytedance.tiktok.proxy.d> vVar2 = this.f25464a.f25449a;
            if (vVar2 != null) {
                vVar2.f25476m = true;
            }
            this.f25464a.i().post(new Runnable(this) {
                /* class com.bytedance.assem.arch.b.s.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f25465a;

                static {
                    Covode.recordClassIndex(14810);
                }

                {
                    this.f25465a = r1;
                }

                public final void run() {
                    this.f25465a.f25464a.a((List<? extends Object>) null);
                }
            });
            this.f25464a.f25453e = true;
        }
    }

    public final void j() {
        v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25449a;
        if (!(vVar instanceof i)) {
            vVar = null;
        }
        i iVar = (i) vVar;
        if (iVar != null) {
            iVar.a();
        }
        this.f25449a = null;
        Iterator<T> it = this.f25454f.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    private final void l() {
        this.f25452d.a(i.a.ON_CREATE);
        if (!this.f25453e) {
            v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25449a;
            if (vVar != null && vVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                a(i.b.CREATED, vVar);
            }
            j.a(false).execute(new c(this));
        }
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.CREATED, it.next(), false);
            }
        }
    }

    private final void m() {
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.DESTROYED, it.next(), false);
            }
        }
        this.f25452d.a(i.a.ON_DESTROY);
        this.f25456h.clear();
        this.o.clear();
        this.p.clear();
        this.f25459k.a();
        i().removeCallbacksAndMessages(null);
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("Position=");
        h.f.a.a<Integer> aVar = this.n;
        String str = null;
        if (aVar != null) {
            num = aVar.invoke();
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(", Proxy@").append(Integer.toHexString(hashCode())).append('(').append("host@");
        v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25449a;
        if (vVar != null) {
            str = Integer.toHexString(vVar.hashCode());
        }
        return append.append(str).append(",state:").append(this.f25452d.a()).append(')').toString();
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void a(ad adVar) {
        this.f25458j = adVar;
    }

    private final void a(boolean z) {
        this.f25457i = z;
        this.f25452d.a(i.a.ON_START);
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.STARTED, it.next(), z);
            }
        }
    }

    private final void b(boolean z) {
        this.f25457i = z;
        this.f25452d.a(i.a.ON_RESUME);
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.RESUMED, it.next(), z);
            }
        }
    }

    private final void c(boolean z) {
        this.f25457i = z;
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.STARTED, it.next(), z);
            }
        }
        this.f25452d.a(i.a.ON_PAUSE);
    }

    private final void d(boolean z) {
        this.f25457i = z;
        if (!this.f25454f.isEmpty()) {
            Iterator<T> it = this.f25454f.iterator();
            while (it.hasNext()) {
                a(i.b.CREATED, it.next(), z);
            }
        }
        this.f25452d.a(i.a.ON_STOP);
    }

    @Override // com.bytedance.assem.arch.b.j
    public final void a(v<? extends com.bytedance.tiktok.proxy.d> vVar) {
        T t;
        T t2;
        l.c(vVar, "");
        vVar.y();
        List<s> list = this.f25454f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (l.a(t2.f25450b, ab.a(vVar.getClass()))) {
                    break;
                }
            }
            t = t2;
            if (t != null) {
                n nVar = this.f25452d;
                if (nVar == null || (r0 = nVar.a()) == null) {
                    i.b bVar = i.b.INITIALIZED;
                }
                a(bVar, t, true);
            }
        }
        t = new s();
        l.c(t, "");
        this.f25454f.add(t);
        t.a(vVar, this.f25455g, null, (h.f.a.b) h.f.b.ad.b(this.f25461m, 1), this.n);
        n nVar2 = this.f25452d;
        i.b bVar2 = i.b.INITIALIZED;
        a(bVar2, t, true);
    }

    public final void a(int i2, Object obj) {
        l.c(obj, "");
        this.f25455g = obj;
        Iterator<T> it = this.f25454f.iterator();
        while (it.hasNext()) {
            it.next().a(i2, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.m<Object, List<? extends Object>, z> {
        final /* synthetic */ List $businessPayloads$inlined;
        final /* synthetic */ AssemViewModel $vm;
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(14806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AssemViewModel assemViewModel, s sVar, List list) {
            super(2);
            this.$vm = assemViewModel;
            this.this$0 = sVar;
            this.$businessPayloads$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(final Object obj, List<? extends Object> list) {
            final List<? extends Object> list2 = list;
            final v<? extends com.bytedance.tiktok.proxy.d> vVar = this.this$0.f25449a;
            if (vVar != null) {
                if (vVar instanceof h) {
                    if (list2 != null) {
                        list2.isEmpty();
                    }
                } else if (vVar instanceof i) {
                    this.$vm.d(new h.f.a.b<am, z>() {
                        /* class com.bytedance.assem.arch.b.s.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14807);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(am amVar) {
                            boolean z;
                            l.c(amVar, "");
                            List list = list2;
                            if (list == null || list.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                v vVar = vVar;
                                if (vVar != null) {
                                    ((i) vVar).a(obj);
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            } else {
                                v vVar2 = vVar;
                                if (vVar2 != null) {
                                    ((i) vVar2).a(obj, list2);
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            }
                            return z.f158842a;
                        }
                    });
                }
            }
            return z.f158842a;
        }
    }

    private static void a(i.b bVar, v<?> vVar) {
        int i2 = t.f25467a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (vVar.f25546d.a().compareTo((Enum) i.b.RESUMED) >= 0) {
                            vVar.k();
                        }
                        if (vVar.f25546d.a().compareTo((Enum) i.b.STARTED) >= 0) {
                            vVar.m();
                        }
                        if (vVar.f25546d.a().compareTo((Enum) i.b.CREATED) >= 0) {
                            vVar.o();
                        }
                    }
                } else if (vVar.f25546d.a().compareTo((Enum) i.b.RESUMED) < 0) {
                    if (vVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        vVar.as_();
                    }
                    if (vVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                        vVar.g();
                    }
                    vVar.bP_();
                }
            } else if (vVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                if (vVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                    vVar.as_();
                }
                vVar.g();
            } else if (vVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                vVar.k();
            }
        } else if (vVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
            vVar.as_();
        } else {
            if (vVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                vVar.k();
            }
            if (vVar.f25546d.a().compareTo((Enum) i.b.CREATED) > 0) {
                vVar.m();
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.j
    public final <VM extends AssemViewModel<S>, S extends com.bytedance.assem.arch.viewModel.j, ITEM> void a(VM vm, h.f.a.m<? super S, ? super ITEM, ? extends S> mVar) {
        l.c(vm, "");
        l.c(mVar, "");
        h.k.c<?> a2 = ab.a(vm.getClass());
        if (!this.o.containsKey(a2)) {
            this.o.put(a2, mVar);
            this.p.put(a2, vm);
        }
    }

    public static void a(i.b bVar, s sVar, boolean z) {
        v<? extends com.bytedance.tiktok.proxy.d> vVar;
        l.c(bVar, "");
        l.c(sVar, "");
        int i2 = t.f25468b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (sVar.f25452d.a().compareTo((Enum) i.b.RESUMED) >= 0) {
                            sVar.c(z);
                        }
                        if (sVar.f25452d.a().compareTo((Enum) i.b.STARTED) >= 0) {
                            sVar.d(z);
                        }
                        if (sVar.f25452d.a().compareTo((Enum) i.b.CREATED) >= 0) {
                            sVar.m();
                        }
                    } else if (i2 == 5) {
                        sVar.k();
                    }
                } else if (sVar.f25452d.a().compareTo((Enum) i.b.RESUMED) < 0) {
                    if (sVar.f25452d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        sVar.l();
                    }
                    if (sVar.f25452d.a().compareTo((Enum) i.b.STARTED) < 0 && (vVar = sVar.f25449a) != null) {
                        vVar.f25546d.a();
                        sVar.a(z);
                    }
                    v<? extends com.bytedance.tiktok.proxy.d> vVar2 = sVar.f25449a;
                    if (vVar2 != null) {
                        vVar2.f25546d.a();
                        sVar.b(z);
                    }
                }
            } else if (sVar.f25452d.a().compareTo((Enum) i.b.STARTED) < 0) {
                if (sVar.f25452d.a().compareTo((Enum) i.b.CREATED) < 0) {
                    sVar.l();
                }
                if (sVar.f25449a != null) {
                    sVar.a(z);
                }
            } else if (sVar.f25452d.a().compareTo((Enum) i.b.STARTED) > 0) {
                sVar.c(z);
            }
        } else if (sVar.f25452d.a().compareTo((Enum) i.b.CREATED) < 0) {
            sVar.l();
        } else {
            if (sVar.f25452d.a().compareTo((Enum) i.b.STARTED) > 0) {
                sVar.c(z);
            }
            if (sVar.f25452d.a().compareTo((Enum) i.b.CREATED) > 0) {
                sVar.d(z);
            }
        }
    }

    public final <T extends v<? extends com.bytedance.tiktok.proxy.d>, ITEM> void a(T t, ITEM item, List<? extends Object> list, h.f.a.b<? super ITEM, z> bVar, h.f.a.a<Integer> aVar) {
        l.c(t, "");
        this.f25455g = item;
        this.f25449a = null;
        if (this.f25450b == null) {
            this.f25450b = ab.a(t.getClass());
        }
        t.n = this;
        this.f25449a = t;
        if (t.f25546d.a().compareTo((Enum) this.f25452d.a()) < 0) {
            i.b a2 = this.f25452d.a();
            l.a((Object) a2, "");
            v<? extends com.bytedance.tiktok.proxy.d> vVar = this.f25449a;
            if (vVar == null) {
                l.a();
            }
            a(a2, vVar);
        }
        this.f25461m = bVar;
        this.n = aVar;
        a(list);
        a(t, this, item, list, bVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.b.s */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends v<? extends com.bytedance.tiktok.proxy.d>, ITEM> void a(T t, s sVar, ITEM item, List<? extends Object> list, h.f.a.b<? super ITEM, z> bVar, h.f.a.a<Integer> aVar) {
        s sVar2;
        List<com.bytedance.assem.arch.core.a> t2 = t.t();
        if (t2 != null) {
            int i2 = 0;
            for (T t3 : t2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t4 = t3;
                if (t4 != null) {
                    T t5 = t4;
                    List<s> list2 = sVar.f25454f;
                    if (list2 == null || list2.isEmpty() || sVar.f25454f.size() <= i2) {
                        sVar2 = new s();
                        if (sVar2.f25450b == null) {
                            sVar2.f25450b = ab.a(t5.getClass());
                        }
                        t5.n = sVar2;
                        sVar2.f25449a = t5;
                        sVar.f25454f.add(i2, sVar2);
                    } else {
                        sVar2 = sVar.f25454f.get(i2);
                        if (sVar2.f25450b == null) {
                            sVar2.f25450b = ab.a(t5.getClass());
                        }
                        t5.n = sVar2;
                        sVar2.f25449a = t5;
                    }
                    t5.y();
                    sVar2.f25455g = item;
                    sVar2.f25461m = this.f25461m;
                    sVar2.n = aVar;
                    if (t5.f25546d.a().compareTo((Enum) sVar2.f25452d.a()) < 0) {
                        i.b a2 = sVar2.f25452d.a();
                        l.a((Object) a2, "");
                        a(a2, t5);
                    }
                    sVar2.a(list);
                    if (t5.u()) {
                        a(t5, sVar2, item, list, bVar, aVar);
                    }
                    i2 = i3;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
