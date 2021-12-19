package com.bytedance.android.livesdk.ad;

import android.view.View;
import com.bytedance.android.live.s.a.a;
import com.bytedance.android.live.s.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f13668a;

    static {
        Covode.recordClassIndex(7574);
    }

    d(c cVar) {
        this.f13668a = cVar;
    }

    public final void onClick(View view) {
        c cVar = this.f13668a;
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = c.a();
        }
        if (!j.f107226e) {
            ao.a(cVar.f13658e, (int) R.string.efp);
        } else {
            a aVar = cVar.f13659f;
            k.a(cVar.f13658e);
            cVar.f13656c.setVisibility(0);
            cVar.f13655b.setVisibility(8);
            ((e) com.bytedance.android.live.t.a.a(e.class)).updateAdmin(cVar, !aVar.f12599g, aVar, cVar.f13660g, cVar.f13661h, cVar.f13662i);
            b.a.a("livesdk_anchor_admin_cancel_toast_click").a().a("user_id", cVar.f13659f.f12593a).a("action_type", "yes").b();
            b.a.a("livesdk_anchor_admin_cancel_toast_show").a().a("user_id", cVar.f13659f.f12593a).b();
            k.a(cVar.f13658e);
        }
        b.a.a("livesdk_anchor_admin_cancel_click").a().a("user_id", cVar.f13659f.f12593a).b();
    }
}
