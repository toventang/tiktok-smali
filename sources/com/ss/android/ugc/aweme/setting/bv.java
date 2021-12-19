package com.ss.android.ugc.aweme.setting;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.detail.api.b;

public final /* synthetic */ class bv implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f122120a = new bv();

    static {
        Covode.recordClassIndex(80069);
    }

    private bv() {
    }

    @Override // b.g
    public final Object then(i iVar) {
        if (iVar.c()) {
            return null;
        }
        b bVar = (b) iVar.d();
        if (bVar.f79611b == 0 || bVar.f79610a == 0) {
            Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", br.f122115e);
            return null;
        }
        Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", br.f122116f);
        return null;
    }
}
