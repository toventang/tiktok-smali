package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.comment.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ae f131380a;

    static {
        Covode.recordClassIndex(86078);
    }

    af(ae aeVar) {
        this.f131380a = aeVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ae aeVar = this.f131380a;
        if (aeVar.f131378c == null || aeVar.f131378c.r != a.f71516d) {
            aeVar.f131376a.setChecked(!aeVar.f131376a.d());
            if (aeVar.f131377b != null && aeVar.f131376a != null) {
                aeVar.f131377b.put("to_status", aeVar.f131376a.d() ? "off" : "on");
                r.a("disable_comment", aeVar.f131377b);
                return;
            }
            return;
        }
        new b(aeVar.f131376a).e(R.string.t8).b();
    }
}
