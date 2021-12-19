package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountryListActivity f64121a;

    static {
        Covode.recordClassIndex(39511);
    }

    f(CountryListActivity countryListActivity) {
        this.f64121a = countryListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f64121a.onBackPressed();
    }
}
