package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.c;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements d {

    /* renamed from: a  reason: collision with root package name */
    private final i f143943a;

    static {
        Covode.recordClassIndex(94170);
    }

    t(i iVar) {
        this.f143943a = iVar;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        Integer valueOf;
        i iVar = this.f143943a;
        int i2 = -1;
        if (iVar != null) {
            c hitBitrate = iVar.getHitBitrate();
            if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                valueOf = -1;
            }
            i2 = valueOf.intValue();
        }
        return Integer.valueOf(i2);
    }
}
