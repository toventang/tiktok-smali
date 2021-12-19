package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoEditView f126182a;

    static {
        Covode.recordClassIndex(82838);
    }

    l(VideoEditView videoEditView) {
        this.f126182a = videoEditView;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126182a.a(((Float) obj).floatValue());
    }
}
