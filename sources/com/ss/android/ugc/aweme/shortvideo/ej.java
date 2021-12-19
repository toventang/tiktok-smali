package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ej implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final eh f128433a;

    static {
        Covode.recordClassIndex(84215);
    }

    ej(eh ehVar) {
        this.f128433a = ehVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        eh ehVar = this.f128433a;
        r.a("click_video_at", new d().a("enter_from", "video_post_page").a("enter_method", "button").f66730a);
        if (ehVar.f128419c.getSelectionEnd() > ehVar.f128419c.getSelectionStart()) {
            return;
        }
        if (!c.u.b()) {
            c.u.a(ehVar.f128418b, "", "click_at_friend", (z.a) null);
        } else if (!ehVar.e()) {
            c.f115626e.a(ehVar.f128418b);
        }
    }
}
