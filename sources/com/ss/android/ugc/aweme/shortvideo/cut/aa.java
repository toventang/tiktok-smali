package com.ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z.a f125446a;

    static {
        Covode.recordClassIndex(82335);
    }

    aa(z.a aVar) {
        this.f125446a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f125446a.a(view);
    }
}
