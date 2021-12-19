package com.ss.android.ugc.aweme.dsp.library;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;

public final class h extends RecyclerView.h {
    static {
        Covode.recordClassIndex(52003);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (RecyclerView.d(view) == 0) {
            rect.left = n.a(16.0d);
            rect.right = n.a(16.0d);
            rect.top = n.a(28.0d);
            rect.bottom = n.a(13.0d);
            return;
        }
        rect.left = n.a(16.0d);
        rect.right = n.a(16.0d);
        rect.top = n.a(10.0d);
        rect.bottom = n.a(10.0d);
    }
}
