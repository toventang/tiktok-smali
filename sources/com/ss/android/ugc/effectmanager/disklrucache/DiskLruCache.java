package com.ss.android.ugc.effectmanager.disklrucache;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
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
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

public final class DiskLruCache implements Closeable {
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
        /* class com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.AnonymousClass2 */

        static {
            Covode.recordClassIndex(95355);
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
        }

        {
            MethodCollector.i(991);
            MethodCollector.o(991);
        }
    };
    private final int appVersion;
    private final Callable<Void> cleanupCallable = new Callable<Void>() {
        /* class com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95354);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            boolean z;
            MethodCollector.i(808);
            synchronized (DiskLruCache.this) {
                try {
                    if (!DiskLruCache.this.initialized) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || DiskLruCache.this.closed) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    MethodCollector.o(808);
                    return null;
                } finally {
                    MethodCollector.o(808);
                }
            }
        }
    };
    public boolean closed;
    public final File directory;
    final ExecutorService executorService = com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
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
            Covode.recordClassIndex(95356);
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
                Covode.recordClassIndex(95357);
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
                MethodCollector.i(812);
                try {
                    this.out.write(i2);
                    MethodCollector.o(812);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.o(812);
                }
            }

            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.i(810);
                MethodCollector.o(810);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i2, int i3) {
                MethodCollector.i(813);
                try {
                    this.out.write(bArr, i2, i3);
                    MethodCollector.o(813);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.o(813);
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
            MethodCollector.i(736);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(736);
                        throw illegalStateException;
                    } else if (!this.entry.readable) {
                        return null;
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i2));
                            MethodCollector.o(736);
                            return fileInputStream;
                        } catch (FileNotFoundException unused) {
                            MethodCollector.o(736);
                            return null;
                        }
                    }
                } finally {
                    MethodCollector.o(736);
                }
            }
        }

        public final OutputStream newOutputStream(int i2) {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            MethodCollector.i(743);
            if (i2 < 0 || i2 >= DiskLruCache.this.valueCount) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index " + i2 + " to be greater than 0 and less than the maximum value count of " + DiskLruCache.this.valueCount);
                MethodCollector.o(743);
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
                                MethodCollector.o(743);
                                return outputStream;
                            }
                        }
                        faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(743);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(743);
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
            MethodCollector.i(746);
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i2), Util.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    Util.closeQuietly(outputStreamWriter2);
                    MethodCollector.o(746);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    Util.closeQuietly(outputStreamWriter);
                    MethodCollector.o(746);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                Util.closeQuietly(outputStreamWriter);
                MethodCollector.o(746);
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
            Covode.recordClassIndex(95359);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
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
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void delete() {
        close();
        Util.deleteContents(this.directory);
    }

    public final synchronized long getMaxSize() {
        long j2;
        MethodCollector.i(1558);
        j2 = this.maxSize;
        MethodCollector.o(1558);
        return j2;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        MethodCollector.i(1644);
        z = this.closed;
        MethodCollector.o(1644);
        return z;
    }

    /* access modifiers changed from: package-private */
    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        static {
            Covode.recordClassIndex(95358);
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
        Covode.recordClassIndex(95353);
    }

    public static ExecutorService com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    public final boolean isValid() {
        File file = this.directory;
        if (file == null || !file.exists() || !this.journalFile.exists()) {
            return false;
        }
        return true;
    }

    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        if (i2 < 2000 || i2 < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized long size() {
        long j2;
        MethodCollector.i(1560);
        initialize();
        j2 = this.size;
        MethodCollector.o(1560);
        return j2;
    }

    public final synchronized void flush() {
        MethodCollector.i(1646);
        if (!this.initialized) {
            MethodCollector.o(1646);
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
        MethodCollector.o(1646);
    }

    public final Set<String> getLruEntryKeys() {
        Set<String> unmodifiableSet;
        MethodCollector.i(1697);
        synchronized (this) {
            try {
                initialize();
                unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
            } finally {
                MethodCollector.o(1697);
            }
        }
        return unmodifiableSet;
    }

    public final synchronized void trimToSize() {
        MethodCollector.i(1653);
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
        MethodCollector.o(1653);
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
        MethodCollector.i(1649);
        if (!this.initialized || this.closed) {
            this.closed = true;
            MethodCollector.o(1649);
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
        this.closed = true;
        MethodCollector.o(1649);
    }

    private void readJournal() {
        MethodCollector.i(1418);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                IOException iOException = new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
                MethodCollector.o(1418);
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
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
                    }
                    return;
                }
            }
        } finally {
            Util.closeQuietly(strictLineReader);
            MethodCollector.o(1418);
        }
    }

    public final synchronized void initialize() {
        MethodCollector.i(1366);
        if (this.initialized) {
            MethodCollector.o(1366);
            return;
        }
        if (this.journalFileBackup.exists()) {
            if (!this.journalFile.exists()) {
                renameTo(this.journalFileBackup, this.journalFile, false);
            } else if (com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.journalFileBackup) && this.journalFileBackup.exists()) {
                IOException iOException = new IOException("failed to delete " + this.journalFileBackup);
                MethodCollector.o(1366);
                throw iOException;
            }
        }
        if (this.journalFile.exists()) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                MethodCollector.o(1366);
                return;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + this.directory + " is corrupt: " + e2.getMessage() + ", removing");
                delete();
                this.closed = false;
            } catch (Throwable th) {
                this.closed = false;
                MethodCollector.o(1366);
                throw th;
            }
        }
        rebuildJournal();
        this.initialized = true;
        MethodCollector.o(1366);
    }

    public final synchronized void rebuildJournal() {
        FileOutputStream fileOutputStream;
        MethodCollector.i(1530);
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        try {
            fileOutputStream = new FileOutputStream(this.journalFileTmp);
        } catch (FileNotFoundException unused) {
            this.journalFileTmp.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(this.journalFileTmp);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, Util.US_ASCII));
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
            com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.journalFileBackup);
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            MethodCollector.o(1530);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.o(1530);
            throw th;
        }
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    public static String inputStreamToString(InputStream inputStream) {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
            throw new IOException();
        }
    }

    public final synchronized void setMaxSize(long j2) {
        MethodCollector.i(1559);
        this.maxSize = j2;
        if (this.initialized) {
            this.executorService.submit(this.cleanupCallable);
        }
        MethodCollector.o(1559);
    }

    public static boolean com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(1392);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1392);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1392);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r5 == -1) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournalLine(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    public final synchronized Snapshot get(String str) {
        MethodCollector.i(1543);
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.o(1543);
                return null;
            } else if (!entry.readable) {
                MethodCollector.o(1543);
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
                            Util.closeQuietly(inputStreamArr[i3]);
                            i3++;
                        }
                        MethodCollector.o(1543);
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
                MethodCollector.o(1543);
                return snapshot;
            }
        } else {
            remove(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.o(1543);
            throw illegalArgumentException;
        }
    }

    public final synchronized boolean remove(String str) {
        MethodCollector.i(1639);
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null || entry.currentEditor != null) {
                MethodCollector.o(1639);
                return false;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File cleanFile = entry.getCleanFile(i2);
                if (!cleanFile.exists() || com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete(cleanFile)) {
                    this.size -= entry.lengths[i2];
                    entry.lengths[i2] = 0;
                } else {
                    IOException iOException = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                    MethodCollector.o(1639);
                    throw iOException;
                }
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.o(1639);
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.o(1639);
        throw illegalArgumentException;
    }

    public final synchronized Editor edit(String str, long j2) {
        MethodCollector.i(1557);
        initialize();
        checkNotClosed();
        validateKey(str);
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j2 != -1) {
                if (entry == null || entry.sequenceNumber != j2) {
                    MethodCollector.o(1557);
                    return null;
                }
            } else if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                this.journalWriter.write("DIRTY " + str + '\n');
                this.journalWriter.flush();
                MethodCollector.o(1557);
                return editor;
            }
            if (entry.currentEditor != null) {
                MethodCollector.o(1557);
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            this.journalWriter.write("DIRTY " + str + '\n');
            this.journalWriter.flush();
            MethodCollector.o(1557);
            return editor2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.o(1557);
        throw illegalArgumentException;
    }

    public final synchronized void completeEdit(Editor editor, boolean z) {
        MethodCollector.i(1615);
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i2 = 0; i2 < this.valueCount; i2++) {
                    if (!editor.written[i2]) {
                        editor.abort();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        MethodCollector.o(1615);
                        throw illegalStateException;
                    } else if (!entry.getDirtyFile(i2).exists()) {
                        editor.abort();
                        MethodCollector.o(1615);
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
            MethodCollector.o(1615);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.o(1615);
        throw illegalStateException2;
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.i(1535);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.o(1535);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.o(1535);
        throw iOException;
    }

    public static DiskLruCache open(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new DiskLruCache(file, i2, i3, j2);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
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
}
