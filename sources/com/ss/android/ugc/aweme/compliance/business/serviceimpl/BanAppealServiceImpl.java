package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.x.c.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.a;
import com.ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.compliance.common.b.a;
import com.ss.android.ugc.aweme.main.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class BanAppealServiceImpl implements IBanAppealService {
    static {
        Covode.recordClassIndex(47696);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final String b() {
        String bubbleText;
        GradientPunishWarning a2 = a.a();
        if (a2 == null || (bubbleText = a2.getBubbleText()) == null) {
            return "";
        }
        return bubbleText;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void e() {
        b.f77288b.a(new ArrayList());
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void c() {
        r.a("violation_bubble_show", new d().a("enter_from", "personal_homepage").f66730a);
    }

    public static IBanAppealService f() {
        MethodCollector.i(5603);
        Object a2 = com.ss.android.ugc.b.a(IBanAppealService.class, false);
        if (a2 != null) {
            IBanAppealService iBanAppealService = (IBanAppealService) a2;
            MethodCollector.o(5603);
            return iBanAppealService;
        }
        if (com.ss.android.ugc.b.aC == null) {
            synchronized (IBanAppealService.class) {
                try {
                    if (com.ss.android.ugc.b.aC == null) {
                        com.ss.android.ugc.b.aC = new BanAppealServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5603);
                    throw th;
                }
            }
        }
        BanAppealServiceImpl banAppealServiceImpl = (BanAppealServiceImpl) com.ss.android.ugc.b.aC;
        MethodCollector.o(5603);
        return banAppealServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void d() {
        if (com.ss.android.ugc.aweme.compliance.business.banappeal.a.a.a()) {
            AppealApi.a.f76750a.syncAccountBannedDetails().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(a.C1751a.f76746a, a.b.f76748a);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            String curUserId = g3.getCurUserId();
            l.b(curUserId, "");
            l.d(curUserId, "");
            GradientPunishWarning a2 = com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.a();
            if (a2 == null || a2.getWarnType() == 0) {
                com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.b(curUserId, false);
            } else if (a2.getWarnType() >= 2 && !c.a(a2.getBubbleText()) && !c.a(a2.getDetailUrl())) {
                IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g4, "");
                String curUserId2 = g4.getCurUserId();
                l.b(curUserId2, "");
                l.d(curUserId2, "");
                if (!com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.f76803b.a("has_click_warning_bubble_".concat(String.valueOf(curUserId2)), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void a(Context context) {
        l.d(context, "");
        com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.a(context, "float_warning");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.b(curUserId, true);
        r.a("enter_violation_record", new d().a("enter_method", "bubble").a("enter_from", "personal_homepage").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void a(e eVar) {
        String str;
        l.d(eVar, "");
        l.d(eVar, "");
        if (eVar instanceof j) {
            str = ((j) eVar).getEnterFrom();
        } else {
            str = "homepage_hot";
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            String curUserId = g3.getCurUserId();
            l.b(curUserId, "");
            l.d(curUserId, "");
            GradientPunishWarning a2 = com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.a();
            if (a2 == null || a2.getWarnType() == 0) {
                com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.a(curUserId, false);
            } else if (a2.getWarnType() >= 3 && !c.a(a2.getDialogMessage()) && !c.a(a2.getDialogButton()) && !c.a(a2.getDetailUrl())) {
                IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g4, "");
                String curUserId2 = g4.getCurUserId();
                l.b(curUserId2, "");
                l.d(curUserId2, "");
                if (!com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.f76803b.a("has_click_warning_dialog_".concat(String.valueOf(curUserId2)), false) && !com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a()) {
                    i.b(new a.CallableC1757a(eVar, str), i.f4826c);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean a(int i2) {
        List<com.ss.android.ugc.aweme.compliance.api.model.b> list;
        Integer banPlatform;
        if (com.ss.android.ugc.aweme.compliance.business.banappeal.a.a.a()) {
            com.ss.android.ugc.aweme.compliance.common.b.a aVar = b.f77288b;
            if (aVar.f77302b != null) {
                list = aVar.f77302b;
            } else {
                list = (List) new f().a(aVar.f77301a.getString("account_banned_detail", ""), new a.b().type);
            }
            if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                for (T t : list) {
                    Integer banType = t.getBanType();
                    if (banType != null && banType.intValue() == i2 && (banPlatform = t.getBanPlatform()) != null && banPlatform.intValue() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void a(String str, g<AppealStatusResponse, Void> gVar) {
        l.d(str, "");
        l.d(gVar, "");
        l.d(str, "");
        l.d(gVar, "");
        AppealApi.a.f76750a.getUserAppealStatus("6", str).a(gVar, i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final com.ss.android.ugc.aweme.compliance.api.c.d a(Activity activity, AppealStatusResponse appealStatusResponse) {
        l.d(activity, "");
        l.d(appealStatusResponse, "");
        l.d(activity, "");
        l.d(appealStatusResponse, "");
        if (appealStatusResponse.getAppealType() != 102) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.b.b(activity, appealStatusResponse);
        }
        return new com.ss.android.ugc.aweme.compliance.business.banappeal.b.a(activity, appealStatusResponse);
    }
}
