package com.ss.android.ugc.aweme.music.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f111353a;

    static {
        Covode.recordClassIndex(71547);
    }

    h(f fVar) {
        this.f111353a = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111353a.a(view);
    }
}
