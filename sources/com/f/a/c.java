package com.f.a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.d.b;
import com.facebook.net.d;
import com.facebook.net.h;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements com.facebook.imagepipeline.k.c {

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f46469c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, a> f46470a;

    /* renamed from: b  reason: collision with root package name */
    public d f46471b;

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerEvent(String str, String str2, String str3) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public c() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(28367);
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.f.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28368);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "fresco-trace-monitor");
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        f46469c = g.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f46485a;

        /* renamed from: b  reason: collision with root package name */
        long f46486b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, Long> f46487c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        JSONObject f46488d;

        /* renamed from: e  reason: collision with root package name */
        Object f46489e;

        static {
            Covode.recordClassIndex(28373);
        }

        a() {
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestCancellation(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        f46469c.submit(new Runnable() {
            /* class com.f.a.c.AnonymousClass5 */

            static {
                Covode.recordClassIndex(28372);
            }

            public final void run() {
                c cVar = c.this;
                String str = str;
                long j2 = currentTimeMillis;
                a remove = cVar.f46470a.remove(str);
                if (remove != null && b.f46467d) {
                    com.ss.a.a.a.b("Fresco", com.a.a(null, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", new Object[]{Long.valueOf(j2), str, Long.valueOf(c.a(Long.valueOf(remove.f46486b), j2))}));
                }
            }
        });
    }

    private c(byte b2) {
        this.f46471b = new d() {
            /* class com.f.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28369);
            }

            @Override // com.facebook.net.d
            public final void a(com.facebook.net.g gVar, b bVar, JSONObject jSONObject) {
                c(gVar, bVar, jSONObject);
            }

            @Override // com.facebook.net.d
            public final void b(com.facebook.net.g gVar, b bVar, JSONObject jSONObject) {
                c(gVar, bVar, jSONObject);
            }

            private void c(com.facebook.net.g gVar, b bVar, JSONObject jSONObject) {
                long j2;
                Object remove = jSONObject.remove("requestId");
                Object remove2 = jSONObject.remove("retryCount");
                Object remove3 = jSONObject.remove("queue_time");
                Object remove4 = jSONObject.remove("fetch_time");
                try {
                    if (remove instanceof String) {
                        String str = (String) remove;
                        if (!TextUtils.isEmpty(str)) {
                            int i2 = -1;
                            if (remove2 instanceof Integer) {
                                i2 = ((Integer) remove2).intValue();
                            }
                            long j3 = -1;
                            if (remove3 instanceof Long) {
                                j2 = ((Long) remove3).longValue();
                            } else {
                                j2 = -1;
                            }
                            if (remove4 instanceof Long) {
                                j3 = ((Long) remove4).longValue();
                            }
                            a aVar = c.this.f46470a.get(str);
                            if (aVar != null) {
                                JSONObject jSONObject2 = aVar.f46488d;
                                jSONObject2.put("is_request_network", true);
                                jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                                jSONObject2.put("retry_count", i2);
                                jSONObject2.put("queue_duration", j2);
                                jSONObject2.put("download_duration", j3);
                                c.a(bVar, jSONObject2);
                                c.a(gVar, jSONObject2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        };
        this.f46470a = new ConcurrentHashMap<>();
        com.facebook.net.c.f48949b = this.f46471b;
    }

    static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("Canceled") || str.contains("canceled")) {
            return true;
        }
        return false;
    }

    static long a(Long l2, long j2) {
        if (l2 != null) {
            return j2 - l2.longValue();
        }
        return -1;
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerStart(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = this.f46470a.get(str);
        if (aVar != null) {
            aVar.f46487c.put(str + str2, Long.valueOf(currentTimeMillis));
            JSONObject jSONObject = aVar.f46488d;
            if (jSONObject != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put(str2, new JSONObject());
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void a(com.facebook.net.g gVar, JSONObject jSONObject) {
        String str;
        String str2;
        try {
            String str3 = "";
            if (gVar.f48990a != null) {
                com.bytedance.retrofit2.client.b a2 = gVar.f48990a.f42629a.a("Nw-Session-Trace");
                com.bytedance.retrofit2.client.b a3 = gVar.f48990a.f42629a.a("x-net-info.remoteaddr");
                if (a2 != null) {
                    str = gVar.f48990a.f42629a.a("Nw-Session-Trace").f42472b;
                } else {
                    str = str3;
                }
                if (a3 != null) {
                    str2 = gVar.f48990a.f42629a.a("x-net-info.remoteaddr").f42472b;
                } else {
                    str2 = str3;
                }
            } else if (gVar.f48991b != null) {
                str = gVar.f48991b.header("Nw-Session-Trace");
                str2 = gVar.f48991b.header("x-snssdk.remoteaddr");
            } else {
                str2 = str3;
                str = str2;
            }
            if (str == null) {
                str = str3;
            }
            jSONObject.put("nw-session-trace", str);
            if (str2 != null) {
                str3 = str2;
            }
            jSONObject.put("server_ip", str3);
        } catch (Exception e2) {
            if (f.f46491a) {
                Log.getStackTraceString(e2);
            }
            e2.printStackTrace();
        }
    }

    protected static void a(b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", bVar.f28917e);
                jSONObject2.put("responseBack", bVar.f28918f);
                jSONObject2.put("completeReadResponse", bVar.f28919g);
                jSONObject2.put("requestEnd", bVar.f28920h);
                jSONObject2.put("recycleCount", bVar.f28921i);
                if (bVar.v == 0) {
                    jSONObject2.put("timing_dns", bVar.f28922j);
                    jSONObject2.put("timing_connect", bVar.f28923k);
                    jSONObject2.put("timing_ssl", bVar.f28924l);
                    jSONObject2.put("timing_send", bVar.f28925m);
                    jSONObject2.put("timing_wait", bVar.q);
                    jSONObject2.put("timing_receive", bVar.o);
                    jSONObject2.put("timing_total", bVar.r);
                    jSONObject2.put("timing_isSocketReused", bVar.p);
                    jSONObject2.put("timing_totalSendBytes", bVar.s);
                    jSONObject2.put("timing_totalReceivedBytes", bVar.t);
                    jSONObject2.put("timing_remoteIP", bVar.f28913a);
                    jSONObject2.put("request_log", bVar.y);
                }
                if (bVar.z != null) {
                    jSONObject2.put("req_info", bVar.z);
                }
                jSONObject2.put("download", bVar.A);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (com.bytedance.ttnet.c.a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e2) {
                if (f.f46491a) {
                    Log.getStackTraceString(e2);
                }
                e2.printStackTrace();
            }
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestSuccess(final com.facebook.imagepipeline.o.b bVar, final String str, boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        f46469c.submit(new Runnable() {
            /* class com.f.a.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(28370);
            }

            public final void run() {
                boolean optBoolean;
                int i2;
                c cVar = c.this;
                com.facebook.imagepipeline.o.b bVar = bVar;
                String str = str;
                long j2 = currentTimeMillis;
                com.facebook.imagepipeline.p.b.a();
                a remove = cVar.f46470a.remove(str);
                if (remove != null) {
                    JSONObject jSONObject = remove.f46488d;
                    if (!b.f46465b) {
                        optBoolean = jSONObject.optBoolean("is_request_network", false);
                    } else if (bVar.mSourceUriType == 0) {
                        optBoolean = true;
                    } else {
                        optBoolean = false;
                    }
                    if (optBoolean) {
                        try {
                            if (remove.f46489e instanceof String) {
                                jSONObject.put("scene_tag", remove.f46489e);
                            }
                            jSONObject.put("duration", c.a(Long.valueOf(remove.f46486b), j2));
                            jSONObject.put("load_status", "success");
                            jSONObject.put("timestamp", Long.valueOf(remove.f46486b));
                            jSONObject.put("log_type", "image_monitor_v2");
                            jSONObject.put("log_version", 1);
                            jSONObject.put("uri", bVar.mSourceUri.toString());
                            jSONObject.put("image_sdk_version", "1.13.9.22");
                            if (h.a().b()) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            jSONObject.put("retry_open", i2);
                            JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("image_status", 0);
                                if (optJSONObject.opt("image_origin") == null) {
                                    optJSONObject.put("image_origin", 7);
                                }
                                optJSONObject.put("disk_cache_type", d.a(bVar.mCacheChoice));
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        b.a(true, str, jSONObject);
                    }
                    if (jSONObject.optBoolean("is_request_network", false) && b.f46467d) {
                        com.ss.a.a.a.b("Fresco", com.a.a(null, "time %d: onRequestSuccess: {url: %s, requestId: %s, elapsedTime: %d ms, scene_tag: %s}", new Object[]{Long.valueOf(j2), bVar.mSourceUri.toString(), str, Long.valueOf(c.a(Long.valueOf(remove.f46486b), j2)), jSONObject.optString("scene_tag")}));
                    }
                    com.facebook.imagepipeline.p.b.a();
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r7.equals("BitmapMemoryCacheGetProducer") != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r7.equals("PostprocessedBitmapMemoryCacheProducer") != false) goto L_0x006c;
     */
    @Override // com.facebook.imagepipeline.n.an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUltimateProducerReached(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.f.a.c.onUltimateProducerReached(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    @Override // com.facebook.imagepipeline.n.an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProducerFinishWithSuccess(java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.f.a.c.onProducerFinishWithSuccess(java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestFailure(final com.facebook.imagepipeline.o.b bVar, final String str, final Throwable th, boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        f46469c.submit(new Runnable() {
            /* class com.f.a.c.AnonymousClass4 */

            static {
                Covode.recordClassIndex(28371);
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8 A[Catch:{ JSONException -> 0x0217 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 627
                */
                throw new UnsupportedOperationException("Method not decompiled: com.f.a.c.AnonymousClass4.run():void");
            }
        });
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestStart(com.facebook.imagepipeline.o.b bVar, Object obj, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        com.facebook.imagepipeline.p.b.a();
        a aVar = new a();
        aVar.f46485a = str;
        aVar.f46486b = currentTimeMillis;
        aVar.f46489e = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (b.f46466c) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            aVar.f46488d = jSONObject;
        }
        this.f46470a.put(str, aVar);
        com.facebook.imagepipeline.p.b.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    @Override // com.facebook.imagepipeline.n.an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProducerFinishWithFailure(java.lang.String r14, java.lang.String r15, java.lang.Throwable r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.f.a.c.onProducerFinishWithFailure(java.lang.String, java.lang.String, java.lang.Throwable, java.util.Map):void");
    }
}
