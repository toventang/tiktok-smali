package com.ss.android.ugc.aweme.account.login.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;
import com.ss.android.ugc.aweme.account.login.ui.g;

final /* synthetic */ class j implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final MusCountryListActivity f64133a;

    static {
        Covode.recordClassIndex(39517);
    }

    j(MusCountryListActivity musCountryListActivity) {
        this.f64133a = musCountryListActivity;
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.g.b
    public final void a(a aVar) {
        MusCountryListActivity musCountryListActivity = this.f64133a;
        if (aVar != null) {
            com.ss.android.ugc.aweme.account.f.a.a(aVar);
            if (MusCountryListActivity.f64078g != null) {
                MusCountryListActivity.f64078g.onChanged(aVar.f63498d, aVar.f63497c);
            }
            musCountryListActivity.onBackPressed();
        }
    }
}
