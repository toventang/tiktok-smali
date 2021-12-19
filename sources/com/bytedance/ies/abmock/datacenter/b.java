package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f31799a = new b();

    /* renamed from: b  reason: collision with root package name */
    public Keva f31800b = Keva.getRepoSync("abtest_data_repo", 1);

    /* renamed from: c  reason: collision with root package name */
    private f f31801c;

    static {
        Covode.recordClassIndex(18595);
    }

    private b() {
        System.nanoTime();
    }

    public final f a() {
        if (this.f31801c == null) {
            this.f31801c = new f();
        }
        return this.f31801c;
    }

    public final void a(String str, String str2) {
        this.f31800b.storeString(str, str2);
    }

    public final Object a(String str, Class cls) {
        try {
            return a().a(this.f31800b.getString(str, null), cls);
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a("throwable" + th + "  , key = " + str);
            return null;
        }
    }
}
