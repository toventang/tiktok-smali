package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import h.f.b.l;
import h.m.p;

public final class d {
    static {
        Covode.recordClassIndex(72308);
    }

    public static final boolean a(Request request) {
        l.d(request, "");
        if (b(request) || c(request)) {
            return true;
        }
        return false;
    }

    private static boolean b(Request request) {
        l.d(request, "");
        return p.a("GET", request.getMethod(), true);
    }

    private static boolean c(Request request) {
        l.d(request, "");
        return p.a("POST", request.getMethod(), true);
    }
}
