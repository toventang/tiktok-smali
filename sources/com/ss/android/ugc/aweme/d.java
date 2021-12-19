package com.ss.android.ugc.aweme;

import android.os.Bundle;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.a.n;
import java.util.ArrayList;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f79329a;

    static {
        Covode.recordClassIndex(49245);
    }

    d(Bundle bundle) {
        this.f79329a = bundle;
    }

    @Override // b.g
    public final Object then(i iVar) {
        Bundle bundle = this.f79329a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j(bundle));
        boolean z = bundle.getBoolean("new_user_need_set_username", false);
        boolean z2 = bundle.getBoolean("new_user_need_set_pass_word", false);
        IAccountUserService g2 = b.g();
        boolean z3 = g2.getCurUser().notifyPrivatePolicy && g2.isNewUser() && !bundle.getBoolean("is_from_new_user_journey", false);
        k kVar = k.FINISH;
        if (z2) {
            kVar = k.CREATE_PASSWORD_FOR_PHONE;
            bundle.putBoolean("show_skip", true);
        } else if (z) {
            kVar = k.CREATE_USERNAME;
        } else if (z3) {
            kVar = k.PRIVATE_ACCOUNT_TIPS;
        }
        if (kVar != k.FINISH) {
            com.ss.android.ugc.aweme.account.login.v2.ui.g gVar = new com.ss.android.ugc.aweme.account.login.v2.ui.g();
            gVar.setNeedCreatePwdForPhone(z2);
            gVar.setNeedSetUserName(z);
            gVar.setNeedShowPrivateAccountTips(z3);
            bundle.putSerializable("LoginActionContext", gVar);
            arrayList.add(new q(bundle, kVar));
        }
        i.a(bundle, arrayList);
        arrayList.add(new s(bundle));
        boolean z4 = bundle.getBoolean("is_from_new_user_journey", false);
        boolean z5 = bundle.getBoolean("need_restart", false);
        if (!z4) {
            arrayList.add(new t(bundle, z5));
        }
        i.c(bundle, arrayList);
        i.d(bundle, arrayList);
        i.b(bundle, arrayList);
        arrayList.add(new x(bundle));
        a.C1369a.a(n.g((Collection) arrayList));
        a.C1369a.a();
        a.C1369a.a(bundle);
        return iVar.d();
    }
}
