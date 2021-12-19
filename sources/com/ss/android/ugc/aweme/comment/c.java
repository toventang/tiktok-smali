package com.ss.android.ugc.aweme.comment;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f71739a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71740b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71741c;

    static {
        Covode.recordClassIndex(44120);
    }

    c(b bVar, String str, String str2) {
        this.f71739a = bVar;
        this.f71740b = str;
        this.f71741c = str2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71739a.a(view, this.f71740b, this.f71741c);
    }
}
