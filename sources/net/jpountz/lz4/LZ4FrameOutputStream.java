package net.jpountz.lz4;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4FrameOutputStream extends FilterOutputStream {
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    private final ByteBuffer buffer;
    private final XXHash32 checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    /* renamed from: net.jpountz.lz4.LZ4FrameOutputStream$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(105991);
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);
        
        private final int indicator;

        public final int getIndicator() {
            return this.indicator;
        }

        static {
            Covode.recordClassIndex(105993);
        }

        public static BLOCKSIZE valueOf(int i2) {
            if (i2 == 4) {
                return SIZE_64KB;
            }
            if (i2 == 5) {
                return SIZE_256KB;
            }
            if (i2 == 6) {
                return SIZE_1MB;
            }
            if (i2 == 7) {
                return SIZE_4MB;
            }
            throw new IllegalArgumentException(a.a(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", new Object[]{Integer.valueOf(i2)}));
        }

        private BLOCKSIZE(int i2) {
            this.indicator = i2;
        }
    }

    public static class FLG {
        private final BitSet bitSet;
        private final int version;

        static {
            Covode.recordClassIndex(105994);
        }

        public int getVersion() {
            return this.version;
        }

        public byte toByte() {
            return (byte) (this.bitSet.toByteArray()[0] | ((this.version & 3) << 6));
        }

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);
            
            public final int position;

            static {
                Covode.recordClassIndex(105995);
            }

            private Bits(int i2) {
                this.position = i2;
            }
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                throw new RuntimeException("Reserved0 field must be 0");
            } else if (this.bitSet.get(Bits.RESERVED_1.position)) {
                throw new RuntimeException("Reserved1 field must be 0");
            } else if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
            } else if (this.version != 1) {
                throw new RuntimeException(a.a(Locale.ROOT, "Version %d is unsupported", new Object[]{Integer.valueOf(this.version)}));
            }
        }

        public static FLG fromByte(byte b2) {
            byte b3 = (byte) (b2 & 192);
            return new FLG(b3 >>> 6, (byte) (b2 ^ b3));
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        private FLG(int i2, byte b2) {
            this.bitSet = BitSet.valueOf(new byte[]{b2});
            this.version = i2;
            validate();
        }

        public FLG(int i2, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i2;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }
    }

    /* access modifiers changed from: package-private */
    public static class FrameInfo {
        private final BD bd;
        private boolean finished;
        private final FLG flg;
        private final StreamingXXHash32 streamHash;

        static {
            Covode.recordClassIndex(105996);
        }

        public void finish() {
            this.finished = true;
        }

        public BD getBD() {
            return this.bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isFinished() {
            return this.finished;
        }

        public int currentStreamHash() {
            return this.streamHash.getValue();
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public FrameInfo(FLG flg2, BD bd2) {
            StreamingXXHash32 streamingXXHash32;
            this.flg = flg2;
            this.bd = bd2;
            if (flg2.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                streamingXXHash32 = XXHashFactory.fastestInstance().newStreamingHash32(0);
            } else {
                streamingXXHash32 = null;
            }
            this.streamHash = streamingXXHash32;
        }

        public void updateStreamHash(byte[] bArr, int i2, int i3) {
            this.streamHash.update(bArr, i2, i3);
        }
    }

    public static class BD {
        private final BLOCKSIZE blockSizeValue;

        static {
            Covode.recordClassIndex(105992);
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }

        private BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }

        public static BD fromByte(byte b2) {
            int i2 = (b2 >>> 4) & 7;
            if ((b2 & 143) <= 0) {
                return new BD(BLOCKSIZE.valueOf(i2));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }

        /* synthetic */ BD(BLOCKSIZE blocksize, AnonymousClass1 r2) {
            this(blocksize);
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public void flush() {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    static {
        Covode.recordClassIndex(105990);
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            throw new IllegalStateException("The stream is already closed");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    private void writeEndMark() {
        MethodCollector.i(5491);
        this.intLEBuffer.putInt(0, 0);
        this.out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            this.out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
        MethodCollector.o(5491);
    }

    private void writeHeader() {
        MethodCollector.i(5363);
        ByteBuffer order = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(407708164);
        order.put(this.frameInfo.getFLG().toByte());
        order.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            order.putLong(this.knownSize);
        }
        order.put((byte) ((this.checksum.hash(order.array(), 4, order.position() - 4, 0) >> 8) & 255));
        this.out.write(order.array(), 0, order.position());
        MethodCollector.o(5363);
    }

    private void writeBlock() {
        byte[] bArr;
        int i2;
        MethodCollector.i(5482);
        if (this.buffer.position() == 0) {
            MethodCollector.o(5482);
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        int compress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (compress >= this.buffer.position()) {
            compress = this.buffer.position();
            bArr = Arrays.copyOf(this.buffer.array(), compress);
            i2 = Integer.MIN_VALUE;
        } else {
            bArr = this.compressedBuffer;
            i2 = 0;
        }
        this.intLEBuffer.putInt(0, i2 | compress);
        this.out.write(this.intLEBuffer.array());
        this.out.write(bArr, 0, compress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.hash(bArr, 0, compress, 0));
            this.out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
        MethodCollector.o(5482);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i2) {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        byte b2 = (byte) i2;
        this.buffer.put(b2);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(new byte[]{b2}, 0, 1);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) {
        this(outputStream, blocksize, -1, bitsArr);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        ensureNotFinished();
        while (i3 > this.buffer.remaining()) {
            int remaining = this.buffer.remaining();
            this.buffer.put(bArr, i2, remaining);
            if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                this.frameInfo.updateStreamHash(bArr, i2, remaining);
            }
            writeBlock();
            i2 += remaining;
            i3 -= remaining;
        }
        this.buffer.put(bArr, i2, i3);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(bArr, i2, i3);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j2, FLG.Bits... bitsArr) {
        super(outputStream);
        MethodCollector.i(5352);
        this.intLEBuffer = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        this.frameInfo = null;
        LZ4Compressor fastCompressor = LZ4Factory.fastestInstance().fastCompressor();
        this.compressor = fastCompressor;
        this.checksum = XXHashFactory.fastestInstance().hash32();
        FrameInfo frameInfo2 = new FrameInfo(new FLG(1, bitsArr), new BD(blocksize, null));
        this.frameInfo = frameInfo2;
        int blockMaximumSize = frameInfo2.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(ByteOrder.LITTLE_ENDIAN);
        this.compressedBuffer = new byte[fastCompressor.maxCompressedLength(blockMaximumSize)];
        if (!this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) || j2 >= 0) {
            this.knownSize = j2;
            writeHeader();
            MethodCollector.o(5352);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        MethodCollector.o(5352);
        throw illegalArgumentException;
    }
}
