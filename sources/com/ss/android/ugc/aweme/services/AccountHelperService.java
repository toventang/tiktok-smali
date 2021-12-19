package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.a;
import com.ss.android.c.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.newmedia.g;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.ss.android.ugc.aweme.money.growth.e;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import h.f.b.l;

public final class AccountHelperService implements IAccountHelperService {
    static {
        Covode.recordClassIndex(79407);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final void recommendAppUponAuth(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final String getUserApi() {
        return ProfileServiceImpl.g().a();
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final UrlModel getLoginViewBanner() {
        com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel;
        try {
            UgLoginBanner g2 = e.f110853g.g();
            if (g2 != null) {
                urlModel = g2.getResourceUrl();
            } else {
                urlModel = null;
            }
            return e.a(urlModel);
        } catch (a unused) {
            return new UrlModel();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final String getLoginViewTitleForMoneyGrowth() {
        try {
            UgLoginBanner g2 = e.f110853g.g();
            if (!(g2 == null || g2.getText() == null)) {
                String text = g2.getText();
                l.b(text, "");
                return text;
            }
        } catch (a unused) {
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final String selfUserApi() {
        return b.f59141e + ProfileServiceImpl.g().a(true);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final String userPermissionApi() {
        return b.f59141e + ProfileServiceImpl.g().b();
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final void AppsFlyerUtilsTrackLoginSuccess(String str) {
        UgCommonServiceImpl.j().a().a(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final void appendCommonParams(StringBuilder sb) {
        l.d(sb, "");
        AppLog.appendCommonParams(sb, false);
    }

    public static IAccountHelperService createIAccountHelperServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(9441);
        Object a2 = com.ss.android.ugc.b.a(IAccountHelperService.class, z);
        if (a2 != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) a2;
            MethodCollector.o(9441);
            return iAccountHelperService;
        }
        if (com.ss.android.ugc.b.dm == null) {
            synchronized (IAccountHelperService.class) {
                try {
                    if (com.ss.android.ugc.b.dm == null) {
                        com.ss.android.ugc.b.dm = new AccountHelperService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9441);
                    throw th;
                }
            }
        }
        AccountHelperService accountHelperService = (AccountHelperService) com.ss.android.ugc.b.dm;
        MethodCollector.o(9441);
        return accountHelperService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final void loadWebViewUrl(String str, WebView webView) {
        if (webView != null && !m.a(str)) {
            g.a(webView, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public final void friendUploadToken(String str, String str2, String str3) {
        FriendsServiceImpl.s();
    }
}
