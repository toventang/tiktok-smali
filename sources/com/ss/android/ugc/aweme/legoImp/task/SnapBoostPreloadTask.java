package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.common.a.b.a;
import com.bytedance.common.a.c.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fm;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public class SnapBoostPreloadTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static String f107884a = "snapboost";

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(69134);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        fm.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            a.a(context, true);
            if (fm.b()) {
                b.a("snapboost_list.txt").b();
            }
            if (com.ss.android.ugc.aweme.s.a.n() != 0) {
                b.a("snapboost_list_second_page.txt").b();
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin() && !in.e()) {
            r.a("tool_performance_profile_editor", new d().a("commit_took", uptimeMillis2).a("commit_id", 1).a("commit_result", 0).f66730a);
        }
    }
}
