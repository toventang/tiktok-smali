package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoEditView f126184a;

    static {
        Covode.recordClassIndex(82840);
    }

    n(VideoEditView videoEditView) {
        this.f126184a = videoEditView;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126184a.a((VideoSegment) obj);
    }
}
