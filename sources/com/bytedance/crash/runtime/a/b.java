package com.bytedance.crash.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.m;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ac;
import com.bytedance.crash.util.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected CrashType f27865a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f27866b;

    /* renamed from: c  reason: collision with root package name */
    protected ICommonParams f27867c = m.a().f27905a;

    /* renamed from: d  reason: collision with root package name */
    protected a f27868d;

    /* renamed from: e  reason: collision with root package name */
    protected d f27869e;

    public interface a {
        static {
            Covode.recordClassIndex(16311);
        }

        com.bytedance.crash.entity.b a(int i2, com.bytedance.crash.entity.b bVar);

        com.bytedance.crash.entity.b b(int i2, com.bytedance.crash.entity.b bVar);
    }

    static {
        Covode.recordClassIndex(16310);
    }

    /* access modifiers changed from: package-private */
    public com.bytedance.crash.entity.b a(com.bytedance.crash.entity.b bVar) {
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return true;
    }

    private void b(com.bytedance.crash.entity.b bVar) {
        List<AttachUserData> attachUserData = m.f27731h.getAttachUserData(this.f27865a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = bVar.f27557a.optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            bVar.a("custom", optJSONObject);
        }
        if (attachUserData != null) {
            for (int i2 = 0; i2 < attachUserData.size(); i2++) {
                try {
                    AttachUserData attachUserData2 = attachUserData.get(i2);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.bytedance.crash.entity.b.a(optJSONObject, attachUserData2.getUserData(this.f27865a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    com.bytedance.crash.entity.b.a(optJSONObject, th);
                }
            }
        }
        n.a(optJSONObject, "fd_count", Integer.valueOf(NativeTools.a().b()));
        for (Map.Entry entry : hashMap.entrySet()) {
            n.a(optJSONObject, (String) entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public com.bytedance.crash.entity.b a(int i2, com.bytedance.crash.entity.b bVar) {
        int i3;
        if (bVar == null) {
            bVar = new com.bytedance.crash.entity.b();
        }
        if (i2 == 0) {
            int i4 = m.f27734k;
            String str = m.f27735l;
            n.a(bVar.f27557a, "miniapp_id", Integer.valueOf(i4));
            n.a(bVar.f27557a, "miniapp_version", str);
            if (m.f27729f) {
                bVar.a("is_mp", (Object) 1);
            }
            bVar.a(this.f27867c);
            ConcurrentHashMap<Integer, String> concurrentHashMap = m.f27732i;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Integer num : concurrentHashMap.keySet()) {
                    n.a(jSONObject, String.valueOf(num), concurrentHashMap.get(num));
                }
                n.a(bVar.f27557a, "sdk_info", jSONObject);
            }
            bVar.a("inner_sdk", m.f27733j);
            bVar.a("process_name", com.bytedance.crash.util.b.c(m.f27724a));
        } else if (i2 == 1) {
            if (!com.bytedance.crash.util.b.b(m.f27724a)) {
                bVar.a("remote_process", (Object) 1);
            }
            bVar.a("pid", Integer.valueOf(Process.myPid()));
            bVar.a(m.f27726c, m.f27727d);
            a aVar = this.f27868d;
            if (aVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                n.a(jSONObject2, "last_create_activity", a.a(aVar.f27853l, aVar.f27854m));
                n.a(jSONObject2, "last_start_activity", a.a(aVar.n, aVar.o));
                n.a(jSONObject2, "last_resume_activity", a.a(aVar.p, aVar.q));
                n.a(jSONObject2, "last_pause_activity", a.a(aVar.r, aVar.s));
                n.a(jSONObject2, "last_stop_activity", a.a(aVar.t, aVar.u));
                n.a(jSONObject2, "alive_activities", aVar.a(aVar.f27848g, aVar.f27849h));
                n.a(jSONObject2, "finish_activities", aVar.a(aVar.f27850i, aVar.f27851j));
                bVar.a("activity_trace", jSONObject2);
                bVar.a("activity_track", aVar.c());
            }
            try {
                bVar.a(this.f27867c.getPatchInfo());
            } catch (Throwable unused) {
            }
            Object obj = m.f27728e;
            if (obj != null) {
                bVar.a("business", obj);
            }
            bVar.a("is_background", Boolean.valueOf(com.bytedance.crash.util.b.a(this.f27866b)));
            b(bVar);
        } else if (i2 == 2) {
            String d2 = m.a().d();
            if (!TextUtils.isEmpty(d2)) {
                bVar.a("session_id", (Object) d2);
            }
            d dVar = this.f27869e;
            if (dVar == null) {
                i3 = 0;
            } else {
                i3 = dVar.f27870a;
            }
            bVar.a("battery", Integer.valueOf(i3));
            bVar.a(m.f27731h.getTagMap());
            bVar.a("alog_inited", String.valueOf(com.bytedance.crash.a.a.a().b()));
        } else if (i2 == 5 && a()) {
            bVar.b(ac.a());
        }
        return bVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[SYNTHETIC, Splitter:B:11:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.crash.entity.b a(com.bytedance.crash.entity.b r8, com.bytedance.crash.runtime.a.b.a r9, boolean r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0007
            com.bytedance.crash.entity.b r8 = new com.bytedance.crash.entity.b
            r8.<init>()
        L_0x0007:
            r0 = 0
            r6 = r8
            r5 = 0
        L_0x000a:
            long r3 = android.os.SystemClock.uptimeMillis()
            if (r9 == 0) goto L_0x0014
            com.bytedance.crash.entity.b r6 = r9.a(r5, r6)     // Catch:{ all -> 0x0014 }
        L_0x0014:
            com.bytedance.crash.entity.b r6 = r7.a(r5, r6)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            if (r9 == 0) goto L_0x002c
            com.bytedance.crash.entity.b r6 = r9.b(r5, r6)     // Catch:{ all -> 0x001e }
        L_0x001e:
            if (r10 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x0048
            org.json.JSONObject r0 = r6.f27557a
            r8.c(r0)
        L_0x0027:
            com.bytedance.crash.entity.b r6 = new com.bytedance.crash.entity.b
            r6.<init>()
        L_0x002c:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "step_cost_"
            java.lang.String r2 = r0.concat(r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.c(r2, r0)
            int r5 = r5 + 1
            r0 = 6
            if (r5 >= r0) goto L_0x004a
            goto L_0x000a
        L_0x0048:
            r8 = r6
            goto L_0x0027
        L_0x004a:
            com.bytedance.crash.entity.b r0 = r7.a(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.a.b.a(com.bytedance.crash.entity.b, com.bytedance.crash.runtime.a.b$a, boolean):com.bytedance.crash.entity.b");
    }

    b(CrashType crashType, Context context, a aVar, d dVar) {
        this.f27865a = crashType;
        this.f27866b = context;
        this.f27868d = aVar;
        this.f27869e = dVar;
    }
}
