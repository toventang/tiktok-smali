package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

public interface o {
    static {
        Covode.recordClassIndex(37363);
    }

    int a(String str, String str2);

    List<DownloadInfo> a(String str);

    void a();

    void a(int i2);

    void a(int i2, int i3);

    void a(int i2, int i3, int i4, int i5);

    void a(int i2, int i3, int i4, long j2);

    void a(int i2, int i3, long j2);

    void a(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z);

    void a(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z, boolean z2);

    void a(int i2, long j2);

    void a(int i2, Notification notification);

    void a(int i2, y yVar);

    void a(int i2, List<DownloadChunk> list);

    void a(int i2, boolean z);

    void a(int i2, boolean z, boolean z2);

    void a(ag agVar);

    void a(DownloadChunk downloadChunk);

    void a(DownloadTask downloadTask);

    void a(List<String> list);

    void a(boolean z);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(String str, String str2);

    List<DownloadInfo> b(String str);

    void b(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z);

    void b(int i2, List<DownloadChunk> list);

    void b(int i2, boolean z);

    void b(DownloadInfo downloadInfo);

    void b(DownloadTask downloadTask);

    void b(List<String> list);

    boolean b();

    boolean b(int i2);

    List<DownloadInfo> c(String str);

    void c(int i2);

    boolean c();

    boolean c(DownloadInfo downloadInfo);

    List<DownloadInfo> d();

    List<DownloadInfo> d(String str);

    void d(int i2);

    long e(int i2);

    List<DownloadInfo> e(String str);

    void e();

    int f(int i2);

    boolean f();

    void g();

    boolean g(int i2);

    DownloadInfo h(int i2);

    boolean h();

    List<DownloadChunk> i(int i2);

    void j(int i2);

    void k(int i2);

    boolean l(int i2);

    int m(int i2);

    boolean n(int i2);

    void o(int i2);

    boolean p(int i2);

    y q(int i2);

    ac r(int i2);

    q s(int i2);
}
