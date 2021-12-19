package com.bytedance.android.monitorV2.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<String, Boolean>> f23920a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14127);
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, Boolean> map = this.f23920a.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f23920a.put(str, map);
            }
            map.put(str2, true);
        }
    }

    public final boolean b(String str, String str2) {
        Map<String, Boolean> map;
        Boolean bool;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f23920a.get(str)) == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
