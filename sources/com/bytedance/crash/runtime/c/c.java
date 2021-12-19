package com.bytedance.crash.runtime.c;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.r;
import com.bytedance.crash.util.v;

public final class c extends a {
    static {
        Covode.recordClassIndex(16330);
    }

    public final void run() {
        r b2 = m.b();
        if (TextUtils.isEmpty(b2.f27957a) || "0".equals(b2.f27957a)) {
            String c2 = m.a().c();
            if (TextUtils.isEmpty(c2) || "0".equals(c2)) {
                a(this.f27900a);
                v.a("[DeviceIdTask] did is null, continue check.");
                return;
            }
            m.b().a(c2);
            v.a("[DeviceIdTask] did is ".concat(String.valueOf(c2)));
        }
    }

    public c(Handler handler) {
        super(handler, 5000);
    }
}
