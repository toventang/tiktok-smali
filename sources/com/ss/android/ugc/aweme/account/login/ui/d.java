package com.ss.android.ugc.aweme.account.login.ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.ui.WaveSideBar;

final /* synthetic */ class d implements WaveSideBar.a {

    /* renamed from: a  reason: collision with root package name */
    private final CountryListActivity f64118a;

    static {
        Covode.recordClassIndex(39509);
    }

    d(CountryListActivity countryListActivity) {
        this.f64118a = countryListActivity;
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.WaveSideBar.a
    public final void a(String str) {
        CountryListActivity countryListActivity = this.f64118a;
        for (int i2 = 0; i2 < countryListActivity.f64072b.size(); i2++) {
            if (TextUtils.equals(countryListActivity.f64072b.get(i2).f63496b, str)) {
                ((LinearLayoutManager) countryListActivity.f64071a.getLayoutManager()).a(i2, 0);
                return;
            }
        }
    }
}
