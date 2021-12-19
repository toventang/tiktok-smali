package com.ss.android.ugc.aweme.cn.a;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.aweme.cn.d;
import com.ss.android.ugc.aweme.cn.e;
import com.ss.android.ugc.aweme.cn.h;
import com.ss.android.ugc.aweme.cn.i;
import com.ss.android.ugc.aweme.tools.g;
import h.f.b.l;

public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f71205a = "type_ui_operation";

    static {
        Covode.recordClassIndex(43825);
    }

    public final void a(int i2) {
        if (i2 == 1) {
            a(this, "action_name_switch_shake_free_mode", null, new e(false, false, false, null, null, true, null, false, 223));
        } else if (i2 == 0) {
            a(this, "action_name_switch_shake_free_mode", null, new e(false, false, false, null, null, false, null, false, 223));
        }
    }

    public final void a(g gVar, PrivacyCert privacyCert, String str) {
        l.d(gVar, "");
        a(this, "action_name_switch_camera", privacyCert, new e(false, false, false, gVar, str, false, null, false, 231));
    }

    public final void a(boolean z, l.a aVar, PrivacyCert privacyCert) {
        h.f.b.l.d(aVar, "");
        a(this, "action_name_switch_ar_mode", privacyCert, new e(false, false, false, null, null, false, aVar, z, 63));
    }

    public static /* synthetic */ void a(f fVar, String str, PrivacyCert privacyCert, e eVar) {
        fVar.a(new i(fVar.f71205a, new h(0, 0), new d(str, privacyCert, eVar)));
    }
}
