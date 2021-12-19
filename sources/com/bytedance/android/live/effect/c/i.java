package com.bytedance.android.live.effect.c;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.f;

public final class i extends RecyclerView.h {
    static {
        Covode.recordClassIndex(4954);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        boolean equals;
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.d(view) == 0) {
            if (y.e() == null) {
                equals = false;
            } else {
                equals = f.f30878a.equals(y.e().getResources().getConfiguration().locale.getLanguage());
            }
            if (equals) {
                rect.set(0, 0, y.a(6.0f), 0);
            } else {
                rect.set(y.a(6.0f), 0, 0, 0);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
