package com.ss.android.ugc.aweme.ttep;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.shortvideo.n.b;

final /* synthetic */ class z implements u {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141454a;

    static {
        Covode.recordClassIndex(92384);
    }

    z(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141454a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141454a;
        a aVar = (a) obj;
        if (aVar != null && aVar.f69569b == a.EnumC1574a.SUCCESS && aVar.f69568a != null) {
            int intValue = ((Integer) aVar.f69568a.getSecond()).intValue();
            if (tTEPEffectPreviewActivity.s != null && tTEPEffectPreviewActivity.f141207e.getValue().b(com.ss.android.ugc.aweme.shortvideo.n.a.class) != null) {
                ((com.ss.android.ugc.aweme.shortvideo.n.a) tTEPEffectPreviewActivity.f141207e.getValue().b(com.ss.android.ugc.aweme.shortvideo.n.a.class)).a(b.f129514c.f129516a, intValue);
            }
        }
    }
}
