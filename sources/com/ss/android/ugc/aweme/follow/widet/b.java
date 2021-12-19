package com.ss.android.ugc.aweme.follow.widet;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.l.a.a;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f96297a;

    /* renamed from: b  reason: collision with root package name */
    private final User f96298b;

    static {
        Covode.recordClassIndex(60983);
    }

    b(a aVar, User user) {
        this.f96297a = aVar;
        this.f96298b = user;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f96297a;
        User user = this.f96298b;
        if (!a.a(view, 300)) {
            d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a.a();
            }
            if (!j.f107229h) {
                new com.bytedance.tux.g.b(view).e(R.string.de8).b();
            } else if (aVar.f96288e != null && aVar.f96288e.a(user.getFollowStatus())) {
            } else {
                if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    c.a(aVar.f96284a, aVar.f96285b.getEnterFrom(), aVar.f96285b.getEnterMethod(), new h(aVar, user));
                    return;
                }
                if (aVar.f96287d != null) {
                    aVar.f96287d.a();
                }
                aVar.b(user);
            }
        }
    }
}
