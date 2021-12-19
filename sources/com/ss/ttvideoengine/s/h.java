package com.ss.ttvideoengine.s;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f153275a;

    /* renamed from: b  reason: collision with root package name */
    public long f153276b;

    /* renamed from: c  reason: collision with root package name */
    public long f153277c;

    static {
        Covode.recordClassIndex(101783);
    }

    /* access modifiers changed from: package-private */
    public static class a extends Exception {
        static {
            Covode.recordClassIndex(101784);
        }

        public a(String str) {
            super(str);
        }
    }

    public final boolean a(String str) {
        try {
            return a(InetAddress.getByName(str));
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0157, code lost:
        if (0 == 0) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.net.InetAddress r22) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.s.h.a(java.net.InetAddress):boolean");
    }

    private static long a(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        byte b4 = bArr[i2 + 2];
        byte b5 = bArr[i2 + 3];
        int i3 = b2 & 128;
        byte b6 = b2;
        if (i3 == 128) {
            b6 = (b2 & Byte.MAX_VALUE) + 128;
        }
        int i4 = b3 & 128;
        byte b7 = b3;
        if (i4 == 128) {
            b7 = (b3 & Byte.MAX_VALUE) + 128;
        }
        int i5 = b4 & 128;
        byte b8 = b4;
        if (i5 == 128) {
            b8 = (b4 & Byte.MAX_VALUE) + 128;
        }
        int i6 = b5 & 128;
        byte b9 = b5;
        if (i6 == 128) {
            b9 = (b5 & Byte.MAX_VALUE) + 128;
        }
        return ((b6 == 1 ? 1 : 0) << 24) + ((b7 == 1 ? 1 : 0) << 16) + ((b8 == 1 ? 1 : 0) << 8) + (b9 == 1 ? 1 : 0);
    }

    private static long b(byte[] bArr, int i2) {
        long a2 = a(bArr, i2);
        long a3 = a(bArr, i2 + 4);
        if (a2 == 0 && a3 == 0) {
            return 0;
        }
        return ((a2 - 2208988800L) * 1000) + ((a3 * 1000) / 4294967296L);
    }
}
