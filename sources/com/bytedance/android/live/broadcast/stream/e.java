package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import com.bytedance.android.live.broadcast.stream.a.a;
import com.bytedance.android.live.i.a.a;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.live.i.a.d;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements LiveCore.Builder.ILogMonitor {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f8595a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f8596b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8597c;

    static {
        Covode.recordClassIndex(4396);
    }

    public e(d dVar) {
        l.d(dVar, "");
        this.f8596b = new WeakReference<>(dVar.f8569a);
        this.f8597c = dVar.r;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f8595a = concurrentHashMap;
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a2, "");
        String a3 = ((d) a2).getCpuInfoFetcher().a();
        if (a3 != null) {
            concurrentHashMap.put("cpu_soc", a3);
        } else {
            com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(d.class);
            l.b(a4, "");
            ((d) a4).getCpuInfoFetcher().a(new a.AbstractC0152a(this) {
                /* class com.bytedance.android.live.broadcast.stream.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f8598a;

                static {
                    Covode.recordClassIndex(4397);
                }

                {
                    this.f8598a = r1;
                }

                @Override // com.bytedance.android.live.i.a.a.AbstractC0152a
                public final void a(String str) {
                    Map<String, String> map = this.f8598a.f8595a;
                    l.b(str, "");
                    map.put("cpu_soc", str);
                }
            });
        }
        concurrentHashMap.put("rtmp_type", String.valueOf(dVar.f8571c));
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor
    public final void onLogMonitor(String str, JSONObject jSONObject) {
        String a2;
        for (String str2 : this.f8595a.keySet()) {
            if (jSONObject != null) {
                try {
                    jSONObject.put(str2, this.f8595a.get(str2));
                } catch (JSONException unused) {
                }
            }
        }
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a3, "");
        b gpuInfoFetcher = ((d) a3).getGpuInfoFetcher();
        Context context = this.f8596b.get();
        if (!(gpuInfoFetcher == null || context == null || (a2 = gpuInfoFetcher.a(context)) == null || jSONObject == null)) {
            jSONObject.put("gpu_name", a2);
        }
        this.f8597c.a(str, jSONObject);
    }
}
