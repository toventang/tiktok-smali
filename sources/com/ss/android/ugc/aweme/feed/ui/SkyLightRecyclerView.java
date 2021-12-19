package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SkyLightRecyclerView extends RecyclerView {
    static {
        Covode.recordClassIndex(59831);
    }

    public final boolean canScrollHorizontally(int i2) {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkyLightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }
}
