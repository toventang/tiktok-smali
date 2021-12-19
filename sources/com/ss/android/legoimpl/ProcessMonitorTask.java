package com.ss.android.legoimpl;

import android.content.Context;
import com.bytedance.apm.a;
import com.bytedance.apm.config.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.ag;
import h.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class ProcessMonitorTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, String> f59620a = ag.b(new p(0, "Cold_Boot_Begin"), new p(1, "Cold_Boot_End"), new p(2, "Cold_Boot_End_Short"), new p(3, "Cold_Boot_End_Long"));

    static {
        Covode.recordClassIndex(36810);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements com.bytedance.apm.core.b {
        static {
            Covode.recordClassIndex(36811);
        }

        @Override // com.bytedance.apm.core.b
        public final String b() {
            return "";
        }

        @Override // com.bytedance.apm.core.b
        public final long c() {
            return 0;
        }

        a() {
        }

        @Override // com.bytedance.apm.core.b
        public final Map<String, String> a() {
            HashMap hashMap = new HashMap();
            q.b(hashMap, true);
            return hashMap;
        }
    }

    public static final class b implements com.bytedance.apm.g.b {
        static {
            Covode.recordClassIndex(36812);
        }

        @Override // com.bytedance.apm.g.b
        public final void a() {
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (!com.ss.android.ugc.aweme.lego.f.a.a(context)) {
            if (context != null) {
                a.C0521a.f24346a.a(context);
                c.a aVar = new c.a();
                c.a a2 = aVar.a("aid", d.n);
                a2.q = new a();
                a2.u = new b();
                a.C0521a.f24346a.a(aVar.a());
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("process_name", com.ss.android.ugc.aweme.lego.f.a.b(context) + "_" + this.f59620a.get(Integer.valueOf(com.ss.android.ugc.aweme.app.launch.a.a().getInt("runstate", 0))));
            com.bytedance.apm.b.a("control_process_init_event", jSONObject2, jSONObject, (JSONObject) null);
        }
    }
}
