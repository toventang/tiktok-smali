package com.bytedance.jedi.ext.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.c;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.internal.g;
import h.f.a.b;
import h.f.b.l;
import h.v;
import java.util.List;

/* JADX WARN: Incorrect field signature: TT; */
public final class d<T extends RecyclerView.a<?> & c<?, ? extends i<?>>> implements u {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.a f39689a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Integer, Integer> f39690b;

    static {
        Covode.recordClassIndex(24454);
    }

    private final com.bytedance.jedi.ext.adapter.internal.b a() {
        return ((i) ((c) this.f39689a).b()).f39711a.f39744b;
    }

    private final g b() {
        return ((i) ((c) this.f39689a).b()).f39711a.f39745c;
    }

    private final com.bytedance.jedi.ext.adapter.internal.a c() {
        return ((c) this.f39689a).b().f39680b;
    }

    public /* synthetic */ d(RecyclerView.a aVar) {
        this(aVar, AnonymousClass1.f39691a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T extends androidx.recyclerview.widget.RecyclerView$a<?> & com.bytedance.jedi.ext.adapter.b.c<?, ? extends com.bytedance.jedi.ext.adapter.i<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(T t, b<? super Integer, Integer> bVar) {
        l.c(t, "");
        l.c(bVar, "");
        this.f39689a = t;
        this.f39690b = bVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        if (i3 != 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                a().a(i5, false);
                b().a(i5, null);
            }
            c().a();
            int intValue = this.f39690b.invoke(Integer.valueOf(i2)).intValue();
            this.f39689a.notifyItemRangeInserted(intValue, i3);
            c().a(intValue);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        JediViewHolderProxy remove;
        if (i3 != 0) {
            com.bytedance.jedi.ext.adapter.internal.b a2 = a();
            if (i2 != 0 || i3 < a2.f39728a.size()) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (i2 < a2.f39728a.size()) {
                        a2.f39728a.remove(i2);
                    }
                    g b2 = b();
                    if (i2 < b2.f39748a.size() && (remove = b2.f39748a.remove(i2)) != null) {
                        b2.f39749b.b(remove);
                    }
                }
                this.f39689a.notifyItemRangeRemoved(this.f39690b.invoke(Integer.valueOf(i2)).intValue(), i3);
                return;
            }
            a2.a();
            b().a();
            this.f39689a.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        List<Boolean> list = a().f39728a;
        if (i2 < list.size() && i3 < list.size()) {
            boolean booleanValue = list.get(i2).booleanValue();
            list.set(i2, list.get(i3));
            list.set(i3, Boolean.valueOf(booleanValue));
        }
        List<JediViewHolderProxy> list2 = b().f39748a;
        if (i2 < list2.size() && i3 < list2.size()) {
            JediViewHolderProxy jediViewHolderProxy = list2.get(i2);
            list2.set(i2, list2.get(i3));
            list2.set(i3, jediViewHolderProxy);
        }
        this.f39689a.notifyItemMoved(this.f39690b.invoke(Integer.valueOf(i2)).intValue(), this.f39690b.invoke(Integer.valueOf(i3)).intValue());
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        this.f39689a.notifyItemRangeChanged(this.f39690b.invoke(Integer.valueOf(i2)).intValue(), i3, v.a(obj, e.f39692a));
    }
}
