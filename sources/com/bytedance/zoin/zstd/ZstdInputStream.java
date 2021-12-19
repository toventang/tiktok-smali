package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.zoin.zstd.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private static final int srcBuffSize = ((int) recommendedDInSize());
    private long dstPos;
    private boolean finalize = true;
    private boolean frameFinished = true;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead = true;
    private byte[] src = new byte[srcBuffSize];
    private long srcPos;
    private long srcSize;
    private final long stream;

    private static native long createDStream();

    private native int decompressStream(long j2, byte[] bArr, int i2, byte[] bArr2, int i3);

    private static native int freeDStream(long j2);

    private native int initDStream(long j2);

    private static native long recommendedDInSize();

    private static native long recommendedDOutSize();

    public boolean markSupported() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (this.finalize) {
            close();
        }
    }

    public synchronized boolean getContinuous() {
        boolean z;
        MethodCollector.i(1780);
        z = this.isContinuous;
        MethodCollector.o(1780);
        return z;
    }

    static {
        MethodCollector.i(2153);
        Covode.recordClassIndex(28282);
        a.a();
        MethodCollector.o(2153);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        MethodCollector.i(1864);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.o(1864);
            throw iOException;
        } else if (!this.needRead) {
            MethodCollector.o(1864);
            return 1;
        } else {
            int available = this.in.available();
            MethodCollector.o(1864);
            return available;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public synchronized void close() {
        MethodCollector.i(1867);
        if (this.isClosed) {
            MethodCollector.o(1867);
            return;
        }
        freeDStream(this.stream);
        this.in.close();
        this.isClosed = true;
        MethodCollector.o(1867);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int readInternal;
        MethodCollector.i(1861);
        byte[] bArr = new byte[1];
        while (true) {
            readInternal = readInternal(bArr, 0, 1);
            if (readInternal != 0) {
                break;
            }
        }
        if (readInternal == 1) {
            int i2 = bArr[0] & 255;
            MethodCollector.o(1861);
            return i2;
        }
        MethodCollector.o(1861);
        return -1;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public synchronized ZstdInputStream setContinuous(boolean z) {
        MethodCollector.i(1779);
        this.isContinuous = z;
        MethodCollector.o(1779);
        return this;
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        MethodCollector.i(1313);
        synchronized (this) {
            try {
                long createDStream = createDStream();
                this.stream = createDStream;
                initDStream(createDStream);
            } finally {
                MethodCollector.o(1313);
            }
        }
    }

    public synchronized ZstdInputStream setDict(byte[] bArr) {
        MethodCollector.i(1785);
        long loadDictDecompress = (long) Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (!Zstd.isError(loadDictDecompress)) {
            MethodCollector.o(1785);
        } else {
            IOException iOException = new IOException("Decompression error: " + Zstd.getErrorName(loadDictDecompress));
            MethodCollector.o(1785);
            throw iOException;
        }
        return this;
    }

    public synchronized ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        int i2;
        MethodCollector.i(1801);
        do {
            i2 = zstdDictDecompress.f46315b;
            if (i2 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("Closed");
                MethodCollector.o(1801);
                throw illegalStateException;
            } else if (i2 == Integer.MAX_VALUE) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Shared lock overflow");
                MethodCollector.o(1801);
                throw illegalStateException2;
            }
        } while (!a.f46314a.compareAndSet(zstdDictDecompress, i2, i2 + 1));
        try {
            long loadFastDictDecompress = (long) Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(loadFastDictDecompress)) {
                IOException iOException = new IOException("Decompression error: " + Zstd.getErrorName(loadFastDictDecompress));
                MethodCollector.o(1801);
                throw iOException;
            }
        } finally {
            zstdDictDecompress.a();
            MethodCollector.o(1801);
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) {
        int read;
        MethodCollector.i(1866);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.o(1866);
            throw iOException;
        } else if (j2 <= 0) {
            MethodCollector.o(1866);
            return 0;
        } else {
            int min = (int) Math.min(recommendedDOutSize(), j2);
            byte[] bArr = new byte[min];
            long j3 = j2;
            while (j3 > 0 && (read = read(bArr, 0, (int) Math.min((long) min, j3))) >= 0) {
                j3 -= (long) read;
            }
            long j4 = j2 - j3;
            MethodCollector.o(1866);
            return j4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int readInternal;
        MethodCollector.i(1815);
        if (i2 < 0 || i3 > bArr.length - i2) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Requested lenght " + i3 + " from offset " + i2 + " in buffer of size " + bArr.length);
            MethodCollector.o(1815);
            throw indexOutOfBoundsException;
        } else if (i3 == 0) {
            MethodCollector.o(1815);
            return 0;
        } else {
            do {
                readInternal = readInternal(bArr, i2, i3);
            } while (readInternal == 0);
            MethodCollector.o(1815);
            return readInternal;
        }
    }

    /* access modifiers changed from: package-private */
    public int readInternal(byte[] bArr, int i2, int i3) {
        long j2;
        int i4 = 1858;
        MethodCollector.i(1858);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.o(1858);
            throw iOException;
        } else if (i2 < 0 || i3 > bArr.length - i2) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Requested lenght " + i3 + " from offset " + i2 + " in buffer of size " + bArr.length);
            MethodCollector.o(1858);
            throw indexOutOfBoundsException;
        } else {
            int i5 = i2 + i3;
            long j3 = (long) i2;
            this.dstPos = j3;
            long j4 = -1;
            while (true) {
                j2 = this.dstPos;
                long j5 = (long) i5;
                if (j2 >= j5 || j4 >= j2) {
                    int i6 = (int) (j2 - j3);
                    MethodCollector.o(1858);
                } else {
                    boolean z = false;
                    if (this.needRead && (this.in.available() > 0 || this.dstPos == j3)) {
                        long read = (long) this.in.read(this.src, 0, srcBuffSize);
                        this.srcSize = read;
                        this.srcPos = 0;
                        if (read < 0) {
                            this.srcSize = 0;
                            if (this.frameFinished) {
                                MethodCollector.o(i4);
                                return -1;
                            } else if (this.isContinuous) {
                                int i7 = (int) (this.dstPos - j3);
                                MethodCollector.o(i4);
                                return i7;
                            } else {
                                IOException iOException2 = new IOException("Read error or truncated source");
                                MethodCollector.o(i4);
                                throw iOException2;
                            }
                        } else {
                            this.frameFinished = false;
                        }
                    }
                    j4 = this.dstPos;
                    int decompressStream = decompressStream(this.stream, bArr, i5, this.src, (int) this.srcSize);
                    long j6 = (long) decompressStream;
                    if (Zstd.isError(j6)) {
                        IOException iOException3 = new IOException("Decompression error: " + Zstd.getErrorName(j6));
                        MethodCollector.o(1858);
                        throw iOException3;
                    } else if (decompressStream == 0) {
                        this.frameFinished = true;
                        if (this.srcPos == this.srcSize) {
                            z = true;
                        }
                        this.needRead = z;
                        int i8 = (int) (this.dstPos - j3);
                        MethodCollector.o(1858);
                        return i8;
                    } else {
                        if (this.dstPos < j5) {
                            z = true;
                        }
                        this.needRead = z;
                        i4 = 1858;
                    }
                }
            }
            int i62 = (int) (j2 - j3);
            MethodCollector.o(1858);
            return i62;
        }
    }
}
