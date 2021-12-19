package com.ss.android.k;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f59601a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f59602a;

        /* renamed from: b  reason: collision with root package name */
        public int f59603b;

        /* renamed from: c  reason: collision with root package name */
        public int f59604c;

        /* renamed from: d  reason: collision with root package name */
        public long f59605d;

        /* renamed from: e  reason: collision with root package name */
        public String f59606e;

        static {
            Covode.recordClassIndex(36791);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(36790);
    }

    private static String a(long j2) {
        return Long.toHexString((j2 << 4) + 31);
    }

    private static long b(String str) {
        try {
            return (Long.parseLong(str, 16) - 31) >> 4;
        } catch (Throwable unused) {
            throw new RuntimeException("ttmd5 decryptNum error, num = ".concat(String.valueOf(str)));
        }
    }

    private static a a(String str) {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(";");
        String[] split2 = split[0].split(":");
        a aVar = new a((byte) 0);
        aVar.f59602a = Integer.parseInt(split2[1]);
        if (aVar.f59602a > 1) {
            return aVar;
        }
        aVar.f59603b = Integer.parseInt(split2[2]);
        String[] split3 = split2[3].split("g");
        aVar.f59604c = (int) b(split3[0]);
        aVar.f59605d = b(split3[1]);
        aVar.f59606e = split[1];
        return aVar;
    }

    public static int a(String str, File file, b bVar) {
        String str2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        if (bVar != null) {
            try {
                if (bVar.a() <= 0) {
                    try {
                        bVar.b();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } catch (Throwable unused2) {
                return 99;
            }
        } else if (file == null || !file.exists()) {
            return 5;
        }
        int i2 = -1;
        long j2 = -1;
        try {
            a a2 = a(str);
            if (a2 != null) {
                if (a2.f59602a > 1) {
                    return 3;
                }
                i2 = a2.f59604c;
                j2 = a2.f59605d;
            }
            a aVar = null;
            if (bVar != null) {
                try {
                    str2 = a(bVar, i2, j2);
                } catch (Throwable unused3) {
                    return 6;
                }
            } else {
                str2 = a(new a(file), i2, j2);
            }
            if (str2 == null || str2.length() == 0) {
                return 6;
            }
            if (a2 == null || (a2.f59602a == 1 && a2.f59603b == 1)) {
                if (str2.equals(str)) {
                    return 0;
                }
            } else if (a2.f59606e != null) {
                try {
                    aVar = a(str2);
                } catch (Throwable unused4) {
                }
                if (aVar == null || a2.f59604c != aVar.f59604c || a2.f59605d != aVar.f59605d || !a2.f59606e.equals(aVar.f59606e)) {
                    return 1;
                }
                return 0;
            }
            return 1;
        } catch (Throwable unused5) {
            return 4;
        }
    }

    private static String a(b bVar, int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        MessageDigest instance = MessageDigest.getInstance("MD5");
        if (instance == null) {
            return "";
        }
        try {
            long a2 = bVar.a();
            long j4 = 0;
            if (i3 <= 0 || j3 <= 0 || ((long) i3) * j3 > (8 * a2) / 10) {
                j3 = a2;
                i3 = 1;
            }
            byte[] bArr = new byte[8192];
            a(bVar, instance, bArr, 0, j3);
            if (i3 > 2) {
                int i4 = i3 - 1;
                long j5 = (a2 - (((long) i3) * j3)) / ((long) i4);
                for (int i5 = 1; i5 < i4; i5++) {
                    j4 += j3 + j5;
                    a(bVar, instance, bArr, j4, j3);
                }
            }
            if (i3 > 1) {
                a(bVar, instance, bArr, a2 - j3, j3);
            }
            byte[] digest = instance.digest();
            if (digest != null) {
                int length = digest.length;
                int i6 = length * 2;
                char[] cArr = new char[i6];
                int i7 = 0;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = digest[i8 + 0] & 255;
                    int i10 = i7 + 1;
                    char[] cArr2 = f59601a;
                    cArr[i7] = cArr2[i9 >> 4];
                    i7 = i10 + 1;
                    cArr[i10] = cArr2[i9 & 15];
                }
                String str = new String(cArr, 0, i6);
                if (i3 == 1 && j3 == a2) {
                    try {
                        bVar.b();
                    } catch (Throwable unused) {
                    }
                    return str;
                }
                String str2 = ("ttmd5:1:1:" + a((long) i3) + "g" + a(j3)) + ";" + str;
                try {
                    bVar.b();
                } catch (Throwable unused2) {
                }
                return str2;
            }
            throw new NullPointerException("bytes is null");
        } catch (Throwable unused3) {
        }
        throw th;
    }

    private static void a(b bVar, MessageDigest messageDigest, byte[] bArr, long j2, long j3) {
        bVar.a(j2);
        long j4 = 0;
        while (j4 < j3) {
            int a2 = bVar.a(bArr, (int) Math.min(j3 - j4, 8192L));
            if (a2 > 0) {
                messageDigest.update(bArr, 0, a2);
                j4 += (long) a2;
            } else {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + a2 + ", readTotalCount = " + j4 + ", sampleSize = " + j3);
            }
        }
    }
}
