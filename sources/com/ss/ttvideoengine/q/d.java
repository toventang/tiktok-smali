package com.ss.ttvideoengine.q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f153181a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<String, Object> f153182b = new HashMap();

    static {
        Covode.recordClassIndex(101759);
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f153183a;

        static {
            Covode.recordClassIndex(101760);
        }

        public final void a() {
            this.f153183a++;
        }

        a() {
        }
    }

    public final Map<String, Object> a(String str) {
        MethodCollector.i(13559);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(13559);
            return null;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            try {
                Map map = (Map) this.f153181a.get(str);
                if (map != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("pause", Integer.valueOf(((a) map.get("pause")).f153183a));
                    hashMap2.put("resume", Integer.valueOf(((a) map.get("resume")).f153183a));
                    hashMap.put("st_play_task_op", hashMap2);
                }
                if (this.f153182b.size() > 0) {
                    hashMap.put("st_preload", this.f153182b);
                }
            } finally {
                MethodCollector.o(13559);
            }
        }
        return hashMap;
    }
}
