package com.ss.android.ugc.tools.view.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.b.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.b f150038a;

    static {
        Covode.recordClassIndex(98779);
    }

    d(c.b bVar) {
        this.f150038a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.b bVar = this.f150038a;
        if (c.this.o != null) {
            c.this.o.a();
        }
        if (bVar.f150035a != null) {
            bVar.f150035a.f150039a = false;
        }
    }
}
