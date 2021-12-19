package com.bytedance.b.b.a.b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f25875c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, a> f25876a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public a f25877b;

    static {
        Covode.recordClassIndex(15097);
    }

    public static b a() {
        if (f25875c == null) {
            synchronized (b.class) {
                if (f25875c == null) {
                    f25875c = new b();
                }
            }
        }
        return f25875c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.b.b.a.b.a a(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.b.a.b.b.a(java.lang.String):com.bytedance.b.b.a.b.a");
    }
}
