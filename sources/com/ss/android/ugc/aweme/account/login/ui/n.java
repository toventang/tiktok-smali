package com.ss.android.ugc.aweme.account.login.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;
import java.util.Comparator;

final /* synthetic */ class n implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final MusCountryListActivity f64138a;

    static {
        Covode.recordClassIndex(39521);
    }

    n(MusCountryListActivity musCountryListActivity) {
        this.f64138a = musCountryListActivity;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MusCountryListActivity musCountryListActivity = this.f64138a;
        return musCountryListActivity.getResources().getString(((a) obj).f63495a).compareTo(musCountryListActivity.getResources().getString(((a) obj2).f63495a));
    }
}
