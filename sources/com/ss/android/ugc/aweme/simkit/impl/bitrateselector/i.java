package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.d;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.session.a;
import com.ss.android.ugc.playerkit.videoview.a.d;

public final class i implements b {
    static {
        Covode.recordClassIndex(87365);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean a(int i2, int i3, e eVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean b(int i2, int i3, e eVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.c
    public final void a(int i2, int i3, e.a aVar) {
        if (aVar != null && !aVar.q) {
            Session c2 = a.f148854a.c(aVar.n);
            if (c2 != null) {
                c2.sourceId = aVar.n;
                c2.speed = aVar.o;
                c2.bitrate = aVar.f115348a;
                c2.calcBitrate = aVar.r;
            }
            if (aVar.n != null) {
                a aVar2 = a.f148854a;
                String str = aVar.n;
                d dVar = new d();
                dVar.f148914e = aVar.t;
                dVar.f145550d = aVar.r;
                dVar.f145549c = aVar.s;
                dVar.f145547a = new d.a.C3461a(aVar);
                aVar2.a(str, dVar);
            }
            a.f148854a.a(aVar.f115352e, aVar.f115354g);
        }
    }
}
