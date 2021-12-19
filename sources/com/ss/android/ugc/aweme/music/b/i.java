package com.ss.android.ugc.aweme.music.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f111354a;

    static {
        Covode.recordClassIndex(71548);
    }

    i(f fVar) {
        this.f111354a = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111354a.a(view);
    }
}
