package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class at implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72537a;

    static {
        Covode.recordClassIndex(44699);
    }

    at(k kVar) {
        this.f72537a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        k kVar = this.f72537a;
        int i2 = 0;
        if (!Keva.getRepo("keva_repo_batch").getBoolean("keva_key_portal" + b.g().getCurUserId(), false)) {
            Keva.getRepo("keva_repo_batch").storeBoolean("keva_key_portal" + b.g().getCurUserId(), true);
            i2 = 1;
        }
        r.a("comment_batch_management_portal_left_ck", new d().a("is_first", i2).f66730a);
        kVar.u();
    }
}
