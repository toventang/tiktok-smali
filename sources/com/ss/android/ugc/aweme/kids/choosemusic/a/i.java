package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.a.h;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h.a f105476a;

    static {
        Covode.recordClassIndex(67586);
    }

    i(h.a aVar) {
        this.f105476a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h.a aVar = this.f105476a;
        if (h.this.f105471a != null) {
            h.this.f105471a.a(aVar.f105474c, aVar.getLayoutPosition());
        }
    }
}
