package com.facebook.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.a.g;
import com.facebook.a.h;
import com.facebook.a.m;
import com.facebook.internal.a.b.a;
import com.facebook.internal.w;
import com.facebook.u;
import com.ss.android.ugc.aweme.bf.d;
import java.io.File;
import java.util.Locale;

class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46757a = j.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static final long[] f46758b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    j() {
    }

    private static void a() {
        if (!a.a(j.class)) {
            try {
                w.a(u.APP_EVENTS, f46757a, "Clock skew detected");
            } catch (Throwable th) {
                a.a(th, j.class);
            }
        }
    }

    static {
        Covode.recordClassIndex(28486);
    }

    private static int a(long j2) {
        if (a.a(j.class)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = f46758b;
                if (i2 >= jArr.length || jArr[i2] >= j2) {
                    return i2;
                }
                i2++;
            } catch (Throwable th) {
                a.a(th, j.class);
                return 0;
            }
        }
        return i2;
    }

    private static String a(Context context) {
        if (a.a(j.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String concat = "PCKGCHKSUM;".concat(String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 0).versionName));
            SharedPreferences a2 = d.a(context, "com.facebook.sdk.appEventPreferences", 0);
            String string = a2.getString(concat, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, com.bytedance.ies.ugc.appcontext.d.a().getPackageName());
            String a3 = f.a(new File(packageManager.getApplicationInfo(packageName, 0).sourceDir));
            a2.edit().putString(concat, a3).apply();
            return a3;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            a.a(th, j.class);
            return null;
        }
    }

    static void a(String str, i iVar, String str2) {
        String str3;
        if (!a.a(j.class) && iVar != null) {
            try {
                Long valueOf = Long.valueOf(iVar.a() - iVar.f46752b.longValue());
                if (valueOf.longValue() < 0) {
                    valueOf = 0L;
                    a();
                }
                Long valueOf2 = Long.valueOf(iVar.b());
                if (valueOf2.longValue() < 0) {
                    a();
                    valueOf2 = 0L;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", iVar.f46753c);
                bundle.putString("fb_mobile_time_between_sessions", com.a.a(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(a(valueOf.longValue()))}));
                k kVar = iVar.f46755e;
                if (kVar != null) {
                    str3 = kVar.toString();
                } else {
                    str3 = "Unclassified";
                }
                bundle.putString("fb_mobile_launch_source", str3);
                bundle.putLong("_logTime", iVar.f46752b.longValue() / 1000);
                m mVar = new m(str, str2);
                double longValue = (double) valueOf2.longValue();
                Double.isNaN(longValue);
                mVar.a(longValue / 1000.0d);
            } catch (Throwable th) {
                a.a(th, j.class);
            }
        }
    }

    static void a(String str, String str2, Context context) {
        if (!a.a(j.class)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", "Unclassified");
                bundle.putString("fb_mobile_pckg_fp", a(context));
                bundle.putString("fb_mobile_app_cert_hash", com.facebook.internal.c.a.a(context));
                m mVar = new m(str, str2);
                mVar.a();
                if (h.a() != g.a.EXPLICIT_ONLY) {
                    mVar.e();
                }
            } catch (Throwable th) {
                a.a(th, j.class);
            }
        }
    }
}
