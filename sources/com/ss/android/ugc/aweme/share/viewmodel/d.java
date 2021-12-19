package com.ss.android.ugc.aweme.share.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends ad.d {

    /* renamed from: b  reason: collision with root package name */
    public FeedPanelStateViewModel f124423b;

    static {
        Covode.recordClassIndex(81688);
    }

    @Override // androidx.lifecycle.ad.d, androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        if (!l.a(FeedPanelStateViewModel.class, cls)) {
            return (T) super.a(cls);
        }
        if (this.f124423b == null) {
            this.f124423b = (FeedPanelStateViewModel) super.a(cls);
        }
        return this.f124423b;
    }
}
