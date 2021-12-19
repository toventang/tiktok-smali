package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final m f70931a;

    static {
        Covode.recordClassIndex(43687);
    }

    n(m mVar) {
        this.f70931a = mVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        m mVar = this.f70931a;
        if (!a.a(view, 1200) && mVar.f70920f != null) {
            mVar.f70920f.a(null, view, null, 0);
        }
    }
}
