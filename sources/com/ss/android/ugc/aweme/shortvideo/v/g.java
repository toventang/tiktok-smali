package com.ss.android.ugc.aweme.shortvideo.v;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.bs;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(86726);
    }

    public static final float c() {
        return ((float) b()) / ((float) a());
    }

    public static final int d() {
        ar arVar = ar.f132216a;
        l.b(arVar, "");
        return (int) (arVar.f132220e / 1024);
    }

    public static final int a() {
        return (int) ((Runtime.getRuntime().maxMemory() / 1024) / 1024);
    }

    public static final int b() {
        return (int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) / 1024);
    }

    public static /* synthetic */ float a(int i2) {
        if (i2 <= 0) {
            return 1.0f;
        }
        float f2 = (float) i2;
        return (f2 - ((float) d())) / f2;
    }

    public static final int b(Context context) {
        l.d(context, "");
        return (int) ((bs.a(context) / 1024) / 1024);
    }

    public static final boolean a(Context context) {
        l.d(context, "");
        try {
            i d2 = d(context);
            bj.a("PreSyntheticMachinePerformanceLimitLevel2 " + d2.f132495b);
            return d2.f132494a;
        } catch (Throwable th) {
            bj.a(th);
            return false;
        }
    }

    private static final boolean c(Context context) {
        try {
            i d2 = d(context);
            bj.a("PreSyntheticMachinePerformanceLimitLevel1 " + d2.f132495b);
            return d2.f132494a;
        } catch (Throwable th) {
            bj.a(th);
            return false;
        }
    }

    private static final i d(Context context) {
        int b2 = b(context);
        if (b2 <= 0 || b2 >= 1600) {
            return new i(false, "allow");
        }
        return new i(true, "TotalMemory min:1600 current:" + b2);
    }

    public static final int a(Context context, VideoPublishEditModel videoPublishEditModel) {
        l.d(context, "");
        l.d(videoPublishEditModel, "");
        boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
        if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            return 0;
        }
        if (!b.a().a(true, "enable_mv_theme_pre_upload", false) && isMvThemeVideoType) {
            return 0;
        }
        boolean a2 = e.a();
        boolean enablePreUploadByUser = com.ss.android.ugc.aweme.port.in.g.a().e().getEnablePreUploadByUser(false);
        boolean enablePreUpload = com.ss.android.ugc.aweme.port.in.g.a().e().getEnablePreUpload(false);
        bj.a("enablePreUploadByBusiness switchEnable:" + a2 + " userEnable:" + enablePreUploadByUser + " authkeyEnable:" + enablePreUpload);
        if (a2 && enablePreUploadByUser && enablePreUpload && com.ss.android.ugc.aweme.port.in.g.a().A().b() && !com.ss.android.ugc.aweme.port.in.g.a().A().a() && !c(context)) {
            return 2;
        }
        if (!b.a().a(true, "enable_pre_synthetic", false) || c(context)) {
            return 0;
        }
        return 1;
    }
}
