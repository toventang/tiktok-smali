package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Looper;
import androidx.b.a.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl;
import java.util.List;

public class BaseOptFirstFrameTask implements w {
    static {
        Covode.recordClassIndex(68945);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (d.c()) {
            return ae.BOOT_FINISH;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).newAddWikiActivity();
        new a(context);
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).preloadPushSettingsManager();
        com.ss.android.ugc.aweme.compliance.api.a.d().d();
        AVExternalServiceImpl.a().configService().avsettingsConfig().enablePreUploadByUser();
    }
}
