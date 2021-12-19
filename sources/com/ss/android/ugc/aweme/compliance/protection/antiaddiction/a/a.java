package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f77904a;

    /* renamed from: b  reason: collision with root package name */
    public int f77905b;

    /* renamed from: c  reason: collision with root package name */
    public int f77906c;

    /* renamed from: d  reason: collision with root package name */
    private final String f77907d;

    static {
        Covode.recordClassIndex(48293);
    }

    public a() {
        this("05:00");
    }

    public static long a() {
        b.a().b();
        return b.a().b();
    }

    private a(String str) {
        this.f77907d = str;
        try {
            String[] split = str.split(":");
            this.f77904a = Integer.parseInt(split[0]);
            this.f77905b = Integer.parseInt(split[1]);
        } catch (Exception unused) {
            this.f77904a = 5;
            this.f77905b = 0;
        }
        this.f77906c = 0;
    }
}
