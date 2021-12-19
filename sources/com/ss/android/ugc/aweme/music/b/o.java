package com.ss.android.ugc.aweme.music.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.b.n;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final n.b f111376a;

    static {
        Covode.recordClassIndex(71559);
    }

    o(n.b bVar) {
        this.f111376a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        n.b bVar = this.f111376a;
        if (n.this.f111368a != null) {
            n.this.f111368a.a(bVar.getLayoutPosition());
        }
    }
}
