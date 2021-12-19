package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;

final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118262a;

    static {
        Covode.recordClassIndex(76803);
    }

    t(j jVar) {
        this.f118262a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118262a;
        r.a("click_media_type_dropdown", new d().a("prop_id", jVar.ap == null ? "" : jVar.ap.id).a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[jVar.an]).f66730a);
        jVar.f118235a.show(jVar.getChildFragmentManager(), "MediaFilterFragment");
    }
}
