package com.ss.android.ugc.aweme.livewallpaper.b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Aweme f108749a;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f108750b;

    /* renamed from: c  reason: collision with root package name */
    protected d f108751c;

    /* renamed from: d  reason: collision with root package name */
    protected String f108752d;

    /* renamed from: e  reason: collision with root package name */
    protected String f108753e;

    /* renamed from: f  reason: collision with root package name */
    protected String f108754f;

    /* renamed from: g  reason: collision with root package name */
    protected String f108755g;

    /* renamed from: h  reason: collision with root package name */
    protected String f108756h;

    /* renamed from: i  reason: collision with root package name */
    public int f108757i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f108758j = new Runnable() {
        /* class com.ss.android.ugc.aweme.livewallpaper.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69669);
        }

        public final void run() {
            if (a.this.f108751c != null) {
                d dVar = a.this.f108751c;
                int i2 = 100;
                if (a.this.f108757i < 100) {
                    i2 = a.this.f108757i;
                }
                dVar.setProgress(i2);
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private Handler f108759k = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(69668);
    }

    /* access modifiers changed from: protected */
    public abstract void b(String str);

    /* access modifiers changed from: protected */
    public abstract boolean b(Aweme aweme);

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final void a() {
        e.c(this.f108755g);
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        d dVar = this.f108751c;
        if (dVar != null) {
            try {
                dVar.dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f108751c = null;
        }
    }

    protected a(Activity activity) {
        this.f108750b = activity;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (this.f108751c == null) {
            d a2 = d.a(this.f108750b, str);
            this.f108751c = a2;
            a2.setIndeterminate(false);
        }
        this.f108751c.setProgress(0);
    }

    public final void a(Aweme aweme) {
        if (aweme != null) {
            if ((aweme.getAuthor() == null || !TextUtils.equals(b.g().getCurUserId(), aweme.getAuthorUid())) && aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 1) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f108750b).a(R.string.h_5).a();
            } else {
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = g();
                }
                if (!j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f108750b).a(this.f108750b.getString(R.string.fir)).a();
                } else if (b(aweme)) {
                    this.f108749a = aweme;
                    c();
                    if (e.b(this.f108756h)) {
                        e();
                        b();
                        return;
                    }
                    a(d());
                    AnonymousClass2 r2 = new AbsDownloadListener() {
                        /* class com.ss.android.ugc.aweme.livewallpaper.b.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(69670);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            if (a.this.f108750b != null && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
                                a.this.f108757i = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
                                com.ss.android.b.a.a.a.b(a.this.f108758j);
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            String groupId;
                            a.this.b(downloadInfo.getTargetFilePath());
                            com.ss.android.ugc.aweme.app.f.b.a(a.this.f108749a, "live_photo", a.this.f108752d);
                            if (a.this.f108749a == null) {
                                groupId = "-1";
                            } else {
                                groupId = a.this.f108749a.getGroupId();
                            }
                            com.ss.android.ugc.aweme.livewallpaper.f.f.a("share", groupId, true);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            String groupId;
                            String str;
                            if (a.this.f108750b != null) {
                                a.this.f();
                                if (baseException != null) {
                                    if (a.this.f108749a == null || a.this.f108749a.getVideo() == null || TextUtils.isEmpty(a.this.f108749a.getAid()) || TextUtils.isEmpty(a.this.f108749a.getVideo().getVideoId())) {
                                        str = "";
                                    } else {
                                        str = "aid " + a.this.f108749a.getAid() + " vid " + a.this.f108749a.getVideo().getVideoId();
                                    }
                                    com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "download video fail " + str + baseException.getErrorMessage() + " error code " + baseException.getErrorCode());
                                }
                                if (a.this.f108749a == null) {
                                    groupId = "-1";
                                } else {
                                    groupId = a.this.f108749a.getGroupId();
                                }
                                com.ss.android.ugc.aweme.livewallpaper.f.f.a("share", groupId, false);
                            }
                        }
                    };
                    com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f108752d);
                    with.f83078c = this.f108754f + ".mp4";
                    with.f83081f = this.f108753e + "temp";
                    com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3).a("live_wall_paper_share").a(true);
                    a2.D = r2;
                    a2.f();
                    com.ss.android.ugc.aweme.livewallpaper.f.f.a("share");
                    this.f108759k.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.livewallpaper.b.a.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(69671);
                        }

                        public final void run() {
                            if (a.this.f108757i == 0) {
                                a.this.f();
                                com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "timeout download video");
                            }
                        }
                    }, 60000);
                    return;
                }
            }
        }
        b();
    }
}
