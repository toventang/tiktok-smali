package com.facebook.a.g;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f46798a = new HashSet(Arrays.asList("fb_mobile_purchase", "StartTrial", "Subscribe"));

    static {
        Covode.recordClassIndex(28507);
    }

    public static boolean a() {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            ae.a();
            if (m.c(m.f48921g) || ad.g() || !c.a()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }
}
