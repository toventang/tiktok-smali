package com.bytedance.android.livesdk.feed.k;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

public final class b extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private String f17587a;

    static {
        Covode.recordClassIndex(9734);
    }

    public b(String str) {
        this.f17587a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 != 0) {
            LivePerformanceManager.getInstance().monitorPerformance(this.f17587a);
        }
    }
}
