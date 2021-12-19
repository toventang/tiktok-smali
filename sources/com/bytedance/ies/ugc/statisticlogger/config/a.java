package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class a implements com.ss.android.common.a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f35334a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f35335b = new a();

    private a() {
    }

    @Override // com.ss.android.common.a
    public final String a() {
        return d.u;
    }

    @Override // com.ss.android.common.a
    public final int b() {
        return d.n;
    }

    @Override // com.ss.android.common.a
    public final Context c() {
        return d.a();
    }

    @Override // com.ss.android.common.a
    public final int d() {
        return (int) d.h();
    }

    @Override // com.ss.android.common.a
    public final int f() {
        return (int) d.d();
    }

    @Override // com.ss.android.common.a
    public final String g() {
        return d.f();
    }

    @Override // com.ss.android.common.a
    public final String h() {
        return d.b();
    }

    @Override // com.ss.android.common.a
    public final int i() {
        return (int) d.e();
    }

    static {
        Covode.recordClassIndex(21155);
    }

    @Override // com.ss.android.common.a
    public final String e() {
        if (f35334a) {
            return d.f();
        }
        return null;
    }
}
