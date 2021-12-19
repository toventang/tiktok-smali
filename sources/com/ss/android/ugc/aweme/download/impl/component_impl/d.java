package com.ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.download.component_api.c.d;
import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.ss.android.ugc.aweme.download.impl.component_impl.a.a;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class d extends com.ss.android.ugc.aweme.download.component_api.a implements a.AbstractC1954a {
    private DownloadTask aa;

    static {
        Covode.recordClassIndex(51824);
    }

    public static final class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f83120a;

        static {
            Covode.recordClassIndex(51825);
        }

        @Override // com.ss.android.ugc.aweme.download.component_api.c.d.a
        public final void a() {
            this.f83120a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f83120a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.a
    public final int f() {
        return a(com.ss.android.ugc.aweme.download.component_api.c.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ DownloadTask $task;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(51827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, DownloadTask downloadTask) {
            super(0);
            this.this$0 = dVar;
            this.$task = downloadTask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f83077b = this.$task.download();
            e.a().a(this.this$0.f83077b, this.this$0);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ r $downloadStartCallback;
        final /* synthetic */ DownloadTask $task;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(51826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, DownloadTask downloadTask, r rVar) {
            super(0);
            this.this$0 = dVar;
            this.$task = downloadTask;
            this.$downloadStartCallback = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$task.asyncDownload(this.$downloadStartCallback);
            d dVar = this.this$0;
            dVar.f83077b = Downloader.getInstance(dVar.f83076a).getDownloadId(this.this$0.f83080e, this.this$0.f83081f);
            e.a().a(this.this$0.f83077b, this.this$0);
            return z.f158842a;
        }
    }

    private final void c(DownloadTask downloadTask) {
        a(new c(this, downloadTask));
    }

    private final void a(h.f.a.a<z> aVar) {
        boolean z;
        Context context = this.f83076a;
        l.b(context, "");
        int i2 = context.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || (i2 != 29 ? i2 <= 29 : Environment.isExternalStorageLegacy())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.G || z) {
            aVar.invoke();
        } else {
            com.ss.android.ugc.aweme.download.component_api.c.d.a(this.f83076a, new a(aVar));
        }
    }

    private final void b(DownloadTask downloadTask) {
        if (this.C != null) {
            downloadTask.mainThreadListener(new com.ss.android.ugc.aweme.download.impl.component_impl.a.a(this.C, this.Z, this));
        }
        if (this.D != null) {
            downloadTask.subThreadListener(new com.ss.android.ugc.aweme.download.impl.component_impl.a.a(this.D, this.Z, this));
        }
        if (this.R) {
            downloadTask.monitorDepend(new DownloadMonitorDepend(DownloadServiceImpl.f83101b, this.K, this.I, this.J));
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.a
    public final int a(r rVar) {
        this.H = com.ss.android.ugc.aweme.download.component_api.c.DEFAULT;
        a(this.aa);
        b(this.aa);
        a(new b(this, this.aa, rVar));
        return Downloader.getInstance(this.f83076a).getDownloadId(this.f83080e, this.f83081f);
    }

    private final void a(DownloadTask downloadTask) {
        downloadTask.url(this.f83080e).backUpUrls(this.n).name(this.f83078c).title(this.f83079d).savePath(this.f83081f).onlyWifi(this.f83082g).extraHeaders(this.f83085j).addTTNetCommonParam(this.f83083h).depend(this.F).retryCount(this.f83086k).backUpUrlRetryCount(this.S).showNotification(this.o).extra(this.f83084i).mimeType(this.p).force(this.Y).minProgressTimeMsInterval(this.f83088m).maxProgressCount(this.f83087l).notificationListener(this.E).notificationEventListener(this.B).autoResumed(this.x).showNotificationForAutoResumed(this.y).needHttpsToHttpRetry(this.q).packageName(this.r).md5(this.s).fileUriProvider(this.z).expectFileLength(this.w).retryDelayTimeCalculator(this.A).iconUrl(this.t).addListenerToSameTask(this.X).needSDKMonitor(this.u).monitorScene(this.v);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.a
    public final int a(com.ss.android.ugc.aweme.download.component_api.c cVar) {
        l.d(cVar, "");
        this.H = cVar;
        a(this.aa);
        b(this.aa);
        c(this.aa);
        return Downloader.getInstance(this.f83076a).getDownloadId(this.f83080e, this.f83081f);
    }

    @Override // com.ss.android.ugc.aweme.download.impl.component_impl.a.a.AbstractC1954a
    public final void a(DownloadInfo downloadInfo) {
        if ((com.ss.android.ugc.aweme.download.component_api.c.IMAGE == this.H || com.ss.android.ugc.aweme.download.component_api.c.VIDEO == this.H) && this.O && downloadInfo != null) {
            try {
                String targetFilePath = downloadInfo.getTargetFilePath();
                String str = this.P;
                if (!TextUtils.isEmpty(targetFilePath)) {
                    if (!TextUtils.isEmpty(str)) {
                        Context context = this.f83076a;
                        l.b(context, "");
                        l.b(targetFilePath, "");
                        l.b(str, "");
                        if (com.ss.android.ugc.aweme.download.component_api.c.a.a(context, targetFilePath, str, downloadInfo.getMimeType())) {
                            com.ss.android.ugc.aweme.download.component_api.b.a aVar = this.Q;
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (com.ss.android.ugc.aweme.download.component_api.c.ZIP == this.H && this.L && downloadInfo != null) {
            try {
                String targetFilePath2 = downloadInfo.getTargetFilePath();
                if (!TextUtils.isEmpty(targetFilePath2)) {
                    if (!g.b(downloadInfo)) {
                        g.a(downloadInfo, true);
                    } else if (!TextUtils.isEmpty(this.M)) {
                        File file = new File(this.M);
                        if (file.exists()) {
                            File[] listFiles = file.listFiles();
                            l.b(listFiles, "");
                            if (listFiles.length != 0) {
                                com.ss.android.ugc.aweme.download.component_api.c.b bVar = com.ss.android.ugc.aweme.download.component_api.c.b.f83099a;
                                String path = file.getPath();
                                l.b(path, "");
                                bVar.a(path);
                            }
                        }
                        File a2 = cs.a(this.M, false);
                        l.b(a2, "");
                        com.ss.android.ugc.aweme.download.impl.component_impl.b.a.a(new File(targetFilePath2), a2);
                        if (this.N != null) {
                            a2.getPath();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.Z && downloadInfo != null) {
            com.ss.android.ugc.aweme.download.component_api.c.c.a(this.f83076a, this);
        }
    }

    public d(Context context, String str) {
        super(context, str);
        DownloadTask with = Downloader.with(context);
        l.b(with, "");
        this.aa = with;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.a
    public final void a(int i2, AbsDownloadListener absDownloadListener, h hVar) {
        l.d(absDownloadListener, "");
        l.d(hVar, "");
        this.aa.addDownloadListener(i2, absDownloadListener, hVar, true);
    }
}
