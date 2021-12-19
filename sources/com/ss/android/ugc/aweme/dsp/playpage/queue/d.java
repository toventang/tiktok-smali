package com.ss.android.ugc.aweme.dsp.playpage.queue;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;

public final class d extends RecyclerView.h {
    static {
        Covode.recordClassIndex(52336);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
        int i3;
        RecyclerView.a adapter;
        Integer valueOf;
        l.d(rect, "");
        l.d(recyclerView, "");
        RecyclerView.a adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            i3 = adapter2.getItemCount();
        } else {
            i3 = 0;
        }
        if (i2 < i3 && (adapter = recyclerView.getAdapter()) != null && (valueOf = Integer.valueOf(adapter.getItemViewType(i2))) != null) {
            if (valueOf.intValue() == 100) {
                rect.left = n.a(16.0d);
                rect.right = n.a(16.0d);
                rect.top = n.a(24.0d);
                rect.bottom = n.a(10.0d);
            } else if (valueOf.intValue() == 101) {
                rect.left = n.a(16.0d);
                rect.right = n.a(16.0d);
                rect.top = n.a(14.0d);
                rect.bottom = n.a(10.0d);
            } else if (valueOf.intValue() == 102) {
                rect.left = n.a(16.0d);
                rect.right = n.a(16.0d);
                rect.top = n.a(20.0d);
                rect.bottom = n.a(10.0d);
            } else if (valueOf.intValue() == 103) {
                rect.left = n.a(16.0d);
                rect.right = n.a(16.0d);
                rect.top = n.a(10.0d);
                rect.bottom = n.a(10.0d);
            } else if (valueOf.intValue() == 104) {
                rect.left = n.a(16.0d);
                rect.right = n.a(16.0d);
                rect.top = n.a(26.0d);
                rect.bottom = n.a(35.0d);
            }
        }
    }
}
