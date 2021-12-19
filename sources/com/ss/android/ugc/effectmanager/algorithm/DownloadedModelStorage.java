package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DownloadedModelStorage implements IModelCache {
    private static DownloadedModelStorage sInstance;
    private AssetManagerWrapper mAssetManagerWrapper;
    private DiskLruCache mDiskLruCache;
    private final String mEffectSDKVersion;
    private final String mPath;

    static {
        Covode.recordClassIndex(95210);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public String getCacheDir() {
        return this.mPath;
    }

    public DiskLruCache getDiskLruCache() {
        return this.mDiskLruCache;
    }

    /* access modifiers changed from: package-private */
    public String getPath() {
        return this.mPath;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 95211(0x173eb, float:1.33419E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.effectmanager.FetchModelType[] r0 = com.ss.android.ugc.effectmanager.FetchModelType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType = r2
                com.ss.android.ugc.effectmanager.FetchModelType r0 = com.ss.android.ugc.effectmanager.FetchModelType.ZIP     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.effectmanager.FetchModelType r0 = com.ss.android.ugc.effectmanager.FetchModelType.ORIGIN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.AnonymousClass1.<clinit>():void");
        }
    }

    public synchronized void checkDiskLruCache() {
        MethodCollector.i(751);
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache != null) {
            if (diskLruCache.isValid()) {
                MethodCollector.o(751);
                return;
            }
        }
        try {
            AlgorithmModelInfoMemoryCache.clear();
            this.mDiskLruCache = DiskLruCache.open(new File(this.mPath), convertStringToInt(this.mEffectSDKVersion), 1, Long.MAX_VALUE);
            MethodCollector.o(751);
        } catch (IOException e2) {
            RuntimeException runtimeException = new RuntimeException(e2);
            MethodCollector.o(751);
            throw runtimeException;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public Map<String, LocalModelInfo> getLocalModelInfoList() {
        String str;
        MethodCollector.i(759);
        checkDiskLruCache();
        HashMap hashMap = new HashMap();
        try {
            String[] list = this.mAssetManagerWrapper.getWrapped().list("model");
            if (list != null) {
                for (String str2 : list) {
                    String[] list2 = this.mAssetManagerWrapper.getWrapped().list("model/".concat(String.valueOf(str2)));
                    if (list2 != null) {
                        for (String str3 : list2) {
                            try {
                                str = ModelNameProcessor.getNameOfModel(str3);
                            } catch (Exception unused) {
                                str = "";
                            }
                            if (!str.equals("")) {
                                String versionOfModel = ModelNameProcessor.getVersionOfModel(str3);
                                LocalModelInfo localModelInfo = new LocalModelInfo();
                                localModelInfo.setName(str);
                                localModelInfo.setVersion(versionOfModel);
                                localModelInfo.setBuilt(true);
                                hashMap.put(str, localModelInfo);
                            }
                        }
                    }
                }
            }
        } catch (IOException e2) {
            EPLog.e("DownloadedModelStorage", "getLocalModelInfoList built in error", e2);
        }
        try {
            for (String str4 : this.mDiskLruCache.getLruEntryKeys()) {
                String nameOfModel = ModelNameProcessor.getNameOfModel(str4);
                DiskLruCache.Snapshot snapshot = this.mDiskLruCache.get(str4);
                if (snapshot != null) {
                    LocalModelInfo fromFile = LocalModelInfo.fromFile(snapshot.getCleanFile(0).getAbsolutePath());
                    fromFile.setBuilt(false);
                    hashMap.put(nameOfModel, fromFile);
                }
            }
            MethodCollector.o(759);
            return hashMap;
        } catch (IOException e3) {
            EPLog.e("DownloadedModelStorage", "error while getLocalModelInfoList", e3);
            HashMap hashMap2 = new HashMap();
            MethodCollector.o(759);
            return hashMap2;
        }
    }

    private int convertStringToInt(String str) {
        return str.hashCode();
    }

    /* access modifiers changed from: package-private */
    public static class TotalLengthOutputStream extends FilterOutputStream {
        long length;

        static {
            Covode.recordClassIndex(95212);
        }

        public TotalLengthOutputStream(OutputStream outputStream) {
            super(outputStream);
            MethodCollector.i(1038);
            MethodCollector.o(1038);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(int i2) {
            MethodCollector.i(1050);
            this.out.write(i2);
            this.length++;
            MethodCollector.o(1050);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr, int i2, int i3) {
            MethodCollector.i(1053);
            this.out.write(bArr, i2, i3);
            this.length += (long) i3;
            MethodCollector.o(1053);
        }
    }

    /* access modifiers changed from: package-private */
    public void clearModelFromDisk(String str) {
        checkDiskLruCache();
        try {
            this.mDiskLruCache.remove(str);
        } catch (IOException unused) {
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public boolean isBuiltInResource(String str) {
        AssetManagerWrapper assetManagerWrapper = this.mAssetManagerWrapper;
        if (assetManagerWrapper != null) {
            return assetManagerWrapper.exists("model/".concat(String.valueOf(str)));
        }
        EPLog.e("DownloadedModelStorage", "mAssetManagerWrapper is null!");
        return false;
    }

    public static boolean com_ss_android_ugc_effectmanager_algorithm_DownloadedModelStorage_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(784);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(784);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(784);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> listLocalModelKeysByName(String str) {
        checkDiskLruCache();
        ArrayList<String> arrayList = new ArrayList<>();
        String diskLruCacheKey = EffectUtils.toDiskLruCacheKey(str);
        try {
            for (String str2 : this.mDiskLruCache.getLruEntryKeys()) {
                if (ModelNameProcessor.getNameOfModel(str2).equals(diskLruCacheKey)) {
                    DiskLruCache.Snapshot snapshot = null;
                    try {
                        snapshot = this.mDiskLruCache.get(str2);
                        if (snapshot != null) {
                            arrayList.add(str2);
                            snapshot.close();
                        }
                    } catch (IOException unused) {
                        if (0 == 0) {
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            snapshot.close();
                        }
                        throw th;
                    }
                }
            }
        } catch (IOException unused2) {
        }
        return arrayList;
    }

    private static long copy(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(801);
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
            } else {
                MethodCollector.o(801);
                return j2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be A[DONT_GENERATE] */
    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.effectmanager.model.LocalModelInfo getLocalModelInfoByName(java.lang.String r6, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r7) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.getLocalModelInfoByName(java.lang.String, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):com.ss.android.ugc.effectmanager.model.LocalModelInfo");
    }

    private DownloadedModelStorage(String str, String str2, AssetManagerWrapper assetManagerWrapper) {
        this.mPath = str;
        this.mEffectSDKVersion = str2;
        this.mAssetManagerWrapper = assetManagerWrapper;
        checkDiskLruCache();
    }

    public static synchronized DownloadedModelStorage getInstance(String str, String str2, AssetManagerWrapper assetManagerWrapper) {
        DownloadedModelStorage downloadedModelStorage;
        synchronized (DownloadedModelStorage.class) {
            MethodCollector.i(749);
            if (sInstance == null) {
                sInstance = new DownloadedModelStorage(str, str2, assetManagerWrapper);
            }
            downloadedModelStorage = sInstance;
            MethodCollector.o(749);
        }
        return downloadedModelStorage;
    }

    private long writeModelToDisk(String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace monitorTrace) {
        MethodCollector.i(789);
        checkDiskLruCache();
        String diskLruCacheKey = EffectUtils.toDiskLruCacheKey(str);
        EPMonitor.traceStep(monitorTrace, "checkDiskLruCache success, model file type is ORIGIN, fileName = ".concat(String.valueOf(diskLruCacheKey)));
        DiskLruCache.Editor editor = null;
        try {
            DiskLruCache.Editor edit = this.mDiskLruCache.edit(diskLruCacheKey);
            TotalLengthOutputStream totalLengthOutputStream = new TotalLengthOutputStream(new DigestOutputStream(edit.newOutputStream(0), messageDigest));
            copy(inputStream, totalLengthOutputStream);
            totalLengthOutputStream.close();
            String byteArrayToHex = MD5Utils.byteArrayToHex(messageDigest.digest());
            if (byteArrayToHex.equals(str2)) {
                EPMonitor.traceStep(monitorTrace, "model file md5 check success");
                edit.commit();
                long j2 = totalLengthOutputStream.length;
                edit.abortUnlessCommitted();
                MethodCollector.o(789);
                return j2;
            }
            EPMonitor.traceStep(monitorTrace, "model file md5 check failure, expected md5 : " + str2 + ", actual md5 : " + byteArrayToHex);
            edit.abort();
            edit.abortUnlessCommitted();
            MethodCollector.o(789);
            return -1;
        } catch (IOException e2) {
            EPMonitor.traceStep(monitorTrace, "writeModelToDisk, exception occurred, cause = " + e2.getMessage());
            RuntimeException runtimeException = new RuntimeException(e2);
            MethodCollector.o(789);
            throw runtimeException;
        } catch (Throwable th) {
            if (0 != 0) {
                editor.abortUnlessCommitted();
            }
            MethodCollector.o(789);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x011b A[SYNTHETIC, Splitter:B:43:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long writeZipModelToDisk(java.lang.String r8, java.io.InputStream r9, java.security.MessageDigest r10, java.lang.String r11, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r12) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.writeZipModelToDisk(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):long");
    }

    /* access modifiers changed from: package-private */
    public long writeModelToDisk(FetchModelType fetchModelType, String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace monitorTrace) {
        checkDiskLruCache();
        if (AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType[fetchModelType.ordinal()] != 1) {
            return writeModelToDisk(str, inputStream, messageDigest, str2, monitorTrace);
        }
        return writeZipModelToDisk(str, inputStream, messageDigest, str2, monitorTrace);
    }
}
