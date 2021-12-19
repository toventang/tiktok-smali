package com.bytedance.android.livesdk.feed.drawerfeed;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.i.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final l f17420a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.ViewHolder f17421b;

    static {
        Covode.recordClassIndex(9657);
    }

    s(l lVar, RecyclerView.ViewHolder viewHolder) {
        this.f17420a = lVar;
        this.f17421b = viewHolder;
    }

    public final void run() {
        l lVar = this.f17420a;
        RecyclerView.ViewHolder viewHolder = this.f17421b;
        if (lVar.getUserVisibleHint() && lVar.isResumed()) {
            ((a) viewHolder).d();
        }
    }
}
