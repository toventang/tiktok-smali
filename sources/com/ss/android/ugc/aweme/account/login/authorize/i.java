package com.ss.android.ugc.aweme.account.login.authorize;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.a.b;

final /* synthetic */ class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63363a;

    static {
        Covode.recordClassIndex(39051);
    }

    i(AuthorizeActivity authorizeActivity) {
        this.f63363a = authorizeActivity;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        AuthorizeActivity authorizeActivity = this.f63363a;
        authorizeActivity.finish();
        a.a(11);
        a.a(9);
        User f2 = cj.f();
        cj.a(1, 1, (Object) "");
        cj.a(cj.f());
        if (f2 == null || f2.getUid() == null || TextUtils.isEmpty(f2.getUid()) || !authorizeActivity.getIntent().getBooleanExtra("need_remember_login_method", true)) {
            return null;
        }
        q.b(new TPLoginMethod(f2.getUid(), authorizeActivity.f63330j, TPUserInfo.from(f2), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis())));
        return null;
    }
}
