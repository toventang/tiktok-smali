package org.apache.commons.codec.binary;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public abstract class BaseNCodec {
    protected final byte PAD = 61;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    static {
        Covode.recordClassIndex(106347);
    }

    /* access modifiers changed from: package-private */
    public abstract void decode(byte[] bArr, int i2, int i3, Context context);

    /* access modifiers changed from: package-private */
    public abstract void encode(byte[] bArr, int i2, int i3, Context context);

    /* access modifiers changed from: protected */
    public int getDefaultBufferSize() {
        return 8192;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isInAlphabet(byte b2);

    /* access modifiers changed from: package-private */
    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        static {
            Covode.recordClassIndex(106348);
        }

        Context() {
        }

        public String toString() {
            return a.a("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos)});
        }
    }

    /* access modifiers changed from: package-private */
    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (61 == b2 || isInAlphabet(b2)) {
                return true;
            }
        }
        return false;
    }

    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i2 = context.pos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i2 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.unencodedBlockSize;
        long j2 = ((long) (((length + i2) - 1) / i2)) * ((long) this.encodedBlockSize);
        int i3 = this.lineLength;
        if (i3 > 0) {
            return j2 + ((((((long) i3) + j2) - 1) / ((long) i3)) * ((long) this.chunkSeparatorLength));
        }
        return j2;
    }

    private byte[] resizeBuffer(Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr = new byte[(context.buffer.length * 2)];
            System.arraycopy(context.buffer, 0, bArr, 0, context.buffer.length);
            context.buffer = bArr;
        }
        return context.buffer;
    }

    /* access modifiers changed from: protected */
    public byte[] ensureBufferSize(int i2, Context context) {
        if (context.buffer == null || context.buffer.length < context.pos + i2) {
            return resizeBuffer(context);
        }
        return context.buffer;
    }

    protected BaseNCodec(int i2, int i3, int i4, int i5) {
        this.unencodedBlockSize = i2;
        this.encodedBlockSize = i3;
        int i6 = 0;
        if (i4 > 0 && i5 > 0) {
            i6 = (i4 / i3) * i3;
        }
        this.lineLength = i6;
        this.chunkSeparatorLength = i5;
    }

    /* access modifiers changed from: package-private */
    public int readResults(byte[] bArr, int i2, int i3, Context context) {
        if (context.buffer != null) {
            int min = Math.min(available(context), i3);
            System.arraycopy(context.buffer, context.readPos, bArr, i2, min);
            context.readPos += min;
            if (context.readPos >= context.pos) {
                context.buffer = null;
            }
            return min;
        } else if (context.eof) {
            return -1;
        } else {
            return 0;
        }
    }
}
