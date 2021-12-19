package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public int f89404a;

    static {
        Covode.recordClassIndex(56178);
    }

    private /* synthetic */ m() {
        this(0);
    }

    public m(int i2) {
        this.f89404a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.left = this.f89404a;
        rect.right = this.f89404a;
    }
}
