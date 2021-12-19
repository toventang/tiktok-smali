package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f127779a;

    static {
        Covode.recordClassIndex(83757);
    }

    m(i iVar) {
        this.f127779a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f127779a.f();
    }
}
