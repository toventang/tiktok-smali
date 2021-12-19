package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ae implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f127104a;

    static {
        Covode.recordClassIndex(83388);
    }

    ae(i iVar) {
        this.f127104a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f127104a;
        iVar.f127155d.b();
        iVar.a(false, (h) null, false);
        d.a("prop_pin_cancel", new b().a("enter_from", "video_edit_page").a("shoot_way", iVar.u.mShootWay).a("creation_id", iVar.u.creationId).a("content_type", iVar.u.getAvetParameter().getContentType()).a("content_source", iVar.u.getAvetParameter().getContentSource()).a("prop_id", i.a(iVar.K)).f149193a);
    }
}
