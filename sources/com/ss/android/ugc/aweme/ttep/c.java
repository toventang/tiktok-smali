package com.ss.android.ugc.aweme.ttep;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.d.a.a;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141331a;

    static {
        Covode.recordClassIndex(92296);
    }

    c(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141331a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141331a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(tTEPEffectPreviewActivity, tTEPEffectPreviewActivity, null, tTEPEffectPreviewActivity.v);
        tTEPEffectPreviewActivity.C.y();
        defaultGesturePresenter.a(1, new a(tTEPEffectPreviewActivity.C.D().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) tTEPEffectPreviewActivity.f141213k.getLayoutParams())));
    }
}
