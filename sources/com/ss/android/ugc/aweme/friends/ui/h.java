package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97256a;

    static {
        Covode.recordClassIndex(61784);
    }

    h(ContactsActivity contactsActivity) {
        this.f97256a = contactsActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b.e().bindMobile(this.f97256a, "", null, null);
    }
}
