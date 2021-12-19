package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoEditView f126181a;

    static {
        Covode.recordClassIndex(82837);
    }

    k(VideoEditView videoEditView) {
        this.f126181a = videoEditView;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126181a.a((Long) obj);
    }
}
