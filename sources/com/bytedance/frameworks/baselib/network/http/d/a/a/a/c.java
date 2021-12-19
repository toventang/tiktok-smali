package com.bytedance.frameworks.baselib.network.http.d.a.a.a;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f29106a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f29107b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f29108c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    static {
        Covode.recordClassIndex(17040);
    }

    public static boolean a(String str) {
        if (c(str) || d(str)) {
            return true;
        }
        return false;
    }

    private static boolean c(String str) {
        return f29107b.matcher(str).matches();
    }

    private static boolean d(String str) {
        return f29108c.matcher(str).matches();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.a.a.c.b(java.lang.String):boolean");
    }
}
