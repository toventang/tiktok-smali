package com.ss.android.ugc.tiktok.security.a;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(98156);
    }

    public static void a(Intent intent, Object obj) {
        intent.putExtra("key_calling_context", obj.getClass().getName());
    }
}
