package com.ss.android.ugc.aweme.discover.helper;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import h.f.b.l;
import java.util.Objects;

public final class q extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private int f81165a;

    /* renamed from: b  reason: collision with root package name */
    private final int f81166b;

    static {
        Covode.recordClassIndex(50448);
    }

    public q() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(d.a());
        l.b(viewConfiguration, "");
        this.f81166b = viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
        if (i2 == 0) {
            a(recyclerView, true);
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f81165a = ((LinearLayoutManager) layoutManager).k();
        }
    }

    public static void a(RecyclerView recyclerView, boolean z) {
        TrendingTopicViewHolder trendingTopicViewHolder;
        int adapterPosition;
        l.d(recyclerView, "");
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int k2 = linearLayoutManager.k();
        int m2 = linearLayoutManager.m();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
            if (a2 instanceof TrendingTopicViewHolder) {
                if (!z || k2 > (adapterPosition = (trendingTopicViewHolder = (TrendingTopicViewHolder) a2).getAdapterPosition()) || m2 < adapterPosition) {
                    ((TrendingTopicViewHolder) a2).o();
                } else {
                    trendingTopicViewHolder.n();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        l.d(recyclerView, "");
        if (Math.abs(i3) <= this.f81166b) {
            a(recyclerView, true);
        }
    }
}
