package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f70899a;

    static {
        Covode.recordClassIndex(43674);
    }

    d(a aVar) {
        this.f70899a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70899a.a(view);
    }
}
