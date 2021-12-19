package com.ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class FixedRecyclerView extends RecyclerView {
    static {
        Covode.recordClassIndex(55062);
    }

    public FixedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ FixedRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FixedRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (!canScrollVertically(-1)) {
            i();
        }
        if (!canScrollVertically(1)) {
            i();
        }
    }
}
