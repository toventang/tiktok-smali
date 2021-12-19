package com.bytedance.android.livesdk.chatroom.ui.b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends RecyclerView.h {
    static {
        Covode.recordClassIndex(8811);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.set(24, 0, 24, y.a(2.0f));
    }
}
