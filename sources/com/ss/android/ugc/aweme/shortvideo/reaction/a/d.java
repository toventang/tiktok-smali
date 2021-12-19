package com.ss.android.ugc.aweme.shortvideo.reaction.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.setting.n;
import com.ss.android.ugc.aweme.setting.s;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.ugc.effectplatform.util.u;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f129971a = new d();

    private d() {
    }

    public static final class b implements LocalVideoPlayerManager.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f129980b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f129981c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f129982d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f129983e;

        static {
            Covode.recordClassIndex(85305);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a() {
            d.a(this.f129981c, this.f129982d, this.f129983e, this.f129979a);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a(String str) {
            File file = new File(str);
            RuntimeBehaviorServiceImpl.c().a("download_success");
            a aVar = this.f129979a;
            if (aVar != null) {
                aVar.f129967c = System.currentTimeMillis();
            }
            a aVar2 = this.f129979a;
            if (aVar2 != null) {
                aVar2.a(100, file.length(), file.length());
            }
            a aVar3 = this.f129979a;
            if (aVar3 != null) {
                aVar3.a("local", this.f129980b);
            }
        }

        b(a aVar, String str, List list, String str2, String str3) {
            this.f129979a = aVar;
            this.f129980b = str;
            this.f129981c = list;
            this.f129982d = str2;
            this.f129983e = str3;
        }
    }

    static {
        Covode.recordClassIndex(85303);
    }

    public static final class a implements com.ss.android.ugc.aweme.video.preload.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f129972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f129973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f129974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f129975d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f129976e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f129977f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f129978g;

        static {
            Covode.recordClassIndex(85304);
        }

        @Override // com.ss.android.ugc.aweme.video.preload.d
        public final void a() {
            bj.a("DuetVideoDownloader - copy video cache: error");
            d.a(this.f129976e, this.f129977f, this.f129978g, this.f129974c);
        }

        @Override // com.ss.android.ugc.aweme.video.preload.d
        public final void a(boolean z) {
            if (z) {
                bj.a("DuetVideoDownloader - copy video cache: success, isDuplicateCall: " + this.f129972a.element);
                if (!this.f129972a.element) {
                    File file = new File(this.f129973b);
                    a aVar = this.f129974c;
                    if (aVar != null) {
                        aVar.a(100, file.length(), file.length());
                    }
                    a aVar2 = this.f129974c;
                    if (aVar2 != null) {
                        aVar2.a(this.f129975d, this.f129973b);
                    }
                }
                this.f129972a.element = true;
                return;
            }
            bj.a("DuetVideoDownloader - copy video cache: fail");
            d.a(this.f129976e, this.f129977f, this.f129978g, this.f129974c);
        }

        a(z.a aVar, String str, a aVar2, String str2, List list, String str3, String str4) {
            this.f129972a = aVar;
            this.f129973b = str;
            this.f129974c = aVar2;
            this.f129975d = str2;
            this.f129976e = list;
            this.f129977f = str3;
            this.f129978g = str4;
        }
    }

    public static final class c extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f129985b;

        static {
            Covode.recordClassIndex(85306);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            a aVar = this.f129984a;
            if (aVar != null) {
                aVar.f129967c = System.currentTimeMillis();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            a aVar;
            int i2;
            long j2;
            long j3;
            super.onProgress(downloadInfo);
            a aVar2 = this.f129984a;
            if (aVar2 != null) {
                if (downloadInfo != null) {
                    i2 = downloadInfo.getDownloadProcess();
                    j2 = downloadInfo.getCurBytes();
                    j3 = downloadInfo.getTotalBytes();
                } else {
                    i2 = 0;
                    j2 = 0;
                    j3 = 100;
                }
                aVar2.a(i2, j2, j3);
            }
            if (n.a() && s.a() && (aVar = this.f129984a) != null && aVar.a()) {
                DownloadServiceManager.INSTANCE.getDownloadService().cancel(this.f129985b.element);
                this.f129984a.a((Exception) null, "download canceled by user", (Integer) null);
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
                com.ss.android.ugc.aweme.shortvideo.reaction.a.a r3 = r5.f129984a
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.reaction.a.d.c.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        c(a aVar, z.c cVar) {
            this.f129984a = aVar;
            this.f129985b = cVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            a aVar = this.f129984a;
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
                list2 = h.a.z.INSTANCE;
            }
            z.c cVar = new z.c();
            cVar.element = -1;
            c cVar2 = new c(aVar, cVar);
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.n = list2;
            with.f83078c = str2;
            with.f83081f = str;
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3).c().a("duet_react_video").a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
            a2.D = cVar2;
            cVar.element = a2.f();
        }
    }

    public static final void a(Aweme aweme, List<String> list, String str, String str2, a aVar) {
        String str3;
        String str4 = "";
        l.d(aweme, str4);
        l.d(list, str4);
        if (str == null || !p.c(str, "/", false)) {
            str3 = str + File.separator + str2;
        } else {
            str3 = str + str2;
        }
        if (LocalVideoPlayerManager.a().a(aweme.getAid(), str3, new b(aVar, str3, list, str, str2))) {
            return;
        }
        if (!n.a() || (!u.a(aVar.f129968d, "duet") && !u.a(aVar.f129968d, "duet_page"))) {
            bj.a("DuetVideoDownloader - video cache not used");
            a(list, str, str2, aVar);
            return;
        }
        bj.a("DuetVideoDownloader - try use video cache");
        if (!list.isEmpty()) {
            str4 = list.get(0);
        }
        z.a aVar2 = new z.a();
        aVar2.element = false;
        ac.a(aweme, str3, new a(aVar2, str3, aVar, str4, list, str, str2));
    }
}
