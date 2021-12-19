package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import com.bytedance.android.live.core.f.ad;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;

public final class h implements c {
    static {
        Covode.recordClassIndex(4627);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        if (ad.b("ro.miui.notch") == 1) {
            return true;
        }
        return false;
    }
}
