package com.bytedance.android.livesdkapi.depend.model.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f23019a;

    /* renamed from: b  reason: collision with root package name */
    public long f23020b;

    /* renamed from: c  reason: collision with root package name */
    public String f23021c;

    /* renamed from: d  reason: collision with root package name */
    public String f23022d;
    @c(a = "follow_status")

    /* renamed from: e  reason: collision with root package name */
    public int f23023e;

    /* renamed from: f  reason: collision with root package name */
    public EnumC0505a f23024f = EnumC0505a.Default;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23025g;

    static {
        Covode.recordClassIndex(13641);
    }

    public final int a() {
        int i2 = this.f23023e;
        if (i2 < 0 || i2 > 2) {
            this.f23023e = 0;
        }
        return this.f23023e;
    }

    public final boolean b() {
        int i2 = this.f23023e;
        if (i2 == 2 || i2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a$a  reason: collision with other inner class name */
    public enum EnumC0505a {
        Default,
        FromWeb;

        static {
            Covode.recordClassIndex(13642);
        }
    }
}
