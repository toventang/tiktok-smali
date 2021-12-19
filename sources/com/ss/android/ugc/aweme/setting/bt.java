package com.ss.android.ugc.aweme.setting;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.api.b;

public final /* synthetic */ class bt implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f122118a = new bt();

    static {
        Covode.recordClassIndex(80067);
    }

    private bt() {
    }

    @Override // b.g
    public final Object then(i iVar) {
        if (iVar.c()) {
            return null;
        }
        b bVar = (b) iVar.d();
        if (bVar.f79611b == 0 || bVar.f79610a == 0) {
            com.ss.android.ugc.aweme.port.in.g.a().e().setReactDuetSettingCurrent(br.f122115e);
            return null;
        }
        com.ss.android.ugc.aweme.port.in.g.a().e().setReactDuetSettingCurrent(br.f122116f);
        return null;
    }
}
