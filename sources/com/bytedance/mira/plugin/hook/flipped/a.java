package com.bytedance.mira.plugin.hook.flipped;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.mira.plugin.hook.flipped.compat.FlippedV2Impl;
import com.bytedance.mira.plugin.hook.flipped.compat.b;
import com.bytedance.mira.plugin.hook.flipped.compat.c;

public final class a {
    static {
        Covode.recordClassIndex(25327);
    }

    public static void a() {
        c cVar;
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            cVar = new FlippedV2Impl();
        } else if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            cVar = new b();
        } else {
            cVar = new com.bytedance.mira.plugin.hook.flipped.compat.a();
        }
        cVar.a();
    }
}
