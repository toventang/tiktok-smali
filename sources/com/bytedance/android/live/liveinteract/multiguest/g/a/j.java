package com.bytedance.android.live.liveinteract.multiguest.g.a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

public final class j extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private static int f11232a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static int f11233b = -1;

    static {
        Covode.recordClassIndex(6039);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        Context context = recyclerView.getContext();
        if (f11232a <= 0) {
            f11232a = (int) n.b(context, 4.0f);
            f11233b = (int) n.b(context, 4.0f);
        }
        int e2 = RecyclerView.e(view);
        if (e2 == 0) {
            rect.set(f11232a, 0, f11233b, 0);
        } else if (recyclerView.getAdapter().getItemCount() - 1 == e2) {
            rect.set(f11233b, 0, f11232a, 0);
        } else {
            int i2 = f11233b;
            rect.set(i2, 0, i2, 0);
        }
    }
}
