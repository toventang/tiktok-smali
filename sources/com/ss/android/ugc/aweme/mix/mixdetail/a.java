package com.ss.android.ugc.aweme.mix.mixdetail;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends RecyclerView.h {
    static {
        Covode.recordClassIndex(70493);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.d(view) == 0) {
            rect.set(0, (int) n.b(view.getContext(), 8.0f), 0, 0);
        }
    }
}
