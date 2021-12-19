package com.bytedance.helios.sdk.c;

import android.os.Handler;
import com.bytedance.apm.a.d;
import com.bytedance.apm.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.a.a.g;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.b.r;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.keva.Keva;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static long f30804a = a().getLong("alog_last_upload_time", 0);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f30805b;

    /* renamed from: c  reason: collision with root package name */
    public static long f30806c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f30807d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final h f30808e = i.a((h.f.a.a) C0647a.f30811a);

    /* renamed from: f  reason: collision with root package name */
    private static Runnable f30809f;

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f30814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f30815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f30816c;

        static {
            Covode.recordClassIndex(17899);
        }

        /* renamed from: com.bytedance.helios.sdk.c.a$c$a  reason: collision with other inner class name */
        static final class C0648a implements e {

            /* renamed from: a  reason: collision with root package name */
            public static final C0648a f30817a = new C0648a();

            static {
                Covode.recordClassIndex(17900);
            }

            C0648a() {
            }

            @Override // com.bytedance.apm.a.e
            public final void a() {
                ALog.asyncFlush();
            }
        }

        public final void run() {
            Boolean bool;
            if (ALog.sConfig != null) {
                try {
                    f.a(false);
                    ALog.syncFlush();
                    com.ss.android.agilelogger.a aVar = ALog.sConfig;
                    l.a((Object) aVar, "");
                    com.bytedance.apm.b.a(aVar.f59087f, this.f30815b / 1000, this.f30816c / 1000, "sky_eye_alog_scene", C0648a.f30817a, new b(this));
                } catch (Exception e2) {
                    o.a(new r("-101", e2.getMessage()));
                    o.a(new com.bytedance.helios.api.c.b(null, e2, "label_upload_alog", null, 9));
                }
            } else {
                int i2 = this.f30814a + 1;
                this.f30814a = i2;
                if (i2 <= 6) {
                    com.bytedance.helios.a.a.a.b().postDelayed(this, 10000);
                    return;
                }
                StringBuilder sb = new StringBuilder("isFirstStart=");
                com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
                if (envAppInfo != null) {
                    bool = Boolean.valueOf(envAppInfo.f30714e);
                } else {
                    bool = null;
                }
                o.a(new r("-103", sb.append(bool).toString()));
            }
        }

        c(long j2, long j3) {
            this.f30815b = j2;
            this.f30816c = j3;
        }

        static final class b implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f30818a;

            static {
                Covode.recordClassIndex(17901);
            }

            b(c cVar) {
                this.f30818a = cVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
                if (r6 != null) goto L_0x0035;
             */
            @Override // com.bytedance.apm.a.d
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(boolean r5, org.json.JSONObject r6) {
                /*
                    r4 = this;
                    if (r5 == 0) goto L_0x0026
                    com.bytedance.helios.sdk.c.a$c r0 = r4.f30818a
                    long r0 = r0.f30816c
                    com.bytedance.helios.sdk.c.a.f30804a = r0
                    com.bytedance.keva.Keva r3 = com.bytedance.helios.sdk.c.a.a()
                    long r1 = com.bytedance.helios.sdk.c.a.f30804a
                    java.lang.String r0 = "alog_last_upload_time"
                    r3.storeLong(r0, r1)
                    com.bytedance.keva.Keva r1 = com.bytedance.helios.sdk.c.a.a()
                    java.lang.String r0 = "alog_last_request_start_time"
                    r1.erase(r0)
                    com.bytedance.keva.Keva r1 = com.bytedance.helios.sdk.c.a.a()
                    java.lang.String r0 = "alog_last_request_end_time"
                    r1.erase(r0)
                    return
                L_0x0026:
                    r2 = 0
                    if (r6 == 0) goto L_0x004a
                    java.lang.String r0 = "code"
                    java.lang.Object r0 = r6.opt(r0)
                    if (r0 == 0) goto L_0x004a
                    java.lang.String r1 = r0.toString()
                L_0x0035:
                    java.lang.String r0 = "exception"
                    java.lang.Object r0 = r6.opt(r0)
                    if (r0 == 0) goto L_0x0041
                    java.lang.String r2 = r0.toString()
                L_0x0041:
                    com.bytedance.helios.api.b.r r0 = new com.bytedance.helios.api.b.r
                    r0.<init>(r1, r2)
                    com.bytedance.helios.api.b.o.a(r0)
                    return
                L_0x004a:
                    r1 = r2
                    if (r6 == 0) goto L_0x0041
                    goto L_0x0035
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.c.a.c.b.a(boolean, org.json.JSONObject):void");
            }
        }
    }

    public static Keva a() {
        return (Keva) f30808e.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.helios.sdk.c.a$a  reason: collision with other inner class name */
    static final class C0647a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0647a f30811a = new C0647a();

        static {
            Covode.recordClassIndex(17897);
        }

        C0647a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("helios", 1);
        }
    }

    public static void b() {
        long currentTimeMillis = System.currentTimeMillis();
        a(currentTimeMillis - f30806c, currentTimeMillis, 5000);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f30812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f30813b;

        static {
            Covode.recordClassIndex(17898);
        }

        b(long j2, long j3) {
            this.f30812a = j2;
            this.f30813b = j3;
        }

        public final void run() {
            long j2 = this.f30812a;
            long j3 = this.f30813b;
            g.a(j2);
            g.a(j3);
            com.bytedance.helios.a.a.a.b().post(new c(j2, j3));
        }
    }

    static {
        Covode.recordClassIndex(17896);
    }

    public static void a(long j2, long j3, long j4) {
        Boolean bool;
        if (!f30805b) {
            StringBuilder sb = new StringBuilder("isFirstStart=");
            com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                bool = Boolean.valueOf(envAppInfo.f30714e);
            } else {
                bool = null;
            }
            o.a(new r("-102", sb.append(bool).toString()));
            return;
        }
        Runnable runnable = f30809f;
        if (runnable != null) {
            com.bytedance.helios.a.a.a.b().removeCallbacks(runnable);
        }
        f30809f = new b(j2, j3);
        Handler b2 = com.bytedance.helios.a.a.a.b();
        Runnable runnable2 = f30809f;
        if (runnable2 == null) {
            l.a();
        }
        b2.postDelayed(runnable2, j4);
    }
}
