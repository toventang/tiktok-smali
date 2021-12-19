package com.ss.android.ugc.effectmanager.common.cache;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
public class OldEffectDiskLruCache extends FileICache implements IAllowListRule {
    private static OldEffectDiskLruCache INSTANCE;
    private static List<String> mBRAllowList = Arrays.asList("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");
    private static String mCountry;
    private static ArrayList<String> mDraftDIRAllowList;
    private static List<String> mRUAllowList = Arrays.asList("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");
    private final int MAX_CACHE_SIZE = 838860800;
    private EffectConfiguration mConfiguration;
    private DiskLruCache mDiskLruCache;
    private File mEffectDir;
    private EffectIdMapFile mEffectIdFile;
    private IMonitorService mMonitorService;

    static {
        Covode.recordClassIndex(95270);
    }

    private synchronized void checkInit() {
        File file;
        MethodCollector.i(873);
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if ((diskLruCache == null || !diskLruCache.isValid()) && (file = this.mEffectDir) != null) {
            try {
                this.mDiskLruCache = DiskLruCache.open(file, 0, 1, 838860800, this);
            } catch (IOException e2) {
                RuntimeException runtimeException = new RuntimeException(e2);
                MethodCollector.o(873);
                throw runtimeException;
            }
        }
        if (this.mEffectIdFile == null && this.mEffectDir != null) {
            this.mEffectIdFile = new EffectIdMapFile(this.mEffectDir);
        }
        MethodCollector.o(873);
    }

    public synchronized void resetLruCache() {
        MethodCollector.i(887);
        if (this.mEffectDir == null) {
            MethodCollector.o(887);
            return;
        }
        if (!FileUtils.INSTANCE.checkFileExists(new File(this.mEffectDir, "journal").getPath())) {
            try {
                this.mDiskLruCache = DiskLruCache.open(this.mEffectDir, 0, 1, 838860800, this);
                MethodCollector.o(887);
            } catch (IOException e2) {
                RuntimeException runtimeException = new RuntimeException(e2);
                MethodCollector.o(887);
                throw runtimeException;
            }
        } else {
            MethodCollector.o(887);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    public String queryToValue(String str) {
        checkInit();
        return super.queryToValue(str);
    }

    public void readKeyInMemory(String str) {
        if (this.mDiskLruCache != null) {
            try {
                this.mDiskLruCache.readKeyInMemory(DiskLruCache.toDiskLruCacheKey(str));
            } catch (Exception unused) {
            }
        }
    }

    private OldEffectDiskLruCache(File file) {
        super(file.getAbsolutePath());
        this.mEffectDir = file;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            checkInit();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    public boolean has(String str) {
        checkInit();
        if (!this.mDiskLruCache.has(str)) {
            return false;
        }
        if (super.has(str)) {
            return true;
        }
        try {
            this.mDiskLruCache.remove(str);
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    public boolean remove(String str) {
        checkInit();
        try {
            this.mDiskLruCache.remove(DiskLruCache.toDiskLruCacheKey(new File(str).getName()));
        } catch (Exception unused) {
        }
        return super.remove(str);
    }

    public void removeEffect(Effect effect) {
        checkInit();
        remove(effect.getUnzipPath());
        remove(effect.getZipPath());
    }

    private OldEffectDiskLruCache(EffectConfiguration effectConfiguration) {
        super(effectConfiguration.getEffectDir().getAbsolutePath());
        this.mConfiguration = effectConfiguration;
        this.mEffectDir = effectConfiguration.getEffectDir();
        this.mMonitorService = effectConfiguration.getMonitorService();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            checkInit();
        }
    }

    public static OldEffectDiskLruCache getInstance(EffectConfiguration effectConfiguration) {
        MethodCollector.i(869);
        if (INSTANCE == null) {
            synchronized (OldEffectDiskLruCache.class) {
                try {
                    if (INSTANCE == null) {
                        mCountry = effectConfiguration.getRegion();
                        mDraftDIRAllowList = effectConfiguration.getDraftList();
                        INSTANCE = new OldEffectDiskLruCache(effectConfiguration);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(869);
                    throw th;
                }
            }
        }
        OldEffectDiskLruCache oldEffectDiskLruCache = INSTANCE;
        MethodCollector.o(869);
        return oldEffectDiskLruCache;
    }

    private boolean isCountry(String str) {
        EPLog.d("OldEffectDiskLruCache", "isCountry:" + str + " now:" + mCountry);
        if (TextUtils.isEmpty(str) || !str.equals(mCountry)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule
    public boolean isAllowed(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        EPLog.i("OldEffectDiskLruCache", "allowlist：".concat(String.valueOf(str)));
        if (isCountry("BR") && mBRAllowList.contains(this.mEffectIdFile.getEffectId(str))) {
            EPLog.i("cleaneffect", "allowlist：BR");
            return true;
        } else if (!isCountry("RU") || !mRUAllowList.contains(this.mEffectIdFile.getEffectId(str))) {
            ArrayList<String> arrayList = mDraftDIRAllowList;
            if (arrayList == null || !arrayList.contains(str)) {
                return false;
            }
            EPLog.d("OldEffectDiskLruCache", "allowlist：draft");
            return true;
        } else {
            EPLog.i("OldEffectDiskLruCache", "allowlist：RU");
            return true;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    public long save(String str, InputStream inputStream) {
        checkInit();
        return super.save(str, inputStream);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    public long save(String str, String str2) {
        checkInit();
        return super.save(str, str2);
    }

    public void unzipEffectToDisk(Effect effect, MonitorTrace monitorTrace) {
        checkInit();
        EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk::unzip begin, from " + effect.getZipPath() + " to " + effect.getUnzipPath());
        String unzipPath = effect.getUnzipPath();
        String addPathSuffix = FileUtils.INSTANCE.addPathSuffix(effect.getUnzipPath(), "_tmp");
        try {
            FileUtils.INSTANCE.removeDir(addPathSuffix);
            FileUtils.INSTANCE.unZip(effect.getZipPath(), addPathSuffix);
            EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk::unzip to temp dir " + addPathSuffix + " success");
            if (!new File(addPathSuffix, "effect_platform_tag.tag").createNewFile()) {
                EPLog.e("OldEffectDiskLruCache", "create effect platform tag file failed!");
            }
            FileUtils.INSTANCE.rename(addPathSuffix, unzipPath, true, true);
            EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk:: rename from " + addPathSuffix + " to " + unzipPath);
            this.mDiskLruCache.addEntryToCache(new File(effect.getUnzipPath()).getName());
            this.mEffectIdFile.writeEffectId(effect.getId(), effect.getEffectId());
            String[] split = effect.getZipPath().split(File.separator);
            this.mDiskLruCache.remove(split[split.length - 1]);
            EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk::unzip success!!");
            IMonitorService iMonitorService = this.mMonitorService;
            if (iMonitorService != null) {
                iMonitorService.monitorStatusRate("effect_resource_unzip_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("effect_id", effect.getEffectId()).addValuePair("effect_name", effect.getName()).addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("effect_platform_type", (Integer) 0).build());
            }
        } catch (Exception e2) {
            FileUtils.INSTANCE.removeDir(addPathSuffix);
            FileUtils.INSTANCE.removeDir(effect.getUnzipPath());
            EPLog.e("OldEffectDiskLruCache", "unzip effect " + effect.getZipPath() + " to " + effect.getUnzipPath() + " failed.", e2);
            EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk::unzip failed, cause = " + e2.getMessage());
            IMonitorService iMonitorService2 = this.mMonitorService;
            if (iMonitorService2 != null) {
                iMonitorService2.monitorStatusRate("effect_resource_unzip_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("effect_id", effect.getEffectId()).addValuePair("effect_name", effect.getName()).addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("error_msg", Log.getStackTraceString(e2)).addValuePair("effect_platform_type", (Integer) 0).build());
            }
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013a A[Catch:{ all -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeEffectZipToDisk(com.ss.android.ugc.effectmanager.effect.model.Effect r17, java.io.InputStream r18, long r19, com.ss.android.ugc.effectmanager.common.download.DownloadListener r21) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache.writeEffectZipToDisk(com.ss.android.ugc.effectmanager.effect.model.Effect, java.io.InputStream, long, com.ss.android.ugc.effectmanager.common.download.DownloadListener):void");
    }
}
