package com.bytedance.jedi.ext.adapter.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.a.a.r;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f39724a = true;

    /* renamed from: b  reason: collision with root package name */
    public final r f39725b = new r((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public h f39726c;

    /* renamed from: d  reason: collision with root package name */
    private int f39727d = -241;

    static {
        Covode.recordClassIndex(24474);
    }

    public final void a() {
        RecyclerView recyclerView;
        if (this.f39724a && (recyclerView = this.f39725b.f39649a) != null) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f39727d = ((LinearLayoutManager) layoutManager).k();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                this.f39727d = staggeredGridLayoutManager.a(new int[staggeredGridLayoutManager.f3896a])[0];
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39725b.b(recyclerView);
        this.f39726c = null;
    }

    public final void a(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39725b.a(recyclerView);
        this.f39726c = new h();
    }

    public final void a(int i2) {
        RecyclerView recyclerView;
        int i3;
        if (this.f39724a && (recyclerView = this.f39725b.f39649a) != null && (i3 = this.f39727d) != -241 && i3 >= i2) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                layoutManager.e(this.f39727d);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                layoutManager.e(this.f39727d);
            }
        }
    }
}
