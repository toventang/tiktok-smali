package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class ep {

    /* renamed from: a  reason: collision with root package name */
    private final String f51542a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51543b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51544c;

    /* renamed from: d  reason: collision with root package name */
    private final long f51545d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ em f51546e;

    static {
        Covode.recordClassIndex(32210);
    }

    private final long c() {
        return this.f51546e.f().getLong(this.f51542a, 0);
    }

    private final void b() {
        this.f51546e.c();
        long a2 = this.f51546e.l().a();
        SharedPreferences.Editor edit = this.f51546e.f().edit();
        edit.remove(this.f51543b);
        edit.remove(this.f51544c);
        edit.putLong(this.f51542a, a2);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long abs;
        this.f51546e.c();
        this.f51546e.c();
        long c2 = c();
        if (c2 == 0) {
            b();
            abs = 0;
        } else {
            abs = Math.abs(c2 - this.f51546e.l().a());
        }
        long j2 = this.f51545d;
        if (abs < j2) {
            return null;
        }
        if (abs > (j2 << 1)) {
            b();
            return null;
        }
        String string = this.f51546e.f().getString(this.f51544c, null);
        long j3 = this.f51546e.f().getLong(this.f51543b, 0);
        b();
        if (string == null || j3 <= 0) {
            return em.f51519a;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    public final void a(String str) {
        boolean z;
        this.f51546e.c();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f51546e.f().getLong(this.f51543b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f51546e.f().edit();
            edit.putString(this.f51544c, str);
            edit.putLong(this.f51543b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        if ((this.f51546e.o().g().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            z = true;
        } else {
            z = false;
        }
        SharedPreferences.Editor edit2 = this.f51546e.f().edit();
        if (z) {
            edit2.putString(this.f51544c, str);
        }
        edit2.putLong(this.f51543b, j3);
        edit2.apply();
    }

    private ep(em emVar, String str, long j2) {
        boolean z;
        this.f51546e = emVar;
        r.a(str);
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        r.b(z);
        this.f51542a = String.valueOf(str).concat(":start");
        this.f51543b = String.valueOf(str).concat(":count");
        this.f51544c = String.valueOf(str).concat(":value");
        this.f51545d = j2;
    }

    /* synthetic */ ep(em emVar, String str, long j2, byte b2) {
        this(emVar, str, j2);
    }
}
