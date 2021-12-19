package net.openid.appauth;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class a {
    static {
        Covode.recordClassIndex(106058);
    }

    static Map<String, String> a(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    static Map<String, String> a(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            p.a((Object) key, (Object) "additional parameter keys cannot be null");
            p.a((Object) value, (Object) "additional parameter values cannot be null");
            Object[] objArr = {key};
            if (!set.contains(key)) {
                linkedHashMap.put(key, value);
            } else {
                throw new IllegalArgumentException(com.a.a("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
