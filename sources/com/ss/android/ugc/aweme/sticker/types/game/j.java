package com.ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f136114a;

    static {
        Covode.recordClassIndex(88907);
    }

    j(h hVar) {
        this.f136114a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f136114a;
        if (hVar.f136108a != null) {
            hVar.f136108a.a();
        }
    }
}
