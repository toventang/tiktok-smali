package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;

public final class c implements b.e {
    static {
        Covode.recordClassIndex(72209);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        SettingServiceImpl.v().r();
    }
}
