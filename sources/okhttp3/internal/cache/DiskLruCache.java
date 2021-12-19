package okhttp3.internal.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.aa;
import k.g;
import k.h;
import k.q;
import k.y;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106204);
        }

        public void run() {
            boolean z;
            MethodCollector.i(475);
            synchronized (DiskLruCache.this) {
                try {
                    if (!DiskLruCache.this.initialized) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !DiskLruCache.this.closed) {
                        try {
                            DiskLruCache.this.trimToSize();
                        } catch (IOException unused) {
                            DiskLruCache.this.mostRecentTrimFailed = true;
                        }
                        try {
                            if (DiskLruCache.this.journalRebuildRequired()) {
                                DiskLruCache.this.rebuildJournal();
                                DiskLruCache.this.redundantOpCount = 0;
                            }
                        } catch (IOException unused2) {
                            DiskLruCache.this.mostRecentRebuildFailed = true;
                            DiskLruCache.this.journalWriter = q.a(q.a());
                        }
                        MethodCollector.o(475);
                    }
                } finally {
                    MethodCollector.o(475);
                }
            }
        }
    };
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    g journalWriter;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    private long nextSequenceNumber = 0;
    int redundantOpCount;
    private long size;
    final int valueCount;

    public final class Snapshot implements Closeable {
        public final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final aa[] sources;

        static {
            Covode.recordClassIndex(106210);
        }

        public final String key() {
            return this.key;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (aa aaVar : this.sources) {
                Util.closeQuietly(aaVar);
            }
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i2) {
            return this.lengths[i2];
        }

        public final aa getSource(int i2) {
            return this.sources[i2];
        }

        Snapshot(String str, long j2, aa[] aaVarArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j2;
            this.sources = aaVarArr;
            this.lengths = jArr;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    static {
        Covode.recordClassIndex(106203);
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final synchronized long getMaxSize() {
        long j2;
        MethodCollector.i(94);
        j2 = this.maxSize;
        MethodCollector.o(94);
        return j2;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        MethodCollector.i(101);
        z = this.closed;
        MethodCollector.o(101);
        return z;
    }

    private synchronized void checkNotClosed() {
        MethodCollector.i(103);
        if (!isClosed()) {
            MethodCollector.o(103);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("cache is closed");
            MethodCollector.o(103);
            throw illegalStateException;
        }
    }

    private g newJournalWriter() {
        return q.a(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass2 */
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Covode.recordClassIndex(106205);
            }

            /* access modifiers changed from: protected */
            @Override // okhttp3.internal.cache.FaultHidingSink
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        if (i2 < 2000 || i2 < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized long size() {
        long j2;
        MethodCollector.i(96);
        initialize();
        j2 = this.size;
        MethodCollector.o(96);
        return j2;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        AnonymousClass3 r0;
        MethodCollector.i(3266);
        initialize();
        r0 = new Iterator<Snapshot>() {
            /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass3 */
            final Iterator<Entry> delegate;
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            static {
                Covode.recordClassIndex(106206);
            }

            @Override // java.util.Iterator
            public Snapshot next() {
                if (hasNext()) {
                    Snapshot snapshot = this.nextSnapshot;
                    this.removeSnapshot = snapshot;
                    this.nextSnapshot = null;
                    return snapshot;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } finally {
                        this.removeSnapshot = null;
                    }
                } else {
                    throw new IllegalStateException("remove() before next()");
                }
            }

            public boolean hasNext() {
                Snapshot snapshot;
                MethodCollector.i(5573);
                if (this.nextSnapshot != null) {
                    MethodCollector.o(5573);
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    try {
                        if (DiskLruCache.this.closed) {
                            return false;
                        }
                        while (this.delegate.hasNext()) {
                            Entry next = this.delegate.next();
                            if (next.readable && (snapshot = next.snapshot()) != null) {
                                this.nextSnapshot = snapshot;
                                MethodCollector.o(5573);
                                return true;
                            }
                        }
                        MethodCollector.o(5573);
                        return false;
                    } finally {
                        MethodCollector.o(5573);
                    }
                }
            }

            {
                this.delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            }
        };
        MethodCollector.o(3266);
        return r0;
    }

    /* access modifiers changed from: package-private */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        static {
            Covode.recordClassIndex(106207);
        }

        public final void abort() {
            MethodCollector.i(5845);
            synchronized (DiskLruCache.this) {
                try {
                    if (!this.done) {
                        if (this.entry.currentEditor == this) {
                            DiskLruCache.this.completeEdit(this, false);
                        }
                        this.done = true;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(5845);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(5845);
                }
            }
        }

        public final void abortUnlessCommitted() {
            MethodCollector.i(5909);
            synchronized (DiskLruCache.this) {
                try {
                    if (!this.done && this.entry.currentEditor == this) {
                        try {
                            DiskLruCache.this.completeEdit(this, false);
                        } catch (IOException unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(5909);
                }
            }
        }

        public final void commit() {
            MethodCollector.i(5841);
            synchronized (DiskLruCache.this) {
                try {
                    if (!this.done) {
                        if (this.entry.currentEditor == this) {
                            DiskLruCache.this.completeEdit(this, true);
                        }
                        this.done = true;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(5841);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(5841);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void detach() {
            if (this.entry.currentEditor == this) {
                for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                    try {
                        DiskLruCache.this.fileSystem.delete(this.entry.dirtyFiles[i2]);
                    } catch (IOException unused) {
                    }
                }
                this.entry.currentEditor = null;
            }
        }

        public final y newSink(int i2) {
            MethodCollector.i(5694);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.done) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(5694);
                        throw illegalStateException;
                    } else if (this.entry.currentEditor != this) {
                        return q.a();
                    } else {
                        if (!this.entry.readable) {
                            this.written[i2] = true;
                        }
                        try {
                            AnonymousClass1 r0 = new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i2])) {
                                /* class okhttp3.internal.cache.DiskLruCache.Editor.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(106208);
                                }

                                /* access modifiers changed from: protected */
                                @Override // okhttp3.internal.cache.FaultHidingSink
                                public void onException(IOException iOException) {
                                    MethodCollector.i(5539);
                                    synchronized (DiskLruCache.this) {
                                        try {
                                            Editor.this.detach();
                                        } finally {
                                            MethodCollector.o(5539);
                                        }
                                    }
                                }
                            };
                            MethodCollector.o(5694);
                            return r0;
                        } catch (FileNotFoundException unused) {
                            y a2 = q.a();
                            MethodCollector.o(5694);
                            return a2;
                        }
                    }
                } finally {
                    MethodCollector.o(5694);
                }
            }
        }

        public final aa newSource(int i2) {
            MethodCollector.i(5590);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.done) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(5590);
                        throw illegalStateException;
                    } else if (!this.entry.readable || this.entry.currentEditor != this) {
                        return null;
                    } else {
                        try {
                            aa source = DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i2]);
                            MethodCollector.o(5590);
                            return source;
                        } catch (FileNotFoundException unused) {
                            MethodCollector.o(5590);
                            return null;
                        }
                    }
                } finally {
                    MethodCollector.o(5590);
                }
            }
        }

        Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }
    }

    public final synchronized void evictAll() {
        MethodCollector.i(113);
        initialize();
        for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
        MethodCollector.o(113);
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        MethodCollector.i(105);
        if (!this.initialized) {
            MethodCollector.o(105);
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
        MethodCollector.o(105);
    }

    /* access modifiers changed from: package-private */
    public final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        static {
            Covode.recordClassIndex(106209);
        }

        /* access modifiers changed from: package-private */
        public final Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                aa[] aaVarArr = new aa[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i2 = 0;
                for (int i3 = 0; i3 < DiskLruCache.this.valueCount; i3++) {
                    try {
                        aaVarArr[i3] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i3]);
                    } catch (FileNotFoundException unused) {
                        while (i2 < DiskLruCache.this.valueCount && aaVarArr[i2] != null) {
                            Util.closeQuietly(aaVarArr[i2]);
                            i2++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, aaVarArr, jArr);
            }
            throw new AssertionError();
        }

        private IOException invalidLengths(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public final void writeLengths(g gVar) {
            for (long j2 : this.lengths) {
                gVar.a(32).b(j2);
            }
        }

        /* access modifiers changed from: package-private */
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

        Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                append.append(i2);
                this.cleanFiles[i2] = new File(DiskLruCache.this.directory, append.toString());
                append.append(".tmp");
                this.dirtyFiles[i2] = new File(DiskLruCache.this.directory, append.toString());
                append.setLength(length);
            }
        }
    }

    private void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
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
                    this.fileSystem.delete(next.cleanFiles[i2]);
                    this.fileSystem.delete(next.dirtyFiles[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(107);
        if (!this.initialized || this.closed) {
            this.closed = true;
            MethodCollector.o(107);
            return;
        }
        Entry[] entryArr = (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()]);
        for (Entry entry : entryArr) {
            if (entry.currentEditor != null) {
                entry.currentEditor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
        this.closed = true;
        MethodCollector.o(107);
    }

    private void readJournal() {
        h a2 = q.a(this.fileSystem.source(this.journalFile));
        try {
            String s = a2.s();
            String s2 = a2.s();
            String s3 = a2.s();
            String s4 = a2.s();
            String s5 = a2.s();
            if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(this.appVersion).equals(s3) || !Integer.toString(this.valueCount).equals(s4) || !"".equals(s5)) {
                throw new IOException("unexpected journal header: [" + s + ", " + s2 + ", " + s4 + ", " + s5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    readJournalLine(a2.s());
                    i2++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i2 - this.lruEntries.size();
                    if (!a2.e()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = newJournalWriter();
                    }
                    return;
                }
            }
        } finally {
            Util.closeQuietly(a2);
        }
    }

    public final synchronized void initialize() {
        MethodCollector.i(1325);
        if (this.initialized) {
            MethodCollector.o(1325);
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                MethodCollector.o(1325);
                return;
            } catch (IOException e2) {
                Platform.get().log(5, "DiskLruCache " + this.directory + " is corrupt: " + e2.getMessage() + ", removing", e2);
                delete();
                this.closed = false;
            } catch (Throwable th) {
                this.closed = false;
                MethodCollector.o(1325);
                throw th;
            }
        }
        rebuildJournal();
        this.initialized = true;
        MethodCollector.o(1325);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void rebuildJournal() {
        MethodCollector.i(1357);
        g gVar = this.journalWriter;
        if (gVar != null) {
            gVar.close();
        }
        g a2 = q.a(this.fileSystem.sink(this.journalFileTmp));
        try {
            a2.a("libcore.io.DiskLruCache").a(10);
            a2.a("1").a(10);
            a2.b((long) this.appVersion).a(10);
            a2.b((long) this.valueCount).a(10);
            a2.a(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    a2.a("DIRTY").a(32);
                    a2.a(entry.key);
                    a2.a(10);
                } else {
                    a2.a("CLEAN").a(32);
                    a2.a(entry.key);
                    entry.writeLengths(a2);
                    a2.a(10);
                }
            }
            a2.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
            MethodCollector.o(1357);
        } catch (Throwable th) {
            a2.close();
            MethodCollector.o(1357);
            throw th;
        }
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    public final synchronized void setMaxSize(long j2) {
        MethodCollector.i(95);
        this.maxSize = j2;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
        MethodCollector.o(95);
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final synchronized boolean remove(String str) {
        MethodCollector.i(100);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            MethodCollector.o(100);
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        MethodCollector.o(100);
        return removeEntry;
    }

    public final synchronized Snapshot get(String str) {
        MethodCollector.i(1362);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null || !entry.readable) {
            MethodCollector.o(1362);
            return null;
        }
        Snapshot snapshot = entry.snapshot();
        if (snapshot == null) {
            MethodCollector.o(1362);
            return null;
        }
        this.redundantOpCount++;
        this.journalWriter.a("READ").a(32).a(str).a(10);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        MethodCollector.o(1362);
        return snapshot;
    }

    /* access modifiers changed from: package-private */
    public final boolean removeEntry(Entry entry) {
        if (entry.currentEditor != null) {
            entry.currentEditor.detach();
        }
        for (int i2 = 0; i2 < this.valueCount; i2++) {
            this.fileSystem.delete(entry.cleanFiles[i2]);
            this.size -= entry.lengths[i2];
            entry.lengths[i2] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.a("REMOVE").a(32).a(entry.key).a(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r4 == -1) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournalLine(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void completeEdit(Editor editor, boolean z) {
        MethodCollector.i(99);
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i2 = 0; i2 < this.valueCount; i2++) {
                    if (!editor.written[i2]) {
                        editor.abort();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        MethodCollector.o(99);
                        throw illegalStateException;
                    } else if (!this.fileSystem.exists(entry.dirtyFiles[i2])) {
                        editor.abort();
                        MethodCollector.o(99);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.valueCount; i3++) {
                File file = entry.dirtyFiles[i3];
                if (!z) {
                    this.fileSystem.delete(file);
                } else if (this.fileSystem.exists(file)) {
                    File file2 = entry.cleanFiles[i3];
                    this.fileSystem.rename(file, file2);
                    long j2 = entry.lengths[i3];
                    long size2 = this.fileSystem.size(file2);
                    entry.lengths[i3] = size2;
                    this.size = (this.size - j2) + size2;
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                this.journalWriter.a("CLEAN").a(32);
                this.journalWriter.a(entry.key);
                entry.writeLengths(this.journalWriter);
                this.journalWriter.a(10);
                if (z) {
                    long j3 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j3;
                    entry.sequenceNumber = j3;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.a("REMOVE").a(32);
                this.journalWriter.a(entry.key);
                this.journalWriter.a(10);
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            MethodCollector.o(99);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.o(99);
        throw illegalStateException2;
    }

    public static DiskLruCache create(FileSystem fileSystem2, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new DiskLruCache(fileSystem2, file, i2, i3, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    DiskLruCache(FileSystem fileSystem2, File file, int i2, int i3, long j2, Executor executor2) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i2;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i3;
        this.maxSize = j2;
        this.executor = executor2;
    }
}
