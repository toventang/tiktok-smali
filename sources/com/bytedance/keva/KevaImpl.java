package com.bytedance.keva;

import android.content.Context;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class KevaImpl extends Keva {
    static final Executor sExecutor;
    static final KevaMonitor sMonitor;
    public static final String sPortedSpRepoName;
    private static final HashMap<String, Keva> sRepoMap = new HashMap<>();
    private static final File sSharedPrefsDir;
    private final List<Keva.OnChangeListener> mChangeListeners = new ArrayList();
    private List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();
    volatile long mHandle;
    private final boolean mIsMultiProcess;
    private final int mMode;
    public final String mName;
    final HashMap<String, KevaValueWrapper> mValueMap = new HashMap<>();

    protected interface PrivateConstants {
        static {
            Covode.recordClassIndex(24511);
        }
    }

    static native void checkReportException(long j2);

    private static native void clear(long j2);

    private static native boolean delete(String str);

    private native void dump(long j2);

    private native void erase(long j2, String str, long j3);

    private native void eraseUnusedChunk(long j2, long j3);

    static void forceInitImpl() {
    }

    private static native void initialize(String str);

    private native long loadRepo(String str, int i2, boolean z);

    private native int protectPortingInterProcess(String str, boolean z, int i2);

    private native long storeBoolean(long j2, String str, long j3, boolean z);

    private native long storeBytes(long j2, String str, long j3, byte[] bArr, int i2);

    private native long storeDouble(long j2, String str, long j3, double d2);

    private native long storeFloat(long j2, String str, long j3, float f2);

    private native long storeInt(long j2, String str, long j3, int i2);

    private native long storeLong(long j2, String str, long j3, long j4);

    private native long storeString(long j2, String str, long j3, String str2);

    private native long storeStringArray(long j2, String str, long j3, String[] strArr, int i2);

    /* access modifiers changed from: package-private */
    public native boolean contains(long j2, String str, long j3);

    /* access modifiers changed from: package-private */
    public native boolean fetchBoolean(long j2, String str, long j3, boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean fetchBoolean(String str, boolean z);

    /* access modifiers changed from: package-private */
    public native byte[] fetchBytes(long j2, String str, long j3, byte[] bArr, int i2);

    /* access modifiers changed from: protected */
    public abstract byte[] fetchBytes(String str, byte[] bArr, int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native double fetchDouble(long j2, String str, long j3, double d2);

    /* access modifiers changed from: protected */
    public abstract double fetchDouble(String str, double d2);

    /* access modifiers changed from: package-private */
    public native float fetchFloat(long j2, String str, long j3, float f2);

    /* access modifiers changed from: protected */
    public abstract float fetchFloat(String str, float f2);

    /* access modifiers changed from: package-private */
    public native int fetchInt(long j2, String str, long j3, int i2);

    /* access modifiers changed from: protected */
    public abstract int fetchInt(String str, int i2);

    /* access modifiers changed from: package-private */
    public native long fetchLong(long j2, String str, long j3, long j4);

    /* access modifiers changed from: protected */
    public abstract long fetchLong(String str, long j2);

    /* access modifiers changed from: package-private */
    public native String fetchString(long j2, String str, long j3, String str2);

    /* access modifiers changed from: protected */
    public abstract String fetchString(String str, String str2, boolean z);

    /* access modifiers changed from: package-private */
    public native String[] fetchStringArray(long j2, String str, long j3, String[] strArr, int i2);

    /* access modifiers changed from: protected */
    public abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    /* access modifiers changed from: package-private */
    public native void rebuildValueMap(long j2);

    /* access modifiers changed from: package-private */
    public static class KevaValueWrapper {
        volatile boolean loaded;
        volatile long offset;
        volatile int type;
        volatile Object value;

        static {
            Covode.recordClassIndex(24509);
        }

        KevaValueWrapper() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class PortedSpRepoHolder {
        public static final KevaImpl sInstance;
        public static final Map<String, ?> sPortedSpMap;

        private PortedSpRepoHolder() {
        }

        static {
            Covode.recordClassIndex(24510);
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
            sPortedSpMap = kevaMultiProcessImpl.buildNewMap(new HashMap());
        }
    }

    private static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    public void dumpNative() {
        synchronized (this) {
            dump(this.mHandle);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        synchronized (this) {
            try {
                this.mValueMap.clear();
                clear(this.mHandle);
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, null, null, th);
            }
        }
    }

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            sMonitor.reportWarning(1, this.mName, null, null, "free space is " + Environment.getDataDirectory().getFreeSpace());
            return;
        }
        try {
            for (KevaValueWrapper kevaValueWrapper : this.mDuplicatedOldWrappers) {
                eraseUnusedChunk(this.mHandle, kevaValueWrapper.offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    static {
        Covode.recordClassIndex(24502);
        KevaBuilder instance = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        Executor executor = instance.mExecutor;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            sExecutor = threadPoolExecutor;
        }
        String str = instance.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepoName = str;
        Context context = instance.mContext;
        File com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
        if (com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir == null) {
            com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = new File(context.getApplicationInfo().dataDir, "files");
        }
        if (!com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
            com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.mkdirs();
        }
        File file = instance.mWorkDir;
        if (file == null) {
            file = new File(com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, "keva");
        }
        sSharedPrefsDir = new File(com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "shared_prefs");
        KevaMonitor kevaMonitor = instance.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        kevaMonitor.logDebug("Keva version: 1.6.5.clangSharedjavaAndCxxApi-alpha.30");
        if (!file.exists() && !file.mkdirs()) {
            kevaMonitor.reportThrowable(1, null, null, null, new IllegalStateException("fail to create work dir " + file.getPath()));
        }
        KevaPreLoaderHolder.injectPreLoader(instance.mPreLoader);
        try {
            kevaMonitor.loadLibrary("keva");
            initialize(file.getAbsolutePath());
        } catch (Throwable th) {
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.logDebug("fail to load so and init");
            kevaMonitor2.reportThrowable(1, null, null, null, th);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        synchronized (this) {
            sMonitor.logDebug("start dumping keva " + this.mName + ", size=" + this.mValueMap.size());
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                sMonitor.logDebug("key: " + entry.getKey() + ", value: " + value.value + ", offset: " + value.offset + ", loaded: " + value.loaded);
            }
            sMonitor.logDebug("finish dumping keva " + this.mName + ", size=" + this.mValueMap.size());
        }
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    public static File com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean existSharedPrefs(String str) {
        return new File(sSharedPrefsDir, str + ".xml").exists();
    }

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper != null) {
            return kevaValueWrapper;
        }
        KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper2);
        return kevaValueWrapper2;
    }

    /* access modifiers changed from: package-private */
    public void init(boolean z) {
        synchronized (this) {
            if (this.mHandle == 0) {
                doLoadRepo(z);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            if (!this.mChangeListeners.contains(onChangeListener)) {
                this.mChangeListeners.add(onChangeListener);
            }
        }
    }

    private void doLoadRepo(boolean z) {
        try {
            this.mHandle = loadRepo(this.mName, this.mMode, z);
            cleanUpAfterLoadRepo();
            if (!z) {
                sMonitor.onLoadRepo(this.mName, this.mMode);
            }
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkMode(int i2) {
        if (this.mHandle != 0 && this.mMode != i2) {
            sMonitor.reportThrowable(1, this.mName, null, null, new IllegalStateException("mode is different: " + this.mMode + " != " + i2));
        }
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
                erase(this.mHandle, str2, obtainWrapperLocked.offset);
                obtainWrapperLocked.value = null;
                obtainWrapperLocked.offset = 0;
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, str2, null, th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        synchronized (this) {
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                if (value.offset != 0) {
                    String key = entry.getKey();
                    try {
                        if (!value.loaded) {
                            int i2 = value.type;
                            if (i2 == 6) {
                                value.value = fetchString(this.mHandle, key, value.offset, null);
                            } else if (i2 == 7) {
                                value.value = fetchBytes(this.mHandle, key, value.offset, null, 0);
                            } else if (i2 == 23 || i2 == 39) {
                                throw new UnsupportedOperationException("keva has not implemented type " + value.type);
                            } else if (i2 == 55) {
                                value.value = fetchStringArray(this.mHandle, key, value.offset, null, 3);
                            } else if (!this.mIsMultiProcess || value.type > 5) {
                                throw new UnsupportedOperationException("keva has not implemented type " + value.type);
                            }
                            if (!this.mIsMultiProcess) {
                                value.loaded = true;
                            }
                        }
                        map.put(key, value.value);
                    } catch (Throwable th) {
                        sMonitor.reportThrowable(2, this.mName, key, Long.valueOf(value.offset), th);
                    }
                }
            }
        }
        return map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doPortingFromSp(android.content.Context r20) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.doPortingFromSp(android.content.Context):void");
    }

    public static Keva getRepo(String str, int i2) {
        return getRepoImpl(str, i2, false);
    }

    public static Keva getRepoSync(String str, int i2) {
        return getRepoImpl(str, i2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    private void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.size() != 0) {
            for (Keva.OnChangeListener onChangeListener : this.mChangeListeners) {
                onChangeListener.onChanged(keva, str);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        boolean fetchBoolean;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBoolean = fetchBoolean(str2, z);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, null, th);
                return z;
            }
        }
        return fetchBoolean;
    }

    KevaImpl(String str, int i2) {
        this.mName = str;
        this.mMode = i2;
        this.mIsMultiProcess = (i2 & 1) == 0 ? false : true;
    }

    static KevaImpl getEmptyRepoImpl(String str, int i2) {
        if (i2 < 0 || i2 >= 2) {
            sMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException("mode is not valid! ".concat(String.valueOf(i2))));
        }
        if ((i2 & 1) == 0) {
            return new KevaPrivateImpl(str, i2);
        }
        return new KevaMultiProcessImpl(str, i2);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        byte[] fetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                return bArr;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] fetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                return bArr;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d2) {
        double fetchDouble;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchDouble = fetchDouble(str2, d2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Double.valueOf(d2), th);
                return d2;
            }
        }
        return fetchDouble;
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f2) {
        float fetchFloat;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchFloat = fetchFloat(str2, f2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Float.valueOf(f2), th);
                return f2;
            }
        }
        return fetchFloat;
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i2) {
        int fetchInt;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchInt = fetchInt(str2, i2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Integer.valueOf(i2), th);
                return i2;
            }
        }
        return fetchInt;
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j2) {
        long fetchLong;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchLong = fetchLong(str2, j2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Long.valueOf(j2), th);
                return j2;
            }
        }
        return fetchLong;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        String fetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                return str2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        String[] fetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                return strArr;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] fetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                return strArr;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        String fetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                return str2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> fetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, set, th);
                return set;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> fetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, set, th);
                return set;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                try {
                    obtainWrapperLocked.offset = storeBoolean(this.mHandle, str2, obtainWrapperLocked.offset, z);
                    obtainWrapperLocked.value = Boolean.valueOf(z);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d2) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Double.valueOf(d2))) {
                try {
                    obtainWrapperLocked.offset = storeDouble(this.mHandle, str2, obtainWrapperLocked.offset, d2);
                    obtainWrapperLocked.value = Double.valueOf(d2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d2), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f2) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Float.valueOf(f2))) {
                try {
                    obtainWrapperLocked.offset = storeFloat(this.mHandle, str2, obtainWrapperLocked.offset, f2);
                    obtainWrapperLocked.value = Float.valueOf(f2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f2), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i2) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Integer.valueOf(i2))) {
                try {
                    obtainWrapperLocked.offset = storeInt(this.mHandle, str2, obtainWrapperLocked.offset, i2);
                    obtainWrapperLocked.value = Integer.valueOf(i2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i2), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j2) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Long.valueOf(j2))) {
                try {
                    obtainWrapperLocked.offset = storeLong(this.mHandle, str2, obtainWrapperLocked.offset, j2);
                    obtainWrapperLocked.value = Long.valueOf(j2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j2), th);
                }
            }
        }
    }

    public static Keva getRepoFromSp(Context context, String str, int i2) {
        return getRepoFromSpImpl(context, str, i2, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i2) {
        return getRepoFromSpImpl(context, str, i2, true);
    }

    private void reportBigValue(final String str, final Object obj, final int i2) {
        if (i2 > 10000) {
            sExecutor.execute(new Runnable() {
                /* class com.bytedance.keva.KevaImpl.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(24505);
                }

                public void run() {
                    KevaImpl.sMonitor.reportWarning(3, KevaImpl.this.mName, str, obj, "value too big, size=" + i2);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void addMapBoolWhenLoading(String str, boolean z, long j2) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j2, 2);
    }

    /* access modifiers changed from: package-private */
    public void addMapDoubleWhenLoading(String str, double d2, long j2) {
        addMapObjectWhenLoading(str, Double.valueOf(d2), j2, 5);
    }

    /* access modifiers changed from: package-private */
    public void addMapFloatWhenLoading(String str, float f2, long j2) {
        addMapObjectWhenLoading(str, Float.valueOf(f2), j2, 4);
    }

    /* access modifiers changed from: package-private */
    public void addMapIntWhenLoading(String str, int i2, long j2) {
        addMapObjectWhenLoading(str, Integer.valueOf(i2), j2, 1);
    }

    /* access modifiers changed from: package-private */
    public void addMapLongWhenLoading(String str, long j2, long j3) {
        addMapObjectWhenLoading(str, Long.valueOf(j2), j3, 3);
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] fetchStringArray = fetchStringArray(str, strArr, z);
        if (fetchStringArray != null) {
            return new HashSet(Arrays.asList(fetchStringArray));
        }
        return null;
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    /* access modifiers changed from: package-private */
    public void addMapOffsetWhenLoading(String str, long j2, int i2) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j2;
        kevaValueWrapper.type = i2;
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    private static Keva getRepoImpl(final String str, final int i2, boolean z) {
        Keva keva;
        boolean z2;
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            keva = hashMap.get(str);
            if (keva == null) {
                z2 = true;
                if (z) {
                    keva = getEmptyRepoImpl(str, i2);
                } else {
                    keva = new KevaFuture(str, i2, new Callable<KevaImpl>() {
                        /* class com.bytedance.keva.KevaImpl.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(24503);
                        }

                        @Override // java.util.concurrent.Callable
                        public final KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i2);
                            emptyRepoImpl.init(false);
                            return emptyRepoImpl;
                        }
                    });
                }
                hashMap.put(str, keva);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            if (!(keva instanceof KevaFuture)) {
                ((KevaImpl) keva).init(false);
            }
        } else if (!(keva instanceof KevaFuture)) {
            ((KevaImpl) keva).checkMode(i2);
        } else {
            ((KevaFuture) keva).checkMode(i2);
        }
        return keva;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r2 = r15.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeString(java.lang.String r14, final java.lang.String r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeString(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = java.util.Arrays.toString(r14);
        r2 = r3.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeStringArray(java.lang.String r13, java.lang.String[] r14, boolean r15) {
        /*
            r12 = this;
            r7 = r13
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            r3 = 0
            if (r0 == 0) goto L_0x000b
            r7 = r3
        L_0x000b:
            monitor-enter(r12)
            com.bytedance.keva.KevaImpl$KevaValueWrapper r2 = r12.obtainWrapperLocked(r7)     // Catch:{ all -> 0x005a }
            r10 = r14
            long r5 = r12.mHandle     // Catch:{ all -> 0x0036 }
            long r8 = r2.offset     // Catch:{ all -> 0x0036 }
            r11 = 3
            r4 = r12
            long r0 = r4.storeStringArray(r5, r7, r8, r10, r11)     // Catch:{ all -> 0x0036 }
            r2.offset = r0     // Catch:{ all -> 0x0036 }
            r0 = 55
            r2.type = r0     // Catch:{ all -> 0x0036 }
            if (r15 != 0) goto L_0x002d
            r2.value = r10     // Catch:{ all -> 0x0036 }
            boolean r0 = r12.mIsMultiProcess     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0032
            r0 = 1
            r2.loaded = r0     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x002d:
            r2.value = r3     // Catch:{ all -> 0x0036 }
            r0 = 0
            r2.loaded = r0     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r12.notifyChangeListeners(r12, r7)     // Catch:{ all -> 0x0036 }
            goto L_0x0040
        L_0x0036:
            r9 = move-exception
            com.bytedance.keva.KevaMonitor r4 = com.bytedance.keva.KevaImpl.sMonitor
            r5 = 3
            java.lang.String r6 = r12.mName
            r8 = 0
            r4.reportThrowable(r5, r6, r7, r8, r9)
        L_0x0040:
            monitor-exit(r12)
            if (r10 == 0) goto L_0x0059
            java.lang.String r3 = java.util.Arrays.toString(r10)
            int r2 = r3.length()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r2 <= r0) goto L_0x0059
            java.util.concurrent.Executor r1 = com.bytedance.keva.KevaImpl.sExecutor
            com.bytedance.keva.KevaImpl$6 r0 = new com.bytedance.keva.KevaImpl$6
            r0.<init>(r7, r3, r2)
            r1.execute(r0)
        L_0x0059:
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeStringArray(java.lang.String, java.lang.String[], boolean):void");
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j2, int i2) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j2;
        kevaValueWrapper.type = i2;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    private static Keva getRepoFromSpImpl(final Context context, final String str, final int i2, boolean z) {
        Keva keva;
        if (isRepoPorted(str)) {
            return getRepo(str, i2);
        }
        boolean z2 = true;
        if (!existSharedPrefs(str)) {
            getPortedSpRepo().storeBoolean(str, true);
            return getRepo(str, i2);
        }
        sMonitor.logDebug("do poring from sp: ".concat(String.valueOf(str)));
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            keva = hashMap.get(str);
            if (keva == null) {
                if (z) {
                    keva = getEmptyRepoImpl(str, i2);
                } else {
                    keva = new KevaFuture(str, i2, new Callable<KevaImpl>() {
                        /* class com.bytedance.keva.KevaImpl.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(24504);
                        }

                        @Override // java.util.concurrent.Callable
                        public final KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i2);
                            emptyRepoImpl.doPortingFromSp(context);
                            return emptyRepoImpl;
                        }
                    });
                }
                hashMap.put(str, keva);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            if (keva instanceof KevaImpl) {
                try {
                    ((KevaImpl) keva).doPortingFromSp(context);
                } catch (UnsatisfiedLinkError e2) {
                    sMonitor.reportThrowable(1, str, null, null, e2);
                }
            }
        } else if (keva instanceof KevaImpl) {
            ((KevaImpl) keva).checkMode(i2);
        } else {
            ((KevaFuture) keva).checkMode(i2);
        }
        return keva;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r15.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeBytes(java.lang.String r14, byte[] r15, int r16, boolean r17) {
        /*
            r13 = this;
            r8 = r14
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            r4 = 0
            if (r0 == 0) goto L_0x000b
            r8 = r4
        L_0x000b:
            r2 = r13
            monitor-enter(r2)
            com.bytedance.keva.KevaImpl$KevaValueWrapper r3 = r2.obtainWrapperLocked(r8)     // Catch:{ all -> 0x0058 }
            r11 = r15
            long r6 = r2.mHandle     // Catch:{ all -> 0x003a }
            long r9 = r3.offset     // Catch:{ all -> 0x003a }
            r5 = r2
            r12 = r16
            long r0 = r5.storeBytes(r6, r8, r9, r11, r12)     // Catch:{ all -> 0x003a }
            r3.offset = r0     // Catch:{ all -> 0x003a }
            int r0 = r12 << 4
            r0 = r0 | 7
            r3.type = r0     // Catch:{ all -> 0x003a }
            if (r17 != 0) goto L_0x0031
            r3.value = r11     // Catch:{ all -> 0x003a }
            boolean r0 = r2.mIsMultiProcess     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0036
            r0 = 1
            r3.loaded = r0     // Catch:{ all -> 0x003a }
            goto L_0x0036
        L_0x0031:
            r3.value = r4     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.loaded = r0     // Catch:{ all -> 0x003a }
        L_0x0036:
            r2.notifyChangeListeners(r2, r8)     // Catch:{ all -> 0x003a }
            goto L_0x0045
        L_0x003a:
            r10 = move-exception
            com.bytedance.keva.KevaMonitor r5 = com.bytedance.keva.KevaImpl.sMonitor
            r6 = 3
            java.lang.String r7 = r2.mName
            r8 = r8
            r9 = r11
            r5.reportThrowable(r6, r7, r8, r9, r10)
        L_0x0045:
            monitor-exit(r2)
            if (r11 == 0) goto L_0x0057
            int r3 = r11.length
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r3 <= r0) goto L_0x0057
            java.util.concurrent.Executor r1 = com.bytedance.keva.KevaImpl.sExecutor
            com.bytedance.keva.KevaImpl$5 r0 = new com.bytedance.keva.KevaImpl$5
            r0.<init>(r8, r3)
            r1.execute(r0)
        L_0x0057:
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeBytes(java.lang.String, byte[], int, boolean):void");
    }

    static void passWarning(int i2, String str, String str2, Object obj, String str3) {
        sMonitor.reportWarning(i2, str, str2, obj, str3);
    }
}
