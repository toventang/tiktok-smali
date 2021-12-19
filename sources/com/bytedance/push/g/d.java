package com.bytedance.push.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c;
import com.bytedance.push.c.e;
import com.ss.android.message.a.a;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final c f42175a;

    static {
        Covode.recordClassIndex(25773);
    }

    @Override // com.bytedance.push.c.e
    public final void c() {
        g.a(0, (JSONObject) null, "update sender success");
    }

    @Override // com.bytedance.push.c.e
    public final void d() {
        g.a(0, "the out-app switcher upload success", (JSONObject) null);
    }

    @Override // com.bytedance.push.c.e
    public final void a() {
        c cVar = this.f42175a;
        if (a.a(com.ss.android.message.a.f59817a)) {
            c.f42172b = System.currentTimeMillis();
            c.a().sendEmptyMessageDelayed(2, cVar.z);
        }
    }

    @Override // com.bytedance.push.c.e
    public final void b() {
        if (c.f42171a.compareAndSet(false, true)) {
            if (c.a().hasMessages(2)) {
                c.a().removeMessages(2);
            }
            c.a(0, System.currentTimeMillis() - c.f42172b);
        }
    }

    public d(c cVar) {
        this.f42175a = cVar;
        f.f42176a = cVar.t;
    }

    @Override // com.bytedance.push.c.e
    public final void a(int i2) {
        MethodCollector.i(7524);
        synchronized (g.f42178b) {
            try {
                if (g.f42178b.get(Integer.valueOf(i2)) == null) {
                    g.f42178b.put(Integer.valueOf(i2), true);
                    g.f42177a.sendMessageDelayed(g.f42177a.obtainMessage(1001, Integer.valueOf(i2)), TimeUnit.MINUTES.toMillis(1));
                    MethodCollector.o(7524);
                }
            } finally {
                MethodCollector.o(7524);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        com.bytedance.push.g.g.a(r7);
        r3 = com.bytedance.push.third.f.a(com.ss.android.message.a.f59817a).d(r7) + " register success";
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.put("status", 0);
        r2.put("pushType", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.push.c.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r7) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g.d.b(int):void");
    }

    @Override // com.bytedance.push.c.e
    public final void a(int i2, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        switch (i2) {
            case 301:
                str2 = "network error";
                break;
            case 302:
                str2 = "server return error";
                break;
            case 303:
                str2 = "server return empty allow_push_list";
                break;
            default:
                str2 = "update_sender api return empty";
                break;
        }
        g.a(i2, jSONObject, str2);
    }

    @Override // com.bytedance.push.c.e
    public final void b(int i2, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (i2 == 301) {
            str2 = "network error";
        } else if (i2 != 302) {
            str2 = "Server return empty response";
        } else {
            str2 = "Server return not success";
        }
        g.a(i2, str2, jSONObject);
    }

    @Override // com.bytedance.push.c.e
    public final void a(boolean z, String str) {
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 107);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sender", str);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            f.a("push_monitor_register_result", jSONObject, null, jSONObject2);
            a.a("1004", 107, "This device does not support the sender/channel delivered by the server", jSONObject2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        com.bytedance.push.g.g.a(r7);
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.put("pushType", r7);
        r3.put("status", r8);
        r3.put("3rd_code", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.push.c.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g.d.a(int, int, java.lang.String, java.lang.String):void");
    }
}
