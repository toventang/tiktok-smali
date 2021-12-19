package com.bytedance.frameworks.baselib.network.http.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f28937c;

    /* renamed from: a  reason: collision with root package name */
    public a f28938a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f28939b;

    static {
        Covode.recordClassIndex(16978);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(2155);
        if (f28937c == null) {
            synchronized (b.class) {
                try {
                    if (f28937c == null) {
                        f28937c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2155);
                    throw th;
                }
            }
        }
        b bVar = f28937c;
        MethodCollector.o(2155);
        return bVar;
    }

    private static boolean a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public final String a(Request request, String str) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.f28938a.f28928c;
        if (a(copyOnWriteArraySet)) {
            return str;
        }
        for (String str2 : copyOnWriteArraySet) {
            if (i.a(request.getHost(), str2)) {
                if (TextUtils.isEmpty(request.getPath()) || this.f28939b || a(this.f28938a.f28929d, this.f28938a.f28930e, this.f28938a.f28931f, request.getPath()) || a(this.f28938a.f28932g, this.f28938a.f28933h, this.f28938a.f28934i, request.getPath())) {
                    return str;
                }
                boolean z = this.f28938a.f28927b;
                return str;
            }
        }
        return str;
    }

    private static boolean a(Set<String> set, Set<String> set2, Set<Pattern> set3, String str) {
        if (!a(set)) {
            for (String str2 : set) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        if (!a(set2)) {
            for (String str3 : set2) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        if (a(set3)) {
            return false;
        }
        for (Pattern pattern : set3) {
            if (pattern != null && pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
