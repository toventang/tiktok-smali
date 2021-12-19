package com.ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public class f {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f118884a;

    /* renamed from: b  reason: collision with root package name */
    static Set<String> f118885b = new HashSet();

    static {
        Covode.recordClassIndex(77234);
    }

    static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            if (!(packageInfo == null || packageInfo.services == null)) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                String a2 = h.a(context);
                String b2 = h.b(context);
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (serviceInfo != null && (TextUtils.equals(a2, serviceInfo.processName) || TextUtils.equals(b2, serviceInfo.processName))) {
                        f118885b.add(serviceInfo.name);
                        String str = serviceInfo.name;
                    }
                }
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    static boolean a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                if (!(resolveService == null || resolveService.serviceInfo == null)) {
                    String str = resolveService.serviceInfo.processName;
                    if (TextUtils.equals(h.a(context), str) || TextUtils.equals(h.b(context), str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
        return false;
    }
}
