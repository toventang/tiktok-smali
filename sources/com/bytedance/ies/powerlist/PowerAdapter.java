package com.bytedance.ies.powerlist;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.debug.Dr;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.optimize.Optimizer$init$1;
import com.bytedance.ies.powerlist.optimize.b;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.g;
import com.bytedance.ies.powerlist.page.i;
import com.bytedance.ies.powerlist.proxy.ListVMProxy;
import com.bytedance.ies.powerlist.proxy.b;
import com.ss.android.ugc.aweme.au;
import h.f.b.ad;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class PowerAdapter extends RecyclerView.a<PowerCell<? extends com.bytedance.ies.powerlist.b.a>> implements androidx.lifecycle.m, u, au {
    private static final ArrayList<Object> F = new ArrayList<>();
    public static final a o = new a((byte) 0);
    private com.bytedance.ies.powerlist.page.config.c A;
    private com.bytedance.ies.powerlist.page.b B;
    private Class<? extends PowerLoadingCell> C;
    private Field D;
    private final h.h E;

    /* renamed from: a  reason: collision with root package name */
    public PowerStub f34209a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PowerStub> f34210b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    boolean f34211c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Map<PowerStub, Integer> f34212d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Dr.Tracker f34213e;

    /* renamed from: f  reason: collision with root package name */
    public final f.a.l.b<com.bytedance.ies.powerlist.page.config.c> f34214f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.ies.powerlist.page.g f34215g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<c, PowerStub> f34216h;

    /* renamed from: i  reason: collision with root package name */
    public final List<com.bytedance.ies.powerlist.b.a> f34217i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Integer> f34218j;

    /* renamed from: k  reason: collision with root package name */
    androidx.lifecycle.m f34219k;

    /* renamed from: l  reason: collision with root package name */
    boolean f34220l;

    /* renamed from: m  reason: collision with root package name */
    final androidx.lifecycle.n f34221m;
    public final PowerList n;
    private final Map<Integer, Class<? extends PowerCell<?>>> p = new HashMap();
    private final Map<Type, Integer> q = new HashMap();
    private PowerPageLoader<?> r;
    private final h.h s = h.i.a((h.f.a.a) new n(this));
    private final com.bytedance.ies.powerlist.footer.a t = new com.bytedance.ies.powerlist.footer.a((byte) 0);
    private final h.h u = h.i.a((h.f.a.a) o.f34229a);
    private Fragment v;
    private final h.h w = h.i.a((h.f.a.a) new g(this));
    private final h.h x = h.i.a((h.f.a.a) p.f34230a);
    private final h.h y = h.i.a((h.f.a.a) m.f34228a);
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(20444);
        }

        void a(List<? extends com.bytedance.ies.powerlist.b.a> list);
    }

    private final RecyclerView.n l() {
        return (RecyclerView.n) this.s.getValue();
    }

    public final com.bytedance.ies.powerlist.proxy.b b() {
        return (com.bytedance.ies.powerlist.proxy.b) this.u.getValue();
    }

    public final androidx.fragment.app.e d() {
        return (androidx.fragment.app.e) this.w.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Class<? extends PowerCell<?>>, Object> e() {
        return (Map) this.x.getValue();
    }

    public final CopyOnWriteArrayList<com.bytedance.ies.powerlist.page.c> f() {
        return (CopyOnWriteArrayList) this.y.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.ies.powerlist.optimize.b k() {
        return (com.bytedance.ies.powerlist.optimize.b) this.E.getValue();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ PowerCell<? extends com.bytedance.ies.powerlist.b.a> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20443);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        return this.f34221m;
    }

    public final void a(boolean z2) {
        a(new k(this, z2));
    }

    static final class m extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<com.bytedance.ies.powerlist.page.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f34228a = new m();

        static {
            Covode.recordClassIndex(20456);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<com.bytedance.ies.powerlist.page.c> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.bytedance.ies.powerlist.proxy.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f34229a = new o();

        static {
            Covode.recordClassIndex(20459);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.proxy.b invoke() {
            return new com.bytedance.ies.powerlist.proxy.b();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<Map<Class<? extends PowerCell<?>>, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f34230a = new p();

        static {
            Covode.recordClassIndex(20460);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Class<? extends PowerCell<?>>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    private final int m() {
        int i2 = this.z;
        this.z = i2 + 1;
        return i2;
    }

    @v(a = i.a.ON_DESTROY)
    private final void onLifecycleOwnerDestroy() {
        this.f34221m.a(i.a.ON_DESTROY);
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.ies.powerlist.optimize.b> {
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PowerAdapter powerAdapter) {
            super(0);
            this.this$0 = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.optimize.b invoke() {
            return new com.bytedance.ies.powerlist.optimize.b(this.this$0.n, this.this$0.f34214f, this.this$0);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.bytedance.ies.powerlist.page.m> {
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(PowerAdapter powerAdapter) {
            super(0);
            this.this$0 = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.page.m invoke() {
            return new com.bytedance.ies.powerlist.page.m(this.this$0.n, new h.f.a.b<Integer, z>(this) {
                /* class com.bytedance.ies.powerlist.PowerAdapter.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(20458);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Integer num) {
                    int intValue = num.intValue();
                    if (intValue >= 0 && intValue < this.this$0.this$0.h().size()) {
                        RecyclerView.ViewHolder f2 = this.this$0.this$0.n.f(intValue);
                        if ((f2 instanceof PowerCell) && f2 != null) {
                            this.this$0.this$0.a(intValue);
                        }
                    }
                    return z.f158842a;
                }
            });
        }
    }

    public final PowerStub g() {
        PowerStub powerStub = this.f34209a;
        if (powerStub == null) {
            h.f.b.l.a("mainStub");
        }
        return powerStub;
    }

    public final void i() {
        a(new h(this));
    }

    static {
        Covode.recordClassIndex(20442);
    }

    public final List<PowerStub> a() {
        if (!this.f34211c) {
            return this.f34210b;
        }
        PowerStub powerStub = this.f34209a;
        if (powerStub == null) {
            h.f.b.l.a("mainStub");
        }
        return h.a.n.a(powerStub);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List h2;
        com.bytedance.ies.powerlist.page.config.c cVar = this.A;
        if (cVar == null || !cVar.f34359d) {
            h2 = h();
        } else {
            h2 = this.f34215g.f34378b;
        }
        return h2.size();
    }

    public final androidx.lifecycle.m j() {
        androidx.lifecycle.m mVar = this.f34219k;
        if (mVar != null || (mVar = c()) != null || (mVar = d()) != null) {
            return mVar;
        }
        throw new RuntimeException("Can not find lifecycleOwner !");
    }

    static final class g extends h.f.b.m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PowerAdapter powerAdapter) {
            super(0);
            this.this$0 = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            Object obj;
            Iterator a2 = h.l.k.a(this.this$0.n.getContext(), AnonymousClass1.f34224a).a();
            while (true) {
                if (!a2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a2.next();
                if (obj instanceof Activity) {
                    break;
                }
            }
            if (!(obj instanceof androidx.fragment.app.e)) {
                return null;
            }
            return obj;
        }
    }

    public final Fragment c() {
        Fragment fragment = this.v;
        if (fragment == null) {
            androidx.fragment.app.e d2 = d();
            if (d2 != null) {
                PowerList powerList = this.n;
                h.f.b.l.c(d2, "");
                h.f.b.l.c(powerList, "");
                androidx.fragment.app.i supportFragmentManager = d2.getSupportFragmentManager();
                h.f.b.l.a((Object) supportFragmentManager, "");
                List<Fragment> a2 = com.bytedance.ies.powerlist.c.a.a(supportFragmentManager);
                int size = a2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fragment = a2.get(size);
                    if (com.bytedance.ies.powerlist.c.a.a(fragment.getView(), powerList)) {
                        break;
                    }
                }
            }
            fragment = null;
            this.v = fragment;
        }
        return fragment;
    }

    public final List<com.bytedance.ies.powerlist.b.a> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().f34250j);
        }
        if (this.C != null) {
            com.bytedance.ies.powerlist.page.i iVar = this.t.f34291a.f34345b;
            if (iVar.f34400b != com.bytedance.ies.powerlist.page.e.Refresh ? !(iVar instanceof i.e) : (iVar instanceof i.a)) {
                arrayList.add(this.t);
            }
        }
        return arrayList;
    }

    public static final class h implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerAdapter f34225a;

        static {
            Covode.recordClassIndex(20451);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(PowerAdapter powerAdapter) {
            this.f34225a = powerAdapter;
        }

        @Override // com.bytedance.ies.powerlist.PowerAdapter.b
        public final void a(List<? extends com.bytedance.ies.powerlist.b.a> list) {
            h.f.b.l.c(list, "");
            this.f34225a.f34216h.clear();
            int i2 = 0;
            for (PowerStub powerStub : this.f34225a.a()) {
                int d2 = powerStub.d() + i2;
                this.f34225a.f34216h.put(new c(i2, d2), powerStub);
                i2 = d2;
            }
            this.f34225a.notifyDataSetChanged();
        }
    }

    public final void a(com.bytedance.ies.powerlist.page.c cVar) {
        f().add(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell) {
        PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell2 = powerCell;
        h.f.b.l.c(powerCell2, "");
        super.onViewRecycled(powerCell2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell) {
        PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell2 = powerCell;
        h.f.b.l.c(powerCell2, "");
        super.onViewAttachedToWindow(powerCell2);
        powerCell2.l();
        this.n.a(l());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell) {
        PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell2 = powerCell;
        h.f.b.l.c(powerCell2, "");
        super.onViewDetachedFromWindow(powerCell2);
        powerCell2.m();
        this.n.b(l());
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.ies.powerlist.page.h, z> {
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PowerAdapter powerAdapter) {
            super(1);
            this.this$0 = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.powerlist.page.h hVar) {
            com.bytedance.ies.powerlist.page.h hVar2 = hVar;
            h.f.b.l.c(hVar2, "");
            Iterator<T> it = this.this$0.f().iterator();
            while (it.hasNext()) {
                it.next().a(hVar2);
            }
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    private final PowerStub b(int i2) {
        for (Map.Entry<c, PowerStub> entry : this.f34216h.entrySet()) {
            if (entry.getKey().f34222a <= i2 && i2 < entry.getKey().f34223b) {
                return entry.getValue();
            }
        }
        return null;
    }

    public final int a(PowerStub powerStub) {
        if (powerStub == null) {
            return -1;
        }
        int i2 = 0;
        for (T t2 : a()) {
            if (h.f.b.l.a((Object) t2, (Object) powerStub)) {
                return i2;
            }
            i2 += t2.d();
        }
        return i2;
    }

    static final class i extends h.f.b.m implements h.f.a.b<PowerStub, Integer> {
        final /* synthetic */ com.bytedance.ies.powerlist.b.a $item;
        final /* synthetic */ Type $itemType;
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PowerAdapter powerAdapter, com.bytedance.ies.powerlist.b.a aVar, Type type) {
            super(1);
            this.this$0 = powerAdapter;
            this.$item = aVar;
            this.$itemType = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(PowerStub powerStub) {
            int i2;
            Integer num;
            int i3;
            PowerStub powerStub2 = powerStub;
            h.f.b.l.c(powerStub2, "");
            com.bytedance.ies.powerlist.b.a aVar = this.$item;
            if (aVar instanceof com.bytedance.ies.powerlist.header.a) {
                num = Integer.valueOf(((com.bytedance.ies.powerlist.header.a) aVar).f34296b);
            } else {
                Map<Type, Integer> map = powerStub2.f34245e;
                if (map != null) {
                    num = map.get(this.$itemType);
                }
                i2 = -1;
                return Integer.valueOf(i2);
            }
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = this.this$0.f34212d.get(powerStub2);
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    i3 = 0;
                }
                i2 = intValue + i3;
                return Integer.valueOf(i2);
            }
            i2 = -1;
            return Integer.valueOf(i2);
        }
    }

    private final void a(b bVar) {
        for (T t2 : a()) {
            t2.f34250j.clear();
            t2.f34250j.addAll(t2.f34247g);
            t2.f34250j.addAll(t2.f34246f);
            t2.f34250j.addAll(t2.f34248h);
        }
        List<com.bytedance.ies.powerlist.b.a> h2 = h();
        bVar.a(h2);
        this.f34217i.clear();
        this.f34217i.addAll(h2);
        this.f34218j.clear();
        int size = this.f34217i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f34218j.add(Integer.valueOf(this.f34217i.get(i2).hashCode()));
        }
    }

    public static final class k implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerAdapter f34226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34227b;

        static {
            Covode.recordClassIndex(20454);
        }

        @Override // com.bytedance.ies.powerlist.PowerAdapter.b
        public final void a(List<? extends com.bytedance.ies.powerlist.b.a> list) {
            ArrayList arrayList;
            ArrayList arrayList2;
            h.f.b.l.c(list, "");
            if (!this.f34227b) {
                this.f34226a.f34216h.clear();
                boolean z = false;
                int i2 = 0;
                for (PowerStub powerStub : this.f34226a.a()) {
                    int d2 = powerStub.d() + i2;
                    this.f34226a.f34216h.put(new c(i2, d2), powerStub);
                    i2 = d2;
                }
                com.bytedance.ies.powerlist.page.g gVar = this.f34226a.f34215g;
                List<Integer> list2 = this.f34226a.f34218j;
                List<com.bytedance.ies.powerlist.b.a> list3 = this.f34226a.f34217i;
                h.f.b.l.c(list2, "");
                h.f.b.l.c(list3, "");
                h.f.b.l.c(list, "");
                gVar.f34377a++;
                int i3 = gVar.f34377a;
                com.bytedance.ies.powerlist.page.config.c i4 = gVar.f34383g.i();
                if (i4 == null || !i4.f34359d) {
                    arrayList = new ArrayList(list3);
                    arrayList2 = new ArrayList(list2);
                } else {
                    z = true;
                    arrayList = new ArrayList(gVar.f34378b);
                    arrayList2 = new ArrayList(gVar.f34379c);
                }
                ArrayList arrayList3 = new ArrayList(list);
                g.e eVar = new g.e(arrayList, arrayList3, arrayList2);
                Executor executor = (Executor) gVar.f34381e.getValue();
                if (!z || executor == null) {
                    j.d a2 = androidx.recyclerview.widget.j.a(eVar);
                    h.f.b.l.a((Object) a2, "");
                    a2.a(gVar.f34382f);
                    return;
                }
                executor.execute(new g.d(gVar, eVar, i3, arrayList3));
            }
        }

        k(PowerAdapter powerAdapter, boolean z) {
            this.f34226a = powerAdapter;
            this.f34227b = z;
        }
    }

    public PowerAdapter(PowerList powerList) {
        h.f.b.l.c(powerList, "");
        this.n = powerList;
        f.a.l.b<com.bytedance.ies.powerlist.page.config.c> a2 = f.a.l.b.a(new com.bytedance.ies.powerlist.page.config.c());
        h.f.b.l.a((Object) a2, "");
        this.f34214f = a2;
        this.f34215g = new com.bytedance.ies.powerlist.page.g(this, a2);
        this.z = 30000;
        this.B = com.bytedance.ies.powerlist.page.b.Default;
        this.f34216h = new LinkedHashMap();
        this.f34217i = new ArrayList();
        this.f34218j = new ArrayList();
        this.f34221m = new androidx.lifecycle.n(this);
        this.E = h.i.a((h.f.a.a) new l(this));
        if (Dr.f34271b) {
            this.f34213e = new Dr.Tracker();
        }
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField != null) {
                this.D = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        a(this.t);
        a(new h());
        com.bytedance.ies.powerlist.optimize.b k2 = k();
        k2.f34320f.getLifecycle().a(new Optimizer$init$1(k2));
        if (!(k2.f34318d.getContext() instanceof com.bytedance.ies.powerlist.debug.c)) {
            k2.f34317c = k2.f34319e.d((f.a.d.f<? super com.bytedance.ies.powerlist.page.config.c>) new b.a(k2));
        }
    }

    public final void a(int i2) {
        PowerStub powerStub;
        if (this.r != null && (powerStub = (PowerStub) h.a.n.j((List) a())) != null) {
            int a2 = powerStub.a();
            int b2 = powerStub.b();
            PowerPageLoader<?> powerPageLoader = this.r;
            if (powerPageLoader != null) {
                powerPageLoader.b().post(new PowerPageLoader.f(powerPageLoader, (i2 + 0) - a2, ((getItemCount() + 0) - a2) - b2));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        List h2;
        com.bytedance.ies.powerlist.page.config.c cVar = this.A;
        if (cVar == null || !cVar.f34359d) {
            h2 = h();
        } else {
            h2 = this.f34215g.f34378b;
        }
        com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) h2.get(i2);
        Class<?> cls = aVar.getClass();
        i iVar = new i(this, aVar, cls);
        PowerStub b2 = b(i2);
        Integer num = null;
        if (b2 != null) {
            Object invoke = iVar.invoke(b2);
            if (((Number) invoke).intValue() == -1) {
                invoke = null;
            }
            Integer num2 = (Integer) invoke;
            if (num2 != null) {
                return num2.intValue();
            }
        }
        PowerStub g2 = g();
        if (g2 != null) {
            Object invoke2 = iVar.invoke(g2);
            if (((Number) invoke2).intValue() != -1) {
                num = invoke2;
            }
            Integer num3 = num;
            if (num3 != null) {
                return num3.intValue();
            }
        }
        Integer num4 = this.q.get(cls);
        if (num4 != null) {
            return num4.intValue();
        }
        throw new RuntimeException("not registerCells for: " + aVar.getClass());
    }

    public final void a(e eVar) {
        h.f.b.l.c(eVar, "");
        this.f34211c = eVar instanceof h;
        eVar.f34288b = this.n.getContext();
        PowerStub powerStub = new PowerStub(eVar, new d(this, eVar), new e(this, eVar), new f(this));
        int i2 = 0;
        if (this.f34211c) {
            this.f34209a = powerStub;
        } else {
            List<PowerStub> a2 = a();
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    if (h.f.b.l.a(it.next().f34251k.getClass(), eVar.getClass())) {
                        throw new IllegalStateException(("Registered duplicate PowerChunk class : " + eVar.getClass().getName()).toString());
                    }
                }
            }
            this.f34210b.add(powerStub);
        }
        PowerStub powerStub2 = this.f34209a;
        if (powerStub2 == null) {
            h.f.b.l.a("mainStub");
        }
        powerStub.f34242b = powerStub2;
        eVar.f34287a = powerStub;
        if (this.f34220l) {
            powerStub.a(j());
        }
        Integer num = (Integer) h.a.n.q(this.f34212d.values());
        if (num != null) {
            i2 = num.intValue();
        }
        int i3 = i2 + 100;
        Map<PowerStub, Integer> map = this.f34212d;
        PowerStub powerStub3 = eVar.f34287a;
        if (powerStub3 == null) {
            h.f.b.l.a();
        }
        map.put(powerStub3, Integer.valueOf(i3));
        PowerPageLoader<?> powerPageLoader = this.r;
        if (powerPageLoader != null) {
            powerPageLoader.f();
        }
        this.r = null;
        this.C = null;
        com.bytedance.ies.powerlist.page.config.b<?> a3 = eVar.a();
        if (a3 != null) {
            a(a3, true, eVar.b());
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f34222a;

        /* renamed from: b  reason: collision with root package name */
        public final int f34223b;

        static {
            Covode.recordClassIndex(20445);
        }

        public c(int i2, int i3) {
            this.f34222a = i2;
            this.f34223b = i3;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        b().a(i2, i3);
        notifyItemRangeInserted(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.m<Boolean, Boolean, z> {
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PowerAdapter powerAdapter) {
            super(2);
            this.this$0 = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            if (bool2.booleanValue()) {
                this.this$0.i();
            } else {
                this.this$0.a(booleanValue);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        b().b(i2, i3);
        notifyItemRangeRemoved(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.m<Integer, Integer, z> {
        final /* synthetic */ e $chunk;
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PowerAdapter powerAdapter, e eVar) {
            super(2);
            this.this$0 = powerAdapter;
            this.$chunk = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Integer num2) {
            num.intValue();
            this.this$0.b().a(this.this$0.a(this.$chunk.f34287a), num2.intValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.m<Integer, Integer, z> {
        final /* synthetic */ e $chunk;
        final /* synthetic */ PowerAdapter this$0;

        static {
            Covode.recordClassIndex(20447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PowerAdapter powerAdapter, e eVar) {
            super(2);
            this.this$0 = powerAdapter;
            this.$chunk = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Integer num2) {
            num.intValue();
            this.this$0.b().b(this.this$0.a(this.$chunk.f34287a), num2.intValue());
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        notifyItemMoved(i2, i3);
        com.bytedance.ies.powerlist.proxy.b b2 = b();
        int size = b2.a().size();
        if (i2 >= 0 && size > i2 && i3 >= 0 && size > i3 && i2 != i3) {
            ListVMProxy<?, ?> listVMProxy = b2.a().get(i2);
            b2.a().remove(listVMProxy);
            b2.a().add(i3, listVMProxy);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell, int i2) {
        List h2;
        i.b bVar;
        androidx.lifecycle.n b2;
        PowerCell<? extends com.bytedance.ies.powerlist.b.a> powerCell2 = powerCell;
        h.f.b.l.c(powerCell2, "");
        Dr.Tracker tracker = this.f34213e;
        if (tracker != null) {
            tracker.f34276d = SystemClock.uptimeMillis();
            tracker.f34278f++;
        }
        ArrayList<Object> arrayList = F;
        com.bytedance.ies.powerlist.page.config.c cVar = this.A;
        if (cVar == null || !cVar.f34359d) {
            h2 = h();
        } else {
            h2 = this.f34215g.f34378b;
        }
        T t2 = (T) ((com.bytedance.ies.powerlist.b.a) h2.get(i2));
        if (powerCell2 != null) {
            powerCell2.f34236f = b(i2);
            h.f.b.l.c(t2, "");
            powerCell2.f34234d = t2;
            if (powerCell2.f34236f == null && h.f.b.l.a(t2, this.t)) {
                PowerStub powerStub = this.f34209a;
                if (powerStub == null) {
                    h.f.b.l.a("mainStub");
                }
                powerCell2.f34236f = powerStub;
            }
            com.bytedance.ies.powerlist.proxy.b b3 = b();
            h.f.b.l.c(powerCell2, "");
            h.f.b.l.c(t2, "");
            if (b3.a().size() > i2) {
                if (b3.a().get(i2) == null) {
                    b3.a().set(i2, new ListVMProxy<>(powerCell2.f()));
                }
                ListVMProxy<PowerCell<T>, T> listVMProxy = powerCell2.f34239i;
                if (listVMProxy != null) {
                    listVMProxy.c();
                }
                ListVMProxy<?, ?> listVMProxy2 = b3.a().get(i2);
                if (listVMProxy2 != null) {
                    ListVMProxy<?, ?> listVMProxy3 = listVMProxy2;
                    if (listVMProxy3 != null) {
                        b.a aVar = new b.a(b3, listVMProxy3);
                        b.C0765b bVar2 = new b.C0765b(b3, listVMProxy3);
                        h.f.b.l.c(powerCell2, "");
                        h.f.b.l.c(t2, "");
                        h.f.b.l.c(aVar, "");
                        h.f.b.l.c(bVar2, "");
                        listVMProxy3.c();
                        powerCell2.a((com.bytedance.tiktok.proxy.a) listVMProxy3);
                        listVMProxy3.f34422b = powerCell2;
                        androidx.lifecycle.i a2 = listVMProxy3.a();
                        if (a2 != null && (!listVMProxy3.f34421a)) {
                            a2.a(listVMProxy3);
                            listVMProxy3.f34421a = true;
                        }
                        com.bytedance.tiktok.proxy.b<R, ITEM> bVar3 = listVMProxy3.f34423c;
                        if (bVar3 != null) {
                            bVar3.a(i2, powerCell2, t2, arrayList, aVar, bVar2);
                        }
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            ListVMProxy<PowerCell<T>, T> listVMProxy4 = powerCell2.f34239i;
            if (listVMProxy4 == null || (b2 = listVMProxy4.getLifecycle()) == null || (bVar = b2.a()) == null) {
                bVar = i.b.INITIALIZED;
            }
            h.f.b.l.a((Object) bVar, "");
            if (powerCell2.getLifecycle().a().compareTo((Enum) bVar) < 0 && bVar == i.b.RESUMED) {
                powerCell2.n();
                powerCell2.f34237g = true;
            }
            powerCell2.p();
            powerCell2.n();
            powerCell2.o();
            if (t2 != null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    powerCell2.a((Object) t2);
                } else {
                    powerCell2.a(t2, arrayList);
                }
            }
            a(i2);
            Dr.Tracker tracker2 = this.f34213e;
            if (tracker2 != null) {
                tracker2.f34277e = (long) ((((float) ((tracker2.f34277e * ((long) (tracker2.f34278f - 1))) + (SystemClock.uptimeMillis() - tracker2.f34276d))) * 1.0f) / ((float) tracker2.f34278f));
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void a(com.bytedance.ies.powerlist.page.config.c cVar, com.bytedance.ies.powerlist.page.b bVar) {
        h.f.b.l.c(cVar, "");
        h.f.b.l.c(bVar, "");
        if (bVar.ordinal() >= this.B.ordinal()) {
            this.B = bVar;
            this.A = cVar;
            if (cVar.f34358c != null) {
                int m2 = m();
                this.q.put(com.bytedance.ies.powerlist.footer.a.class, Integer.valueOf(m2));
                Map<Integer, Class<? extends PowerCell<?>>> map = this.p;
                Integer valueOf = Integer.valueOf(m2);
                Class<? extends PowerLoadingCell> cls = cVar.f34358c;
                if (cls != null) {
                    map.put(valueOf, cls);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                Integer remove = this.q.remove(com.bytedance.ies.powerlist.footer.a.class);
                Map<Integer, Class<? extends PowerCell<?>>> map2 = this.p;
                if (map2 != null) {
                    ad.h(map2).remove(remove);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            this.C = cVar.f34358c;
            this.f34214f.onNext(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        notifyItemRangeChanged(i2, i3, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
        if (r4 != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.RecyclerView.ViewHolder a(com.bytedance.ies.powerlist.PowerAdapter r11, android.view.ViewGroup r12, int r13) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerAdapter.a(com.bytedance.ies.powerlist.PowerAdapter, android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final void a(com.bytedance.ies.powerlist.page.config.b<?> bVar, boolean z2, f<com.bytedance.ies.powerlist.b.a> fVar) {
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(fVar, "");
        if (!this.f34211c ? !z2 : z2) {
            throw new IllegalStateException("chunk cannot use PowerList.load!".toString());
        }
        PowerPageLoader<?> powerPageLoader = this.r;
        if (powerPageLoader != null) {
            powerPageLoader.f();
        }
        this.r = new PowerPageLoader<>(bVar, this.f34214f, this, fVar, new j(this));
        a(bVar.f34355b, com.bytedance.ies.powerlist.page.b.PageConfig);
        this.t.f34292b = this.r;
        PowerPageLoader<?> powerPageLoader2 = this.r;
        if (powerPageLoader2 != null) {
            powerPageLoader2.d();
        }
    }
}
