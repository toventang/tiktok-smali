package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.bn;
import com.ss.android.ugc.aweme.video.e;
import f.a.v;
import f.a.w;
import java.io.File;

final /* synthetic */ class g implements w {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122903a;

    static {
        Covode.recordClassIndex(80686);
    }

    g(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122903a = i18nSettingNewVersionActivity;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        String str;
        try {
            File[] fileArr = new File[4];
            fileArr[0] = this.f122903a.getCacheDir();
            fileArr[1] = e.a();
            fileArr[2] = new File(AVExternalServiceImpl.a().configService().cacheConfig().stickerDir());
            File file = new File(I18nSettingNewVersionActivity.a(d.a()).getAbsolutePath() + "/aweme_monitor");
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            str = bn.b(fileArr);
        } catch (Exception unused) {
            str = "0.0MB";
        }
        vVar.a(str);
        vVar.a();
    }
}
