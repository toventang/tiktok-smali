package com.bytedance.android.monitor.lynx.c.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<String, Boolean>> f23662a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14025);
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, Boolean> map = this.f23662a.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f23662a.put(str, map);
            }
            map.put(str2, true);
        }
    }

    public final boolean b(String str, String str2) {
        Map<String, Boolean> map;
        Boolean bool;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f23662a.get(str)) == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
