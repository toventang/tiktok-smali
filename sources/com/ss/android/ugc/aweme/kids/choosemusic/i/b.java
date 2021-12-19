package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f105754a;

    static {
        Covode.recordClassIndex(67707);
    }

    b(a aVar) {
        this.f105754a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f105754a.a(view);
    }
}
