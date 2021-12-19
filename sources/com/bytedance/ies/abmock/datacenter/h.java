package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;

final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f31834a = new h();

    /* renamed from: b  reason: collision with root package name */
    Keva f31835b = Keva.getRepoSync("settings_data_repo", 1);

    /* renamed from: c  reason: collision with root package name */
    f f31836c;

    static {
        Covode.recordClassIndex(18611);
    }

    private h() {
        System.nanoTime();
    }

    public final String[] a(String str) {
        return this.f31835b.getStringArray(str, null);
    }

    public final int a(String str, int i2) {
        return this.f31835b.getInt(str, i2);
    }

    public final String b(String str, String str2) {
        return this.f31835b.getString(str, str2);
    }

    public final void a(String str, String str2) {
        this.f31835b.storeString(str, str2);
    }

    public final boolean a(String str, boolean z) {
        return this.f31835b.getBoolean(str, z);
    }
}
