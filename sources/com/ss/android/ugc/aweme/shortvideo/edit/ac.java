package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class ac implements z.b {

    /* renamed from: a  reason: collision with root package name */
    static final z.b f126732a = new ac();

    static {
        Covode.recordClassIndex(83139);
    }

    private ac() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.z.b
    public final void a(int i2, boolean z) {
        g.a().A();
        if (i2 == 3 && z) {
            r.a("logout_in_ai_upload", new b().a("login", "false").f149193a);
            l.f115658a.b().k().b();
        }
    }
}
