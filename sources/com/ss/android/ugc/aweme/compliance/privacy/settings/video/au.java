package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class au implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77867a;

    static {
        Covode.recordClassIndex(48255);
    }

    au(a aVar) {
        this.f77867a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f77867a;
        aVar.getContext();
        if (!a.e()) {
            aVar.c(R.string.de7);
            return;
        }
        if (a.c(aVar.f77828c) == 0) {
            aVar.f77832g = !aVar.f77832g;
            aVar.f77836k.a(new f(aVar));
            r.a("disable_video_stitch", new d().a("to_status", aVar.f77832g ? "on" : "off").f66730a);
        }
        i.b(new l(aVar), i.f4824a).a(new m(aVar), i.f4826c, null);
    }
}
