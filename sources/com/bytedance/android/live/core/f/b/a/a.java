package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import com.bytedance.android.live.core.f.ad;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;

public final class a implements c {
    static {
        Covode.recordClassIndex(4620);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        if (ad.b("persist.sys.notchui.enable") == 1) {
            return true;
        }
        return false;
    }
}
