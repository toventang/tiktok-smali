package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.c;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r;
import com.ss.android.ugc.playerkit.d.d;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import h.f.b.l;
import java.util.List;

public final class q implements b {
    static {
        Covode.recordClassIndex(87373);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.c
    public final void a(int i2, int i3, e.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean b(int i2, int i3, e eVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean a(int i2, int i3, e eVar) {
        if (eVar != null && eVar.f115340f) {
            return false;
        }
        r rVar = r.a.f133571a;
        l.a((Object) rVar, "");
        if (rVar.a() == null || eVar == null) {
            r rVar2 = r.a.f133571a;
            l.a((Object) rVar2, "");
            rVar2.a();
            return false;
        }
        i a2 = d.a(eVar);
        if (a2 == null) {
            return false;
        }
        c a3 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a3, "");
        ISimKitConfig b2 = a3.b();
        l.a((Object) b2, "");
        b2.getCommonConfig().onPreGetProperBitrate(a2);
        if (eVar.f115342h == null) {
            return false;
        }
        List<e.a> list = eVar.f115342h;
        l.a((Object) list, "");
        int i4 = 0;
        if (list != null) {
            while (i4 < list.size()) {
                if (list.get(i4) == null) {
                    list.remove(i4);
                } else {
                    i4++;
                }
            }
        }
        list.size();
        return false;
    }
}
