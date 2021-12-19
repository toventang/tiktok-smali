package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.z;
import com.ss.android.ugc.aweme.discover.widget.d;

final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z.AnonymousClass1 f80301a;

    /* renamed from: b  reason: collision with root package name */
    private final d f80302b;

    static {
        Covode.recordClassIndex(49990);
    }

    ab(z.AnonymousClass1 r1, d dVar) {
        this.f80301a = r1;
        this.f80302b = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        z.AnonymousClass1 r0 = this.f80301a;
        d dVar = this.f80302b;
        z.this.f80686a.b();
        dVar.dismiss();
    }
}
