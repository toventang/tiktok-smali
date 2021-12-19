package com.ss.android.ugc.aweme.ftc;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98905a;

    static {
        Covode.recordClassIndex(62883);
    }

    t(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98905a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98905a;
        if (((Boolean) obj).booleanValue() && fTCVideoRecordNewActivity.w) {
            fTCVideoRecordNewActivity.w = false;
            q.a("VideoRecordNewActivity => addFragment by getFrameAvailableEvent");
            fTCVideoRecordNewActivity.f97382h.post(new r(fTCVideoRecordNewActivity));
        }
    }
}
