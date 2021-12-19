package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;
import java.util.Objects;

public final class ChatRecyclerView extends RecyclerView {
    private int O;

    static {
        Covode.recordClassIndex(65664);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ ChatRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChatRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int m2;
        View c2;
        super.onLayout(z, i2, i3, i4, i5);
        RecyclerView.i layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && !linearLayoutManager.n && (m2 = linearLayoutManager.m()) >= 0 && (c2 = linearLayoutManager.c(m2)) != null) {
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int i6 = ((RecyclerView.j) layoutParams).topMargin;
            int top = c2.getTop();
            a.c("djjChat", "onLayoutCompleted: top:" + top + " topMar:" + i6);
            if (top > i6 && this.O == 0) {
                int i7 = i6 - top;
                this.O = i7;
                linearLayoutManager.i(i7);
                linearLayoutManager.a(true);
            }
        }
    }
}
