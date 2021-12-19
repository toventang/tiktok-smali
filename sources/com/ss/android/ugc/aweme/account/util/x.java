package com.ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f65510a;

    static {
        Covode.recordClassIndex(40291);
    }

    x(Bundle bundle) {
        this.f65510a = bundle;
    }

    @Override // b.g
    public final Object then(i iVar) {
        String message;
        String str;
        Bundle bundle = this.f65510a;
        if (iVar.c()) {
            if (iVar.e() instanceof a) {
                a aVar = (a) iVar.e();
                str = String.valueOf(aVar.getErrorCode());
                message = aVar.getErrorMsg();
            } else {
                message = iVar.e().getMessage();
                str = "";
            }
            com.ss.android.ugc.aweme.account.i.a.a(str, message, a.EnumC1395a.REFRESH_AWEME_USER, "");
        } else if (iVar.d() != null) {
            com.ss.android.ugc.aweme.account.i.a.a(a.EnumC1395a.REFRESH_AWEME_USER, ((User) iVar.d()).getUid());
        } else {
            com.ss.android.ugc.aweme.account.i.a.a("", "user == null", a.EnumC1395a.REFRESH_AWEME_USER, "");
        }
        if (!iVar.c()) {
            if (iVar.d() != null) {
                cj.f71084b.e().queryUserSync((User) iVar.d());
            }
            return bundle;
        }
        throw iVar.e();
    }
}
