package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f48604a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    static {
        Covode.recordClassIndex(29316);
    }

    private static String b() {
        if (a.a(g.class)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder("fbconnect://cct.");
            ae.a();
            return sb.append(m.f48921g.getPackageName()).toString();
        } catch (Throwable th) {
            a.a(th, g.class);
            return null;
        }
    }

    public static String a() {
        if (a.a(g.class)) {
            return null;
        }
        try {
            ae.a();
            Context context = m.f48921g;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(f48604a));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            a.a(th, g.class);
            return null;
        }
    }

    public static String a(String str) {
        if (a.a(g.class)) {
            return null;
        }
        try {
            ae.a();
            if (ae.a(m.f48921g, str)) {
                return str;
            }
            ae.a();
            if (ae.a(m.f48921g, b())) {
                return b();
            }
            return "";
        } catch (Throwable th) {
            a.a(th, g.class);
            return null;
        }
    }
}
