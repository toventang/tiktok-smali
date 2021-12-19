package com.bytedance.apm.agent.monitor;

import com.bytedance.apm.c.a.a;
import com.bytedance.apm.c.a.d;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.c.b.g;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class MonitorTool {
    static {
        Covode.recordClassIndex(14369);
    }

    public static void monitorUIAction(final String str, final String str2, final JSONObject jSONObject) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14370);
            }

            public final void run() {
                a.b().a(new g(str, str2, jSONObject));
            }
        });
    }

    public static void reportTraceTime(final String str, final String str2, final long j2) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass5 */

            static {
                Covode.recordClassIndex(14374);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    a.b().a(new f("page_load", "page_load", jSONObject, jSONObject2, null, (byte) 0));
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void monitorStart(String str, long j2, long j3) {
        if (j3 > j2) {
            try {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j3 - j2);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j2);
                jSONObject2.put("end_time", j3);
                b.a.f25210a.a(new Runnable() {
                    /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(14373);
                    }

                    public final void run() {
                        a.b().a(new f("start", "", jSONObject, null, jSONObject2, (byte) 0));
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void monitorStart(final JSONObject jSONObject, long j2, long j3) {
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j2);
            jSONObject2.put("end_time", j3);
            jSONObject2.put("from", "monitor-plugin");
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(14372);
                }

                public final void run() {
                    a.b().a(new f("start", "", jSONObject, null, jSONObject2, (byte) 0));
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void monitorPerformance(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14371);
            }

            public final void run() {
                a.b().a(new f(str, "", jSONObject, jSONObject2, jSONObject3, (byte) 0));
            }
        });
    }

    public static void monitorSLA(final long j2, final long j3, final String str, final String str2, final String str3, final int i2, final JSONObject jSONObject) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.AnonymousClass6 */

            static {
                Covode.recordClassIndex(14375);
            }

            public final void run() {
                d.a.f24718a.a(new com.bytedance.apm.c.b.a("api_all", j2, j3, str, str2, str3, i2, jSONObject));
            }
        });
    }
}
