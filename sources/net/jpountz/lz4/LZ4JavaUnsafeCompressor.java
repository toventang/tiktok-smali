package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    LZ4JavaUnsafeCompressor() {
    }

    static {
        Covode.recordClassIndex(106009);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (r4 < 15) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r7 = r7 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r4 < 15) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, net.jpountz.util.ByteBufferUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if (r7 <= r9) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r3 = r7 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r7));
        r5 = r15 + net.jpountz.util.UnsafeUtils.readShort(r8, r3);
        net.jpountz.util.UnsafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r7, r5) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        r3 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dc, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 | net.jpountz.util.ByteBufferUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r14, r7, r9, r23, r2);
        r9 = r9 - r3;
        r7 = r7 - r3;
        r6 = r9 - r2;
        r5 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
        if ((((r5 + r6) + 8) + (r6 >>> 8)) > r15) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r6 < 15) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, 240);
        r5 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r6 - 15, r13, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r14, r2, r13, r5, r6);
        r5 = r5 + r6;
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r13, r5, r0);
        r4 = r5 + 2;
        r2 = r2 + 4;
        r6 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r14, r7 + 4, r2, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        if (((r4 + 6) + (r6 >>> 8)) > r15) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cb, code lost:
        r2 = r2 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        if (r6 < 15) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d0, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, net.jpountz.util.ByteBufferUtils.readByte(r13, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r6 - 15, r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r2 <= r10) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r4 = r2 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r14, r4)), r4);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r14, r2));
        r7 = net.jpountz.util.UnsafeUtils.readInt(r8, r0);
        net.jpountz.util.UnsafeUtils.writeInt(r8, r0, r2);
        r0 = r2 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0111, code lost:
        if (r0 >= 65536) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r14, r7, r2) == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        r5 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, r6 | net.jpountz.util.ByteBufferUtils.readByte(r13, r1));
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, r6 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0140, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0146, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(java.nio.ByteBuffer r22, int r23, int r24, java.nio.ByteBuffer r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (r4 < 15) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r7 = r7 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r4 < 15) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r20, r1, net.jpountz.util.UnsafeUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if (r7 <= r9) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r3 = r7 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r17, r7));
        r5 = r15 + net.jpountz.util.UnsafeUtils.readShort(r8, r3);
        net.jpountz.util.UnsafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r17, r7, r5) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        r3 = r1 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dc, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r20, r1, r4 | net.jpountz.util.UnsafeUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r0 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        r0 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r19, r12, r4, r20, r14);
        r4 = r4 - r0;
        r12 = r12 - r0;
        r15 = r4 - r14;
        r13 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if ((((r13 + r15) + 8) + (r15 >>> 8)) > r10) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r15 < 15) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r22, r1, 240);
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r15 - 15, r22, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r19, r14, r22, r13, r15);
        r13 = r13 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r22, r13, r11);
        r11 = r13 + 2;
        r4 = r4 + 4;
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r19, r12 + 4, r4, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        if (((r11 + 6) + (r13 >>> 8)) > r10) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        r4 = r4 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        if (r13 < 15) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r22, r1, net.jpountz.util.UnsafeUtils.readByte(r22, r1) | 15);
        r1 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r13 - 15, r22, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r4 <= r5) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        r11 = r4 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r3, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r19, r11)), r11);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r19, r4));
        r12 = net.jpountz.util.UnsafeUtils.readInt(r3, r0);
        net.jpountz.util.UnsafeUtils.writeInt(r3, r0, r4);
        r11 = r4 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e2, code lost:
        if (r11 >= 65536) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e8, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r19, r12, r4) == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r13 = r1 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r22, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r22, r1, r13 | net.jpountz.util.UnsafeUtils.readByte(r22, r1));
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r22, r1, r15 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
