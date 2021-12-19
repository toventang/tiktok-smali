package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IDonationService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bx implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f117007a;

    static {
        Covode.recordClassIndex(75558);
    }

    bx(bm bmVar) {
        this.f117007a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f117007a.a((IDonationService.OrganizationModel) null);
    }
}
