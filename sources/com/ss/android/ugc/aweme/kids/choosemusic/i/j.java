package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f105783a;

    static {
        Covode.recordClassIndex(67717);
    }

    j(i iVar) {
        this.f105783a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f105783a;
        if (!a.a(view, 1200) && iVar.f105772f != null) {
            iVar.f105772f.a(null, view, null);
        }
    }
}
