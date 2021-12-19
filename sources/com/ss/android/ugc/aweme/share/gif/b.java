package com.ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import h.f.b.l;
import java.io.File;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    FeedPanelStateViewModel f123510a;

    /* renamed from: b  reason: collision with root package name */
    d f123511b;

    static {
        Covode.recordClassIndex(81089);
    }

    static void a(Runnable runnable) {
        i.b(new g(runnable), i.f4826c);
    }

    static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeACLShareInfo() == null || aweme.getAwemeACLShareInfo().getDownloadGeneral() == null || aweme.getAwemeACLShareInfo().getDownloadGeneral().getTranscode() == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.gif.h
    public final void a(final Activity activity, final Aweme aweme, final String str, final String str2) {
        if (!activity.isFinishing()) {
            final String str3 = "";
            l.d(aweme, str3);
            String path = new File(a.a(), a.a(aweme)).getPath();
            l.b(path, str3);
            File file = new File(path);
            if (!file.exists() || file.length() <= 0) {
                if (activity instanceof e) {
                    this.f123510a = (FeedPanelStateViewModel) ae.a((e) activity, (ad.b) null).a(FeedPanelStateViewModel.class);
                }
                if (!(aweme.getVideo() == null || aweme.getVideo().getPlayAddrH264() == null || aweme.getVideo().getPlayAddrH264().getUrlList() == null)) {
                    str3 = aweme.getVideo().getPlayAddrH264().getUrlList().get(0);
                }
                if (!TextUtils.isEmpty(str3)) {
                    File file2 = new File(path);
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdir();
                    }
                    Downloader.with(com.bytedance.ies.ugc.appcontext.d.a()).url(str3).savePath(a.a()).name(a.a(aweme)).subThreadListener(new AbsDownloadListener() {
                        /* class com.ss.android.ugc.aweme.share.gif.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(81090);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                            super.onStart(downloadInfo);
                            b.a(new f(b.this, activity));
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            super.onProgress(downloadInfo);
                            b.a(new e(b.this, (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes())));
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            String str;
                            super.onSuccessed(downloadInfo);
                            if (downloadInfo.getSavePath().endsWith("/")) {
                                str = downloadInfo.getSavePath() + downloadInfo.getName();
                            } else {
                                str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
                            }
                            b.a(new d(b.this, activity, aweme, str, str, str2));
                            com.bytedance.apm.b.a("aweme_download_error_rate", 0, new c().a("tools_use_downloader", (Boolean) true).a("url", str3).a("from", "gifshare").a());
                            com.ss.android.ugc.aweme.app.f.b.a(aweme, "gif", str3);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            String str;
                            super.onFailed(downloadInfo, baseException);
                            b.a(new c(b.this, activity));
                            if (baseException != null) {
                                str = m.c(baseException);
                            } else {
                                str = "null exception";
                            }
                            com.bytedance.apm.b.a("aweme_download_error_rate", 1, new c().a("tools_use_downloader", (Boolean) true).a("url", str3).a("from", "gifshare").a("exception", str).a());
                        }
                    }).download();
                }
            } else if (!activity.isFinishing()) {
                VideoShare2GifEditActivity.a(activity, aweme.getAid(), aweme.getAuthorUid(), a(aweme), path, str, str2);
            }
        }
    }
}
