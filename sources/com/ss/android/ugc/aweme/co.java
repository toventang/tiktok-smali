package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.logger.a;
import f.a.d.f;

final /* synthetic */ class co implements f {

    /* renamed from: a  reason: collision with root package name */
    private final cm f71242a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71243b;

    static {
        Covode.recordClassIndex(43849);
    }

    co(cm cmVar, boolean z) {
        this.f71242a = cmVar;
        this.f71243b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        cm cmVar = this.f71242a;
        boolean z = this.f71243b;
        a.b.f109011a.b("app_start_to_get_did", false);
        a.b.f109011a.b("cold_boot_first_request_to_get_did", false);
        if (z) {
            new f.b().b(cq.f78276a.d()).a();
        } else {
            new f.b().b(cq.f78276a.e()).a();
        }
        if (cmVar.f71190d != null) {
            cmVar.f71190d.dispose();
        }
        cmVar.f71190d = null;
    }
}
