package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    LZ4JavaSafeSafeDecompressor() {
    }

    static {
        Covode.recordClassIndex(106008);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6  */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int decompress(java.nio.ByteBuffer r20, int r21, int r22, java.nio.ByteBuffer r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor, net.jpountz.lz4.LZ4SafeDecompressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int decompress(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }
}
