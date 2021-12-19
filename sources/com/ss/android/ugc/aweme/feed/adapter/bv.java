package com.ss.android.ugc.aweme.feed.adapter;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bv implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91724a;

    static {
        Covode.recordClassIndex(57751);
    }

    bv(VideoViewCell videoViewCell) {
        this.f91724a = videoViewCell;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f91724a.av = true;
    }
}
