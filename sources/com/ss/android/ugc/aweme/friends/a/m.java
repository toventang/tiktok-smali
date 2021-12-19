package com.ss.android.ugc.aweme.friends.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f96815a;

    static {
        Covode.recordClassIndex(61419);
    }

    m(k kVar) {
        this.f96815a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f96815a.a("click_head");
    }
}
