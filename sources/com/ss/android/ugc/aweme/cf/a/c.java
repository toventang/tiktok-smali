package com.ss.android.ugc.aweme.cf.a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Object> f69839a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(43075);
    }

    public static <T> T a(String str) {
        try {
            Map<String, Object> map = f69839a;
            T t = (T) map.get(str);
            if (t != null) {
                return t;
            }
            T t2 = (T) Class.forName(str).newInstance();
            map.put(str, t2);
            return t2;
        } catch (Exception unused) {
            return null;
        }
    }
}
