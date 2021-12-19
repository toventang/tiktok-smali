package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.utility.reflect.b;
import com.bytedance.covode.number.Covode;

public final class g implements c {
    static {
        Covode.recordClassIndex(4626);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        try {
            return ((Boolean) Reflect.on("android.util.FtFeature").call("isFeatureSupport", new Class[]{Integer.class}, 32).get()).booleanValue();
        } catch (b unused) {
            return false;
        }
    }
}
