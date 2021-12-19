package com.ss.android.ugc.aweme.ttep;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class v implements m {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141450a;

    static {
        Covode.recordClassIndex(92380);
    }

    v(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141450a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141450a;
        if (((Boolean) obj).booleanValue() && tTEPEffectPreviewActivity.w) {
            tTEPEffectPreviewActivity.w = false;
            q.a("TTEPEffectPreviewActivity => addFragment by getFrameAvailableEvent");
            tTEPEffectPreviewActivity.f141210h.post(new u(tTEPEffectPreviewActivity));
        }
    }
}
