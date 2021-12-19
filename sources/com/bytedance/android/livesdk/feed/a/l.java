package com.bytedance.android.livesdk.feed.a;

import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f17263a;

    static {
        Covode.recordClassIndex(9580);
    }

    l(d dVar) {
        this.f17263a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f17263a;
        Integer num = (Integer) obj;
        if (num != null && dVar.f17231b != null) {
            RecyclerView.i layoutManager = dVar.f17231b.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).a(0, 0);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).a(0, 0);
            }
            dVar.f17232c.g();
            dVar.f17231b.b(num.intValue());
        }
    }
}
