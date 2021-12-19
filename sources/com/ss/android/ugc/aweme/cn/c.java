package com.ss.android.ugc.aweme.cn;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.asve.f.g;
import com.ss.android.ugc.aweme.cn.b;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f71214a;

    /* renamed from: b  reason: collision with root package name */
    final d f71215b;

    static {
        Covode.recordClassIndex(43837);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ String $actionName;
        final /* synthetic */ e $actionParams;
        final /* synthetic */ PrivacyCert $actionPrivacyCert;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(43838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, PrivacyCert privacyCert, e eVar) {
            super(0);
            this.this$0 = cVar;
            this.$actionName = str;
            this.$actionPrivacyCert = privacyCert;
            this.$actionParams = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            h.f.a.m<PrivacyCert, e, z> c2;
            a a2 = this.this$0.f71214a.a(this.$actionName);
            if (!(a2 == null || (c2 = a2.c()) == null)) {
                c2.invoke(this.$actionPrivacyCert, this.$actionParams);
            }
            return z.f158842a;
        }
    }

    public c(d dVar) {
        l.d(dVar, "");
        this.f71215b = dVar;
        b bVar = new b(dVar);
        this.f71214a = bVar;
        bVar.f71206a.add(b.a("action_name_init_camera", n.a((Object) 0), new b.c(bVar)));
        bVar.f71206a.add(b.a("action_name_start_preview", n.a((Object) 0), new b.e(bVar)));
        bVar.f71206a.add(b.a("action_name_stop_preview", n.b(1, 3), new b.f(bVar)));
        bVar.f71206a.add(b.a("action_name_release_camera", n.b(1, 3), new b.d(bVar)));
        bVar.f71206a.add(b.a("action_name_close_camera", n.a((Object) 1), new b.C1606b(bVar)));
        bVar.f71206a.add(b.a("action_name_switch_wide_camera", n.b(1, 0), new b.j(bVar)));
        bVar.f71206a.add(b.a("action_name_switch_camera", n.b(1, 0), new b.g(bVar)));
        bVar.f71206a.add(b.a("action_name_switch_shake_free_mode", n.b(1, 0), new b.h(bVar)));
        bVar.f71206a.add(b.a("action_name_switch_ar_mode", n.b(1, 0), new b.i(bVar)));
    }

    public final void a(String str, PrivacyCert privacyCert, e eVar) {
        l.d(str, "");
        g.a(new a(this, str, privacyCert, eVar));
    }
}
