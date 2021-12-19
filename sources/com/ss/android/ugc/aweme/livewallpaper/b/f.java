package com.ss.android.ugc.aweme.livewallpaper.b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.d f108778a;

    /* renamed from: b  reason: collision with root package name */
    public String f108779b = "";

    /* renamed from: c  reason: collision with root package name */
    public Handler f108780c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public g f108781d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f108782e;

    static {
        Covode.recordClassIndex(69683);
    }

    private final void c() {
        e.c(this.f108779b);
    }

    public static final class a extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f108783a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f108784b;

        static {
            Covode.recordClassIndex(69684);
        }

        /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$a$a  reason: collision with other inner class name */
        static final class RunnableC2789a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f108785a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f108786b;

            static {
                Covode.recordClassIndex(69685);
            }

            RunnableC2789a(a aVar, int i2) {
                this.f108785a = aVar;
                this.f108786b = i2;
            }

            public final void run() {
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f108785a.f108783a.f108778a;
                if (dVar != null) {
                    dVar.setProgress(this.f108786b);
                }
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                long totalBytes = downloadInfo.getTotalBytes();
                if (totalBytes > 0) {
                    com.ss.android.b.a.a.a.b(new RunnableC2789a(this, (int) ((((float) downloadInfo.getCurBytes()) / ((float) totalBytes)) * 100.0f)));
                }
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String targetFilePath;
            if (downloadInfo == null || (targetFilePath = downloadInfo.getTargetFilePath()) == null || targetFilePath.length() == 0) {
                this.f108783a.a();
                return;
            }
            e.c(targetFilePath, this.f108784b);
            this.f108783a.a(this.f108784b);
        }

        public a(f fVar, String str) {
            this.f108783a = fVar;
            this.f108784b = str;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f108783a.a();
        }
    }

    public final void a() {
        c();
        com.ss.android.b.a.a.a.b(new b(this));
    }

    public final void b() {
        com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f108778a;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f108778a = null;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f108788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f108789b;

        static {
            Covode.recordClassIndex(69687);
        }

        c(f fVar, String str) {
            this.f108788a = fVar;
            this.f108789b = str;
        }

        public final void run() {
            if (!this.f108788a.f108782e.isFinishing()) {
                this.f108788a.b();
                g gVar = this.f108788a.f108781d;
                if (gVar != null) {
                    gVar.a(this.f108789b);
                }
            }
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f108790a;

        static {
            Covode.recordClassIndex(69688);
        }

        public d(f fVar) {
            this.f108790a = fVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f108790a.f108778a;
            if (dVar != null && dVar.getProgress() == 0) {
                this.f108790a.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f108787a;

        static {
            Covode.recordClassIndex(69686);
        }

        b(f fVar) {
            this.f108787a = fVar;
        }

        public final void run() {
            if (!this.f108787a.f108782e.isFinishing()) {
                this.f108787a.b();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f108787a.f108782e).a(R.string.bbv).a();
                g gVar = this.f108787a.f108781d;
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
    }

    public f(Activity activity) {
        l.d(activity, "");
        this.f108782e = activity;
    }

    public final void a(String str) {
        c();
        com.ss.android.b.a.a.a.b(new c(this, str));
    }
}
