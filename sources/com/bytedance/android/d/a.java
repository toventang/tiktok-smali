package com.bytedance.android.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f6835a;

    /* renamed from: b  reason: collision with root package name */
    public String f6836b;

    /* renamed from: c  reason: collision with root package name */
    public String f6837c;

    /* renamed from: d  reason: collision with root package name */
    public String f6838d;

    /* renamed from: e  reason: collision with root package name */
    public String f6839e;

    /* renamed from: f  reason: collision with root package name */
    public int f6840f;

    /* renamed from: g  reason: collision with root package name */
    public long f6841g;

    /* renamed from: h  reason: collision with root package name */
    public long f6842h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f6843i;

    /* renamed from: j  reason: collision with root package name */
    public long f6844j;

    static {
        Covode.recordClassIndex(3282);
    }

    private a() {
    }

    public static a a(long j2) {
        a aVar = new a();
        aVar.f6841g = j2;
        return aVar;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "other";
        }
        return str;
    }
}
