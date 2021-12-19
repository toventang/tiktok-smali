package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public final class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;
    private int o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    static {
        Covode.recordClassIndex(105979);
    }

    public final void mark(int i2) {
    }

    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.originalLen - this.o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i2 = this.o;
        this.o = i2 + 1;
        return bArr[i2] & 255;
    }

    public final String toString() {
        return getClass().getSimpleName() + "(in=" + this.in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    private void refill() {
        do {
            try {
                readFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH);
                for (int i2 = 0; i2 < LZ4BlockOutputStream.MAGIC_LENGTH; i2++) {
                    if (this.compressedBuffer[i2] != LZ4BlockOutputStream.MAGIC[i2]) {
                        throw new IOException("Stream is corrupted");
                    }
                }
                int i3 = this.compressedBuffer[LZ4BlockOutputStream.MAGIC_LENGTH] & 255;
                int i4 = i3 & 240;
                int i5 = (i3 & 15) + 10;
                if (i4 == 16 || i4 == 32) {
                    int readIntLE = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 1);
                    this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 5);
                    int readIntLE2 = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 9);
                    int i6 = this.originalLen;
                    if (i6 <= (1 << i5) && i6 >= 0 && readIntLE >= 0) {
                        if (i6 == 0) {
                            if (readIntLE != 0) {
                            }
                        } else if (readIntLE == 0) {
                        }
                        if (i4 != 16 || i6 == readIntLE) {
                            if (i6 != 0 || readIntLE != 0) {
                                byte[] bArr = this.buffer;
                                if (bArr.length < i6) {
                                    this.buffer = new byte[Math.max(i6, (bArr.length * 3) / 2)];
                                }
                                if (i4 == 16) {
                                    readFully(this.buffer, this.originalLen);
                                } else if (i4 == 32) {
                                    byte[] bArr2 = this.compressedBuffer;
                                    if (bArr2.length < readIntLE) {
                                        this.compressedBuffer = new byte[Math.max(readIntLE, (bArr2.length * 3) / 2)];
                                    }
                                    readFully(this.compressedBuffer, readIntLE);
                                    try {
                                        if (readIntLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                            throw new IOException("Stream is corrupted");
                                        }
                                    } catch (LZ4Exception e2) {
                                        throw new IOException("Stream is corrupted", e2);
                                    }
                                } else {
                                    throw new AssertionError();
                                }
                                this.checksum.reset();
                                this.checksum.update(this.buffer, 0, this.originalLen);
                                if (((int) this.checksum.getValue()) == readIntLE2) {
                                    this.o = 0;
                                    return;
                                }
                                throw new IOException("Stream is corrupted");
                            } else if (readIntLE2 != 0) {
                                throw new IOException("Stream is corrupted");
                            }
                        }
                    }
                    throw new IOException("Stream is corrupted");
                }
                throw new IOException("Stream is corrupted");
            } catch (EOFException e3) {
                if (!this.stopOnEmptyBlock) {
                    this.finished = true;
                    return;
                }
                throw e3;
            }
        } while (!this.stopOnEmptyBlock);
        this.finished = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        if (j2 <= 0 || this.finished) {
            return 0;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0;
        }
        int min = (int) Math.min(j2, (long) (this.originalLen - this.o));
        this.o += min;
        return (long) min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), true);
    }

    private void readFully(byte[] bArr, int i2) {
        MethodCollector.i(6331);
        int i3 = 0;
        while (i3 < i2) {
            int read = this.in.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                EOFException eOFException = new EOFException("Stream ended prematurely");
                MethodCollector.o(6331);
                throw eOFException;
            }
        }
        MethodCollector.o(6331);
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), z);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2) {
        this(inputStream, lZ4FastDecompressor, checksum2, true);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        SafeUtils.checkRange(bArr, i2, i3);
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i3, this.originalLen - this.o);
        System.arraycopy(this.buffer, this.o, bArr, i2, min);
        this.o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2, boolean z) {
        super(inputStream);
        MethodCollector.i(6017);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum2;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.o = 0;
        MethodCollector.o(6017);
    }
}
