package com.ss.android.ugc.aweme.account.login.ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.ui.WaveSideBar;

final /* synthetic */ class k implements WaveSideBar.a {

    /* renamed from: a  reason: collision with root package name */
    private final MusCountryListActivity f64134a;

    static {
        Covode.recordClassIndex(39518);
    }

    k(MusCountryListActivity musCountryListActivity) {
        this.f64134a = musCountryListActivity;
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.WaveSideBar.a
    public final void a(String str) {
        MusCountryListActivity musCountryListActivity = this.f64134a;
        for (int i2 = 0; i2 < musCountryListActivity.f64080b.size(); i2++) {
            if (TextUtils.equals(musCountryListActivity.f64080b.get(i2).f63496b, str)) {
                ((LinearLayoutManager) musCountryListActivity.f64079a.getLayoutManager()).a(i2, 0);
                return;
            }
        }
    }
}
