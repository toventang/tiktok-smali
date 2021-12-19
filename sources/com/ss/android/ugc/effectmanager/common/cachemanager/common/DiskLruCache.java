package com.ss.android.ugc.effectmanager.common.cachemanager.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

public final class DiskLruCache implements Closeable {
    private static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
        /* class com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.AnonymousClass2 */

        static {
            Covode.recordClassIndex(95277);
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
        }

        {
            MethodCollector.i(341);
            MethodCollector.o(341);
        }
    };
    private final int appVersion;
    private final Callable<Void> cleanupCallable = new Callable<Void>() {
        /* class com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95276);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            MethodCollector.i(203);
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.journalWriter == null) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    MethodCollector.o(203);
                    return null;
                } finally {
                    MethodCollector.o(203);
                }
            }
        }
    };
    public final File directory;
    private final ExecutorService executorService = com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    public Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private IAllowListRule mAllowKeyRule;
    private long maxSize;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size;
    public final int valueCount;

    public final File getDirectory() {
        return this.directory;
    }

    public final class Editor {
        private boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        static {
            Covode.recordClassIndex(95278);
        }

        public final void abort() {
            DiskLruCache.this.completeEdit(this, false);
        }

        public final void abortUnlessCommitted() {
            if (!this.committed) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class FaultHidingOutputStream extends FilterOutputStream {
            static {
                Covode.recordClassIndex(95279);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i2) {
                MethodCollector.i(496);
                try {
                    this.out.write(i2);
                    MethodCollector.o(496);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.o(496);
                }
            }

            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.i(493);
                MethodCollector.o(493);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i2, int i3) {
                MethodCollector.i(498);
                try {
                    this.out.write(bArr, i2, i3);
                    MethodCollector.o(498);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.o(498);
                }
            }
        }

        public final void commit() {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public final String getString(int i2) {
            InputStream newInputStream = newInputStream(i2);
            if (newInputStream != null) {
                return DiskLruCache.inputStreamToString(newInputStream);
            }
            return null;
        }

        public final InputStream newInputStream(int i2) {
            MethodCollector.i(566);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(566);
                        throw illegalStateException;
                    } else if (!this.entry.readable) {
                        return null;
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i2));
                            MethodCollector.o(566);
                            return fileInputStream;
                        } catch (FileNotFoundException unused) {
                            MethodCollector.o(566);
                            return null;
                        }
                    }
                } finally {
                    MethodCollector.o(566);
                }
            }
        }

        public final OutputStream newOutputStream(int i2) {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            MethodCollector.i(628);
            if (i2 < 0 || i2 >= DiskLruCache.this.valueCount) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index " + i2 + " to be greater than 0 and less than the maximum value count of " + DiskLruCache.this.valueCount);
                MethodCollector.o(628);
                throw illegalArgumentException;
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor == this) {
                        if (!this.entry.readable) {
                            this.written[i2] = true;
                        }
                        File dirtyFile = this.entry.getDirtyFile(i2);
                        try {
                            fileOutputStream = new FileOutputStream(dirtyFile);
                        } catch (FileNotFoundException unused) {
                            DiskLruCache.this.directory.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(dirtyFile);
                            } catch (FileNotFoundException unused2) {
                                OutputStream outputStream = DiskLruCache.NULL_OUTPUT_STREAM;
                                MethodCollector.o(628);
                                return outputStream;
                            }
                        }
                        faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(628);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(628);
                }
            }
            return faultHidingOutputStream;
        }

        private Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        public final void set(int i2, String str) {
            Throwable th;
            MethodCollector.i(787);
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i2), FileUtils.INSTANCE.getUTF_8());
                try {
                    outputStreamWriter2.write(str);
                    FileUtils.INSTANCE.closeQuietly(outputStreamWriter2);
                    MethodCollector.o(787);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    FileUtils.INSTANCE.closeQuietly(outputStreamWriter);
                    MethodCollector.o(787);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                FileUtils.INSTANCE.closeQuietly(outputStreamWriter);
                MethodCollector.o(787);
                throw th;
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final File[] cleanFiles;
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        static {
            Covode.recordClassIndex(95281);
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ins) {
                FileUtils.INSTANCE.closeQuietly(inputStream);
            }
        }

        public final File getCleanFile(int i2) {
            return this.cleanFiles[i2];
        }

        public final InputStream getInputStream(int i2) {
            return this.ins[i2];
        }

        public final long getLength(int i2) {
            return this.lengths[i2];
        }

        public final String getString(int i2) {
            return DiskLruCache.inputStreamToString(getInputStream(i2));
        }

        private Snapshot(String str, long j2, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j2;
            this.cleanFiles = fileArr;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized long getMaxSize() {
        long j2;
        MethodCollector.i(1187);
        j2 = this.maxSize;
        MethodCollector.o(1187);
        return j2;
    }

    public final synchronized long size() {
        long j2;
        MethodCollector.i(1190);
        j2 = this.size;
        MethodCollector.o(1190);
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        static {
            Covode.recordClassIndex(95280);
        }

        public final String getLengths() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.lengths) {
                sb.append(' ').append(j2);
            }
            return sb.toString();
        }

        private IOException invalidLengths(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File getCleanFile(int i2) {
            if (i2 == 0) {
                return new File(DiskLruCache.this.directory, this.key);
            }
            return new File(DiskLruCache.this.directory, this.key + "." + i2);
        }

        public final void setLengths(String[] strArr) {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.lengths[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public final File getDirtyFile(int i2) {
            if (i2 == 0) {
                return new File(DiskLruCache.this.directory, this.key + ".tmp");
            }
            return new File(DiskLruCache.this.directory, this.key + "." + i2 + ".tmp");
        }

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }
    }

    static {
        Covode.recordClassIndex(95275);
    }

    public static ExecutorService com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    public final void delete() {
        EPLog.d("DiskLruCache", "delete");
        close();
        FileUtils.INSTANCE.deleteContents(this.directory);
    }

    public final synchronized void flush() {
        MethodCollector.i(1218);
        EPLog.d("DiskLruCache", "flush");
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
        MethodCollector.o(1218);
    }

    public final Set<String> getLruEntryKeys() {
        Set<String> unmodifiableSet;
        MethodCollector.i(1246);
        synchronized (this) {
            try {
                unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
            } finally {
                MethodCollector.o(1246);
            }
        }
        return unmodifiableSet;
    }

    public final synchronized boolean isClosed() {
        MethodCollector.i(1217);
        if (this.journalWriter == null) {
            MethodCollector.o(1217);
            return true;
        }
        MethodCollector.o(1217);
        return false;
    }

    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        if (i2 < 2000 || i2 < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized boolean isValid() {
        MethodCollector.i(1108);
        File file = this.directory;
        if (file == null || !file.exists() || !this.journalFile.exists()) {
            MethodCollector.o(1108);
            return false;
        }
        MethodCollector.o(1108);
        return true;
    }

    private void processJournal() {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i2 = 0;
            if (next.currentEditor == null) {
                while (i2 < this.valueCount) {
                    this.size += next.lengths[i2];
                    i2++;
                }
            } else {
                next.currentEditor = null;
                while (i2 < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i2));
                    deleteIfExists(next.getDirtyFile(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(1220);
        if (this.journalWriter == null) {
            MethodCollector.o(1220);
            return;
        }
        Iterator it = new ArrayList(this.lruEntries.values()).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (entry.currentEditor != null) {
                entry.currentEditor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
        MethodCollector.o(1220);
    }

    private void readJournal() {
        MethodCollector.i(1120);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                IOException iOException = new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
                MethodCollector.o(1120);
                throw iOException;
            }
            int i2 = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i2++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i2 - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            MethodCollector.o(1120);
        }
    }

    public final synchronized void rebuildJournal() {
        MethodCollector.i(1150);
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    bufferedWriter.write("DIRTY " + entry.key + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.journalFileBackup);
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
            MethodCollector.o(1150);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.o(1150);
            throw th;
        }
    }

    public final synchronized void trimToSize() {
        Map.Entry<String, Entry> next;
        MethodCollector.i(1232);
        EPLog.d("DiskLruCache", "trimToSize size: " + this.size);
        while (this.size > this.maxSize) {
            int size2 = this.lruEntries.size();
            int i2 = 0;
            Iterator<Map.Entry<String, Entry>> it = this.lruEntries.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                EPLog.d("DiskLruCache", "trimToSize key:" + next.getKey());
                IAllowListRule iAllowListRule = this.mAllowKeyRule;
                if (iAllowListRule == null || !iAllowListRule.isAllowed(next.getKey())) {
                    EPLog.d("DiskLruCache", "trimToSize exe");
                } else {
                    i2++;
                }
            }
            EPLog.d("DiskLruCache", "trimToSize exe");
            if (size2 - i2 < 10) {
                setMaxSize(getMaxSize() * 2);
            }
            remove(next.getKey());
        }
        MethodCollector.o(1232);
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
            throw new IOException();
        }
    }

    public static String inputStreamToString(InputStream inputStream) {
        return FileUtils.INSTANCE.readFully(new InputStreamReader(inputStream, FileUtils.INSTANCE.getUTF_8()));
    }

    public static String toDiskLruCacheKeyPattern(String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] == File.separatorChar) {
                charArray[i2] = '_';
            }
        }
        return new String(charArray);
    }

    public final synchronized void readKeyInMemory(String str) {
        MethodCollector.i(1284);
        checkNotClosed();
        this.lruEntries.get(str);
        MethodCollector.o(1284);
    }

    public final synchronized void setMaxSize(long j2) {
        MethodCollector.i(1189);
        this.maxSize = j2;
        this.executorService.submit(this.cleanupCallable);
        MethodCollector.o(1189);
    }

    public static String toDiskLruCacheKey(String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (!(c2 == '_' || c2 == '-' || ((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9')))) {
                charArray[i2] = '_';
            }
        }
        return new String(charArray);
    }

    public static boolean com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(1100);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1100);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1100);
        return delete;
    }

    public final synchronized boolean has(String str) {
        MethodCollector.i(1278);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.o(1278);
                return false;
            } else if (!entry.readable) {
                MethodCollector.o(1278);
                return false;
            } else {
                try {
                    this.redundantOpCount++;
                    this.journalWriter.write("READ " + str + '\n');
                    this.journalWriter.flush();
                    if (journalRebuildRequired()) {
                        this.executorService.submit(this.cleanupCallable);
                    }
                } catch (IOException unused) {
                }
                MethodCollector.o(1278);
                return true;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.o(1278);
            throw illegalArgumentException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r5 == -1) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournalLine(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    public final synchronized Snapshot get(String str) {
        MethodCollector.i(1166);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.o(1166);
                return null;
            } else if (!entry.readable) {
                MethodCollector.o(1166);
                return null;
            } else {
                int i2 = this.valueCount;
                InputStream[] inputStreamArr = new InputStream[i2];
                File[] fileArr = new File[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < this.valueCount; i4++) {
                    try {
                        fileArr[i4] = entry.getCleanFile(i4);
                        inputStreamArr[i4] = new FileInputStream(fileArr[i4]);
                    } catch (FileNotFoundException unused) {
                        while (i3 < this.valueCount && inputStreamArr[i3] != null) {
                            FileUtils.INSTANCE.closeQuietly(inputStreamArr[i3]);
                            i3++;
                        }
                        MethodCollector.o(1166);
                        return null;
                    }
                }
                this.redundantOpCount++;
                this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
                this.journalWriter.flush();
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                Snapshot snapshot = new Snapshot(str, entry.sequenceNumber, fileArr, inputStreamArr, entry.lengths);
                MethodCollector.o(1166);
                return snapshot;
            }
        } else {
            remove(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.o(1166);
            throw illegalArgumentException;
        }
    }

    public final synchronized boolean addEntryToCache(String str) {
        MethodCollector.i(1268);
        EPLog.d("DiskLruCache", "addEntryToCache:".concat(String.valueOf(str)));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            } else if (entry.currentEditor != null) {
                MethodCollector.o(1268);
                return false;
            }
            File cleanFile = entry.getCleanFile(0);
            if (cleanFile.exists()) {
                long j2 = entry.lengths[0];
                long length = cleanFile.length();
                if (cleanFile.isDirectory()) {
                    length = FileUtils.INSTANCE.getFolderSize(cleanFile);
                }
                entry.lengths[0] = length;
                this.size = (this.size - j2) + length;
                this.redundantOpCount++;
                entry.currentEditor = null;
                entry.readable = true;
                this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry.sequenceNumber = j3;
                this.journalWriter.flush();
                if (this.size > this.maxSize || journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                MethodCollector.o(1268);
                return true;
            }
            this.lruEntries.remove(entry.key);
            this.journalWriter.write("REMOVE " + entry.key + '\n');
            MethodCollector.o(1268);
            return false;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.o(1268);
        throw illegalArgumentException;
    }

    public final synchronized boolean remove(String str) {
        MethodCollector.i(1216);
        EPLog.d("DiskLruCache", "remove:".concat(String.valueOf(str)));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            boolean z = true;
            if (entry == null || entry.currentEditor != null) {
                StringBuilder sb = new StringBuilder("remove: can not:");
                if (entry != null) {
                    z = false;
                }
                EPLog.e("DiskLruCache", sb.append(z).toString());
                MethodCollector.o(1216);
                return false;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File cleanFile = entry.getCleanFile(i2);
                if (cleanFile.exists()) {
                    if (cleanFile.isFile() && !com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(cleanFile)) {
                        EPLog.e("DiskLruCache", "remove  err:".concat(String.valueOf(str)));
                        IOException iOException = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                        MethodCollector.o(1216);
                        throw iOException;
                    } else if (cleanFile.isDirectory() && !FileUtils.INSTANCE.deleteDir(cleanFile)) {
                        EPLog.e("DiskLruCache", "remove  err:".concat(String.valueOf(str)));
                        IOException iOException2 = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                        MethodCollector.o(1216);
                        throw iOException2;
                    }
                }
                this.size -= entry.lengths[i2];
                entry.lengths[i2] = 0;
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.o(1216);
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.o(1216);
        throw illegalArgumentException;
    }

    public final synchronized Editor edit(String str, long j2) {
        MethodCollector.i(1186);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j2 != -1) {
                if (entry == null || entry.sequenceNumber != j2) {
                    MethodCollector.o(1186);
                    return null;
                }
            } else if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                this.journalWriter.write("DIRTY " + str + '\n');
                this.journalWriter.flush();
                MethodCollector.o(1186);
                return editor;
            }
            if (entry.currentEditor != null) {
                MethodCollector.o(1186);
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            this.journalWriter.write("DIRTY " + str + '\n');
            this.journalWriter.flush();
            MethodCollector.o(1186);
            return editor2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.o(1186);
        throw illegalArgumentException;
    }

    public final synchronized void completeEdit(Editor editor, boolean z) {
        String str;
        MethodCollector.i(1206);
        Entry entry = editor.entry;
        StringBuilder sb = new StringBuilder("completeEdit start, key: ");
        if (entry == null) {
            str = "null";
        } else {
            str = entry.key;
        }
        EPLog.d("DiskLruCache", sb.append(str).append(", success: ").append(z).toString());
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i2 = 0; i2 < this.valueCount; i2++) {
                    if (!editor.written[i2]) {
                        editor.abort();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        MethodCollector.o(1206);
                        throw illegalStateException;
                    } else if (!entry.getDirtyFile(i2).exists()) {
                        editor.abort();
                        MethodCollector.o(1206);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.valueCount; i3++) {
                File dirtyFile = entry.getDirtyFile(i3);
                if (!z) {
                    deleteIfExists(dirtyFile);
                } else if (dirtyFile.exists()) {
                    File cleanFile = entry.getCleanFile(i3);
                    dirtyFile.renameTo(cleanFile);
                    long j2 = entry.lengths[i3];
                    long length = cleanFile.length();
                    entry.lengths[i3] = length;
                    this.size = (this.size - j2) + length;
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                if (z) {
                    long j3 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j3;
                    entry.sequenceNumber = j3;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.write("REMOVE " + entry.key + '\n');
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.o(1206);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.o(1206);
        throw illegalStateException2;
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.i(1160);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.o(1160);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.o(1160);
        throw iOException;
    }

    private DiskLruCache(File file, int i2, int i3, long j2) {
        this.directory = file;
        this.appVersion = i2;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i3;
        this.maxSize = j2;
    }

    public static synchronized DiskLruCache open(File file, int i2, int i3, long j2, IAllowListRule iAllowListRule) {
        synchronized (DiskLruCache.class) {
            MethodCollector.i(1095);
            if (j2 <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("maxSize <= 0");
                MethodCollector.o(1095);
                throw illegalArgumentException;
            } else if (i3 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                    } else {
                        renameTo(file2, file3, false);
                    }
                }
                DiskLruCache diskLruCache = new DiskLruCache(file, i2, i3, j2);
                if (diskLruCache.journalFile.exists()) {
                    try {
                        diskLruCache.readJournal();
                        diskLruCache.processJournal();
                        MethodCollector.o(1095);
                        return diskLruCache;
                    } catch (IOException e2) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        diskLruCache.delete();
                    }
                }
                file.mkdirs();
                DiskLruCache diskLruCache2 = new DiskLruCache(file, i2, i3, j2);
                diskLruCache2.rebuildJournal();
                if (iAllowListRule != null) {
                    diskLruCache2.mAllowKeyRule = iAllowListRule;
                }
                MethodCollector.o(1095);
                return diskLruCache2;
            } else {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("valueCount <= 0");
                MethodCollector.o(1095);
                throw illegalArgumentException2;
            }
        }
    }
}
