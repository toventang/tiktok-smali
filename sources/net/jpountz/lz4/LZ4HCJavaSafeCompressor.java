package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* access modifiers changed from: package-private */
public final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    final int compressionLevel;
    public final int maxAttempts;

    LZ4HCJavaSafeCompressor() {
        this(9);
    }

    /* access modifiers changed from: package-private */
    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int base;
        private final short[] chainTable = new short[65536];
        private final int[] hashTable;
        int nextToUpdate;

        static {
            Covode.recordClassIndex(105999);
        }

        private int hashPointer(int i2) {
            return this.hashTable[LZ4Utils.hashHC(i2)];
        }

        private int next(int i2) {
            return i2 - (this.chainTable[i2 & 65535] & 65535);
        }

        private void addHash(ByteBuffer byteBuffer, int i2) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i2), i2);
        }

        private void addHash(byte[] bArr, int i2) {
            addHash(SafeUtils.readInt(bArr, i2), i2);
        }

        /* access modifiers changed from: package-private */
        public void insert(int i2, ByteBuffer byteBuffer) {
            while (true) {
                int i3 = this.nextToUpdate;
                if (i3 < i2) {
                    addHash(byteBuffer, i3);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        HashTable(int i2) {
            this.base = i2;
            this.nextToUpdate = i2;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
        }

        private void addHash(int i2, int i3) {
            int hashHC = LZ4Utils.hashHC(i2);
            int[] iArr = this.hashTable;
            int i4 = i3 - iArr[hashHC];
            if (i4 >= 65536) {
                i4 = 65535;
            }
            this.chainTable[65535 & i3] = (short) i4;
            iArr[hashHC] = i3;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i2) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i2));
        }

        /* access modifiers changed from: package-private */
        public void insert(int i2, byte[] bArr) {
            while (true) {
                int i3 = this.nextToUpdate;
                if (i3 < i2) {
                    addHash(bArr, i3);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private int hashPointer(byte[] bArr, int i2) {
            return hashPointer(SafeUtils.readInt(bArr, i2));
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i2, int i3, LZ4Utils.Match match) {
            int i4;
            int i5;
            int commonBytes;
            match.start = i2;
            match.len = 0;
            insert(i2, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i2);
            if (hashPointer < i2 - 4 || hashPointer > i2 || hashPointer < this.base) {
                i4 = 0;
                i5 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i2)) {
                    i4 = i2 - hashPointer;
                    i5 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i2 + 4, i3) + 4;
                    match.len = i5;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i2 - 65536) + 1) && hashPointer <= i2; i6++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i2) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i2 + 4, i3) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i5 != 0) {
                int i7 = (i5 + i2) - 3;
                while (i2 < i7 - i4) {
                    this.chainTable[65535 & i2] = (short) i4;
                    i2++;
                }
                do {
                    this.chainTable[i2 & 65535] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i2))] = i2;
                    i2++;
                } while (i2 < i7);
                this.nextToUpdate = i7;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindBestMatch(byte[] bArr, int i2, int i3, LZ4Utils.Match match) {
            int i4;
            int i5;
            int commonBytes;
            match.start = i2;
            match.len = 0;
            insert(i2, bArr);
            int hashPointer = hashPointer(bArr, i2);
            if (hashPointer < i2 - 4 || hashPointer > i2 || hashPointer < this.base) {
                i4 = 0;
                i5 = 0;
            } else {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i2)) {
                    i4 = i2 - hashPointer;
                    i5 = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i2 + 4, i3) + 4;
                    match.len = i5;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i2 - 65536) + 1) && hashPointer <= i2; i6++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i2) && (commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i2 + 4, i3) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i5 != 0) {
                int i7 = (i5 + i2) - 3;
                while (i2 < i7 - i4) {
                    this.chainTable[65535 & i2] = (short) i4;
                    i2++;
                }
                do {
                    this.chainTable[i2 & 65535] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(SafeUtils.readInt(bArr, i2))] = i2;
                    i2++;
                } while (i2 < i7);
                this.nextToUpdate = i7;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i5;
            insert(i2, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i2);
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i2 - 65536) + 1) && hashPointer <= i2; i6++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i2) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i2 + 4, i4) + 4 + (commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i2, this.base, i3))) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - commonBytesBackward;
                    match.start = i2 - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i5) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindWiderMatch(byte[] bArr, int i2, int i3, int i4, int i5, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i5;
            insert(i2, bArr);
            int hashPointer = hashPointer(bArr, i2);
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i2 - 65536) + 1) && hashPointer <= i2; i6++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i2) && (commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i2 + 4, i4) + 4 + (commonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, hashPointer, i2, this.base, i3))) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - commonBytesBackward;
                    match.start = i2 - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i5) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(105998);
    }

    LZ4HCJavaSafeCompressor(int i2) {
        this.maxAttempts = 1 << (i2 - 1);
        this.compressionLevel = i2;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        int i6 = i2;
        SafeUtils.checkRange(bArr, i6, i3);
        SafeUtils.checkRange(bArr2, i4, i5);
        int i7 = i6 + i3;
        int i8 = i4 + i5;
        int i9 = i7 - 12;
        int i10 = i7 - 5;
        int i11 = i6 + 1;
        HashTable hashTable = new HashTable(i6);
        LZ4Utils.Match match = new LZ4Utils.Match();
        LZ4Utils.Match match2 = new LZ4Utils.Match();
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        int i12 = i4;
        while (i11 < i9) {
            if (!hashTable.insertAndFindBestMatch(bArr, i11, i10, match2)) {
                i11++;
            } else {
                LZ4Utils.copyTo(match2, match);
                while (true) {
                    if (match2.end() >= i9 || !hashTable.insertAndFindWiderMatch(bArr, match2.end() - 2, match2.start + 1, i10, match2.len, match3)) {
                        i12 = LZ4SafeUtils.encodeSequence(bArr, i6, match2.start, match2.ref, match2.len, bArr2, i12, i8);
                        i6 = match2.end();
                        i11 = i6;
                    } else {
                        if (match.start < match2.start && match3.start < match2.start + match.len) {
                            LZ4Utils.copyTo(match, match2);
                        }
                        if (match3.start - match2.start < 3) {
                            LZ4Utils.copyTo(match3, match2);
                        } else {
                            while (true) {
                                if (match3.start - match2.start < 18) {
                                    int i13 = match2.len;
                                    if (i13 > 18) {
                                        i13 = 18;
                                    }
                                    if (match2.start + i13 > match3.end() - 4) {
                                        i13 = ((match3.start - match2.start) + match3.len) - 4;
                                    }
                                    int i14 = i13 - (match3.start - match2.start);
                                    if (i14 > 0) {
                                        match3.fix(i14);
                                    }
                                }
                                if (match3.start + match3.len < i9 && hashTable.insertAndFindWiderMatch(bArr, match3.end() - 3, match3.start, i10, match3.len, match4)) {
                                    if (match4.start >= match2.end() + 3) {
                                        if (match3.start < match2.end()) {
                                            if (match3.start - match2.start < 15) {
                                                if (match2.len > 18) {
                                                    match2.len = 18;
                                                }
                                                if (match2.end() > match3.end() - 4) {
                                                    match2.len = (match3.end() - match2.start) - 4;
                                                }
                                                match3.fix(match2.end() - match3.start);
                                            } else {
                                                match2.len = match3.start - match2.start;
                                            }
                                        }
                                        i12 = LZ4SafeUtils.encodeSequence(bArr, i6, match2.start, match2.ref, match2.len, bArr2, i12, i8);
                                        i6 = match2.end();
                                        LZ4Utils.copyTo(match3, match2);
                                        LZ4Utils.copyTo(match4, match3);
                                    } else if (match4.start >= match2.end()) {
                                        if (match3.start < match2.end()) {
                                            match3.fix(match2.end() - match3.start);
                                            if (match3.len < 4) {
                                                LZ4Utils.copyTo(match4, match3);
                                            }
                                        }
                                        i12 = LZ4SafeUtils.encodeSequence(bArr, i6, match2.start, match2.ref, match2.len, bArr2, i12, i8);
                                        i6 = match2.end();
                                        LZ4Utils.copyTo(match4, match2);
                                        LZ4Utils.copyTo(match3, match);
                                    } else {
                                        LZ4Utils.copyTo(match4, match3);
                                    }
                                }
                            }
                        }
                    }
                }
                if (match3.start < match2.end()) {
                    match2.len = match3.start - match2.start;
                }
                i12 = LZ4SafeUtils.encodeSequence(bArr, match2.end(), match3.start, match3.ref, match3.len, bArr2, LZ4SafeUtils.encodeSequence(bArr, i6, match2.start, match2.ref, match2.len, bArr2, i12, i8), i8);
                i6 = match3.end();
                i11 = i6;
            }
        }
        return LZ4SafeUtils.lastLiterals(bArr, i6, i7 - i6, bArr2, i12, i8) - i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        if (r1.start >= r0.end()) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        r0.len = r1.start - r0.start;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0133, code lost:
        r19 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r0.end(), r1.start, r1.ref, r1.len, r11, net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r14, r0.start, r0.ref, r0.len, r11, r19, r20), r20);
        r14 = r1.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(java.nio.ByteBuffer r33, int r34, int r35, java.nio.ByteBuffer r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 544
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
