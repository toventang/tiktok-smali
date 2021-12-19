package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;

public class ToastMethod extends f<Params, Object> {
    static {
        Covode.recordClassIndex(8045);
    }

    /* access modifiers changed from: package-private */
    public static final class Params {
        @c(a = "position")
        int position;
        @c(a = "text")
        String text;

        static {
            Covode.recordClassIndex(8046);
        }

        Params() {
        }
    }

    public Object invoke(Params params, g gVar) {
        if (params.position == 1) {
            ao.a(y.e(), params.text, 0);
            return null;
        }
        ao.a(gVar.f35646a, params.text, 0);
        return null;
    }
}
