package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.l;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static e f34889a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f34890b;

    static {
        Covode.recordClassIndex(20930);
    }

    private h() {
    }

    public static boolean d() {
        e eVar = f34889a;
        if (eVar != null) {
            return eVar.e();
        }
        return false;
    }

    public static void b() {
        if (f34889a != null && !d()) {
            f34889a.b();
        }
    }

    public static h a() {
        MethodCollector.i(7991);
        if (f34890b == null) {
            synchronized (h.class) {
                try {
                    if (f34890b == null) {
                        i.f34794j = SettingsManager.a().a("topview_storage_optimize_enable", false);
                        f34889a = new e();
                        f34890b = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7991);
                    throw th;
                }
            }
        }
        h hVar = f34890b;
        MethodCollector.o(7991);
        return hVar;
    }

    public static String c() {
        if (a.a().r()) {
            return "1";
        }
        if (a.a().s()) {
            return "2";
        }
        if (!i.f34790f) {
            return "3";
        }
        if (!i.f34786b && !a.a().q()) {
            return "3";
        }
        if (i.f34791g) {
            return "4";
        }
        if (!i.f34787c) {
            return "5";
        }
        return a.b.f73758a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_count", aweme.getAwemeRawAd()).b();
            if ((!z || b.a().a(true, "awesome_splash_preload_optimize", 0) == 0) && a(aweme)) {
                z = true;
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(aweme);
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a(list);
        }
        e eVar = f34889a;
        if (eVar == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = (Aweme) it2.next();
            if (aweme2 != null) {
                AwemeStatus status = aweme2.getStatus();
                com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                status.setPrivateStatus(0);
                status.setAllowComment(true);
                status.setAllowShare(true);
            }
            AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(aweme2);
            if (m2 != null) {
                m2.anchorId = aweme2.getAuthorUid();
            }
            String I = com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme2);
            if (!TextUtils.isEmpty(I)) {
                eVar.a().put(I, aweme2);
            }
        }
        eVar.d();
        return null;
    }

    public final boolean a(final Aweme aweme) {
        VideoUrlModel playAddr;
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("start preload TopView Aweme =" + aweme.getAid());
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.H(aweme)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("past data, cancel download");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "past_data").b();
            return false;
        }
        AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(aweme);
        if (m2 == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("awemeSplashInfo is null，cancel download");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "splash_info_null").b();
            return false;
        }
        int preloadType = m2.getPreloadType();
        if (!f.a.f68431a.c()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("no network, cancel download");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "no_network").b();
            return false;
        } else if (f.a.f68431a.b() || preloadType != 1) {
            aweme.getAid();
            AnonymousClass1 r5 = new IDownloadListener() {
                /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(20931);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first succeed");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPause(DownloadInfo downloadInfo) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download pause");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_cancel", aweme.getAwemeRawAd()).b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download cancel");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstStart(DownloadInfo downloadInfo) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_start_first_sdk", aweme.getAwemeRawAd()).b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first start");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPrepare(DownloadInfo downloadInfo) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_prepare", aweme.getAwemeRawAd()).b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download prepare");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_start_sdk", aweme.getAwemeRawAd()).b();
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download start");
                }

                public static boolean a(File file) {
                    MethodCollector.i(5770);
                    try {
                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                        if (e.a(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                        }
                        if (e.c(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                            MethodCollector.o(5770);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.o(5770);
                    return delete;
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    downloadInfo.getUrl();
                    if (l.f34845a == 0) {
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_succeed", aweme.getAwemeRawAd()).a("video_url", downloadInfo.getUrl()).b();
                        com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(true, aweme, null, -1, downloadInfo.getUrl());
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
                        return;
                    }
                    b.i.b(new j(aweme, downloadInfo), b.i.f4824a);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry delay");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    int errorCode;
                    String errorMessage;
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download failed");
                    if (baseException == null) {
                        errorCode = 0;
                        errorMessage = "";
                    } else {
                        errorCode = baseException.getErrorCode();
                        errorMessage = baseException.getErrorMessage();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_failed", aweme.getAwemeRawAd()).a("failed_code", Integer.valueOf(errorCode)).a("failed_msg", errorMessage).a("video_url", downloadInfo.getUrl()).b();
                    if (errorCode == 1034) {
                        File file = new File(i.b() + aweme.getAid());
                        if (file.exists()) {
                            a(file);
                        }
                    }
                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, errorMessage, Integer.valueOf(errorCode), downloadInfo.getUrl());
                }
            };
            Video video = aweme.getVideo();
            if (video == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_null");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "video_null").b();
                return false;
            }
            if (SettingsManager.a().a("awesome_splash_force_use_h264", false)) {
                playAddr = video.getPlayAddrH264();
            } else {
                playAddr = video.getPlayAddr();
            }
            if (playAddr == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_model_null");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "video_url_model_null").b();
                return false;
            }
            playAddr.setSourceId(aweme.getAid());
            String str = i.c() + playAddr.getSourceId();
            if (new File(i.b() + playAddr.getSourceId()).exists() || (i.f34794j && new File(str).exists())) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video has download, do not download again");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "video_exists").b();
                return false;
            }
            List<String> urlList = playAddr.getUrlList();
            if (com.bytedance.common.utility.collection.b.a((Collection) urlList)) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_list_null");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "video_url_list_null").b();
                return false;
            }
            String str2 = urlList.get(0);
            if (TextUtils.isEmpty(str2)) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_first_null");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "video_url_first_null").b();
                return false;
            }
            ArrayList arrayList = new ArrayList(urlList);
            arrayList.remove(str2);
            int a2 = c.a(str2, i.b());
            IDownloadService p = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().p();
            if (p == null) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "download_service_null").b();
                return false;
            } else if (p.a(a2)) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "is_downloading").b();
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video is downloading, not start download");
                return false;
            } else {
                DownloadInfo downloadInfo = p.getDownloadInfo(a2);
                int i2 = 100;
                if (downloadInfo != null) {
                    i2 = downloadInfo.getStatus();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_start", aweme.getAwemeRawAd()).a("download_status", Integer.valueOf(i2)).b();
                String fileHash = playAddr.getFileHash();
                com.ss.android.ugc.aweme.download.component_api.a with = p.with(str2);
                with.n = arrayList;
                with.f83081f = i.b();
                with.s = fileHash;
                with.f83078c = aweme.getAid();
                with.C = r5;
                with.a("ad_splash_video_preload").b().a(com.ss.android.ugc.aweme.download.component_api.c.VIDEO);
                return true;
            }
        } else {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("not wifi, cancel download");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).a("reason", "wifi_only").b();
            return false;
        }
    }
}
