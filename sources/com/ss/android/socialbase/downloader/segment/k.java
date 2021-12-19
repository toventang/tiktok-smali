package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.c;
import java.io.IOException;

final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final i f60951a;

    /* renamed from: b  reason: collision with root package name */
    final c f60952b;

    /* renamed from: c  reason: collision with root package name */
    public final e f60953c;

    static {
        Covode.recordClassIndex(37568);
    }

    @Override // com.ss.android.socialbase.downloader.segment.e
    public final void b(a aVar) {
        this.f60952b.a(aVar.f60897a, aVar.f60899c);
        i iVar = this.f60951a;
        iVar.f60928b.addAndGet((long) aVar.f60899c);
    }

    private static c a(DownloadInfo downloadInfo, i iVar) {
        c a2 = g.a(downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName(), a.a(downloadInfo.getId(), (DownloadInfo) null).a("flush_buffer_size_byte", -1));
        try {
            a2.a(iVar.d());
            return a2;
        } catch (IOException e2) {
            throw new BaseException(1054, e2);
        }
    }

    public k(DownloadInfo downloadInfo, b bVar, i iVar) {
        this.f60951a = iVar;
        this.f60952b = a(downloadInfo, iVar);
        this.f60953c = new h(bVar, this);
    }
}
