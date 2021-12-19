package com.ss.android.ugc.aweme.shortvideo.upload;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class af {

    /* renamed from: e  reason: collision with root package name */
    public static final a f131978e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f131979a = com.bytedance.ies.abmock.b.a().a(true, "upload_status_report_gap_s", -1);

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f131980b;

    /* renamed from: c  reason: collision with root package name */
    public long f131981c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f131982d;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentLinkedQueue<String> f131983f = new ConcurrentLinkedQueue<>();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f131984g;

    /* renamed from: h  reason: collision with root package name */
    private final String f131985h;

    /* renamed from: i  reason: collision with root package name */
    private final String f131986i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f131987j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.upload.c.b f131988k;

    static {
        Covode.recordClassIndex(86481);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86482);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f131989a;

        static {
            Covode.recordClassIndex(86483);
        }

        public b(af afVar) {
            this.f131989a = afVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f131989a.a(null);
        }
    }

    public final void b(s sVar) {
        l.d(sVar, "");
        if (this.f131979a > 0) {
            this.f131984g = true;
            f.a.b.b bVar = this.f131980b;
            if (bVar != null && !bVar.isDisposed()) {
                f.a.b.b bVar2 = this.f131980b;
                if (bVar2 == null) {
                    l.b();
                }
                bVar2.dispose();
            }
            a(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(s sVar) {
        String str;
        String str2;
        String str3;
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("mob_lost_assist", 1).a("shoot_way", this.f131986i).a("mob_lost_gap", SystemClock.uptimeMillis() - this.f131981c).a("status", 20001).a("upload_is_success", sVar);
        String str4 = "1";
        if (this.f131987j) {
            str = str4;
        } else {
            str = "0";
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("retry_publish", str);
        if (this.f131988k.c()) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("is_synthetic_success", str2).a("synthetic_error_code", this.f131988k.f132099d).a("publish_step", 32);
        if (this.f131982d) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("is_click_publish", str3);
        if (!c.a(i.f115645a)) {
            str4 = "0";
        }
        com.ss.android.ugc.tools.f.b a6 = a5.a("network_available", str4);
        ArrayList arrayList = new ArrayList(this.f131983f);
        this.f131983f.clear();
        Iterator it = arrayList.iterator();
        String str5 = "";
        while (it.hasNext()) {
            str5 = str5 + " | " + ((String) it.next());
        }
        r.a("parallel_publish_result", a6.a("upload_error_msg", str5).a("publish_id", this.f131985h).f149193a);
    }

    public final void a(int i2, String str) {
        if (this.f131979a > 0 && !this.f131984g && str != null && str.length() != 0) {
            if (this.f131983f.size() >= 20) {
                this.f131983f.poll();
            }
            this.f131983f.offer("[" + i2 + "][" + System.currentTimeMillis() + ']' + str);
        }
    }

    public af(String str, String str2, boolean z, boolean z2, com.ss.android.ugc.aweme.shortvideo.upload.c.b bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        this.f131985h = str;
        this.f131986i = str2;
        this.f131987j = z;
        this.f131982d = z2;
        this.f131988k = bVar;
    }
}
