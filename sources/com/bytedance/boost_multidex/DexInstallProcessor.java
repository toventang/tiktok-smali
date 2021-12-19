package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import com.bytedance.boost_multidex.DexHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public class DexInstallProcessor {
    private boolean mDoCheckSum;
    private SharedPreferences mPreferences;

    static {
        Covode.recordClassIndex(15640);
    }

    DexInstallProcessor() {
        this.mDoCheckSum = new Random().nextInt(3) == 0;
        Monitor.get().logInfo("Do checksum " + this.mDoCheckSum);
    }

    private boolean checkFileValid(int i2, String str, String str2, File file, boolean z) {
        long j2;
        if (!file.exists()) {
            Monitor.get().logWarning("File does not exist! " + file.getPath());
            return false;
        }
        long j3 = this.mPreferences.getLong(str2 + i2, -1);
        long lastModified = file.lastModified();
        if (j3 != lastModified) {
            Monitor.get().logWarning("Invalid file:  (key \"" + str + str2 + i2 + "\"), expected modification time: " + j3 + ", modification time: " + lastModified);
            return false;
        }
        if ("dex.checksum.".equals(str)) {
            if (z) {
                try {
                    j2 = Utility.doZipCheckSum(file);
                } catch (IOException unused) {
                    return false;
                }
            } else {
                if (this.mDoCheckSum) {
                    j2 = Utility.doFileCheckSum(file);
                }
                return true;
            }
        } else if ("odex.checksum.".equals(str)) {
            j2 = file.length();
        } else {
            Monitor.get().logWarning("unsupported checksum key: ".concat(String.valueOf(str)));
            return false;
        }
        long j4 = this.mPreferences.getLong(str + i2, -1);
        if (j4 != j2) {
            Monitor.get().logWarning("Invalid file:  (key \"" + str + str2 + i2 + "\"), expected checksum: " + j4 + ", file checksum: " + j2);
            return false;
        }
        return true;
    }

    public static File com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private File getValidDexFile(File file, int i2) {
        if (!checkFileValid(i2, "dex.checksum.", "dex.time.", file, false)) {
            return null;
        }
        return file;
    }

    private File getValidOptDexFile(File file, int i2) {
        if (!file.exists()) {
            Monitor.get().logInfo("opt file does not exist: " + file.getPath());
            return null;
        } else if (!checkFileValid(i2, "odex.checksum.", "odex.time.", file, false)) {
            return null;
        } else {
            return file;
        }
    }

    private void installSecondaryDexes(ClassLoader classLoader, List<DexHolder> list) {
        MethodCollector.i(9057);
        DexLoader.create(Build.VERSION.SDK_INT).install(classLoader, list, this.mPreferences);
        try {
            BoostNative.recoverAction();
        } catch (UnsatisfiedLinkError unused) {
        }
        Monitor.get().logDebug("After install all, sp value is " + this.mPreferences.getAll());
        MethodCollector.o(9057);
    }

    private boolean isZipFileValid(File file, int i2) {
        return checkFileValid(i2, "dex.checksum.", "dex.time.", file, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.boost_multidex.DexHolder obtainDexHolder(int r18, java.io.File r19, java.io.File r20, java.io.File r21, java.io.File r22) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexInstallProcessor.obtainDexHolder(int, java.io.File, java.io.File, java.io.File, java.io.File):com.bytedance.boost_multidex.DexHolder");
    }

    private List<DexHolder> obtainDexObjectList(File file, File file2, File file3, File file4, File file5, Result result) {
        Object obj;
        MethodCollector.i(9242);
        File file6 = file;
        long doZipCheckSum = Utility.doZipCheckSum(file6);
        long lastModified = file6.lastModified();
        boolean z = (this.mPreferences.getLong("timestamp", -1) == lastModified && this.mPreferences.getLong("crc", -1) == doZipCheckSum) ? false : true;
        result.modified = z;
        ArrayList arrayList = new ArrayList();
        int i2 = 2;
        if (z) {
            Utility.clearDirFiles(file3);
            Utility.clearDirFiles(file4);
            Utility.clearDirFiles(file5);
            SharedPreferences.Editor edit = this.mPreferences.edit();
            edit.clear();
            edit.commit();
            ZipFile zipFile = new ZipFile(file6);
            while (true) {
                ZipEntry entry = zipFile.getEntry("classes" + i2 + ".dex");
                if (entry == null) {
                    break;
                }
                File file7 = new File(file3, i2 + ".dex");
                File file8 = new File(file4, i2 + ".odex");
                if (!BoostNative.isSupportFastLoad()) {
                    obj = Environment.getDataDirectory().getFreeSpace() > 150000000 ? DexHolder.obtainValidForceDexOpt(this.mPreferences, i2, file7, file8, zipFile, entry) : DexHolder.obtainValidZipDex(this.mPreferences, i2, new File(file5, i2 + ".zip"), new File(file5, i2 + ".odex"), zipFile, entry);
                    arrayList.add(obj);
                } else if (Utility.isBetterUseApkBuf()) {
                    arrayList.add(new DexHolder.ApkBuffer(i2, obtainEntryBytesInApk(zipFile, entry), file7, file8));
                } else {
                    obj = DexHolder.obtainValidDexBuffer(this.mPreferences, i2, obtainEntryFileInApk(zipFile, entry, file7), file8);
                    arrayList.add(obj);
                }
                i2++;
            }
            zipFile.close();
            edit.putInt("dex.number", i2 - 1);
            edit.putLong("timestamp", lastModified);
            edit.putLong("crc", doZipCheckSum);
            edit.commit();
        } else {
            int i3 = this.mPreferences.getInt("dex.number", 0);
            while (i2 <= i3) {
                file6 = file6;
                arrayList.add(obtainDexHolder(i2, file6, file3, file4, file5));
                i2++;
            }
        }
        MethodCollector.o(9242);
        return arrayList;
    }

    private byte[] obtainEntryBytesInApk(ZipFile zipFile, ZipEntry zipEntry) {
        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
    }

    private File obtainEntryFileInApk(ZipFile zipFile, ZipEntry zipEntry, File file) {
        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
    }

    /* access modifiers changed from: package-private */
    public void doInstallation(final Context context, File file, Result result) {
        File com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
        if (!com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
            Utility.mkdirChecked(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir);
        }
        Utility.clearDirFiles(new File(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "code_cache/secondary-dexes"));
        File ensureDirCreated = Utility.ensureDirCreated(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, "boost_multidex");
        File ensureDirCreated2 = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
        File ensureDirCreated3 = Utility.ensureDirCreated(ensureDirCreated, "odex_cache");
        File ensureDirCreated4 = Utility.ensureDirCreated(ensureDirCreated, "zip_cache");
        result.setDirs(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4);
        Locker locker = new Locker(new File(ensureDirCreated, "boost_multidex.prepare.lock"));
        locker.lock();
        Locker locker2 = new Locker(new File(ensureDirCreated, "boost_multidex.install.lock"));
        locker2.lock();
        locker.close();
        try {
            this.mPreferences = com.ss.android.ugc.aweme.bf.d.a(context, "boost_multidex.records", 0);
            result.freeSpaceBefore = Environment.getDataDirectory().getFreeSpace();
            List<DexHolder> obtainDexObjectList = obtainDexObjectList(file, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4, result);
            installSecondaryDexes(context.getClassLoader(), obtainDexObjectList);
            locker2.close();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            result.freeSpaceAfter = freeSpace;
            if (freeSpace < 20000000) {
                Monitor.get().logWarning("Free space is too small: " + freeSpace + ", compare to 20000000");
                return;
            }
            for (DexHolder dexHolder : obtainDexObjectList) {
                if (!((dexHolder instanceof DexHolder.ZipOpt) || (dexHolder instanceof DexHolder.DexOpt))) {
                    Monitor.get().doAfterInstall(new Runnable() {
                        /* class com.bytedance.boost_multidex.DexInstallProcessor.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15641);
                        }

                        public void run() {
                            OptimizeService.startOptimizeService(context);
                        }
                    });
                    return;
                }
            }
        } catch (Throwable th) {
            locker2.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void doInstallationInOptProcess(Context context, File file) {
        MethodCollector.i(9055);
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Fast load is not supported!");
            MethodCollector.o(9055);
            return;
        }
        int i2 = 2;
        ZipFile zipFile = new ZipFile(file);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ZipEntry entry = zipFile.getEntry("classes" + i2 + ".dex");
            if (entry != null) {
                arrayList.add(new DexHolder.ApkBuffer(i2, obtainEntryBytesInApk(zipFile, entry), null, null));
                i2++;
            } else {
                DexLoader.create(Build.VERSION.SDK_INT).installInOptProcess(context.getClassLoader(), arrayList);
                zipFile.close();
                try {
                    BoostNative.recoverAction();
                    MethodCollector.o(9055);
                    return;
                } catch (UnsatisfiedLinkError unused) {
                    MethodCollector.o(9055);
                    return;
                }
            }
        }
    }
}
