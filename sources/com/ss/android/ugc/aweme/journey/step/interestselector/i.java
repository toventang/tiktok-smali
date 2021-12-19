package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f105119a;

    static {
        Covode.recordClassIndex(67404);
    }

    public i(int i2) {
        this.f105119a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        rect.bottom = this.f105119a;
        if (RecyclerView.d(view) == 0) {
            rect.top = this.f105119a;
        }
    }
}
