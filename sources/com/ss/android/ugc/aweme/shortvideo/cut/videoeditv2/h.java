package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

final /* synthetic */ class h implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoEditViewV2 f126264a;

    static {
        Covode.recordClassIndex(82881);
    }

    h(VEVideoEditViewV2 vEVideoEditViewV2) {
        this.f126264a = vEVideoEditViewV2;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126264a.a((VideoSegment) obj);
    }
}
