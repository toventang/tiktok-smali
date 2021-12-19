package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.tools.draft.e.a;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f139796a;

    /* renamed from: b  reason: collision with root package name */
    private final c f139797b;

    static {
        Covode.recordClassIndex(91379);
    }

    j(i iVar, c cVar) {
        this.f139796a = iVar;
        this.f139797b = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f139796a;
        c cVar = this.f139797b;
        if (!g.a().o().c()) {
            cr.a();
            if (!cr.a(view.getContext())) {
                return;
            }
        }
        if (l.f115658a.b().a(cVar.f83185f, iVar.f139794e, true)) {
            e eVar = (e) iVar.itemView.getContext();
            ay.a(eVar, cVar, new l(iVar, eVar, cVar), new m(iVar, a.a(eVar, k.f139806a))).a();
        }
    }
}
