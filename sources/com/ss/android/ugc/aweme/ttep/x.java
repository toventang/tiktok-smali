package com.ss.android.ugc.aweme.ttep;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class x implements m {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141452a;

    static {
        Covode.recordClassIndex(92382);
    }

    x(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141452a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141452a;
        i K = tTEPEffectPreviewActivity.C.K();
        if (tTEPEffectPreviewActivity.f141209g != null) {
            r.a("choose_speed_mode", new b().a("creation_id", tTEPEffectPreviewActivity.f141209g.q).a("shoot_way", tTEPEffectPreviewActivity.f141209g.r).a("draft_id", tTEPEffectPreviewActivity.f141209g.C).a("speed_mode", K.description()).f149193a);
        }
    }
}
