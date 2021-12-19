package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.util.j;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public String f27957a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27958b = -1;

    static {
        Covode.recordClassIndex(16358);
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f27957a) && !"0".equals(this.f27957a)) {
            return this.f27957a;
        }
        String c2 = m.a().c();
        this.f27957a = c2;
        if (TextUtils.isEmpty(c2) || "0".equals(this.f27957a)) {
            String b2 = q.a().b();
            this.f27957a = b2;
            return b2;
        }
        a(this.f27957a);
        return this.f27957a;
    }

    public final void a(String str) {
        this.f27957a = str;
        try {
            j.a(q.a().f27942b, str, false);
        } catch (Throwable unused) {
        }
    }
}
