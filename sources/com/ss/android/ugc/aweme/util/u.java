package com.ss.android.ugc.aweme.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c.b.e;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import h.f.b.l;
import h.f.b.z;
import java.lang.ref.WeakReference;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142555a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f142556b;

    public interface b {
        static {
            Covode.recordClassIndex(93230);
        }

        void a();

        void a(Uri uri);

        void b();
    }

    static {
        Covode.recordClassIndex(93228);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93229);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f142558b;

        static {
            Covode.recordClassIndex(93231);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            b bVar = this.f142557a;
            if (bVar != null) {
                new RuntimeException("Download is canceled");
                bVar.b();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            b bVar = this.f142557a;
            if (bVar != null) {
                bVar.a(this.f142558b.element);
            }
        }

        c(b bVar, z.e eVar) {
            this.f142557a = bVar;
            this.f142558b = eVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            b bVar = this.f142557a;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public u(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        this.f142556b = weakReference;
    }

    public final void a(String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            bVar.b();
            return;
        }
        Context context = this.f142556b.get();
        if (context != null) {
            l.b(context, "");
            if (com.ss.android.ugc.aweme.share.improve.c.b.b(context)) {
                b(str, bVar);
            } else {
                com.ss.android.ugc.aweme.share.improve.c.c.a(context);
            }
        }
    }

    private final void b(String str, b bVar) {
        if (bVar != null) {
            bVar.a();
        }
        String str2 = d.b(str) + ".png";
        z.e eVar = new z.e();
        eVar.element = (T) e.c(this.f142556b.get(), str2, "image/png");
        if (eVar.element == null) {
            eVar.element = (T) e.a(this.f142556b.get(), str2, "image/png");
        }
        if (!e.c(this.f142556b.get(), (Uri) eVar.element) && this.f142556b.get() != null) {
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f83078c = str2;
            with.f83081f = String.valueOf(eVar.element);
            with.D = new c(bVar, eVar);
            with.f();
        }
    }
}
