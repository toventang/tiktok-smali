package com.ss.android.ugc.aweme.cn.a;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cn.d;
import com.ss.android.ugc.aweme.cn.h;
import com.ss.android.ugc.aweme.cn.i;
import h.f.b.l;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f71204a = "type_surface_view";

    static {
        Covode.recordClassIndex(43824);
    }

    public final void a(PrivacyCert privacyCert) {
        l.d(privacyCert, "");
        a(new i(this.f71204a, new h(0, 0), new d("action_name_init_camera", privacyCert, null)));
    }

    public final void a(boolean z, PrivacyCert privacyCert) {
        a(new i(this.f71204a, new h(0, 0), new d("action_name_release_camera", privacyCert, new com.ss.android.ugc.aweme.cn.e(false, z, false, null, null, false, null, false, 253))));
    }

    public final void b(boolean z, PrivacyCert privacyCert) {
        a(new i(this.f71204a, new h(0, 0), new d("action_name_close_camera", privacyCert, new com.ss.android.ugc.aweme.cn.e(false, z, false, null, null, false, null, false, 253))));
    }
}
