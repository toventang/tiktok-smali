package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.preload.s;
import java.io.File;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122906a;

    static {
        Covode.recordClassIndex(80689);
    }

    j(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122906a = i18nSettingNewVersionActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122906a;
        a.a(3, "clear-cache", "start clear cache without disk manager");
        IExternalService a2 = AVExternalServiceImpl.a();
        a2.configService().cacheConfig().clearEffectCache();
        a2.configService().cacheConfig().clearMvCache();
        File file = new File(I18nSettingNewVersionActivity.a(d.a()).getAbsolutePath() + "/aweme_monitor");
        if (file.exists()) {
            I18nSettingNewVersionActivity.a(file);
        }
        e.b(i18nSettingNewVersionActivity.getCacheDir());
        s.a().c();
        am.a();
        a.b(3, "clear-cache", "finish clear cache without disk manager");
        return null;
    }
}
