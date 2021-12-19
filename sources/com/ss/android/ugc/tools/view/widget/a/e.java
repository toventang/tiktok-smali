package com.ss.android.ugc.tools.view.widget.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class e extends RecyclerView.a<RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(98893);
    }

    public int a(int i2, GridLayoutManager gridLayoutManager) {
        l.d(gridLayoutManager, "");
        return 1;
    }

    public static final class a extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f150347e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView.i f150348f;

        static {
            Covode.recordClassIndex(98894);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            return this.f150347e.a(i2, (GridLayoutManager) this.f150348f);
        }

        a(e eVar, RecyclerView.i iVar) {
            this.f150347e = eVar;
            this.f150348f = iVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).a(new a(this, layoutManager));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == -2147483646) {
                z = true;
            } else {
                z = false;
            }
            bVar.f3934b = z;
        }
    }
}
