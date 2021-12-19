package com.bytedance.android.live.liveinteract.linkroom.a.b;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.f.b;

public final class a {
    static {
        Covode.recordClassIndex(5586);
    }

    public static void a(int i2) {
        String str;
        if (i2 == 1) {
            str = "anchor_linkmic_red_dot_shown";
        } else {
            str = "guest_linkmic_red_dot_shown";
        }
        b(str);
    }

    public static boolean a(String str) {
        Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
        if (context == null || b.a(context, b.f33816b).a(str, false)) {
            return false;
        }
        return true;
    }

    public static void b(String str) {
        Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
        if (context != null) {
            b.a(context, b.f33816b).a(str, (Object) true).a();
        }
    }
}
