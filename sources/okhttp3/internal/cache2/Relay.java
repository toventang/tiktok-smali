package okhttp3.internal.cache2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import k.aa;
import k.ab;
import k.f;
import k.i;
import okhttp3.internal.Util;

final class Relay {
    static final i PREFIX_CLEAN = i.encodeUtf8("OkHttp cache v1\n");
    static final i PREFIX_DIRTY = i.encodeUtf8("OkHttp DIRTY :(\n");
    final f buffer = new f();
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final i metadata;
    int sourceCount;
    aa upstream;
    final f upstreamBuffer = new f();
    long upstreamPos;
    Thread upstreamReader;

    class RelaySource implements aa {
        private FileOperator fileOperator;
        private long sourcePos;
        private final ab timeout = new ab();

        static {
            Covode.recordClassIndex(106215);
        }

        @Override // k.aa
        public ab timeout() {
            return this.timeout;
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MethodCollector.i(5582);
            if (this.fileOperator == null) {
                MethodCollector.o(5582);
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                try {
                    Relay relay = Relay.this;
                    relay.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile2 = Relay.this.file;
                        Relay.this.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                } finally {
                    MethodCollector.o(5582);
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            r0 = 2;
         */
        @Override // k.aa
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(k.f r25, long r26) {
            /*
            // Method dump skipped, instructions count: 358
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(k.f, long):long");
        }
    }

    public final i metadata() {
        return this.metadata;
    }

    /* access modifiers changed from: package-private */
    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(106214);
    }

    public final aa newSource() {
        MethodCollector.i(5971);
        synchronized (this) {
            try {
                if (this.file == null) {
                    return null;
                }
                this.sourceCount++;
                RelaySource relaySource = new RelaySource();
                MethodCollector.o(5971);
                return relaySource;
            } finally {
                MethodCollector.o(5971);
            }
        }
    }

    private void writeMetadata(long j2) {
        f fVar = new f();
        fVar.a(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j2, fVar, (long) this.metadata.size());
    }

    /* access modifiers changed from: package-private */
    public final void commit(long j2) {
        MethodCollector.i(5793);
        writeMetadata(j2);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j2, (long) this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            try {
                this.complete = true;
            } catch (Throwable th) {
                MethodCollector.o(5793);
                throw th;
            }
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
        MethodCollector.o(5793);
    }

    public static Relay read(File file2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        f fVar = new f();
        fileOperator.read(0, fVar, 32);
        i iVar = PREFIX_CLEAN;
        if (fVar.g((long) iVar.size()).equals(iVar)) {
            long k2 = fVar.k();
            long k3 = fVar.k();
            f fVar2 = new f();
            fileOperator.read(k2 + 32, fVar2, k3);
            return new Relay(randomAccessFile, null, k2, fVar2.q(), 0);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(i iVar, long j2, long j3) {
        f fVar = new f();
        fVar.a(iVar);
        fVar.m(j2);
        fVar.m(j3);
        if (fVar.f158864b == 32) {
            new FileOperator(this.file.getChannel()).write(0, fVar, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Relay edit(File file2, aa aaVar, i iVar, long j2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        Relay relay = new Relay(randomAccessFile, aaVar, 0, iVar, j2);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    private Relay(RandomAccessFile randomAccessFile, aa aaVar, long j2, i iVar, long j3) {
        boolean z;
        this.file = randomAccessFile;
        this.upstream = aaVar;
        if (aaVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.complete = z;
        this.upstreamPos = j2;
        this.metadata = iVar;
        this.bufferMaxSize = j3;
    }
}
