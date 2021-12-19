package com.ss.android.ugc.aweme.experiment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class dm {

    /* renamed from: a  reason: collision with root package name */
    public static final dm f89805a = new dm();

    /* renamed from: b  reason: collision with root package name */
    private static final int f89806b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static long f89807c;

    private dm() {
    }

    static {
        Covode.recordClassIndex(56417);
    }

    public static final boolean a() {
        boolean z;
        if (System.currentTimeMillis() - b() <= TimeUnit.DAYS.toMillis(7)) {
            z = true;
        } else {
            z = false;
        }
        Boolean a2 = s.a();
        l.b(a2, "");
        if (a2.booleanValue() || z) {
            return true;
        }
        return false;
    }

    private static long b() {
        long j2;
        PackageInfo packageInfo;
        long j3 = f89807c;
        if (j3 != 0) {
            return j3;
        }
        Context a2 = d.a();
        if (a2 != null) {
            try {
                PackageManager packageManager = a2.getPackageManager();
                if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(a2.getPackageName(), 0)) == null)) {
                    j2 = packageInfo.firstInstallTime;
                    f89807c = j2;
                    return j2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        }
        j2 = 0;
        f89807c = j2;
        return j2;
    }
}
