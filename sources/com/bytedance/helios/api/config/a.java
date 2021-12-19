package com.bytedance.helios.api.config;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30710a;

    /* renamed from: b  reason: collision with root package name */
    public long f30711b;

    /* renamed from: c  reason: collision with root package name */
    public final Application f30712c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30713d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f30714e;

    static {
        Covode.recordClassIndex(17847);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f30712c, aVar.f30712c) && l.a(this.f30713d, aVar.f30713d) && this.f30714e == aVar.f30714e;
    }

    public final int hashCode() {
        Application application = this.f30712c;
        int i2 = 0;
        int hashCode = (application != null ? application.hashCode() : 0) * 31;
        String str = this.f30713d;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f30714e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "AppInfoModel(application=" + this.f30712c + ", channel='" + this.f30713d + "', isFirstStart=" + this.f30714e + ", isDebug=" + this.f30710a + ", versionCode=" + this.f30711b + ')';
    }

    public a(Application application, String str, boolean z) {
        boolean z2;
        long j2;
        l.c(application, "");
        l.c(str, "");
        this.f30712c = application;
        this.f30713d = str;
        this.f30714e = z;
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f30710a = z2;
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                l.a((Object) packageInfo, "");
                j2 = packageInfo.getLongVersionCode();
            } else {
                j2 = (long) packageInfo.versionCode;
            }
            this.f30711b = j2;
        } catch (Exception unused) {
        }
    }
}
