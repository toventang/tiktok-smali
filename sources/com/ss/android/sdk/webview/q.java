package com.ss.android.sdk.webview;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class q {

    /* renamed from: b  reason: collision with root package name */
    private static volatile q f60251b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Boolean> f60252a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f60253c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60254d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60255e;

    static {
        Covode.recordClassIndex(37211);
    }

    private q() {
    }

    public static q a() {
        MethodCollector.i(12384);
        if (f60251b == null) {
            synchronized (q.class) {
                try {
                    if (f60251b == null) {
                        f60251b = new q();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12384);
                    throw th;
                }
            }
        }
        q qVar = f60251b;
        MethodCollector.o(12384);
        return qVar;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getHost()) || !parse.getHost().contains("link-sg.byteoversea.com") || TextUtils.isEmpty(parse.getQueryParameter("target"))) {
                return parse.getHost();
            }
            return Uri.parse(parse.getQueryParameter("target")).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(boolean z, String str) {
        String a2 = a(str);
        if (a2 != null) {
            boolean z2 = true;
            if (!z ? !this.f60253c || !this.f60255e : !this.f60253c || !this.f60254d) {
                z2 = false;
            }
            this.f60252a.put(a2, Boolean.valueOf(z2));
        }
    }
}
