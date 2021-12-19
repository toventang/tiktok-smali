package com.bytedance.jedi.ext.adapter.b;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.c;
import h.f.b.l;

/* JADX WARN: Incorrect field signature: TT; */
public final class b<T extends RecyclerView.a<?> & c<?, ? extends f<?>>> implements u {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.a f39670a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.b<Integer, Integer> f39671b;

    static {
        Covode.recordClassIndex(24439);
    }

    private final com.bytedance.jedi.ext.adapter.internal.a a() {
        return ((c) this.f39670a).b().f39680b;
    }

    public /* synthetic */ b(RecyclerView.a aVar) {
        this(aVar, AnonymousClass1.f39672a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T extends androidx.recyclerview.widget.RecyclerView$a<?> & com.bytedance.jedi.ext.adapter.b.c<?, ? extends com.bytedance.jedi.ext.adapter.b.f<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    private b(T t, h.f.a.b<? super Integer, Integer> bVar) {
        l.c(t, "");
        l.c(bVar, "");
        this.f39670a = t;
        this.f39671b = bVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        if (i3 != 0) {
            this.f39670a.notifyItemRangeRemoved(this.f39671b.invoke(Integer.valueOf(i2)).intValue(), i3);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        if (i3 != 0) {
            a().a();
            int intValue = this.f39671b.invoke(Integer.valueOf(i2)).intValue();
            this.f39670a.notifyItemRangeInserted(intValue, i3);
            a().a(intValue);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        this.f39670a.notifyItemMoved(this.f39671b.invoke(Integer.valueOf(i2)).intValue(), this.f39671b.invoke(Integer.valueOf(i3)).intValue());
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        this.f39670a.notifyItemRangeChanged(this.f39671b.invoke(Integer.valueOf(i2)).intValue(), i3, obj);
    }
}
