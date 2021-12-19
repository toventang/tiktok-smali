package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f30872f = {"start", "end", "sensitive", "tag"};

    /* renamed from: a  reason: collision with root package name */
    public final String f30873a;

    /* renamed from: b  reason: collision with root package name */
    final int f30874b;

    /* renamed from: c  reason: collision with root package name */
    final int f30875c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30876d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30877e;

    public static String a() {
        return "SensitiveApiException";
    }

    static {
        Covode.recordClassIndex(17923);
    }

    public String toString() {
        return "ApiConfig{id=" + this.f30873a + ", type=" + f30872f[this.f30874b] + ", actionId=" + this.f30875c + ", actionName=" + this.f30876d + "}";
    }

    public e(String str, String str2, int i2, String str3) {
        this(str, str2, i2, str3, 2);
    }

    public e(String str, String str2, int i2, String str3, int i3) {
        this.f30873a = str;
        this.f30877e = str2;
        this.f30874b = i3;
        this.f30875c = i2;
        this.f30876d = str3;
    }
}
