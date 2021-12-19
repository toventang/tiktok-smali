package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class fy implements m {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131774a;

    static {
        Covode.recordClassIndex(86314);
    }

    fy(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131774a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131774a;
        if (((Boolean) obj).booleanValue() && videoRecordNewActivity.y) {
            videoRecordNewActivity.y = false;
            q.a("VideoRecordNewActivity => addFragment by getFrameAvailableEvent");
            videoRecordNewActivity.f131229h.post(new fx(videoRecordNewActivity));
        }
    }
}
