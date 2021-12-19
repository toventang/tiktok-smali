package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.b.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f117006a;

    static {
        Covode.recordClassIndex(75557);
    }

    bw(bm bmVar) {
        this.f117006a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bm bmVar = this.f117006a;
        r.a("edit_change_nonprofit_link", new a().a("enter_from", "personal_homepage").a("user_id", d.a()).a("enter_method", "click_change_ngo_profile").f62575a);
        bmVar.i();
    }
}
