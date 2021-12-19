package com.bytedance.boost_multidex;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* access modifiers changed from: package-private */
public class Locker {
    private FileLock cacheLock;
    private FileChannel lockChannel;
    private File lockFile;
    private RandomAccessFile lockRaf;

    static {
        Covode.recordClassIndex(15651);
    }

    Locker(File file) {
        this.lockFile = file;
    }

    /* access modifiers changed from: package-private */
    public void close() {
        FileLock fileLock = this.cacheLock;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        Monitor.get().logInfo("Released lock " + this.lockFile.getPath());
        Utility.closeQuietly(this.lockChannel);
        Utility.closeQuietly(this.lockRaf);
    }

    /* access modifiers changed from: package-private */
    public void lock() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.lockFile, "rw");
        this.lockRaf = randomAccessFile;
        try {
            this.lockChannel = randomAccessFile.getChannel();
            try {
                Monitor.get().logInfo("Blocking on lock " + this.lockFile.getPath());
                this.cacheLock = this.lockChannel.lock();
                Monitor.get().logInfo("Acquired on lock " + this.lockFile.getPath());
            } catch (IOException e2) {
                Utility.closeQuietly(this.lockChannel);
                throw e2;
            }
        } catch (IOException e3) {
            Utility.closeQuietly(this.lockRaf);
            throw e3;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        com.bytedance.boost_multidex.Monitor.get().logInfo("Acquired on lock " + r5.lockFile.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.bytedance.boost_multidex.Monitor.get().logInfo("Aborting on lock " + r5.lockFile.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        r2 = com.bytedance.boost_multidex.Monitor.get();
        r1 = new java.lang.StringBuilder("Acquired on lock ");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean test() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Locker.test():boolean");
    }
}
