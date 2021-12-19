package com.bytedance.lynx.hybrid.resource.h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41198a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Pattern> f41199b = new ConcurrentHashMap<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(25235);
    }

    private static boolean b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    private static String a(String str) {
        if (str.length() <= 0 || p.a((CharSequence) str, "/") != str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, str.length() - 1);
        l.a((Object) substring, "");
        return substring;
    }

    private static com.bytedance.lynx.hybrid.resource.d.a a(String str, List<String> list) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            for (T t : list) {
                if (t.length() != 0) {
                    ConcurrentHashMap<String, Pattern> concurrentHashMap = f41199b;
                    Pattern pattern = concurrentHashMap.get(t);
                    if (pattern == null) {
                        pattern = Pattern.compile(((String) t) + "/(([^/]+)/([^?]*))");
                        l.a((Object) pattern, "");
                        concurrentHashMap.put(t, pattern);
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String group = matcher.group(2);
                        String group2 = matcher.group(3);
                        if (b(group) && b(group2)) {
                            if (group == null) {
                                l.a();
                            }
                            if (group2 == null) {
                                l.a();
                            }
                            return new com.bytedance.lynx.hybrid.resource.d.a(group, group2, true);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1.length() > 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.lynx.hybrid.resource.d.a a(java.lang.String r7, com.bytedance.lynx.hybrid.resource.g r8, com.bytedance.lynx.hybrid.resource.config.j r9) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.h.a.a(java.lang.String, com.bytedance.lynx.hybrid.resource.g, com.bytedance.lynx.hybrid.resource.config.j):com.bytedance.lynx.hybrid.resource.d.a");
    }
}
