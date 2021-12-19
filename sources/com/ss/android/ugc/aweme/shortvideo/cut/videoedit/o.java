package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoEditView f126185a;

    static {
        Covode.recordClassIndex(82841);
    }

    o(VideoEditView videoEditView) {
        this.f126185a = videoEditView;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126185a.a((e) obj);
    }
}
