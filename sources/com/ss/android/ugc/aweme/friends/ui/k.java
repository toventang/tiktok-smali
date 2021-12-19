package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97259a;

    static {
        Covode.recordClassIndex(61787);
    }

    k(ContactsActivity contactsActivity) {
        this.f97259a = contactsActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97259a.f97058f.setVisibility(8);
        SharePrefCache.inst().getHasEnterBindPhone().b(true);
    }
}
