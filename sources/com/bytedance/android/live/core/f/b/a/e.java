package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;

public final class e implements c {
    static {
        Covode.recordClassIndex(4624);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
