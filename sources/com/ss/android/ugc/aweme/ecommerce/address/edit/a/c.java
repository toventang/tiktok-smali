package com.ss.android.ugc.aweme.ecommerce.address.edit.a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f84410a;

    /* renamed from: b  reason: collision with root package name */
    private final int f84411b;

    static {
        Covode.recordClassIndex(52673);
    }

    public c(int i2, int i3) {
        this.f84410a = i2;
        this.f84411b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (RecyclerView.e(view) == 0) {
            rect.left = this.f84411b;
            rect.right = this.f84410a / 2;
            return;
        }
        int e2 = RecyclerView.e(view);
        l.b(adapter, "");
        if (e2 == adapter.getItemCount() - 1) {
            rect.left = this.f84410a / 2;
            rect.right = this.f84411b;
            return;
        }
        rect.left = this.f84410a / 2;
        rect.right = this.f84410a / 2;
    }
}
