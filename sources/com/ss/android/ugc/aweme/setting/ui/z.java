package com.ss.android.ugc.aweme.setting.ui;

import android.os.Handler;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ah;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122945a;

    static {
        Covode.recordClassIndex(80714);
    }

    z(v vVar) {
        this.f122945a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122945a;
        if (!a.a(view, 1200)) {
            r.a("click_share_person", new d().a("enter_from", "settings_page").f66730a);
            User curUser = b.g().getCurUser();
            if (curUser != null) {
                ah.f123352a.a((Handler) null, vVar, curUser, vVar.ai);
            }
        }
    }
}
