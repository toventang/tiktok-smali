package com.bytedance.android.livesdk.manage.a;

import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.ugc.live.a.a.a;
import com.ss.ugc.live.a.a.c;
import com.ss.ugc.live.a.a.c.e;
import com.ss.ugc.live.a.a.d.d;
import java.io.File;
import java.io.IOException;

public final class b implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public a<String> f18868a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.ugc.live.a.a.a.b f18869b;

    static {
        Covode.recordClassIndex(11228);
    }

    public b(com.ss.ugc.live.a.a.a.b bVar) {
        this.f18869b = bVar;
    }

    @Override // com.ss.ugc.live.a.a.d.d
    public final void a(final c cVar, a<String> aVar) {
        String str;
        this.f18868a = aVar;
        try {
            String a2 = com.ss.ugc.live.a.a.e.b.a(this.f18869b.a(cVar));
            File file = new File(a2);
            if (file.exists() || file.mkdirs()) {
                final String str2 = a2 + com.ss.ugc.live.a.a.e.a.a(cVar.f154006c[0]);
                DownloadTask url = Downloader.with(y.e()).url(cVar.a());
                int lastIndexOf = str2.lastIndexOf("/");
                String str3 = null;
                if (lastIndexOf != -1) {
                    str = str2.substring(lastIndexOf);
                } else {
                    str = null;
                }
                DownloadTask name = url.name(str);
                int lastIndexOf2 = str2.lastIndexOf("/");
                if (lastIndexOf2 != -1) {
                    str3 = str2.substring(0, lastIndexOf2);
                }
                name.savePath(str3).subThreadListener(new AbsDownloadListener() {
                    /* class com.bytedance.android.livesdk.manage.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(11229);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo) {
                        super.onProgress(downloadInfo);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                        b.this.f18868a.a(cVar, str2);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        super.onFailed(downloadInfo, baseException);
                        b.this.f18868a.a(cVar, new a(baseException.getErrorMessage(), baseException, cVar, baseException.getErrorCode(), new com.ss.ugc.live.a.a.b.a(downloadInfo.getUrl())));
                    }
                }).download();
                return;
            }
            throw new IOException("mkdirs return false, dir=".concat(String.valueOf(file)));
        } catch (Exception e2) {
            this.f18868a.a(cVar, new e("write storage failed.", e2, cVar));
        }
    }
}
