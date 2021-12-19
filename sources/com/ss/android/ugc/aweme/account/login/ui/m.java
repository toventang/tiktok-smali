package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MusCountryListActivity f64137a;

    static {
        Covode.recordClassIndex(39520);
    }

    m(MusCountryListActivity musCountryListActivity) {
        this.f64137a = musCountryListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f64137a.onBackPressed();
    }
}
