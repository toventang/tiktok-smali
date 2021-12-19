package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class fo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131764a;

    static {
        Covode.recordClassIndex(86304);
    }

    fo(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131764a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f131764a;
        if (videoRecordNewActivity.y) {
            videoRecordNewActivity.y = false;
            q.a("VideoRecordNewActivity => addFragment by postDelay");
            videoRecordNewActivity.o();
            videoRecordNewActivity.n();
        }
    }
}
