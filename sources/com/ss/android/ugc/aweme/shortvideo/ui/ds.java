package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.f;
import com.ss.android.ugc.tools.f.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ds implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131696a;

    static {
        Covode.recordClassIndex(86248);
    }

    ds(cj cjVar) {
        this.f131696a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        cj cjVar = this.f131696a;
        r.a("click_privacy_setting", new b().a("creation_id", cjVar.K.creationId).a("enter_from", "video_post_page").a("content_type", es.c(cjVar.K)).a("content_source", cjVar.K.getAvetParameter().getContentSource()).a("shoot_way", cjVar.K.mShootWay).a("enter_method", "publishing").a("is_private", cjVar.f131594a ? 1 : 0).f149193a);
        int permission = cjVar.n.f125110b.getPermission();
        cjVar.aa = "click_audience_select";
        f.a(cjVar.aa, permission);
    }
}
