package com.ss.android.ugc.aweme.base.arch;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.c;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.b.f;
import com.bytedance.jedi.ext.adapter.b.g;
import h.f.b.l;
import java.util.List;

public abstract class h<VH extends e<?>, M extends f<VH>> extends com.ss.android.ugc.aweme.common.a.h implements c<VH, M> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67989c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f67990b;

    static {
        Covode.recordClassIndex(41875);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
    }

    /* access modifiers changed from: protected */
    public abstract void a(g<VH> gVar);

    /* access modifiers changed from: protected */
    public abstract Object b(int i2);

    public static final class a {
        static {
            Covode.recordClassIndex(41876);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int d() {
        if (this.f67990b == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public int c(int i2) {
        if (i2 < d()) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        b().a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        b().b(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final /* synthetic */ RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 != Integer.MAX_VALUE) {
            return b().a(viewGroup, i2);
        }
        View view = this.f67990b;
        if (view == null) {
            l.b();
        }
        return new f(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            super.onBindViewHolder(viewHolder, i2, list);
        } else if (getItemViewType(i2) != Integer.MAX_VALUE) {
            b();
            f.a((e) viewHolder, b(i2), i2 - d(), list);
        }
    }
}
