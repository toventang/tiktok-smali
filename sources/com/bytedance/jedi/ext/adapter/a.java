package com.bytedance.jedi.ext.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.a.b;
import com.bytedance.jedi.arch.ext.list.a.c;
import com.bytedance.jedi.ext.adapter.b.d;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.b.f;
import h.f.b.l;
import h.z;
import java.util.List;

public abstract class a<T, VH extends e<T>, M extends f<VH>> extends d<VH, M> implements com.bytedance.jedi.arch.ext.list.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.jedi.arch.ext.list.a.e f39569a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f39570b;

    static {
        Covode.recordClassIndex(24366);
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public b<T> a() {
        return this.f39570b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return a().a();
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final T a(int i2) {
        return (T) a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.d
    public final T a(int i2, boolean z) {
        return (T) a.C0960a.a(this, i2, z);
    }

    public a(com.bytedance.jedi.arch.ext.list.a.e eVar, c<T> cVar) {
        l.c(cVar, "");
        this.f39569a = eVar;
        this.f39570b = new b<>(new com.bytedance.jedi.ext.adapter.b.b(this), cVar, eVar);
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final void a(List<? extends T> list, h.f.a.a<z> aVar) {
        l.c(list, "");
        a.C0960a.a(this, list, aVar);
    }
}
