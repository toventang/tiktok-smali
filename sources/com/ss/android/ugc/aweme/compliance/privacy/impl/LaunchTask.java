package com.ss.android.ugc.aweme.compliance.privacy.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class LaunchTask implements w {
    static {
        Covode.recordClassIndex(47901);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        b.a(true);
        if (com.ss.android.ugc.aweme.compliance.privacy.a.a.d()) {
            b.b(true);
        }
        AccountService.a().a(a.f77437a);
    }

    static final class a implements IAccountService.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77437a = new a();

        static {
            Covode.recordClassIndex(47902);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.b
        public final void onAccountResult(int i2, boolean z, int i3, User user) {
            if (i2 == 1 || i2 == 2) {
                IAccountUserService e2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e();
                l.b(e2, "");
                if (!e2.isChildrenMode()) {
                    b.a(true);
                    b.c();
                    b.b(true);
                }
            } else if (i2 == 3) {
                b.c();
            }
        }
    }
}
