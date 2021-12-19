package com.bytedance.android.livesdk.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14287a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static int f14288b;

    /* renamed from: c  reason: collision with root package name */
    private static int f14289c;

    private c() {
    }

    static {
        Covode.recordClassIndex(7918);
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder("WEBVIEW_");
        int i2 = f14288b;
        f14288b = i2 + 1;
        return sb.append(i2).toString();
    }

    public static final String b() {
        StringBuilder sb = new StringBuilder(k.f41016d);
        int i2 = f14289c;
        f14289c = i2 + 1;
        return sb.append(i2).toString();
    }
}
