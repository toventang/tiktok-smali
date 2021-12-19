package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;
import java.util.Iterator;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountryListActivity f64119a;

    /* renamed from: b  reason: collision with root package name */
    private final b f64120b;

    static {
        Covode.recordClassIndex(39510);
    }

    e(CountryListActivity countryListActivity, b bVar) {
        this.f64119a = countryListActivity;
        this.f64120b = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CountryListActivity countryListActivity = this.f64119a;
        b bVar = this.f64120b;
        String obj = countryListActivity.f64074d.getText().toString();
        countryListActivity.f64072b.clear();
        Iterator<a> it = countryListActivity.f64073c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f63499e.toLowerCase().contains(obj) || countryListActivity.getString(next.f63495a).toLowerCase().contains(obj)) {
                countryListActivity.f64072b.add(next);
            }
        }
        bVar.notifyDataSetChanged();
    }
}
