package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.notice.api.d.d;
import com.ss.android.ugc.aweme.notice.api.d.e;
import com.ss.android.ugc.aweme.requesttask.a.a;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.b;
import com.ss.android.ugc.aweme.requesttask.idle.d;
import com.ss.android.ugc.aweme.requesttask.idle.g;
import com.ss.android.ugc.aweme.requesttask.idle.h;
import com.ss.android.ugc.aweme.requesttask.idle.j;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public class LegoRequestTask implements w {
    static {
        Covode.recordClassIndex(69053);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        new f.b().b((r) new g()).b((r) new a()).b((r) new j()).b((r) new b()).b(z.f105220a.a()).b((r) new com.ss.android.ugc.aweme.task.a.b()).b((r) new com.ss.android.ugc.aweme.friends.h.a()).b((r) new h()).b((r) new com.ss.android.ugc.aweme.settingsrequest.api.g()).b((r) new com.ss.android.ugc.aweme.account.login.trusted.b()).a();
        if (com.bytedance.ies.abmock.b.a().a(true, "use_new_app_alert", 0) == 1) {
            new f.b().b((r) new d()).a();
        }
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        if (p.a.a().c() != 0 && createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin() && !createIMandatoryLoginServicebyMonsterPlugin.getHasRequestComplianceApi()) {
            createIMandatoryLoginServicebyMonsterPlugin.setHasRequestComplianceApi(true);
            new f.b().b((r) new com.ss.android.ugc.aweme.request_combine.request.a.a(aa.NORMAL)).a();
        }
        com.ss.android.ugc.aweme.compliance.api.a.r().a();
        new f.c().b((w) new GeckoHighPriorityCheckInRequest()).b((w) new GeckoCheckInRequest()).b((w) new FetchFriendsRelationTask()).b((w) new InitServiceTask(IMService.createIIMServicebyMonsterPlugin(false).getSystemEmojiService().a(), 1048575, ae.BOOT_FINISH)).b((w) new InitServiceSettingTask()).a();
        if (com.ss.android.ugc.aweme.account.b.g().isLogin() && !in.d() && com.bytedance.ies.abmock.b.a().a(true, "inbox_has_top_msg", false)) {
            e eVar = (e) d.a.a(e.class);
            if (eVar != null) {
                eVar.b("");
                eVar.d("");
                eVar.f("");
                eVar.h("");
                eVar.j("");
                eVar.l("");
            }
            new f.b().b((r) new com.ss.android.ugc.aweme.requesttask.idle.f()).a();
        }
        List<r> a2 = com.ss.android.ugc.aweme.social.service.a.f133708a.a();
        f.d e2 = f.e();
        for (r rVar : a2) {
            e2.a(rVar);
        }
        e2.a();
    }
}
