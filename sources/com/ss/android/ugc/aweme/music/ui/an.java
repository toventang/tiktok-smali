package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;

final /* synthetic */ class an implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111889a;

    /* renamed from: b  reason: collision with root package name */
    private final List f111890b;

    static {
        Covode.recordClassIndex(71914);
    }

    an(ah ahVar, List list) {
        this.f111889a = ahVar;
        this.f111890b = list;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ah ahVar = this.f111889a;
        ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) this.f111890b.get(0);
        if (ahVar.aw != null) {
            ahVar.aw.a(ahVar.getContext(), externalMusicInfo, true);
        }
    }
}
