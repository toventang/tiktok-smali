package com.ss.android.ugc.aweme.discover.adapter.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.e.o;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f80525a;

    static {
        Covode.recordClassIndex(50095);
    }

    j(h hVar) {
        this.f80525a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f80525a;
        if (hVar.f80515j != null) {
            if (hVar.f80518m != null) {
                hVar.f80518m.a("sug", Integer.valueOf(hVar.f80517l), "complete", hVar.f80515j);
            }
            c.a(new o(hVar.f80515j.f121519b));
            g.a(hVar.f80517l, hVar.f80515j);
        }
    }
}
