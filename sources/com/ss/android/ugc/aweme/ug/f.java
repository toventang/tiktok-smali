package com.ss.android.ugc.aweme.ug;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f141824b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final a f141825c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f141826a = Keva.getRepo("first_install_version");

    /* renamed from: d  reason: collision with root package name */
    private long f141827d;

    public static final class a {
        static {
            Covode.recordClassIndex(92696);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(92695);
    }

    public final long a() {
        long j2;
        PackageInfo packageInfo;
        long j3 = this.f141827d;
        if (j3 != 0) {
            return j3;
        }
        Context a2 = d.a();
        if (a2 != null) {
            try {
                PackageManager packageManager = a2.getPackageManager();
                if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(a2.getPackageName(), 0)) == null)) {
                    j2 = packageInfo.firstInstallTime;
                    this.f141827d = j2;
                    return j2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        }
        j2 = 0;
        this.f141827d = j2;
        return j2;
    }
}
