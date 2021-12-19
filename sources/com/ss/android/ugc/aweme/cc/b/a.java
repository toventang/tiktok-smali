package com.ss.android.ugc.aweme.cc.b;

import com.bytedance.apm.n.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cc.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.fc;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.cc.a {

    /* renamed from: a  reason: collision with root package name */
    final String f69793a = "prf_page_load";

    static {
        Covode.recordClassIndex(43030);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cc.b.a$a  reason: collision with other inner class name */
    public static final class RunnableC1578a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f69794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69795b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f69796c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f69797d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f69798e;

        static {
            Covode.recordClassIndex(43031);
        }

        RunnableC1578a(a aVar, String str, b bVar, long j2, Map map) {
            this.f69794a = aVar;
            this.f69795b = str;
            this.f69796c = bVar;
            this.f69797d = j2;
            this.f69798e = map;
        }

        public final void run() {
            a aVar = this.f69794a;
            String str = this.f69795b;
            b bVar = this.f69796c;
            long j2 = this.f69797d;
            Map map = this.f69798e;
            if (fc.f90024a && c.a(aVar.f69793a)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                jSONObject.put("load_time", j2);
                jSONObject.put("load_result", String.valueOf(bVar.getValue()));
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                r.a(aVar.f69793a, jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cc.a
    public final void a(String str, b bVar, long j2) {
        l.d(str, "");
        l.d(bVar, "");
        a(str, bVar, j2, null);
    }

    @Override // com.ss.android.ugc.aweme.cc.a
    public final void a(String str, b bVar, long j2, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(bVar, "");
        g.c().execute(new RunnableC1578a(this, str, bVar, j2, map));
    }
}
