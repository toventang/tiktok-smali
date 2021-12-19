package com.ss.android.ugc.playerkit;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f148650a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f148651b = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Long> f148652c = new LinkedHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(97963);
    }

    public final void a(String str, String str2) {
        a(str, str2, SystemClock.elapsedRealtime());
    }

    private synchronized void a(String str, String str2, long j2) {
        MethodCollector.i(3455);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3455);
            return;
        }
        if ("player_try_play".equals(str2)) {
            this.f148652c.clear();
        } else if (this.f148652c.containsKey(str2)) {
            MethodCollector.o(3455);
            return;
        }
        Map<String, Long> map = this.f148652c;
        if (map != null) {
            map.put(str2, Long.valueOf(j2));
        }
        MethodCollector.o(3455);
    }
}
