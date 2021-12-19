package com.ss.android.ugc.aweme.ttep;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;

final /* synthetic */ class i implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141343a;

    static {
        Covode.recordClassIndex(92309);
    }

    i(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141343a = tTEPEffectPreviewActivity;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
    public final void a(d dVar) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141343a;
        if (dVar != null) {
            if (tTEPEffectPreviewActivity.z != null) {
                tTEPEffectPreviewActivity.z.a(true);
            }
            tTEPEffectPreviewActivity.f141209g.aw = k.a(dVar);
        }
    }
}
