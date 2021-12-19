package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.share.t;
import com.ss.android.ugc.aweme.share.u;
import java.util.List;

public class InitMobShare implements w {
    static {
        Covode.recordClassIndex(69002);
    }

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
        return ae.MAIN;
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
        try {
            LauncherServiceImpl.b();
            Reflect.on((Class<?>) u.class).set("sMobKey", new t("YYWjeT5eJGnfiErKfxYxYAXHq", "w981H5bEdxghiDenDVAu2dTutdsQsh71LU0w4sLmVO8UMdbe6Q", "be57ee08-231d-4622-9cad-4e0792363934", "musically", AppLog.getInstallId()));
        } catch (Exception unused) {
        }
    }
}
