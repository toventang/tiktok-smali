package com.bytedance.jedi.ext.adapter.b;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.e;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

public class f<VH extends e<?>> implements g<VH> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<h.f.a.b<ViewGroup, VH>> f39679a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.jedi.ext.adapter.internal.a f39680b;

    /* renamed from: c  reason: collision with root package name */
    private int f39681c = 11513600;

    /* renamed from: d  reason: collision with root package name */
    private final List<a<VH>> f39682d;

    static {
        Covode.recordClassIndex(24446);
    }

    /* access modifiers changed from: protected */
    public VH a(int i2) {
        return null;
    }

    public VH a(VH vh) {
        l.c(vh, "");
        return vh;
    }

    public f() {
        b bVar = new b(this);
        c cVar = c.f39687a;
        int i2 = this.f39681c;
        this.f39681c = i2 + 1;
        this.f39682d = n.c(new a(bVar, cVar, i2));
        this.f39680b = new com.bytedance.jedi.ext.adapter.internal.a();
    }

    static final class b extends m implements h.f.a.b<ViewGroup, VH> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(24448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            return this.this$0.a(viewGroup2);
        }
    }

    static final class c extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39687a = new c();

        static {
            Covode.recordClassIndex(24449);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    static final class d extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39688a = new d();

        static {
            Covode.recordClassIndex(24450);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    public final void b(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39680b.b(recyclerView);
    }

    /* access modifiers changed from: protected */
    public VH a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        return new a(viewGroup);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: android.util.SparseArray<h.f.a.b<android.view.ViewGroup, VH extends com.bytedance.jedi.ext.adapter.b.e<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final int b(int i2) {
        T t;
        Iterator<T> it = this.f39682d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f39684b.invoke(Integer.valueOf(i2)).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            h.f.a.b<ViewGroup, VH> bVar = t2.f39683a;
            int i3 = t2.f39685c;
            if (this.f39679a.get(i3) == null) {
                this.f39679a.put(i3, bVar);
            }
            return i3;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    @Override // com.bytedance.jedi.ext.adapter.b.g
    public final g<VH> a(h.f.a.b<? super ViewGroup, ? extends VH> bVar) {
        l.c(bVar, "");
        h.f.a.b<ViewGroup, VH> bVar2 = this.f39679a.get(0);
        if (bVar2 == null) {
            this.f39682d.add(this.f39682d.size() - 1, new a<>(bVar, d.f39688a, 0, null));
            this.f39679a.put(0, bVar);
            return this;
        }
        throw new IllegalArgumentException(("factory's viewType 0 " + bVar2.getClass().getSimpleName() + " is already registered").toString());
    }

    public final void a(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39680b.a(recyclerView);
        for (T t : this.f39682d) {
            int i2 = t.f39685c;
            h.f.a.m<Integer, RecyclerView, z> mVar = t.f39686d;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(i2), recyclerView);
            }
        }
    }

    public final VH a(ViewGroup viewGroup, int i2) {
        l.c(viewGroup, "");
        VH a2 = a(i2);
        if (a2 != null) {
            return a2;
        }
        if (this.f39679a.indexOfKey(i2) >= 0) {
            h.f.a.b<ViewGroup, VH> bVar = this.f39679a.get(i2);
            l.a((Object) bVar, "");
            VH invoke = bVar.invoke(viewGroup);
            a(invoke);
            return invoke;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i2 + " is registered").toString());
    }

    /* access modifiers changed from: package-private */
    public static final class a<VH> {

        /* renamed from: a  reason: collision with root package name */
        public final h.f.a.b<ViewGroup, VH> f39683a;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.b<Integer, Boolean> f39684b;

        /* renamed from: c  reason: collision with root package name */
        public final int f39685c;

        /* renamed from: d  reason: collision with root package name */
        public final h.f.a.m<Integer, RecyclerView, z> f39686d;

        static {
            Covode.recordClassIndex(24447);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f39683a, aVar.f39683a) && l.a(this.f39684b, aVar.f39684b) && this.f39685c == aVar.f39685c && l.a(this.f39686d, aVar.f39686d);
        }

        public final int hashCode() {
            h.f.a.b<ViewGroup, VH> bVar = this.f39683a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            h.f.a.b<Integer, Boolean> bVar2 = this.f39684b;
            int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f39685c) * 31;
            h.f.a.m<Integer, RecyclerView, z> mVar = this.f39686d;
            if (mVar != null) {
                i2 = mVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "HolderCreator(factory=" + this.f39683a + ", typeMatcher=" + this.f39684b + ", viewType=" + this.f39685c + ", onAttachedToRecyclerView=" + this.f39686d + ")";
        }

        public /* synthetic */ a(h.f.a.b bVar, h.f.a.b bVar2, int i2) {
            this(bVar, bVar2, i2, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.ViewGroup, ? extends VH> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super androidx.recyclerview.widget.RecyclerView, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h.f.a.b<? super ViewGroup, ? extends VH> bVar, h.f.a.b<? super Integer, Boolean> bVar2, int i2, h.f.a.m<? super Integer, ? super RecyclerView, z> mVar) {
            l.c(bVar, "");
            l.c(bVar2, "");
            this.f39683a = bVar;
            this.f39684b = bVar2;
            this.f39685c = i2;
            this.f39686d = mVar;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.b.g
    public final g<VH> a(h.f.a.b<? super Integer, Boolean> bVar, h.f.a.m<? super Integer, ? super RecyclerView, z> mVar, h.f.a.b<? super ViewGroup, ? extends VH> bVar2) {
        l.c(bVar, "");
        l.c(bVar2, "");
        int size = this.f39682d.size();
        int i2 = this.f39681c;
        this.f39681c = i2 + 1;
        this.f39682d.add(size - 1, new a<>(bVar2, bVar, i2, mVar));
        return this;
    }

    public static void a(VH vh, Object obj, int i2, List<Object> list) {
        l.c(vh, "");
        if (obj != null) {
            vh.b(obj, i2, list);
        }
    }
}
