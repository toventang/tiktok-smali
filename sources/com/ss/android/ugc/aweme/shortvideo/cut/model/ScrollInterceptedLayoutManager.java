package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;

public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f125476a = true;

    static {
        Covode.recordClassIndex(82357);
    }

    public ScrollInterceptedLayoutManager() {
        super(0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        if (!super.f() || !this.f125476a) {
            return false;
        }
        return true;
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
