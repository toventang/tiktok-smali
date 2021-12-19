package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ba implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LongPressLayout f94316a;

    static {
        Covode.recordClassIndex(59920);
    }

    ba(LongPressLayout longPressLayout) {
        this.f94316a = longPressLayout;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LongPressLayout longPressLayout = this.f94316a;
        if (longPressLayout.f94132g != null) {
            longPressLayout.f94132g.onClick(view);
        }
        if (!longPressLayout.f94134i) {
            longPressLayout.f94133h.onClick(view);
        }
        longPressLayout.f94134i = false;
    }
}
