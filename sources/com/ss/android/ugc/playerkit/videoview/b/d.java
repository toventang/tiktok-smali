package com.ss.android.ugc.playerkit.videoview.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.a.h;
import com.ss.android.ugc.aweme.player.sdk.a.i;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.playerkit.model.m;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static d f148916a = new d();

    /* renamed from: b  reason: collision with root package name */
    private l f148917b;

    /* renamed from: c  reason: collision with root package name */
    private m.e f148918c;

    static {
        Covode.recordClassIndex(98060);
    }

    public final synchronized l a(m.e eVar) {
        l lVar;
        MethodCollector.i(2004);
        if (this.f148917b == null) {
            this.f148918c = eVar;
            this.f148917b = new h(new i(eVar));
        } else {
            m.e eVar2 = this.f148918c;
            if (eVar2 != null && !eVar2.equals(eVar)) {
                this.f148917b.g();
                this.f148918c = eVar;
                this.f148917b = new h(new i(eVar));
            }
        }
        lVar = this.f148917b;
        MethodCollector.o(2004);
        return lVar;
    }
}
