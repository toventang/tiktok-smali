package com.ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98904a;

    static {
        Covode.recordClassIndex(62882);
    }

    s(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98904a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98904a;
        if (fTCVideoRecordNewActivity.w) {
            fTCVideoRecordNewActivity.w = false;
            q.a("VideoRecordNewActivity => addFragment by postDelay");
            fTCVideoRecordNewActivity.k();
            fTCVideoRecordNewActivity.j();
        }
    }
}
