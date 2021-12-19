package com.bytedance.push.notification;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.PushBody;
import com.bytedance.push.c;
import com.bytedance.push.c.b;
import com.bytedance.push.c.d;
import com.bytedance.push.c.m;
import com.bytedance.push.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements com.bytedance.push.c.g {

    /* renamed from: a  reason: collision with root package name */
    public final d f42263a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Long> f42264b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final h f42265c;

    /* renamed from: d  reason: collision with root package name */
    private final m f42266d;

    /* renamed from: e  reason: collision with root package name */
    private final d f42267e;

    /* renamed from: f  reason: collision with root package name */
    private final c f42268f;

    static {
        Covode.recordClassIndex(25822);
    }

    public static String a() {
        b bVar = f.f42099a.h().x;
        if (bVar == null) {
            return "";
        }
        String a2 = bVar.a();
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return "";
    }

    public g(c cVar) {
        this.f42265c = cVar.f42069m;
        this.f42263a = cVar.f42068l;
        this.f42266d = cVar.s;
        this.f42267e = new d();
        this.f42268f = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r2 == null) goto L_0x009a;
     */
    @Override // com.bytedance.push.c.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.g.a(java.lang.String, int):void");
    }

    private void a(final int i2, final PushBody pushBody, final boolean z) {
        AnonymousClass1 r2 = new Runnable() {
            /* class com.bytedance.push.notification.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25823);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 183
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.g.AnonymousClass1.run():void");
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(r2);
        } else {
            r2.run();
        }
        e.a(new com.bytedance.push.i.c(i2, pushBody));
    }

    @Override // com.bytedance.push.c.g
    public final void a(Context context, String str, int i2) {
        d dVar = this.f42267e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (dVar.f42253c != i2 || elapsedRealtime - dVar.f42251a > 1000 || !TextUtils.equals(dVar.f42252b, str)) {
            dVar.f42252b = str;
            dVar.f42253c = i2;
            dVar.f42251a = elapsedRealtime;
            try {
                PushBody pushBody = new PushBody(new JSONObject(str));
                m mVar = this.f42266d;
                if (mVar != null) {
                    mVar.a(context, i2, pushBody);
                }
                if (!this.f42268f.y) {
                    AnonymousClass2 r2 = new Runnable(null, pushBody.f42028e, pushBody.f42024a, pushBody.f42026c) {
                        /* class com.bytedance.push.notification.g.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ JSONObject f42273a = null;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ boolean f42274b = true;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f42275c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ long f42276d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ String f42277e;

                        static {
                            Covode.recordClassIndex(25824);
                        }

                        public final void run() {
                            MethodCollector.i(6796);
                            JSONObject jSONObject = this.f42273a;
                            if (jSONObject == null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            if (!com.bytedance.push.k.b.f42229a || !TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
                                if (this.f42274b) {
                                    jSONObject.put("click_position", "notify");
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                jSONObject.put("ttpush_sec_target_uid", this.f42275c);
                                jSONObject.put("local_sec_uid", g.a());
                                jSONObject.put("client_time", System.currentTimeMillis());
                                jSONObject.put("real_filter", "0");
                                jSONObject.put("rule_id", this.f42276d);
                                jSONObject.put("push_sdk_version", "30203");
                                jSONObject.put("push_sdk_version_name", "3.2.3-alpha.16-tiktok");
                                if (!TextUtils.isEmpty(this.f42277e)) {
                                    jSONObject.put("ttpush_group_id", this.f42277e);
                                }
                                synchronized (g.this.f42264b) {
                                    try {
                                        if (!g.this.f42264b.contains(Long.valueOf(this.f42276d))) {
                                            g.this.f42264b.add(Long.valueOf(this.f42276d));
                                            g.this.f42263a.a("push_click", jSONObject);
                                            MethodCollector.o(6796);
                                        }
                                    } finally {
                                        MethodCollector.o(6796);
                                    }
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("rule_id64 is empty，please set effective rule_id64 for push click event !!");
                                MethodCollector.o(6796);
                                throw illegalArgumentException;
                            }
                        }

                        {
                            this.f42275c = r4;
                            this.f42276d = r5;
                            this.f42277e = r7;
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        e.a(r2);
                    } else {
                        r2.run();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
