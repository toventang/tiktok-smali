package com.ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.fi;
import com.ss.android.ugc.aweme.feed.guide.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.main.ax;
import com.ss.android.ugc.aweme.ug.guide.j;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Collection;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f120104a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(78062);
    }

    public static final boolean a() {
        int a2 = b.a().a(true, "popup_alert_recommend_strategy", 0);
        if (a2 == 1 || a2 == 2) {
            return true;
        }
        return false;
    }

    private static boolean d() {
        if (ax.f109172a || (j.a.a() && i.b())) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() && b.a().a(true, "popup_alert_recommend_strategy", 0) == 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c() {
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() && b.a().a(true, "popup_alert_recommend_strategy", 0) == 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(Aweme aweme) {
        if (l.f120097b || in.d() || !f.a(e.f142364k.a()) || d()) {
            return false;
        }
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        if ((!com.bytedance.common.utility.collection.b.a((Collection) iESSettingsProxy.getContentLanguageGuideCodes()) && !in.g()) || com.ss.android.ugc.aweme.i18n.language.a.i.a() == 1) {
            return false;
        }
        if (aweme != null && aweme.isWithSurvey()) {
            return false;
        }
        fi a2 = a.f97047a.a(2);
        if (a2.f90044a || a2.f90045b) {
            return false;
        }
        return true;
    }
}
