package com.ss.android.ugc.aweme.tools.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.tools.h.a.l;
import com.ss.android.ugc.tools.h.a.p;
import com.ss.android.ugc.tools.h.a.q;
import h.v;
import java.io.File;

public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f138747a;

    static {
        Covode.recordClassIndex(90751);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.a.a$a  reason: collision with other inner class name */
    public static final class C3660a extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f138748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138749b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f138750c;

        /* renamed from: d  reason: collision with root package name */
        private long f138751d;

        static {
            Covode.recordClassIndex(90752);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            this.f138751d = System.currentTimeMillis();
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && this.f138748a != null) {
                q qVar = new q(this.f138749b, this.f138750c);
                downloadInfo.getDownloadProcess();
                h.f.b.l.d(qVar, "");
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            p pVar = this.f138748a;
            if (pVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                    str = this.f138749b;
                }
                pVar.a(str, System.currentTimeMillis() - this.f138751d);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            long currentTimeMillis;
            Integer num;
            super.onFailed(downloadInfo, baseException);
            p pVar = this.f138748a;
            if (pVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                    str = this.f138749b;
                }
                if (this.f138751d == 0) {
                    currentTimeMillis = 0;
                } else {
                    currentTimeMillis = System.currentTimeMillis() - this.f138751d;
                }
                if (baseException != null) {
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    num = null;
                }
                pVar.a(str, currentTimeMillis, baseException, num);
            }
        }

        C3660a(p pVar, String str, String str2) {
            this.f138748a = pVar;
            this.f138749b = str;
            this.f138750c = str2;
        }
    }

    public a(Context context) {
        h.f.b.l.d(context, "");
        this.f138747a = context;
    }

    @Override // com.ss.android.ugc.tools.h.a.l
    public final void a(String str, String str2, p pVar) {
        h.p a2;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        String str3 = File.separator;
        h.f.b.l.b(str3, "");
        int a3 = h.m.p.a((CharSequence) str2, str3);
        if (a3 <= 0 || a3 >= str2.length()) {
            a2 = v.a(str2, "");
        } else {
            String substring = str2.substring(0, a3);
            h.f.b.l.b(substring, "");
            String substring2 = str2.substring(a3 + 1);
            h.f.b.l.b(substring2, "");
            a2 = v.a(substring, substring2);
        }
        Downloader.with(this.f138747a).url(str).savePath((String) a2.getFirst()).name((String) a2.getSecond()).subThreadListener(new C3660a(pVar, str, str2)).download();
    }
}
