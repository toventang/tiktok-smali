package com.ss.android.ugc.aweme.sticker.o.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bc;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.h;
import h.f.b.l;

public final class a implements bc {
    static {
        Covode.recordClassIndex(88259);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bc
    public final void b(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.port.in.bc
    public final h a(String str) {
        l.d(str, "");
        return PropReuseServiceImpl.c().a(str);
    }
}
