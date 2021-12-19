package com.ss.android.socialbase.downloader.downloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.i;
import java.util.List;
import java.util.Map;

public interface l {
    static {
        Covode.recordClassIndex(37360);
    }

    DownloadInfo a(int i2, int i3);

    DownloadInfo a(int i2, long j2);

    DownloadInfo a(int i2, long j2, String str, String str2);

    List<DownloadInfo> a(String str);

    void a(int i2, int i3, int i4, int i5);

    void a(int i2, int i3, int i4, long j2);

    void a(int i2, int i3, long j2);

    void a(int i2, List<DownloadChunk> list);

    void a(DownloadChunk downloadChunk);

    boolean a(int i2, Map<Long, i> map);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(int i2);

    DownloadInfo b(int i2, long j2);

    List<DownloadInfo> b();

    List<DownloadInfo> b(String str);

    void b(int i2, List<DownloadChunk> list);

    void b(DownloadChunk downloadChunk);

    void b(DownloadInfo downloadInfo);

    DownloadInfo c(int i2, long j2);

    List<DownloadChunk> c(int i2);

    List<DownloadInfo> c(String str);

    void c();

    DownloadInfo d(int i2, long j2);

    List<DownloadInfo> d(String str);

    void d(int i2);

    boolean d();

    boolean e();

    boolean e(int i2);

    boolean f(int i2);

    DownloadInfo g(int i2);

    DownloadInfo h(int i2);

    DownloadInfo i(int i2);

    DownloadInfo j(int i2);

    Map<Long, i> k(int i2);

    void l(int i2);

    List<i> m(int i2);
}
