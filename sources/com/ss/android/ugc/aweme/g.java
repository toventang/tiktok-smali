package com.ss.android.ugc.aweme;

import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import h.f.b.l;

public final class g extends ao {

    /* renamed from: a  reason: collision with root package name */
    public static final a f98931a = new a((byte) 0);

    static {
        Covode.recordClassIndex(62901);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62902);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isChildrenMode() {
        init();
        return e.f142364k.d();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isUidContactPermisioned() {
        try {
            if (b.a(d.a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isDeleteByAgeGate() {
        init();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        l.b(createIUserServicebyMonsterPlugin, "");
        User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
        if (currentUser == null || currentUser.getAgeGatePostAction() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void clear(String str) {
        l.d(str, "");
        init();
        a.C1450a.a(com.ss.android.ugc.aweme.account.m.a.f65142b + "|clear:" + str);
        Keva.getRepo("password_status").clear();
        e eVar = e.f142364k;
        eVar.f142366a = false;
        eVar.c(f.f142379d.e());
        eVar.f142367b = false;
        eVar.f142368c = -1;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void queryVerifyStatus(cw cwVar, boolean z) {
        f.a(e.f142364k.a());
    }
}
