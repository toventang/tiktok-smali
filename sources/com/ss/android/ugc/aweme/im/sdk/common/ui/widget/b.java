package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.f.g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Locale;

public final class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f102597a;

    /* renamed from: b  reason: collision with root package name */
    private final int f102598b;

    /* renamed from: c  reason: collision with root package name */
    private final int f102599c;

    static {
        Covode.recordClassIndex(65694);
    }

    public b(int i2, int i3, int i4) {
        this.f102597a = i2;
        this.f102598b = i3;
        this.f102599c = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        int d2 = RecyclerView.d(view);
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i2 = Build.VERSION.SDK_INT;
            if (g.a(Locale.getDefault()) == 1) {
                if (d2 == 0) {
                    rect.right = this.f102597a;
                } else {
                    rect.right = this.f102598b;
                }
                if (d2 == itemCount - 1) {
                    rect.left = this.f102599c;
                    return;
                }
                return;
            }
            if (d2 == 0) {
                rect.left = this.f102597a;
            } else {
                rect.left = this.f102598b;
            }
            if (d2 == itemCount - 1) {
                rect.right = this.f102599c;
            }
        }
    }
}
