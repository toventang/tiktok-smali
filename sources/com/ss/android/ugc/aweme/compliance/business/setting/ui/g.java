package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.preload.s;
import java.io.File;
import java.util.concurrent.Callable;

final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ChildrenModeSettingActivity f77202a;

    static {
        Covode.recordClassIndex(47733);
    }

    g(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f77202a = childrenModeSettingActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f77202a;
        File file = new File(ChildrenModeSettingActivity.a(d.a()).getAbsolutePath() + "/aweme_monitor");
        if (file.exists()) {
            ChildrenModeSettingActivity.a(file);
        }
        e.b(childrenModeSettingActivity.getCacheDir());
        s.a().c();
        am.a();
        AVExternalServiceImpl.a().configService().cacheConfig().clearEffectCache();
        return null;
    }
}
