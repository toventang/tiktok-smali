package com.ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f136113a;

    static {
        Covode.recordClassIndex(88906);
    }

    i(h hVar) {
        this.f136113a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f136113a;
        if (hVar.f136108a != null) {
            hVar.f136108a.b();
        }
    }
}
