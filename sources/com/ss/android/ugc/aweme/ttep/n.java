package com.ss.android.ugc.aweme.ttep;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141348a;

    static {
        Covode.recordClassIndex(92314);
    }

    n(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141348a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141348a;
        if (tTEPEffectPreviewActivity.w) {
            tTEPEffectPreviewActivity.w = false;
            q.a("TTEPEffectPreviewActivity => addFragment by postDelay");
            tTEPEffectPreviewActivity.o();
            tTEPEffectPreviewActivity.n();
        }
    }
}
