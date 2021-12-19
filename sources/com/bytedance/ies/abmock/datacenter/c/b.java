package com.bytedance.ies.abmock.datacenter.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.keva.Keva;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import com.google.gson.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f31810a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Keva f31811b;

    /* renamed from: c  reason: collision with root package name */
    private f f31812c;

    public final String[] a(String str) {
        return this.f31811b.getStringArray(str, null);
    }

    static {
        Covode.recordClassIndex(18600);
    }

    private b() {
        System.nanoTime();
        if (e.a().f31828d == 2) {
            this.f31811b = KevaMultiProcessCache.getRepoSync("libra_config_center_repo");
        } else {
            this.f31811b = Keva.getRepoSync("libra_config_center_repo", 1);
        }
    }

    public final f a() {
        if (this.f31812c == null) {
            this.f31812c = new f();
        }
        return this.f31812c;
    }

    public final void c(String str) {
        if (!e.a().f31826b.f() || this.f31811b.contains(str)) {
            this.f31811b.erase(str);
        }
    }

    public final boolean b(String str) {
        return this.f31811b.contains(str);
    }

    public final double a(String str, double d2) {
        return this.f31811b.getDouble(str, d2);
    }

    public final void b(String str, double d2) {
        this.f31811b.storeDouble(str, d2);
    }

    public final float a(String str, float f2) {
        return this.f31811b.getFloat(str, f2);
    }

    public final void b(String str, float f2) {
        this.f31811b.storeFloat(str, f2);
    }

    public final int a(String str, int i2) {
        return this.f31811b.getInt(str, i2);
    }

    public final void b(String str, int i2) {
        this.f31811b.storeInt(str, i2);
    }

    public final long a(String str, long j2) {
        return this.f31811b.getLong(str, j2);
    }

    public final void b(String str, long j2) {
        this.f31811b.storeLong(str, j2);
    }

    public final void b(String str, String str2) {
        this.f31811b.storeString(str, str2);
    }

    public final Object a(String str, Class cls) {
        try {
            return a().a(this.f31811b.getString(str, null), cls);
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a("throwable" + th + "  , key = " + str);
            return null;
        }
    }

    public final void b(String str, boolean z) {
        this.f31811b.storeBoolean(str, z);
    }

    public final String a(String str, String str2) {
        return this.f31811b.getString(str, str2);
    }

    public final void a(String str, String[] strArr) {
        this.f31811b.storeStringArray(str, strArr);
    }

    public final boolean a(String str, boolean z) {
        return this.f31811b.getBoolean(str, z);
    }
}
