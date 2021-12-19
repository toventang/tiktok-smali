package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.k.a;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class b {
    private String globalDefaultSavePath;
    private String globalDefaultSaveTempPath;

    static {
        Covode.recordClassIndex(37338);
    }

    b() {
    }

    public void destoryDownloader() {
        c.a();
    }

    public t getReserveWifiStatusListener() {
        return c.f60435j;
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath, true);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath, false);
    }

    public boolean isHttpServiceInit() {
        d.a();
        return c.C();
    }

    public boolean isDownloadCacheSyncSuccess() {
        d.a();
        o a2 = l.a(false);
        if (a2 != null) {
            return a2.f();
        }
        return false;
    }

    public void pauseAll() {
        d.a();
        o a2 = l.a(false);
        if (a2 != null) {
            a2.a();
        }
        o a3 = l.a(true);
        if (a3 != null) {
            a3.a();
        }
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        List<DownloadInfo> list;
        d.a();
        SparseArray sparseArray = new SparseArray();
        o a2 = l.a(false);
        List<DownloadInfo> list2 = null;
        if (a2 != null) {
            list = a2.d();
        } else {
            list = null;
        }
        o a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.d();
        }
        return d.a(list, list2, sparseArray);
    }

    public void setDownloadInMultiProcess() {
        MethodCollector.i(11211);
        if (a.a(4194304)) {
            synchronized (this) {
                try {
                    c.b();
                } finally {
                    MethodCollector.o(11211);
                }
            }
            return;
        }
        c.b();
        MethodCollector.o(11211);
    }

    public void setReserveWifiStatusListener(t tVar) {
        c.f60435j = tVar;
    }

    public void cancel(int i2) {
        cancel(i2, true);
    }

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    public void clearDownloadData(int i2) {
        d.a().c(i2, true);
    }

    public void forceDownloadIngoreRecommendSize(int i2) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.j(i2);
        }
    }

    public boolean isDownloadServiceForeground(int i2) {
        return d.a().c(i2).b();
    }

    public void pause(int i2) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.a(i2);
        }
    }

    public void removeTaskMainListener(int i2) {
        d.a().a(i2, null, h.MAIN, true);
    }

    public void removeTaskNotificationListener(int i2) {
        d.a().a(i2, null, h.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i2) {
        d.a().a(i2, null, h.SUB, true);
    }

    public void restart(int i2) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.d(i2);
        }
    }

    public void resume(int i2) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.c(i2);
        }
    }

    public void setDefaultSavePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSavePath = str;
        }
    }

    public void setDefaultSaveTempPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSaveTempPath = str;
        }
    }

    public boolean canResume(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return false;
        }
        return c2.b(i2);
    }

    public long getCurBytes(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return 0;
        }
        return c2.e(i2);
    }

    public q getDownloadFileUriProvider(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return null;
        }
        return c2.s(i2);
    }

    public DownloadInfo getDownloadInfo(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return null;
        }
        return c2.h(i2);
    }

    public y getDownloadNotificationEventListener(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return null;
        }
        return c2.q(i2);
    }

    public int getStatus(int i2) {
        o c2 = d.a().c(i2);
        if (c2 == null) {
            return 0;
        }
        return c2.f(i2);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        o c2;
        d a2 = d.a();
        if (downloadInfo == null || (c2 = a2.c(downloadInfo.getId())) == null) {
            return false;
        }
        return c2.a(downloadInfo);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        d.a();
        o a2 = l.a(false);
        if (a2 != null) {
            a2.a(list);
        }
        o a3 = l.a(true);
        if (a3 != null) {
            a3.a(list);
        }
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        d.a();
        o a2 = l.a(false);
        if (a2 != null) {
            a2.b(list);
        }
        o a3 = l.a(true);
        if (a3 != null) {
            a3.b(list);
        }
    }

    public void setLogLevel(int i2) {
        d.a();
        o a2 = l.a(false);
        if (a2 != null) {
            a2.k(i2);
        }
        o a3 = l.a(true);
        if (a3 != null) {
            a3.k(i2);
        }
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        d.a();
        List<DownloadInfo> a2 = l.a(false).a(str);
        List<DownloadInfo> a3 = l.a(true).a(str);
        if (a2 == null) {
            if (a3 == null) {
                return null;
            }
            return a3;
        } else if (a3 == null) {
            return a2;
        } else {
            ArrayList arrayList = new ArrayList(a2);
            arrayList.addAll(a3);
            return arrayList;
        }
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        d.a();
        SparseArray sparseArray = new SparseArray();
        o a2 = l.a(false);
        List<DownloadInfo> list2 = null;
        if (a2 != null) {
            list = a2.e(str);
        } else {
            list = null;
        }
        o a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.e(str);
        }
        return d.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        d.a();
        SparseArray sparseArray = new SparseArray();
        o a2 = l.a(false);
        List<DownloadInfo> list2 = null;
        if (a2 != null) {
            list = a2.b(str);
        } else {
            list = null;
        }
        o a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.b(str);
        }
        return d.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        d.a();
        SparseArray sparseArray = new SparseArray();
        o a2 = l.a(false);
        List<DownloadInfo> list2 = null;
        if (a2 != null) {
            list = a2.c(str);
        } else {
            list = null;
        }
        o a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.c(str);
        }
        return d.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        d.a();
        SparseArray sparseArray = new SparseArray();
        o a2 = l.a(false);
        List<DownloadInfo> list2 = null;
        if (a2 != null) {
            list = a2.d(str);
        } else {
            list = null;
        }
        o a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.d(str);
        }
        return d.a(list, list2, sparseArray);
    }

    public boolean isDownloading(int i2) {
        boolean d2;
        MethodCollector.i(14263);
        if (a.a(4194304)) {
            synchronized (this) {
                try {
                    d2 = d.a().d(i2);
                } finally {
                    MethodCollector.o(14263);
                }
            }
            return d2;
        }
        boolean d3 = d.a().d(i2);
        MethodCollector.o(14263);
        return d3;
    }

    public void registerDownloadCacheSyncListener(i iVar) {
        MethodCollector.i(10882);
        d.a();
        synchronized (c.f60431f) {
            if (iVar != null) {
                try {
                    if (!c.f60431f.contains(iVar)) {
                        c.f60431f.add(iVar);
                        return;
                    }
                } finally {
                    MethodCollector.o(10882);
                }
            }
            MethodCollector.o(10882);
        }
    }

    public void registerDownloaderProcessConnectedListener(aa aaVar) {
        MethodCollector.i(11368);
        d a2 = d.a();
        if (aaVar == null || g.c()) {
            MethodCollector.o(11368);
            return;
        }
        l.a(true).h();
        synchronized (a2.f60441b) {
            try {
                if (!a2.f60441b.contains(aaVar)) {
                    a2.f60441b.add(aaVar);
                }
            } finally {
                MethodCollector.o(11368);
            }
        }
    }

    public void unRegisterDownloadCacheSyncListener(i iVar) {
        MethodCollector.i(11050);
        d.a();
        synchronized (c.f60431f) {
            if (iVar != null) {
                try {
                    if (c.f60431f.contains(iVar)) {
                        c.f60431f.remove(iVar);
                        return;
                    }
                } finally {
                    MethodCollector.o(11050);
                }
            }
            MethodCollector.o(11050);
        }
    }

    public void unRegisterDownloaderProcessConnectedListener(aa aaVar) {
        MethodCollector.i(11696);
        d a2 = d.a();
        if (aaVar != null) {
            synchronized (a2.f60441b) {
                try {
                    if (a2.f60441b.contains(aaVar)) {
                        a2.f60441b.remove(aaVar);
                    }
                } finally {
                    MethodCollector.o(11696);
                }
            }
            return;
        }
        MethodCollector.o(11696);
    }

    public static boolean com_ss_android_socialbase_downloader_downloader_BaseDownloader_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(11702);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11702);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11702);
        return delete;
    }

    public void clearDownloadData(int i2, boolean z) {
        d.a().c(i2, z);
    }

    public int getDownloadId(String str, String str2) {
        d.a();
        return c.a(str, str2);
    }

    public void addMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.MAIN, false);
        }
    }

    public void addNotificationListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.NOTIFICATION, false);
        }
    }

    public void addSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.SUB, false);
        }
    }

    public void removeMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().a(i2, iDownloadListener, h.MAIN, false);
        }
    }

    public void removeNotificationListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().a(i2, iDownloadListener, h.NOTIFICATION, false);
        }
    }

    public void removeSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().a(i2, iDownloadListener, h.SUB, false);
        }
    }

    public void setDownloadNotificationEventListener(int i2, y yVar) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.a(i2, yVar);
        }
    }

    public void setMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.MAIN, true);
        }
    }

    public void setNotificationListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.NOTIFICATION, true);
        }
    }

    public void setSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            d.a().b(i2, iDownloadListener, h.SUB, true);
        }
    }

    public void setThrottleNetSpeed(int i2, long j2) {
        o c2 = d.a().c(i2);
        if (c2 != null) {
            c2.a(i2, j2);
        }
    }

    private File getGlobalSaveDir(String str, boolean z) {
        File file = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file2 = new File(str);
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                    return file2;
                } else if (file2.isDirectory()) {
                    return file2;
                } else {
                    if (!z) {
                        return null;
                    }
                    com_ss_android_socialbase_downloader_downloader_BaseDownloader_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                    file2.mkdirs();
                    return file2;
                }
            } catch (Throwable unused) {
                file = file2;
                return file;
            }
        } catch (Throwable unused2) {
            return file;
        }
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        d a2 = d.a();
        int a3 = c.a(str, str2);
        o c2 = a2.c(a3);
        if (c2 == null) {
            return null;
        }
        return c2.h(a3);
    }

    public void cancel(int i2, boolean z) {
        d a2 = d.a();
        if (!g.a()) {
            o c2 = a2.c(i2);
            if (c2 != null) {
                c2.a(i2, z);
            }
            l.a(true).a(2, i2);
        } else if (a.a(8388608)) {
            o a3 = l.a(true);
            if (a3 != null) {
                a3.a(i2, z);
            }
            o a4 = l.a(false);
            if (a4 != null) {
                a4.a(i2, z);
            }
        } else {
            o a5 = l.a(false);
            if (a5 != null) {
                a5.a(i2, z);
            }
            o a6 = l.a(true);
            if (a6 != null) {
                a6.a(i2, z);
            }
        }
    }

    public void setMainThreadListener(int i2, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener != null) {
            d a2 = d.a();
            h hVar = h.MAIN;
            o c2 = a2.c(i2);
            if (c2 != null) {
                c2.a(i2, iDownloadListener.hashCode(), iDownloadListener, hVar, true, z);
            }
        }
    }
}
