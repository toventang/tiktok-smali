package com.bytedance.jedi.ext.adapter.a.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;

public final class k extends f {

    /* renamed from: c  reason: collision with root package name */
    public int f39630c = 16121856;

    static {
        Covode.recordClassIndex(24393);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final int e() {
        return this.f39630c;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final boolean g() {
        if (this.f39609b != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void a(int i2) {
        this.f39630c = i2;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar = this.f39609b;
        if (bVar == null) {
            l.a();
        }
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) bVar.invoke(viewGroup);
        a(viewHolder);
        return viewHolder;
    }
}
