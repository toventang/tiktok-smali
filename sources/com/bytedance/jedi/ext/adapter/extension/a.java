package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.c;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.extension.a;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.u;
import h.z;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T, BUILDER extends a<T, BUILDER, VH>, VH extends e<T>> {

    /* renamed from: a  reason: collision with root package name */
    public e.b f39697a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.jedi.arch.ext.list.a.e f39698b;

    /* renamed from: c  reason: collision with root package name */
    public final List<u<b<ViewGroup, VH>, m<Integer, Object, Boolean>, m<Integer, RecyclerView, z>>> f39699c;

    /* renamed from: d  reason: collision with root package name */
    public final c<T> f39700d;

    static {
        Covode.recordClassIndex(24459);
    }

    private a(c<T> cVar) {
        this.f39700d = cVar;
        this.f39699c = new ArrayList();
    }

    public /* synthetic */ a(c cVar, byte b2) {
        this(cVar);
    }

    public final BUILDER a(m<? super Integer, Object, Boolean> mVar, m<? super Integer, ? super RecyclerView, z> mVar2, b<? super ViewGroup, ? extends VH> bVar) {
        l.c(mVar, "");
        l.c(bVar, "");
        this.f39699c.add(new u<>(bVar, mVar, mVar2));
        return this;
    }
}
