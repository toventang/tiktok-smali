package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CommerceTagLayout f74527a;

    /* renamed from: b  reason: collision with root package name */
    private final g f74528b;

    static {
        Covode.recordClassIndex(45958);
    }

    d(CommerceTagLayout commerceTagLayout, g gVar) {
        this.f74527a = commerceTagLayout;
        this.f74528b = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f74527a;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new e(commerceTagLayout, this.f74528b));
    }
}
