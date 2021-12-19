package com.bytedance.apm.f.a;

import com.bytedance.apm.c;
import com.bytedance.apm.c.b.d;
import com.bytedance.apm.f.a;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.k;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(14566);
    }

    public static long a() {
        List<BinderMonitor.a> d2;
        long j2 = 0;
        if (a.C0529a.f24928a.b().f25291c && com.bytedance.apm.internal.a.b(2) && k.a().f41552h != null && (d2 = BinderMonitor.d()) != null && !d2.isEmpty()) {
            for (BinderMonitor.a aVar : d2) {
                final long j3 = aVar.f41411b - aVar.f41410a;
                j2 += j3;
                final StackTraceElement[] stackTraceElementArr = aVar.f41413d;
                if (!(stackTraceElementArr == null || stackTraceElementArr.length == 0)) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= stackTraceElementArr.length) {
                            break;
                        } else if ("saveBinderInfo".equals(stackTraceElementArr[i3].getMethodName())) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    int i4 = i2 + 1;
                    if (i4 <= stackTraceElementArr.length) {
                        stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i4, stackTraceElementArr.length);
                    }
                }
                b.a.f25210a.a(new Runnable() {
                    /* class com.bytedance.apm.f.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14567);
                    }

                    public final void run() {
                        try {
                            String a2 = r.a(stackTraceElementArr);
                            if (j3 == 0) {
                                return;
                            }
                            if (!a2.isEmpty()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("timestamp", System.currentTimeMillis());
                                jSONObject.put("crash_time", System.currentTimeMillis());
                                jSONObject.put("is_main_process", c.b());
                                jSONObject.put("process_name", c.a());
                                jSONObject.put("block_duration", j3);
                                StringBuilder sb = new StringBuilder("BinderInfo:\n");
                                sb.append("-Binder Time ").append(j3).append("ms\n-Binder Stack\n").append(a2).append("\n");
                                jSONObject.put("stack", sb.toString());
                                jSONObject.put("event_type", "lag");
                                JSONObject c2 = com.bytedance.b.i.a.c.a().c();
                                c2.put("block_stack_type", "stack");
                                c2.put("is_launch_binder", "true");
                                jSONObject.put("filters", c2);
                                com.bytedance.apm.c.a.a.b().a(new d("block_monitor", jSONObject));
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                });
            }
        }
        return j2;
    }
}
