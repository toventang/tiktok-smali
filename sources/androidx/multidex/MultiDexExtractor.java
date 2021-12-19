package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* access modifiers changed from: package-private */
public final class MultiDexExtractor implements Closeable {
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    static {
        Covode.recordClassIndex(1456);
    }

    public static int androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static int androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() {
            /* class androidx.multidex.MultiDexExtractor.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1457);
            }

            public boolean accept(File file) {
                if (!file.getName().equals("MultiDex.lock")) {
                    return true;
                }
                return false;
            }
        });
        if (listFiles == null) {
            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    private List<ExtractedDex> performExtractions() {
        String str;
        String str2 = this.sourceApk.getName() + ".classes";
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        int i2 = 2;
        try {
            ZipEntry entry = zipFile.getEntry(new StringBuilder("classes2.dex").toString());
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i2 + ".zip");
                arrayList.add(extractedDex);
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Extraction is needed for file ".concat(String.valueOf(extractedDex)));
                int i3 = 0;
                boolean z = false;
                while (i3 < 3 && !z) {
                    i3++;
                    extract(zipFile, entry, extractedDex, str2);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z = true;
                    } catch (IOException e2) {
                        androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", sb.append(str).append(" '").append(extractedDex.getAbsolutePath()).append("': length ").append(extractedDex.length()).append(" - crc: ").append(extractedDex.crc).toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (z) {
                    i2++;
                    entry = zipFile.getEntry("classes" + i2 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e3) {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to close resource", e3);
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to close resource", e2);
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return d.a(context, "multidex.version", 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long getZipCrc(File file) {
        long zipCrc = ZipUtil.getZipCrc(file);
        if (zipCrc == -1) {
            return zipCrc - 1;
        }
        return zipCrc;
    }

    public static boolean androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* access modifiers changed from: package-private */
    public static class ExtractedDex extends File {
        public long crc = -1;

        static {
            Covode.recordClassIndex(1458);
        }

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    MultiDexExtractor(File file, File file2) {
        androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e2) {
                closeQuietly(this.lockChannel);
                throw e2;
            }
        } catch (IOException | Error | RuntimeException e3) {
            closeQuietly(this.lockRaf);
            throw e3;
        }
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) {
        androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "loading existing secondary dex files");
        String str2 = this.sourceApk.getName() + ".classes";
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i2 = multiDexPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 - 1);
        for (int i3 = 2; i3 <= i2; i3++) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i3 + ".zip");
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j2 = multiDexPreferences.getLong(str + "dex.crc." + i3, -1);
                long j3 = multiDexPreferences.getLong(str + "dex.time." + i3, -1);
                long lastModified = extractedDex.lastModified();
                if (j3 == lastModified && j2 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                } else {
                    throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + extractedDex.crc);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List<? extends File> load(Context context, String str, boolean z) {
        List<ExtractedDex> list;
        androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z + ", " + str + ")");
        if (this.cacheLock.isValid()) {
            if (!z && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
                try {
                    list = loadExistingExtractions(context, str);
                } catch (IOException e2) {
                    androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                }
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            } else if (z) {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Forced extraction must be performed.");
            } else {
                androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Detected that extraction must be performed.");
            }
            list = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, list);
            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    private static boolean isModified(Context context, File file, long j2, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + "timestamp", -1) == getTimeStamp(file) && multiDexPreferences.getLong(str + "crc", -1) == j2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-".concat(String.valueOf(str)), ".zip", file.getParentFile());
        androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Renaming to " + file.getPath());
                    if (!createTempFile.renameTo(file)) {
                        throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                    }
                    return;
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            closeQuietly(inputStream);
            androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_storage_FileLancet_delete(createTempFile);
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j2, long j3, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(str + "crc", j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + "dex.crc." + i2, extractedDex.crc);
            edit.putLong(str + "dex.time." + i2, extractedDex.lastModified());
            i2++;
        }
        edit.commit();
    }
}
