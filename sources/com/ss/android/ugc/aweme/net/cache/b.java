package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import h.f.b.l;
import h.m.p;
import k.i;

public final class b {
    static {
        Covode.recordClassIndex(72139);
    }

    public static final f a(Request request) {
        l.d(request, "");
        Object extraInfo = request.getExtraInfo();
        if (extraInfo instanceof f) {
            return (f) extraInfo;
        }
        return null;
    }

    public static final d b(Request request) {
        l.d(request, "");
        Object extraInfo = request.getExtraInfo();
        if (extraInfo instanceof f) {
            return ((f) extraInfo).v;
        }
        return null;
    }

    public static final boolean c(Request request) {
        d b2;
        l.d(request, "");
        if (!f(request) || (b2 = b(request)) == null) {
            return false;
        }
        int i2 = b2.f112262d;
        if (i2 == 0 || i2 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean d(Request request) {
        d b2;
        l.d(request, "");
        if (!f(request) || (b2 = b(request)) == null) {
            return false;
        }
        int i2 = b2.f112262d;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    public static final String e(Request request) {
        l.d(request, "");
        Object tag = request.tag(k.class);
        if (tag != null) {
            return ((k) tag).f112280a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static boolean f(Request request) {
        l.d(request, "");
        return p.a("GET", request.getMethod(), true);
    }

    public static final String a(String str) {
        l.d(str, "");
        return i.a.a(str).md5().hex();
    }

    public static final void a(Request request, boolean z) {
        l.d(request, "");
        f a2 = a(request);
        if (a2 != null) {
            a2.w = z;
        }
    }
}
