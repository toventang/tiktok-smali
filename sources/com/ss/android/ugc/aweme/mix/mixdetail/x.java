package com.ss.android.ugc.aweme.mix.mixdetail;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mix.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;

public final class x extends n.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f110162d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f110163a;

    /* renamed from: b  reason: collision with root package name */
    public PowerList f110164b;

    /* renamed from: c  reason: collision with root package name */
    public b f110165c;

    static {
        Covode.recordClassIndex(70702);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean b() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70703);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean a() {
        return this.f110163a;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (i2 != 0 && (viewHolder instanceof w)) {
            ((w) viewHolder).a();
        }
        super.a(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            return n.a.b(15, 0);
        }
        return n.a.b(3, 48);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        super.d(recyclerView, viewHolder);
        View view = viewHolder.itemView;
        l.b(view, "");
        view.setAlpha(1.0f);
        if (viewHolder instanceof w) {
            ((w) viewHolder).b();
        }
    }

    public x(PowerList powerList, b bVar, boolean z) {
        l.d(powerList, "");
        l.d(bVar, "");
        this.f110164b = powerList;
        this.f110165c = bVar;
        this.f110163a = z;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        int headerCount = this.f110164b.getHeaderCount();
        int adapterPosition = viewHolder.getAdapterPosition() - headerCount;
        int adapterPosition2 = viewHolder2.getAdapterPosition() - headerCount;
        viewHolder.getAdapterPosition();
        viewHolder2.getAdapterPosition();
        this.f110165c.a(adapterPosition, adapterPosition2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f110164b.getState().c());
        Collections.swap(arrayList, adapterPosition, adapterPosition2);
        this.f110164b.getState().c(arrayList);
        RecyclerView.a adapter = this.f110164b.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        String a2 = this.f110165c.a();
        String b2 = this.f110165c.b();
        l.d(a2, "");
        l.d(b2, "");
        r.a("reorder_playlist", new d().a("enter_from", a2).a("enter_method", b2).f66730a);
        return true;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        if (i2 == 1) {
            float abs = Math.abs(f2);
            View view = viewHolder.itemView;
            l.b(view, "");
            View view2 = viewHolder.itemView;
            l.b(view2, "");
            view2.setAlpha(1.0f - (abs / ((float) view.getWidth())));
            View view3 = viewHolder.itemView;
            l.b(view3, "");
            view3.setTranslationX(f2);
            return;
        }
        super.a(canvas, recyclerView, viewHolder, f2, f3, i2, z);
    }
}
