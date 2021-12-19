package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import androidx.lifecycle.m;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.t;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi;
import com.ss.android.ugc.aweme.account.login.trusted.g;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.dc;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.user.a;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.user.e;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class LoginMethodService implements bn {
    public final String TAG = "LoginMethodService";

    static {
        Covode.recordClassIndex(79511);
    }

    public final String getCurSecUserId() {
        return e.f142364k.e();
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final boolean isTrustedEnvLoginFreshInstallEnable() {
        return g.a();
    }

    public final int getCurrentLoginHistoryState() {
        return a.a(getCurSecUserId());
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final boolean isOneKeyLoginExprimentEnable() {
        if (!p.a("JP", d.a(), true)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final String getLatestLoginMethodName() {
        BaseLoginMethod d2 = q.d();
        if (d2 instanceof TPLoginMethod) {
            return ((TPLoginMethod) d2).getPlatform();
        }
        return d2.getLoginMethodName().name();
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final boolean isCurrentMethodAvaliable() {
        String b2 = cj.b();
        l.b(b2, "");
        if (!b.a((Collection) q.b(b2))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final boolean getSaveLoginStatus() {
        Boolean allowOneKeyLogin;
        List<BaseLoginMethod> list = q.f63528b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (l.a((Object) t.getUid(), (Object) cj.b())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!b.a((Collection) arrayList2) && (allowOneKeyLogin = ((BaseLoginMethod) n.g((List) arrayList2)).getAllowOneKeyLogin()) != null) {
            return allowOneKeyLogin.booleanValue();
        }
        if (isOneKeyLoginExprimentEnable()) {
            return false;
        }
        return ((t) dc.a(com.ss.android.ugc.aweme.a.f62426a, t.class)).b(false);
    }

    public final void removeLoginMethod(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                l.b();
            }
            q.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final void fetchLoginHistoryState(m mVar, h.f.a.b<? super Integer, z> bVar) {
        LoginMethodService$fetchLoginHistoryState$1 loginMethodService$fetchLoginHistoryState$1 = new LoginMethodService$fetchLoginHistoryState$1(this, bVar);
        l.d(loginMethodService$fetchLoginHistoryState$1, "");
        TrustedEnvApi.f63680a.getLoginHistoryFeatureState().a(new TrustedEnvApi.d(mVar, loginMethodService$fetchLoginHistoryState$1), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final void updateLoginHistoryState(int i2, h.f.a.b<? super Integer, z> bVar) {
        LoginMethodService$updateLoginHistoryState$1 loginMethodService$updateLoginHistoryState$1 = new LoginMethodService$updateLoginHistoryState$1(this, i2, bVar);
        l.d(loginMethodService$updateLoginHistoryState$1, "");
        TrustedEnvApi.f63680a.setLoginHistoryFeatureState(i2).a(new TrustedEnvApi.e(loginMethodService$updateLoginHistoryState$1), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.bn
    public final void updateMethodInfo(String str, Object... objArr) {
        l.d(str, "");
        l.d(objArr, "");
        c cVar = null;
        int i2 = 2;
        switch (str.hashCode()) {
            case -1854071945:
                if (str.equals("update_expire_time") && objArr.length >= 2) {
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[1];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                    q.a((String) obj, ((Long) obj2).longValue(), false);
                    return;
                }
                return;
            case -573632447:
                if (str.equals("update_name") && objArr.length != 0) {
                    String b2 = cj.b();
                    l.b(b2, "");
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    q.a(b2, (String) obj3);
                    return;
                }
                return;
            case 58019962:
                if (str.equals("allow_one_key_login") && objArr.length != 0) {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                    if (isOneKeyLoginExprimentEnable()) {
                        q.a(booleanValue);
                    } else {
                        ((t) dc.a(com.ss.android.ugc.aweme.a.f62426a, t.class)).a(booleanValue);
                    }
                    if (objArr.length >= 2) {
                        Object obj5 = objArr[1];
                        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj5).booleanValue()) {
                            return;
                        }
                    }
                    if (booleanValue) {
                        i2 = 1;
                    }
                    updateLoginHistoryState(i2, null);
                    return;
                }
                return;
            case 2043348218:
                if (str.equals("update_significan_user_info") && objArr.length != 0) {
                    Object obj6 = objArr[1];
                    if (obj6 instanceof c) {
                        cVar = obj6;
                    }
                    q.a(cVar);
                    return;
                }
                return;
            case 2096788723:
                if (str.equals("update_last_active_time") && objArr.length >= 2) {
                    Object obj7 = objArr[0];
                    Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
                    Object obj8 = objArr[1];
                    Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                    q.b((String) obj7, ((Long) obj8).longValue());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
