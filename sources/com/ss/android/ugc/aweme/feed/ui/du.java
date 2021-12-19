package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class du implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final dt f94631a;

    static {
        Covode.recordClassIndex(60063);
    }

    du(dt dtVar) {
        this.f94631a = dtVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        new a(this.f94631a.R).a(R.string.fh3).a();
    }
}
