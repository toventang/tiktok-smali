package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.ss.android.ugc.aweme.im.sdk.chat.b.b.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import h.f.b.l;

public final class j implements i {
    static {
        Covode.recordClassIndex(63912);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.i
    public final e a(String str) {
        l.d(str, "");
        l.d(str, "");
        e eVar = b.f100120a;
        String str2 = null;
        if (eVar != null) {
            str2 = eVar.a();
        }
        if (!l.a((Object) str, (Object) str2) || eVar == null) {
            return e.a.a(str, ReadStateViewModel.f100939b);
        }
        return eVar;
    }
}
