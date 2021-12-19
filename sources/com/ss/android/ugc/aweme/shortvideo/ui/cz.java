package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.a;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cz implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131671a;

    static {
        Covode.recordClassIndex(86227);
    }

    cz(cj cjVar) {
        this.f131671a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        cj cjVar = this.f131671a;
        if (!c.u.b()) {
            c.u.a(cjVar, "", "", (z.a) null);
            return;
        }
        r.a("click_video_tag", new d().a("enter_from", "video_post_page").f66730a);
        a.f104775a.a(cjVar.getContext(), "video_post_page", null, cjVar.n.f125110b.getPermission(), cjVar.K.tagUserList, new es(cjVar));
    }
}
