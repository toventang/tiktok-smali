package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import java.util.ArrayList;
import java.util.List;

public final class l implements b {
    static {
        Covode.recordClassIndex(87368);
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
        if (!(eVar == null || eVar.f115340f || eVar.f115342h == null || !com.ss.android.ugc.playerkit.exp.b.b() || eVar.f115342h.size() <= 0)) {
            eVar.f115342h.size();
            ArrayList arrayList = new ArrayList();
            List<e.a> list = eVar.f115342h;
            h.f.b.l.a((Object) list, "");
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e.a aVar = eVar.f115342h.get(i4);
                if (com.ss.android.ugc.aweme.simkit.model.b.b.a(aVar.f115350c, aVar.f115349b) <= 540) {
                    h.f.b.l.a((Object) aVar, "");
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() != 0) {
                eVar.f115342h = arrayList;
            }
            eVar.f115342h.size();
        }
        return false;
    }
}
