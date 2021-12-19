package com.vk.api.sdk.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f156327a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(103819);
    }

    public static DisplayMetrics a() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        l.a((Object) displayMetrics, "");
        return displayMetrics;
    }

    public static final Map<String, String> a(String str) {
        if (str == null) {
            return null;
        }
        List<String> b2 = p.b(str, new String[]{"&"});
        HashMap hashMap = new HashMap(b2.size());
        for (String str2 : b2) {
            List c2 = p.c(str2, new String[]{"="});
            if (c2.size() > 1) {
                hashMap.put(c2.get(0), c2.get(1));
            }
        }
        return hashMap;
    }

    public static final boolean a(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
