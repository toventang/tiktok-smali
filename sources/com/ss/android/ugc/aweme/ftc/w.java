package com.ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98908a;

    static {
        Covode.recordClassIndex(62886);
    }

    w(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98908a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98908a;
        if (fTCVideoRecordNewActivity.n() != null) {
            fTCVideoRecordNewActivity.n().a(true);
        }
    }
}
