package com.bytedance.apm.f.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(14570);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f24936a;

        /* renamed from: b  reason: collision with root package name */
        public long f24937b;

        /* renamed from: c  reason: collision with root package name */
        public String f24938c;

        /* renamed from: d  reason: collision with root package name */
        public String f24939d;

        /* renamed from: e  reason: collision with root package name */
        public String f24940e;

        /* renamed from: f  reason: collision with root package name */
        public String f24941f;

        static {
            Covode.recordClassIndex(14572);
        }

        a() {
        }

        public final String toString() {
            return "LockItemInfo{duration=" + this.f24936a + ", startTime=" + this.f24937b + ", blockStackInfo='" + this.f24938c + '\'' + ", completeBlockStackInfo='" + this.f24939d + '\'' + ", ownerStackInfo='" + this.f24940e + '\'' + ", ownerThreadName='" + this.f24941f + '\'' + '}';
        }
    }

    public static JSONObject a(a aVar, String str, String str2) {
        boolean z = false;
        if (!aVar.f24938c.isEmpty() && aVar.f24936a >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", aVar.f24937b);
            jSONObject.put("crash_time", aVar.f24937b);
            jSONObject.put("is_main_process", com.bytedance.apm.c.b());
            jSONObject.put("process_name", com.bytedance.apm.c.a());
            jSONObject.put("block_duration", aVar.f24936a);
            jSONObject.put("raw_dump_info", str);
            StringBuilder sb = new StringBuilder("LockInfo:\n");
            sb.append("-Lock Time ").append(aVar.f24936a).append("ms\n-Block Stack \nat ").append(aVar.f24938c).append("\n");
            if (!aVar.f24939d.isEmpty()) {
                sb.append(aVar.f24939d.replace("\t", "")).append("\n");
            }
            sb.append("-Owner Thread: ").append(aVar.f24941f).append("\n");
            if (aVar.f24940e != null && !aVar.f24940e.isEmpty()) {
                sb.append("-Owner Stack: \n-at ").append(aVar.f24940e).append("\n");
            }
            jSONObject.put("stack", sb.toString());
            jSONObject.put("event_type", "lag");
            JSONObject c2 = com.bytedance.b.i.a.c.a().c();
            c2.put("block_stack_type", "stack");
            c2.put(str2, "true");
            jSONObject.put("filters", c2);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
