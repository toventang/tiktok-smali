package com.ss.android.ugc.aweme.video.local;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static int f143446c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final C3822a f143447d = new C3822a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final String f143448e = "DownloaderVideoWrapper";

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f143449f = Collections.synchronizedMap(new HashMap());

    /* renamed from: a  reason: collision with root package name */
    public int f143450a = -1;

    /* renamed from: b  reason: collision with root package name */
    public AbsDownloadListener f143451b;

    /* access modifiers changed from: package-private */
    public static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143457a = new c();

        static {
            Covode.recordClassIndex(93870);
        }

        c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$a  reason: collision with other inner class name */
    public static final class C3822a {
        static {
            Covode.recordClassIndex(93868);
        }

        private C3822a() {
        }

        public /* synthetic */ C3822a(byte b2) {
            this();
        }
    }

    public static final class b implements LocalVideoPlayerManager.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f143452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f143453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f143454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f143455d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f143456e;

        static {
            Covode.recordClassIndex(93869);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a() {
            this.f143452a.a(this.f143453b, this.f143454c, this.f143455d, this.f143456e);
        }

        @Override // com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a
        public final void a(String str) {
            l.d(str, "");
            File file = new File(str);
            RuntimeBehaviorServiceImpl.c().a("download_success");
            DownloadInfo downloadInfo = new DownloadInfo();
            DownloadInfo.a aVar = new DownloadInfo.a();
            downloadInfo.setCurBytes(file.length());
            downloadInfo.setTotalBytes(file.length());
            AbsDownloadListener absDownloadListener = this.f143452a.f143451b;
            if (absDownloadListener != null) {
                absDownloadListener.onProgress(downloadInfo);
            }
            String str2 = File.separator;
            l.b(str2, "");
            String i2 = p.i(str, str2);
            String str3 = File.separator;
            l.b(str3, "");
            String h2 = p.h(str, str3);
            AbsDownloadListener absDownloadListener2 = this.f143452a.f143451b;
            if (absDownloadListener2 != null) {
                aVar.f60840a = i2;
                aVar.f60843d = h2;
                absDownloadListener2.onSuccessed(aVar.a());
            }
        }

        b(a aVar, Context context, String str, String str2, String str3) {
            this.f143452a = aVar;
            this.f143453b = context;
            this.f143454c = str;
            this.f143455d = str2;
            this.f143456e = str3;
        }
    }

    private static List<HttpHeader> a() {
        return n.a(new HttpHeader("downloader_scene", "video"));
    }

    static {
        Covode.recordClassIndex(93867);
    }

    public final void a(AbsDownloadListener absDownloadListener) {
        l.d(absDownloadListener, "");
        this.f143451b = absDownloadListener;
    }

    public final void a(Context context) {
        l.d(context, "");
        DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(this.f143450a).a();
    }

    public final void a(Context context, String str, String str2, String str3) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.f83078c = str2;
        com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(a());
        a2.f83081f = str3;
        com.ss.android.ugc.aweme.download.component_api.a a3 = a2.a(DownloadServiceManager.INSTANCE.getRetryExpCount());
        a3.C = this.f143451b;
        int a4 = a3.a("feed_video").a(c.f143457a);
        this.f143450a = a4;
        f143446c = a4;
    }

    public final void a(Context context, String str, String str2, String str3, String str4) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        if (!LocalVideoPlayerManager.a().a(str, str4 + str3, new b(this, context, str2, str3, str4))) {
            a(context, str2, str3, str4);
        }
    }
}
