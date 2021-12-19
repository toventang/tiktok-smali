package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;
import java.util.Iterator;

final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MusCountryListActivity f64135a;

    /* renamed from: b  reason: collision with root package name */
    private final g f64136b;

    static {
        Covode.recordClassIndex(39519);
    }

    l(MusCountryListActivity musCountryListActivity, g gVar) {
        this.f64135a = musCountryListActivity;
        this.f64136b = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusCountryListActivity musCountryListActivity = this.f64135a;
        g gVar = this.f64136b;
        String lowerCase = musCountryListActivity.f64082d.getText().toString().toLowerCase();
        musCountryListActivity.f64080b.clear();
        Iterator<a> it = musCountryListActivity.f64081c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f63499e.toLowerCase().contains(lowerCase) || musCountryListActivity.getString(next.f63495a).toLowerCase().contains(lowerCase)) {
                musCountryListActivity.f64080b.add(next);
            }
        }
        gVar.notifyDataSetChanged();
    }
}
