package com.ss.android.ugc.aweme.player.sdk.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f115444a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f115445b = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Map<String, Long>> f115446c = new LinkedHashMap<String, Map<String, Long>>() {
        /* class com.ss.android.ugc.aweme.player.sdk.util.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(74110);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Map<String, Long>> entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }
    };

    private b() {
    }

    static {
        Covode.recordClassIndex(74109);
    }

    public final void a(String str, String str2) {
        a(str, str2, System.currentTimeMillis());
    }

    private synchronized void a(String str, String str2, long j2) {
        Map<String, Long> map;
        MethodCollector.i(3822);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3822);
            return;
        }
        if ("player_try_play".equals(str2)) {
            this.f115446c.remove(str);
            map = new LinkedHashMap<>();
            this.f115446c.put(str, map);
        } else {
            map = this.f115446c.get(str);
            if (map == null || map.containsKey(str2)) {
                MethodCollector.o(3822);
                return;
            }
        }
        map.put(str2, Long.valueOf(j2));
        MethodCollector.o(3822);
    }
}
