package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.challenge.ui.p;
import com.ss.android.ugc.aweme.commerce_challenge_api.a.a;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;

public final class l implements a {
    static {
        Covode.recordClassIndex(45426);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final User a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final void a(e eVar) {
        AdPopUpWebPageView b2;
        if (eVar != null) {
            b a2 = new b.a().a(eVar).b(8).a(2).b(0).a();
            Context context = a2.f74372a;
            if ((context instanceof Activity) && context != null && (b2 = p.a.b(eVar)) != null && !b2.g()) {
                FrameLayout a3 = p.a.a(eVar);
                if (a3 != null) {
                    a3.setVisibility(0);
                }
                b2.getActionMode().f74368f = a2.f74375d;
                b2.a(a2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a(str, null, str2);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final boolean a(Context context, String str) {
        h.f.b.l.d(context, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.b(context, Uri.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final void a(e eVar, String str) {
        MethodCollector.i(1477);
        h.f.b.l.d(str, "");
        if (eVar == null) {
            MethodCollector.o(1477);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromChallenge", true);
        ac a2 = new ac.a().a(bundle).a(eVar).a(str).a(hh.b()).a();
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(a2, "");
        if (p.a.b(eVar) == null) {
            AdPopUpWebPageView adPopUpWebPageView = new AdPopUpWebPageView(eVar, (byte) 0);
            adPopUpWebPageView.setId(R.id.a4_);
            adPopUpWebPageView.setParams(a2);
            adPopUpWebPageView.setMBehaviorCallback(null);
            adPopUpWebPageView.setKeyDownCallBack(null);
            FrameLayout a3 = p.a.a(eVar);
            if (a3 != null) {
                a3.addView(adPopUpWebPageView);
                MethodCollector.o(1477);
                return;
            }
        }
        MethodCollector.o(1477);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final boolean a(Context context, String str, String str2) {
        h.f.b.l.d(context, "");
        return g.c().a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.a.a
    public final boolean a(Context context, String str, boolean z) {
        h.f.b.l.d(context, "");
        return g.c().a(context, str, z);
    }
}
