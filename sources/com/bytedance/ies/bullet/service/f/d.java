package com.bytedance.ies.bullet.service.f;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f32759a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Pattern> f32760b = new ConcurrentHashMap<>();

    private d() {
    }

    static {
        Covode.recordClassIndex(19576);
    }

    private static boolean a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static com.bytedance.ies.bullet.service.base.d a(String str, List<String> list) {
        l.c(list, "");
        com.bytedance.ies.bullet.service.base.d dVar = new com.bytedance.ies.bullet.service.base.d("", "");
        if (str == null || str.length() == 0) {
            return dVar;
        }
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        String path = parse.getPath();
        if (path == null || path.length() == 0) {
            return dVar;
        }
        try {
            for (T t : list) {
                if (t.length() != 0) {
                    ConcurrentHashMap<String, Pattern> concurrentHashMap = f32760b;
                    Pattern pattern = concurrentHashMap.get(t);
                    if (pattern == null) {
                        pattern = Pattern.compile(((String) t) + "/(([^/]+)/([^?]*))");
                        l.a((Object) pattern, "");
                        concurrentHashMap.put(t, pattern);
                    }
                    Matcher matcher = pattern.matcher(path);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String group = matcher.group(2);
                        String group2 = matcher.group(3);
                        if (a(group) && a(group2)) {
                            l.a((Object) group, "");
                            dVar.a(group);
                            l.a((Object) group2, "");
                            dVar.b(group2);
                            dVar.f32587c = true;
                            return dVar;
                        }
                    }
                    if (!dVar.f32587c) {
                        Matcher matcher2 = pattern.matcher(str);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String group3 = matcher2.group(2);
                            String group4 = matcher2.group(3);
                            if (a(group3) && a(group4)) {
                                l.a((Object) group3, "");
                                dVar.a(group3);
                                l.a((Object) group4, "");
                                dVar.b(group4);
                                dVar.f32587c = true;
                                return dVar;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return dVar;
    }
}
