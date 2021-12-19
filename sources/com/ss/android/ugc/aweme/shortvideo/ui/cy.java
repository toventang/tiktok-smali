package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.tools.f.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cy implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131670a;

    static {
        Covode.recordClassIndex(86226);
    }

    cy(cj cjVar) {
        this.f131670a = cjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        cj cjVar = this.f131670a;
        bz bzVar = cjVar.A;
        new a.C1112a().a(new by()).a(true).f45299a.show(bzVar.f131570a.getChildFragmentManager(), "VideoPrivacySettingsSheet");
        r.a("click_video_privacy_settings_entrance", new b().a("creation_id", cjVar.K.creationId).a("enter_from", "video_post_page").a("shoot_way", cjVar.K.mShootWay).a("content_type", es.c(cjVar.K)).a("content_source", cjVar.K.getAvetParameter().getContentSource()).f149193a);
    }
}
