package com.ss.android.ad.splash.core.i;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.h;
import com.ss.android.ad.splash.f.l;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public Context f58599a;

    /* renamed from: b  reason: collision with root package name */
    public g f58600b;

    static {
        Covode.recordClassIndex(36336);
    }

    @Override // com.ss.android.ad.splash.core.i.d
    public final void a() {
        if (h.a(this.f58599a)) {
            com.ss.android.ad.splash.core.h.f58580i.submit(new Runnable() {
                /* class com.ss.android.ad.splash.core.i.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36337);
                }

                public final void run() {
                    final List<f> a2 = e.this.f58600b.a();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.ss.android.ad.splash.core.i.e.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(36338);
                        }

                        public final void run() {
                            e eVar = e.this;
                            List<f> list = a2;
                            if (f.b(list)) {
                                for (f fVar : list) {
                                    new a(eVar, fVar, (byte) 0).executeOnExecutor(com.ss.android.ad.splash.core.h.f58580i, new Void[0]);
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        private f f58605b;

        /* renamed from: c  reason: collision with root package name */
        private long f58606c;

        static {
            Covode.recordClassIndex(36339);
        }

        private Void a() {
            boolean z;
            String str = this.f58605b.f58608b;
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            if (this.f58605b.f58610d == 0) {
                e.this.f58600b.c(this.f58605b);
                return null;
            }
            while (true) {
                if (this.f58605b.f58610d <= 0 || isCancelled()) {
                    break;
                }
                if (this.f58605b.f58610d == 5) {
                    e.this.f58600b.a(this.f58605b);
                }
                if (!h.a(e.this.f58599a)) {
                    break;
                }
                String str2 = this.f58605b.f58608b;
                if (!TextUtils.isEmpty(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f58606c = currentTimeMillis;
                    if (str2.contains("{TS}") || str2.contains("__TS__")) {
                        str2 = str2.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                    }
                }
                int i2 = this.f58605b.f58611e;
                if (this.f58605b.f58609c) {
                    str2 = a(str2);
                }
                if (com.ss.android.ad.splash.core.h.f58574c == null) {
                    return null;
                }
                i a2 = com.ss.android.ad.splash.core.h.f58574c.a(str2);
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    f fVar = this.f58605b;
                    if (fVar != null && fVar.f58612f > 0) {
                        try {
                            jSONObject.put("track_url_list", str2);
                            jSONObject.put("track_status", a2.f58616b);
                            jSONObject.put("ts", this.f58606c);
                            jSONObject.put("local_time_ms", System.currentTimeMillis());
                            if (!l.a(a2.f58615a)) {
                                jSONObject.put("user_agent", a2.f58615a);
                            } else {
                                jSONObject.put("user_agent", -1);
                            }
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("ad_event_type", "monitor");
                            long j2 = -1;
                            if (com.ss.android.ad.splash.core.h.b() != null && com.ss.android.ad.splash.core.h.b().e() > 0) {
                                j2 = com.ss.android.ad.splash.core.h.b().e();
                            }
                            jSONObject.put("user_id", j2);
                            if (!l.a(this.f58605b.f58613g)) {
                                jSONObject.put("log_extra", this.f58605b.f58613g);
                            } else {
                                jSONObject.put("log_extra", -1);
                            }
                            String str3 = "";
                            if (i2 == 1) {
                                str3 = "show";
                            } else if (i2 == 2) {
                                str3 = "play";
                            } else if (i2 == 3) {
                                str3 = "click";
                            } else if (i2 == 4) {
                                str3 = "play_over";
                            }
                            jSONObject.put("track_label", str3);
                            com.ss.android.ad.splash.core.h.a(this.f58605b.f58612f, "track_ad", "track_url", jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (a2.f58616b >= 200 && a2.f58616b < 300) {
                        e.this.f58600b.c(this.f58605b);
                        g.c("track success : " + this.f58605b.f58608b);
                        break;
                    }
                }
                g.c("track fail : " + this.f58605b.f58608b);
                this.f58605b.f58610d--;
                if (this.f58605b.f58610d == 0) {
                    e.this.f58600b.c(this.f58605b);
                    g.c("track fail and delete : " + this.f58605b.f58608b);
                    break;
                }
                e.this.f58600b.b(this.f58605b);
            }
            String str4 = this.f58605b.f58608b;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key_send_track_url", str4);
                com.ss.android.ad.splash.b.a.a().a("service_ad_send_track_fail", (JSONObject) null, jSONObject2);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return null;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return a();
        }

        private static String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                return str;
            } catch (Exception e2) {
                e2.printStackTrace();
                return str;
            }
        }

        private a(f fVar) {
            this.f58605b = fVar;
        }

        /* synthetic */ a(e eVar, f fVar, byte b2) {
            this(fVar);
        }
    }

    public e(Context context, g gVar) {
        this.f58599a = context;
        this.f58600b = gVar;
    }

    private void a(long j2, String str, List<String> list, int i2) {
        if (f.b(list)) {
            for (String str2 : list) {
                new a(this, new f(j2, str, UUID.randomUUID().toString(), str2, true, 5, i2), (byte) 0).executeOnExecutor(com.ss.android.ad.splash.core.h.f58580i, new Void[0]);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(j2, str, list, 1);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void b(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(j2, str, list, 3);
        com.ss.android.ad.splash.core.h.h().h();
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void c(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(j2, str, list, 2);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void d(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(j2, str, list, 4);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, String str, long j2, List<String> list, String str2, boolean z, long j3, JSONObject jSONObject, c cVar) {
        int i2;
        str.hashCode();
        switch (str.hashCode()) {
            case -1877652737:
                if (str.equals("play_over")) {
                    i2 = 4;
                    break;
                }
                i2 = 0;
                break;
            case 3443508:
                if (str.equals("play")) {
                    i2 = 2;
                    break;
                }
                i2 = 0;
                break;
            case 3529469:
                if (str.equals("show")) {
                    i2 = 1;
                    break;
                }
                i2 = 0;
                break;
            case 94750088:
                if (str.equals("click")) {
                    i2 = 3;
                    break;
                }
                i2 = 0;
                break;
            default:
                i2 = 0;
                break;
        }
        a(j2, str2, list, i2);
    }
}
