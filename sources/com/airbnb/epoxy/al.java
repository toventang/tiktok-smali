package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedList;
import java.util.Queue;

public final class al extends RecyclerView.RecycledViewPool {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Queue<RecyclerView.ViewHolder>> f5009a = new SparseArray<>();

    static {
        Covode.recordClassIndex(2113);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void clear() {
        this.f5009a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i2) {
        Queue<RecyclerView.ViewHolder> queue = this.f5009a.get(i2);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        l.c(viewHolder, "");
        int itemViewType = viewHolder.getItemViewType();
        Queue<RecyclerView.ViewHolder> queue = this.f5009a.get(itemViewType);
        if (queue == null) {
            queue = new LinkedList<>();
            this.f5009a.put(itemViewType, queue);
        }
        queue.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void setMaxRecycledViews(int i2, int i3) {
        throw new UnsupportedOperationException("UnboundedViewPool does not support setting a maximum number of recycled views");
    }
}
