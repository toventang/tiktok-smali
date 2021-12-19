package com.bytedance.ies.abmock.datacenter.c;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.keva.Keva;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import com.google.gson.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31807a = new a();

    /* renamed from: b  reason: collision with root package name */
    public Keva f31808b;

    /* renamed from: c  reason: collision with root package name */
    private f f31809c;

    public final String[] a(String str) {
        return this.f31808b.getStringArray(str, null);
    }

    static {
        Covode.recordClassIndex(18599);
    }

    private a() {
        System.nanoTime();
        if (e.a().f31828d == 2) {
            this.f31808b = KevaMultiProcessCache.getRepoSync("config_center_repo");
        } else {
            this.f31808b = Keva.getRepoSync("config_center_repo", 1);
        }
    }

    public final f a() {
        if (this.f31809c == null) {
            this.f31809c = new f();
        }
        return this.f31809c;
    }

    public final void c(String str) {
        if (!e.a().f31826b.f() || this.f31808b.contains(str)) {
            this.f31808b.erase(str);
        }
    }

    public final boolean b(String str) {
        return this.f31808b.contains(str);
    }

    public final double a(String str, double d2) {
        return this.f31808b.getDouble(str, d2);
    }

    public final void b(String str, double d2) {
        this.f31808b.storeDouble(str, d2);
    }

    public final float a(String str, float f2) {
        return this.f31808b.getFloat(str, f2);
    }

    public final void b(String str, float f2) {
        this.f31808b.storeFloat(str, f2);
    }

    public final int a(String str, int i2) {
        return this.f31808b.getInt(str, i2);
    }

    public final void b(String str, int i2) {
        this.f31808b.storeInt(str, i2);
    }

    public final long a(String str, long j2) {
        return this.f31808b.getLong(str, j2);
    }

    public final void b(String str, long j2) {
        this.f31808b.storeLong(str, j2);
    }

    public final void b(String str, String str2) {
        this.f31808b.storeString(str, str2);
    }

    public final Object a(String str, Class cls) {
        try {
            return a().a(this.f31808b.getString(str, null), cls);
        } catch (Throwable th) {
            b.a("throwable" + th + "  , key = " + str);
            return null;
        }
    }

    public final void b(String str, boolean z) {
        this.f31808b.storeBoolean(str, z);
    }

    public final String a(String str, String str2) {
        return this.f31808b.getString(str, str2);
    }

    public final void a(String str, String[] strArr) {
        this.f31808b.storeStringArray(str, strArr);
    }

    public final boolean a(String str, boolean z) {
        return this.f31808b.getBoolean(str, z);
    }
}
