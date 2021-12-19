package com.ss.android.ugc.aweme.sticker.f;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.b.c;
import com.ss.android.ugc.aweme.sticker.d.b.d;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(88146);
    }

    public static final d a(com.ss.android.ugc.aweme.sticker.d.b.a aVar) {
        l.d(aVar, "");
        return new d(aVar);
    }

    public static /* synthetic */ c a(Effect effect, int i2, com.ss.android.ugc.aweme.sticker.d.b.a aVar, Effect effect2, Bundle bundle, c.a aVar2, c.b bVar, int i3, boolean z, int i4) {
        boolean z2 = z;
        int i5 = i3;
        c.a aVar3 = aVar2;
        int i6 = i2;
        Effect effect3 = effect2;
        com.ss.android.ugc.aweme.sticker.d.b.a aVar4 = aVar;
        Bundle bundle2 = bundle;
        if ((i4 & 1) != 0) {
            i6 = -1;
        }
        if ((i4 & 2) != 0) {
            aVar4 = com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK;
        }
        c.b bVar2 = null;
        if ((i4 & 4) != 0) {
            effect3 = null;
        }
        if ((i4 & 8) != 0) {
            bundle2 = null;
        }
        if ((i4 & 16) != 0) {
            aVar3 = null;
        }
        if ((i4 & 32) == 0) {
            bVar2 = bVar;
        }
        if ((i4 & 64) != 0) {
            i5 = Integer.MIN_VALUE;
        }
        if ((i4 & 128) != 0) {
            z2 = true;
        }
        l.d(effect, "");
        l.d(aVar4, "");
        return new com.ss.android.ugc.aweme.sticker.d.b.c(effect, i6, aVar4, effect3, bundle2, aVar3, bVar2, i5, z2);
    }
}
