package com.ss.android.ugc.aweme.app.accountsdk;

import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.c.b;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.web.e;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements IAccountUserService.a {
    static {
        Covode.recordClassIndex(40902);
    }

    private static String a(User user) {
        if (user == null || user.getAvatarThumb() == null || d.a(user.getAvatarThumb().getUrlList())) {
            return "";
        }
        return user.getAvatarThumb().getUrlList().get(0);
    }

    static final /* synthetic */ Object a(User user, User user2) {
        int a2;
        MethodCollector.i(6263);
        synchronized (c.class) {
            try {
                b bVar = new b();
                int i2 = 1;
                if (user.getUserMode() == 0) {
                    int i3 = bVar.f142353a.getInt("ftc_user_mode_prefix_".concat(String.valueOf(user.getUid())), 0);
                    if (i3 == 2 || i3 == 1) {
                        user.setUserMode(i3);
                    }
                }
                if (user.getAgeGatePostAction() == 0 && (a2 = com.ss.android.ugc.aweme.account.b.d().a(user.getUid())) != -1) {
                    r.a("age_gate_fallback_hit", new com.ss.android.ugc.aweme.app.f.d().a("age_gate_action_origin", user.getAgeGateAction()).f66730a);
                    user.setAgeGatePostAction(a2);
                    user.setAgeGateAction(0);
                }
                if (user.getAgeGateAction() != 0) {
                    r.a("age_gate_need_pop", new com.ss.android.ugc.aweme.app.f.d().a("age_gate_action", user.getAgeGateAction()).f66730a);
                }
                if (user2.getAgeGatePostAction() == 1 && user.getAgeGatePostAction() == 0) {
                    a.q().a(false, f.f66547a);
                }
                com.ss.android.ugc.aweme.account.b.b().toRecoverDeletedAccount(null);
                Bundle bundle = new Bundle();
                bundle.putInt("user_mode", user.getUserMode());
                bundle.putInt("user_period", user.getUserPeriod());
                if (user.getAgeGatePostAction() != 1) {
                    i2 = 0;
                }
                bundle.putInt("is_kids_mode", i2);
                AppLog.setCustomerHeader(bundle);
                IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(com.ss.android.ugc.aweme.im.c.a(user));
            } finally {
                MethodCollector.o(6263);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService.a
    public final void a(int i2, User user, User user2) {
        boolean z;
        boolean z2;
        if (i2 == 4) {
            i.b(new d(user2, user), g.a());
        } else if (i2 == 5) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.c(user2));
        } else if (i2 == 6) {
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(com.ss.android.ugc.aweme.im.c.a(user2));
        } else if (i2 == 10) {
            com.ss.android.ugc.d.a.c.b(new com.ss.android.ugc.aweme.base.d.b(user2));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("user_id", user2.getUid());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.d.a.c.b(new e("userLogin", jSONObject));
        }
        List asList = Arrays.asList(6, 7);
        if (user == null || user2 == null) {
            z = false;
            z2 = false;
        } else {
            z2 = !TextUtils.equals(user.getNickname(), user2.getNickname());
            z = !TextUtils.equals(a(user), a(user2));
        }
        if (asList.contains(Integer.valueOf(i2)) || z2 || z) {
            f fVar = new f((char) 0);
            if (z2) {
                fVar.f90401b = user2.getNickname();
            }
            if (z) {
                fVar.f90402c = a(user2);
            }
            ai.a(new e(fVar), "BoltsUtils");
        }
    }
}
