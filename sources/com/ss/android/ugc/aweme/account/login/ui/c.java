package com.ss.android.ugc.aweme.account.login.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;
import com.ss.android.ugc.aweme.account.login.ui.b;

final /* synthetic */ class c implements b.AbstractC1436b {

    /* renamed from: a  reason: collision with root package name */
    private final CountryListActivity f64117a;

    static {
        Covode.recordClassIndex(39508);
    }

    c(CountryListActivity countryListActivity) {
        this.f64117a = countryListActivity;
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.b.AbstractC1436b
    public final void a(a aVar) {
        CountryListActivity countryListActivity = this.f64117a;
        if (aVar != null) {
            com.ss.android.ugc.aweme.account.f.a.a(aVar);
            countryListActivity.onBackPressed();
        }
    }
}
