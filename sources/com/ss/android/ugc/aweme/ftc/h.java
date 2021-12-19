package com.ss.android.ugc.aweme.ftc;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.d.a.a;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98525a;

    static {
        Covode.recordClassIndex(62647);
    }

    h(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98525a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98525a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity, null, fTCVideoRecordNewActivity.v);
        fTCVideoRecordNewActivity.A.y();
        defaultGesturePresenter.a(1, new a(fTCVideoRecordNewActivity.A.D().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) fTCVideoRecordNewActivity.A.G().getLayoutParams())));
    }
}
