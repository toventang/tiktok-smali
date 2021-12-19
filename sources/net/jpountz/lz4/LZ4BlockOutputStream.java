package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public final class LZ4BlockOutputStream extends FilterOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int HEADER_LENGTH = 21;
    static final byte[] MAGIC = {76, 90, 52, 66, 108, 111, 99, 107};
    static final int MAGIC_LENGTH = 8;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;
    private int o;
    private final boolean syncFlush;

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    static {
        Covode.recordClassIndex(105980);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        if (!this.finished) {
            finish();
        }
        if (this.out != null) {
            this.out.close();
            this.out = null;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public final void flush() {
        if (this.out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            this.out.flush();
        }
    }

    public final void finish() {
        MethodCollector.i(4484);
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i2 = MAGIC_LENGTH;
        bArr[i2] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i2 + 1);
        writeIntLE(0, this.compressedBuffer, i2 + 5);
        writeIntLE(0, this.compressedBuffer, i2 + 9);
        this.out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        this.out.flush();
        MethodCollector.o(4484);
    }

    private void flushBufferedData() {
        int i2;
        MethodCollector.i(4474);
        if (this.o == 0) {
            MethodCollector.o(4474);
            return;
        }
        this.checksum.reset();
        this.checksum.update(this.buffer, 0, this.o);
        int value = (int) this.checksum.getValue();
        LZ4Compressor lZ4Compressor = this.compressor;
        byte[] bArr = this.buffer;
        int i3 = this.o;
        byte[] bArr2 = this.compressedBuffer;
        int i4 = HEADER_LENGTH;
        int compress = lZ4Compressor.compress(bArr, 0, i3, bArr2, i4);
        int i5 = this.o;
        if (compress >= i5) {
            i2 = 16;
            System.arraycopy(this.buffer, 0, this.compressedBuffer, i4, i5);
        } else {
            i5 = compress;
            i2 = 32;
        }
        byte[] bArr3 = this.compressedBuffer;
        int i6 = MAGIC_LENGTH;
        bArr3[i6] = (byte) (i2 | this.compressionLevel);
        writeIntLE(i5, bArr3, i6 + 1);
        writeIntLE(this.o, this.compressedBuffer, i6 + 5);
        writeIntLE(value, this.compressedBuffer, i6 + 9);
        this.out.write(this.compressedBuffer, 0, i4 + i5);
        this.o = 0;
        MethodCollector.o(4474);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(out=" + this.out + ", blockSize=" + this.blockSize + ", compressor=" + this.compressor + ", checksum=" + this.checksum + ")";
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr) {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i2) {
        ensureNotFinished();
        if (this.o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i3 = this.o;
        this.o = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    private static int compressionLevel(int i2) {
        if (i2 < 64) {
            throw new IllegalArgumentException("blockSize must be >= 64, got ".concat(String.valueOf(i2)));
        } else if (i2 <= 33554432) {
            return Math.max(0, (32 - Integer.numberOfLeadingZeros(i2 - 1)) - 10);
        } else {
            throw new IllegalArgumentException("blockSize must be <= 33554432, got ".concat(String.valueOf(i2)));
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i2) {
        this(outputStream, i2, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i2, LZ4Compressor lZ4Compressor) {
        this(outputStream, i2, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), false);
    }

    private static void writeIntLE(int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        bArr[i3] = (byte) i2;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) (i2 >>> 16);
        bArr[i5 + 1] = (byte) (i2 >>> 24);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        SafeUtils.checkRange(bArr, i2, i3);
        ensureNotFinished();
        while (true) {
            int i4 = this.o;
            int i5 = i4 + i3;
            int i6 = this.blockSize;
            if (i5 > i6) {
                int i7 = i6 - i4;
                System.arraycopy(bArr, i2, this.buffer, i4, i6 - i4);
                this.o = this.blockSize;
                flushBufferedData();
                i2 += i7;
                i3 -= i7;
            } else {
                System.arraycopy(bArr, i2, this.buffer, i4, i3);
                this.o += i3;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i2, LZ4Compressor lZ4Compressor, Checksum checksum2, boolean z) {
        super(outputStream);
        MethodCollector.i(4368);
        this.blockSize = i2;
        this.compressor = lZ4Compressor;
        this.checksum = checksum2;
        this.compressionLevel = compressionLevel(i2);
        this.buffer = new byte[i2];
        byte[] bArr = new byte[(HEADER_LENGTH + lZ4Compressor.maxCompressedLength(i2))];
        this.compressedBuffer = bArr;
        this.syncFlush = z;
        this.o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
        MethodCollector.o(4368);
    }
}
