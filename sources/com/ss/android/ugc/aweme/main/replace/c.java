package com.ss.android.ugc.aweme.main.replace;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import h.a.z;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f109285a = new c();

    private c() {
    }

    public static final class a implements LocalVideoPlayerManager.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109287b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f109288c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f109289d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f109290e;

        static {
            Covode.recordClassIndex(70001);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a() {
            c.a(this.f109288c, this.f109289d, this.f109290e, this.f109286a);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a(String str) {
            File file = new File(str);
            RuntimeBehaviorServiceImpl.c().a("download_success");
            a aVar = this.f109286a;
            if (aVar != null) {
                aVar.f109282a = System.currentTimeMillis();
            }
            a aVar2 = this.f109286a;
            if (aVar2 != null) {
                aVar2.a(100, file.length(), file.length());
            }
            a aVar3 = this.f109286a;
            if (aVar3 != null) {
                aVar3.a("local", this.f109287b);
            }
        }

        a(a aVar, String str, List list, String str2, String str3) {
            this.f109286a = aVar;
            this.f109287b = str;
            this.f109288c = list;
            this.f109289d = str2;
            this.f109290e = str3;
        }
    }

    static {
        Covode.recordClassIndex(70000);
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109291a;

        static {
            Covode.recordClassIndex(70002);
        }

        b(a aVar) {
            this.f109291a = aVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            a aVar = this.f109291a;
            if (aVar != null) {
                aVar.f109282a = System.currentTimeMillis();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            int i2;
            long j2;
            long j3;
            super.onProgress(downloadInfo);
            a aVar = this.f109291a;
            if (aVar != null) {
                if (downloadInfo != null) {
                    i2 = downloadInfo.getDownloadProcess();
                    j2 = downloadInfo.getCurBytes();
                    j3 = downloadInfo.getTotalBytes();
                } else {
                    i2 = 0;
                    j2 = 0;
                    j3 = 100;
                }
                aVar.a(i2, j2, j3);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r6 == null) goto L_0x0014;
         */
        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r6) {
            /*
                r5 = this;
                super.onSuccessed(r6)
                com.ss.android.ugc.aweme.main.replace.a r3 = r5.f109291a
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0011
                java.lang.String r2 = r6.getUrl()
                if (r2 != 0) goto L_0x0018
            L_0x0011:
                r2 = r0
                if (r6 != 0) goto L_0x0018
            L_0x0014:
                r3.a(r2, r0)
            L_0x0017:
                return
            L_0x0018:
                java.lang.String r4 = r6.getSavePath()
                if (r4 == 0) goto L_0x0042
                r1 = 0
                java.lang.String r0 = "/"
                boolean r1 = h.m.p.c(r4, r0, r1)
                r0 = 1
                if (r1 != r0) goto L_0x0042
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            L_0x0042:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = java.io.File.separator
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.replace.c.b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            a aVar = this.f109291a;
            if (aVar != null) {
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    str = null;
                }
                aVar.a(baseException, str, num);
            }
        }
    }

    public static final void a(List<String> list, String str, String str2, a aVar) {
        List<String> list2;
        l.d(list, "");
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = z.INSTANCE;
            }
            b bVar = new b(aVar);
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.n = list2;
            with.f83078c = str2;
            with.f83081f = str;
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3).c().a("duet_react_video").a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
            a2.D = bVar;
            a2.f();
        }
    }
}
