package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class CommonViewStatus$bindView$4 implements View.OnClickListener {
    final /* synthetic */ CommonViewStatus this$0;

    static {
        Covode.recordClassIndex(84432);
    }

    CommonViewStatus$bindView$4(CommonViewStatus commonViewStatus) {
        this.this$0 = commonViewStatus;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CommonViewStatus commonViewStatus = this.this$0;
        l.b(view, "");
        commonViewStatus.click(view);
    }
}
