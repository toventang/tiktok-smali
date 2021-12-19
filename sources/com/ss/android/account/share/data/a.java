package com.ss.android.account.share.data;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f58198a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f58199b;

    static {
        Covode.recordClassIndex(36177);
    }

    public static a a() {
        return new a();
    }

    public final void b() {
        try {
            com.ss.android.common.c.a.a(this.f58198a, this.f58199b);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final a a(String str) {
        this.f58198a = str;
        a("params_for_special", "uc_login");
        return this;
    }

    public final a a(String str, Object obj) {
        if (this.f58199b == null) {
            this.f58199b = new Bundle();
        }
        try {
            this.f58199b.putString(str, obj.toString());
        } catch (Exception unused) {
        }
        return this;
    }
}
