package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;

public class ScrollOffsetLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f97131a = new SparseIntArray();

    static {
        Covode.recordClassIndex(61715);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.s sVar) {
        super.a(sVar);
        int s = s();
        for (int i2 = 0; i2 < s; i2++) {
            View g2 = g(i2);
            if (g2 != null) {
                this.f97131a.put(i2, g2.getHeight());
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        int i2;
        if (s() == 0) {
            return 0;
        }
        try {
            int k2 = k();
            int i3 = -((int) c(k2).getY());
            for (int i4 = 0; i4 < k2; i4++) {
                if (this.f97131a.indexOfKey(i4) >= 0) {
                    i2 = 0;
                } else {
                    i2 = this.f97131a.get(i4);
                }
                i3 += i2;
            }
            return i3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public ScrollOffsetLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
