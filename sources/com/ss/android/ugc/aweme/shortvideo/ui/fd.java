package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.d.a.a;

final /* synthetic */ class fd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131752a;

    static {
        Covode.recordClassIndex(86293);
    }

    fd(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131752a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f131752a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(videoRecordNewActivity, videoRecordNewActivity, null, videoRecordNewActivity.x);
        videoRecordNewActivity.F.y();
        defaultGesturePresenter.a(1, new a(videoRecordNewActivity.F.D().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) videoRecordNewActivity.F.G().getLayoutParams())));
    }
}
