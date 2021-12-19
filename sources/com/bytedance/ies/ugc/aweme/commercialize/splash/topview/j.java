package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.l;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ad.splash.f.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f34896a;

    /* renamed from: b  reason: collision with root package name */
    private final DownloadInfo f34897b;

    static {
        Covode.recordClassIndex(20933);
    }

    j(Aweme aweme, DownloadInfo downloadInfo) {
        this.f34896a = aweme;
        this.f34897b = downloadInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Aweme aweme = this.f34896a;
        DownloadInfo downloadInfo = this.f34897b;
        String str = i.b() + aweme.getAid();
        File file = new File(str);
        if (d.a(str) < ((long) l.f34845a)) {
            if (file.exists()) {
                h.AnonymousClass1.a(file);
            }
            a.a("draw_ad", "download_video_failed", aweme.getAwemeRawAd()).a("failed_code", -2).a("failed_msg", "Less than minsize").a("video_url", downloadInfo.getUrl()).b();
            com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "Less than minsize", -2, downloadInfo.getUrl());
        } else {
            a.a("draw_ad", "download_video_succeed", aweme.getAwemeRawAd()).a("video_url", downloadInfo.getUrl()).b();
            com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(true, aweme, null, -1, downloadInfo.getUrl());
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        }
        return null;
    }
}
