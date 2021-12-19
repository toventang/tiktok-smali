package com.ss.android.socialbase.downloader.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.a;
import com.ss.android.socialbase.downloader.g.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;

public interface f {
    static {
        Covode.recordClassIndex(37471);
    }

    a a(BaseException baseException, long j2);

    DownloadChunk a(int i2);

    void a(long j2);

    void a(BaseException baseException, boolean z);

    void a(g gVar);

    void a(b bVar);

    void a(String str, g gVar, long j2);

    boolean a(BaseException baseException);

    a b(BaseException baseException, long j2);

    void b(BaseException baseException);

    boolean b(long j2);

    void c(BaseException baseException);
}
