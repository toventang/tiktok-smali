package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.a.a.m;
import h.f.a.b;

public abstract class f implements m {

    /* renamed from: a  reason: collision with root package name */
    public View f39608a;

    /* renamed from: b  reason: collision with root package name */
    public b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f39609b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39610c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.ViewHolder f39611d;

    static {
        Covode.recordClassIndex(24386);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final RecyclerView.ViewHolder b() {
        return this.f39611d;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void d() {
        m.a.a(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final boolean a() {
        return this.f39610c;
    }

    public int c() {
        if (g()) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void a(boolean z) {
        this.f39610c = z;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void a(RecyclerView.ViewHolder viewHolder) {
        View view;
        this.f39611d = viewHolder;
        if (viewHolder != null) {
            view = viewHolder.itemView;
        } else {
            view = null;
        }
        this.f39608a = view;
    }
}
