package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.ies.powerpreload.task.e;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class fs {

    /* renamed from: a  reason: collision with root package name */
    public static final fs f142951a = new fs();

    public interface a {
        static {
            Covode.recordClassIndex(93545);
        }

        void a(String str, Map<String, String> map);
    }

    private fs() {
    }

    static {
        Covode.recordClassIndex(93544);
    }

    public static final void a(String str, String str2, long j2, long j3, long j4, boolean z, a aVar) {
        boolean z2;
        String str3 = "";
        l.d(str2, str3);
        l.d(aVar, str3);
        boolean z3 = true;
        if (str2.length() != 0 && j3 > 0 && j4 > 0 && j2 > 0) {
            if (str != null) {
                str3 = str;
            }
            TaskTraceMetric a2 = e.a(str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (a2 != null) {
                Long valueOf = Long.valueOf(a2.f34536b);
                if (valueOf.longValue() >= j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && valueOf != null) {
                    linkedHashMap.put("to_execute_stime", String.valueOf(valueOf.longValue() - j2));
                }
                Long valueOf2 = Long.valueOf(a2.f34537c);
                if (valueOf2.longValue() >= j2 && valueOf2 != null) {
                    linkedHashMap.put("to_execute_etime", String.valueOf(valueOf2.longValue() - j2));
                }
                Long valueOf3 = Long.valueOf(a2.f34538d);
                if (valueOf3.longValue() >= j2 && valueOf3 != null) {
                    linkedHashMap.put("to_shoot_stime", String.valueOf(valueOf3.longValue() - j2));
                }
                Long valueOf4 = Long.valueOf(a2.f34539e);
                if (valueOf4.longValue() >= j2 && valueOf4 != null) {
                    linkedHashMap.put("to_shoot_etime", String.valueOf(valueOf4.longValue() - j2));
                }
                if (a2.f34537c <= 0) {
                    z3 = false;
                }
                linkedHashMap.put("preload_ab_open", String.valueOf(z3));
            }
            linkedHashMap.put("to_request_time", String.valueOf(j3 - j2));
            linkedHashMap.put("to_response_time", String.valueOf(j4 - j2));
            linkedHashMap.put("page_name", str2);
            linkedHashMap.put("preload_ab_setting", String.valueOf(z));
            aVar.a("power_preload_duration_key", linkedHashMap);
        }
    }
}
