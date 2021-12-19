package com.ss.android.ugc.aweme.kids.intergration.account;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class KidsAccountServiceImpl implements IAccountService.b, IKidsAccountService {
    static {
        Covode.recordClassIndex(68191);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean a() {
        IAccountUserService b2 = a.b();
        l.b(b2, "");
        return b2.isLogin();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean c() {
        a.a();
        return a.f106698a.k().getSaveLoginStatus();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean d() {
        a.a();
        return a.f106698a.k().isOneKeyLoginExprimentEnable();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean e() {
        a.a();
        return a.f106698a.k().isCurrentMethodAvaliable();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void f() {
        a.a();
        a.f106698a.b(this);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void g() {
        a.a();
        a.f106698a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final com.ss.android.ugc.aweme.kids.api.account.a.a b() {
        IAccountUserService b2 = a.b();
        l.b(b2, "");
        User curUser = b2.getCurUser();
        l.b(curUser, "");
        return new b(curUser);
    }

    public static IKidsAccountService h() {
        MethodCollector.i(8920);
        Object a2 = b.a(IKidsAccountService.class, false);
        if (a2 != null) {
            IKidsAccountService iKidsAccountService = (IKidsAccountService) a2;
            MethodCollector.o(8920);
            return iKidsAccountService;
        }
        if (b.bT == null) {
            synchronized (IKidsAccountService.class) {
                try {
                    if (b.bT == null) {
                        b.bT = new KidsAccountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8920);
                    throw th;
                }
            }
        }
        KidsAccountServiceImpl kidsAccountServiceImpl = (KidsAccountServiceImpl) b.bT;
        MethodCollector.o(8920);
        return kidsAccountServiceImpl;
    }

    public static final class a implements cv {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.api.account.a f106697a;

        static {
            Covode.recordClassIndex(68192);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateFailed(String str) {
        }

        a(com.ss.android.ugc.aweme.kids.api.account.a aVar) {
            this.f106697a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateSuccess(boolean z) {
            this.f106697a.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void a(com.ss.android.ugc.aweme.kids.api.account.a aVar) {
        l.d(aVar, "");
        a.b().getSetPasswordStatus(new a(aVar));
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a.a();
        a.f106698a.g().logout(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void a(String str, boolean z) {
        l.d(str, "");
        a.a();
        a.f106698a.k().updateMethodInfo(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void a(Activity activity, String str, String str2, Bundle bundle) {
        a.a();
        a.f106698a.i().changePassword(activity, str, str2, bundle, null);
    }
}
