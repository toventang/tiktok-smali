package com.ss.android.ugc.aweme.discover.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.b;
import com.ss.android.ugc.aweme.search.theme.c;

final /* synthetic */ class as implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ap f82325a;

    static {
        Covode.recordClassIndex(51237);
    }

    as(ap apVar) {
        this.f82325a = apVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ap apVar = this.f82325a;
        c cVar = (c) obj;
        apVar.f82318l = TextUtils.equals("dark", cVar.f121704a);
        apVar.f82315e.setBackgroundColor(apVar.a(cVar));
        apVar.f82314d.setBackgroundColor(cVar.f121705b);
        apVar.f82314d.setCustomTabViewResId(apVar.b());
        apVar.f82314d.setupWithViewPager(apVar.f82313c);
        apVar.f82314d.setSelectedTabIndicatorColor(apVar.a());
        b.a(apVar.f82314d);
    }
}
