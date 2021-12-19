package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.legacy.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RecoverDeletedAccountActivity f65435a;

    static {
        Covode.recordClassIndex(40224);
    }

    g(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f65435a = recoverDeletedAccountActivity;
    }

    @Override // com.ss.android.ugc.aweme.legacy.a
    public final void a() {
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f65435a;
        com.ss.android.b.a.a.a.a(new h(recoverDeletedAccountActivity), 5000);
        User curUser = recoverDeletedAccountActivity.f65422j.getCurUser();
        curUser.setUserCancelled(false);
        recoverDeletedAccountActivity.f65422j.updateCurUser(curUser);
        if (TextUtils.equals(recoverDeletedAccountActivity.f65419g, "enter_from_login_ui_routine")) {
            a.C1369a.a((Bundle) null);
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.o().f()) {
            com.ss.android.ugc.aweme.compliance.api.a.o().g();
            com.ss.android.ugc.aweme.compliance.api.a.o().i();
        }
        Context applicationContext = recoverDeletedAccountActivity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.faa).a();
        recoverDeletedAccountActivity.finish();
    }
}
