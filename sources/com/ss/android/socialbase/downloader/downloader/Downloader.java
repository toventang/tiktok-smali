package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

public class Downloader extends b {
    private static volatile Downloader instance = null;

    private Downloader() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void destoryDownloader() {
        super.destoryDownloader();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void pauseAll() {
        super.pauseAll();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDownloadInMultiProcess() {
        super.setDownloadInMultiProcess();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getAllDownloadInfo() {
        return super.getAllDownloadInfo();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ File getGlobalSaveDir() {
        return super.getGlobalSaveDir();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ File getGlobalSaveTempDir() {
        return super.getGlobalSaveTempDir();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ t getReserveWifiStatusListener() {
        return super.getReserveWifiStatusListener();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadCacheSyncSuccess() {
        return super.isDownloadCacheSyncSuccess();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isHttpServiceInit() {
        return super.isHttpServiceInit();
    }

    static {
        Covode.recordClassIndex(37333);
        c.a(new x());
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void cancel(int i2) {
        super.cancel(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i2) {
        super.clearDownloadData(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void forceDownloadIngoreRecommendSize(int i2) {
        super.forceDownloadIngoreRecommendSize(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void pause(int i2) {
        super.pause(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void registerDownloadCacheSyncListener(i iVar) {
        super.registerDownloadCacheSyncListener(iVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void registerDownloaderProcessConnectedListener(aa aaVar) {
        super.registerDownloaderProcessConnectedListener(aaVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeTaskMainListener(int i2) {
        super.removeTaskMainListener(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeTaskNotificationListener(int i2) {
        super.removeTaskNotificationListener(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeTaskSubListener(int i2) {
        super.removeTaskSubListener(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restart(int i2) {
        super.restart(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restartAllFailedDownloadTasks(List list) {
        super.restartAllFailedDownloadTasks(list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restartAllPauseReserveOnWifiDownloadTasks(List list) {
        super.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void resume(int i2) {
        super.resume(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDefaultSavePath(String str) {
        super.setDefaultSavePath(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDefaultSaveTempPath(String str) {
        super.setDefaultSaveTempPath(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setLogLevel(int i2) {
        super.setLogLevel(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setReserveWifiStatusListener(t tVar) {
        super.setReserveWifiStatusListener(tVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void unRegisterDownloadCacheSyncListener(i iVar) {
        super.unRegisterDownloadCacheSyncListener(iVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void unRegisterDownloaderProcessConnectedListener(aa aaVar) {
        super.unRegisterDownloaderProcessConnectedListener(aaVar);
    }

    Downloader(h hVar) {
        c.a(hVar);
    }

    public static void init(h hVar) {
        initOrCover(hVar, false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean canResume(int i2) {
        return super.canResume(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ long getCurBytes(int i2) {
        return super.getCurBytes(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ q getDownloadFileUriProvider(int i2) {
        return super.getDownloadFileUriProvider(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(int i2) {
        return super.getDownloadInfo(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getDownloadInfoList(String str) {
        return super.getDownloadInfoList(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ y getDownloadNotificationEventListener(int i2) {
        return super.getDownloadNotificationEventListener(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getDownloadingDownloadInfosWithMimeType(String str) {
        return super.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getFailedDownloadInfosWithMimeType(String str) {
        return super.getFailedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ int getStatus(int i2) {
        return super.getStatus(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getSuccessedDownloadInfosWithMimeType(String str) {
        return super.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getUnCompletedDownloadInfosWithMimeType(String str) {
        return super.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadServiceForeground(int i2) {
        return super.isDownloadServiceForeground(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return super.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloading(int i2) {
        return super.isDownloading(i2);
    }

    public static Downloader getInstance(Context context) {
        MethodCollector.i(13361);
        if (instance == null) {
            synchronized (Downloader.class) {
                try {
                    if (instance == null) {
                        c.a(context);
                        instance = new Downloader();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13361);
                    throw th;
                }
            }
        }
        Downloader downloader = instance;
        MethodCollector.o(13361);
        return downloader;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.addMainThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addNotificationListener(int i2, IDownloadListener iDownloadListener) {
        super.addNotificationListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.addSubThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.removeMainThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeNotificationListener(int i2, IDownloadListener iDownloadListener) {
        super.removeNotificationListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.removeSubThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDownloadNotificationEventListener(int i2, y yVar) {
        super.setDownloadNotificationEventListener(i2, yVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.setMainThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setNotificationListener(int i2, IDownloadListener iDownloadListener) {
        super.setNotificationListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setSubThreadListener(int i2, IDownloadListener iDownloadListener) {
        super.setSubThreadListener(i2, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i2, long j2) {
        super.setThrottleNetSpeed(i2, j2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void cancel(int i2, boolean z) {
        super.cancel(i2, z);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i2, boolean z) {
        super.clearDownloadData(i2, z);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ int getDownloadId(String str, String str2) {
        return super.getDownloadId(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(String str, String str2) {
        return super.getDownloadInfo(str, str2);
    }

    public static synchronized void initOrCover(h hVar, boolean z) {
        synchronized (Downloader.class) {
            MethodCollector.i(13276);
            if (hVar == null) {
                MethodCollector.o(13276);
            } else if (instance == null) {
                instance = new Downloader(hVar);
                MethodCollector.o(13276);
            } else if (!c.f60436k) {
                c.a(hVar);
                MethodCollector.o(13276);
            } else {
                if (z) {
                    c.b(hVar);
                }
                MethodCollector.o(13276);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i2, IDownloadListener iDownloadListener, boolean z) {
        super.setMainThreadListener(i2, iDownloadListener, z);
    }
}
