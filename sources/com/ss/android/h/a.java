package com.ss.android.h;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(36750);
    }

    public static boolean c() {
        try {
            if (c.f99077a.f99078b.getMtLocalAnalysisHprof().intValue() == 1) {
                return true;
            }
            return false;
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static LikoAnalysisConfig d() {
        try {
            LikoAnalysisConfig likoAnalysisConfig = (LikoAnalysisConfig) SettingsManager.a().a("dmt_liko_analysis_config", LikoAnalysisConfig.class);
            if (likoAnalysisConfig == null) {
                return new LikoAnalysisConfig();
            }
            return likoAnalysisConfig;
        } catch (Throwable unused) {
        }
    }

    public static File a() {
        Context a2 = d.a();
        if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107195c = a2.getFilesDir();
        }
        File file = new File(com.ss.android.ugc.aweme.lancet.d.f107195c.getAbsolutePath() + "/aweme_monitor");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File b() {
        File file;
        Context a2 = d.a();
        if (!TextUtils.isEmpty(null)) {
            file = a2.getExternalFilesDir(null);
        } else {
            if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107196d = a2.getExternalFilesDir(null);
            }
            file = com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File file2 = new File(file.getPath() + "/aweme_monitor");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
