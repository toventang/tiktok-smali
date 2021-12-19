package com.bytedance.platform.a.b.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.b.c.a.b;

public final class a implements b {
    static {
        Covode.recordClassIndex(25584);
    }

    @Override // com.bytedance.platform.a.b.c.a.b
    public final void a() {
        if (!"main".equals(Thread.currentThread().getName())) {
            Log.getStackTraceString(new RuntimeException());
        } else {
            d.b().a();
        }
    }
}
