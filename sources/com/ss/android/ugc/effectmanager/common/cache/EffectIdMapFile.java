package com.ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.StrictLineReader;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

public class EffectIdMapFile {
    private final LinkedHashMap<String, String> effectidMap = new LinkedHashMap<>(0, 0.75f, true);
    private int mapCount;
    private final File mapFile;
    private final File mapFileBak;
    private final File mapFileTmp;
    private Writer mapWriter;

    static {
        Covode.recordClassIndex(95268);
    }

    private void checkNotClosed() {
        if (this.mapWriter == null) {
            throw new IllegalStateException("map file is closed");
        } else if (!this.mapFile.exists()) {
            rebuildMap();
        }
    }

    private void readMap() {
        MethodCollector.i(1382);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.mapFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            if (!"id.to.effectid".equals(readLine) || !"1".equals(readLine2) || !"".equals(readLine3)) {
                IOException iOException = new IOException("unexpected Map header: [" + readLine + ", " + readLine2 + ", " + readLine3 + "]");
                MethodCollector.o(1382);
                throw iOException;
            }
            int i2 = 0;
            while (true) {
                try {
                    readMapLine(strictLineReader.readLine());
                    i2++;
                } catch (EOFException unused) {
                    this.mapCount = i2;
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildMap();
                    } else {
                        this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            MethodCollector.o(1382);
        }
    }

    private synchronized void rebuildMap() {
        MethodCollector.i(1436);
        Writer writer = this.mapWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.mapCount = 0;
            for (Map.Entry<String, String> entry : this.effectidMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ' ' + entry.getValue() + '\n');
                this.mapCount++;
            }
            bufferedWriter.close();
            if (this.mapFile.exists()) {
                renameTo(this.mapFile, this.mapFileBak, true);
            }
            renameTo(this.mapFileTmp, this.mapFile, false);
            com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mapFileBak);
            this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
            MethodCollector.o(1436);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.o(1436);
            throw th;
        }
    }

    public String getEffectId(String str) {
        return this.effectidMap.get(str);
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
            throw new IOException();
        }
    }

    private void readMapLine(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            this.effectidMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
            return;
        }
        throw new IOException("unexpected Map line: ".concat(String.valueOf(str)));
    }

    public EffectIdMapFile(File file) {
        File file2 = new File(file, "effectidmap");
        this.mapFile = file2;
        this.mapFileTmp = new File(file, "effectidmap.tmp");
        File file3 = new File(file, "effectidmap.bak");
        this.mapFileBak = file3;
        try {
            if (file3.exists()) {
                if (file2.exists()) {
                    com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete(file3);
                } else {
                    renameTo(file3, file2, false);
                }
            }
            if (file2.exists()) {
                readMap();
            } else {
                rebuildMap();
            }
        } catch (IOException e2) {
            System.out.println("EffectIdMapFile " + file + " is corrupt: " + e2.getMessage() + ", removing");
            com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mapFile);
        }
    }

    public static boolean com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(1323);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1323);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1323);
        return delete;
    }

    public void writeEffectId(String str, String str2) {
        MethodCollector.i(1335);
        if (this.effectidMap.containsKey(str)) {
            MethodCollector.o(1335);
            return;
        }
        this.effectidMap.put(str, str2);
        try {
            checkNotClosed();
            this.mapWriter.write(str + ' ' + str2 + '\n');
            this.mapWriter.flush();
            MethodCollector.o(1335);
        } catch (Exception e2) {
            EPLog.e("EffectIdMapFile", "EffectIdMapFile write failed by " + e2.toString());
            MethodCollector.o(1335);
        }
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.i(1445);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.o(1445);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.o(1445);
        throw iOException;
    }
}
