package com.ss.android.ugc.aweme.cc.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fd;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final String f69778a = "prf_page_start_time";

    static {
        Covode.recordClassIndex(43024);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f69779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f69781c;

        static {
            Covode.recordClassIndex(43025);
        }

        a(c cVar, String str, long j2) {
            this.f69779a = cVar;
            this.f69780b = str;
            this.f69781c = j2;
        }

        public final void run() {
            c cVar = this.f69779a;
            String str = this.f69780b;
            long j2 = this.f69781c;
            l.d(str, "");
            if (fd.f90027a && com.bytedance.apm.n.c.a(cVar.f69778a)) {
                l.d(str, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                jSONObject.put("load_time", j2);
                r.a(cVar.f69778a, jSONObject);
            }
        }
    }
}
