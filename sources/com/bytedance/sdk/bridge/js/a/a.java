package com.bytedance.sdk.bridge.js.a;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.c;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<WebView, Object> f43886a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f43887b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f43888c = f43888c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f43889d = f43889d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f43890e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f43891f;

    /* renamed from: g  reason: collision with root package name */
    private static final String f43892g;

    /* renamed from: h  reason: collision with root package name */
    private static final Handler f43893h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    private static final String f43894i = f43894i;

    private a() {
    }

    static {
        String str;
        Covode.recordClassIndex(26822);
        StringBuilder sb = new StringBuilder();
        com.bytedance.sdk.bridge.a aVar = c.f43852a;
        if (aVar == null || (str = aVar.f43825a) == null) {
            str = "nativeapp";
        }
        String sb2 = sb.append(str).append("://").toString();
        f43890e = sb2;
        f43891f = sb2 + "dispatch_message/";
        f43892g = sb2 + "private/setresult/";
    }
}
