package com.google.android.play.core.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class bq {
    static {
        Covode.recordClassIndex(32825);
    }

    private static int a(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i2));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static long a(ByteBuffer byteBuffer, int i2) {
        return ((long) byteBuffer.getInt(i2)) & 4294967295L;
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> a2 = a(randomAccessFile, 0);
        return a2 != null ? a2 : a(randomAccessFile, 65535);
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, int i2) {
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i2, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                int i5 = i3 - i4;
                if (allocate.getInt(i5) != 101010256 || ((char) allocate.getShort(i5 + 20)) != i4) {
                    i4++;
                } else if (i5 != -1) {
                    allocate.position(i5);
                    ByteBuffer slice = allocate.slice();
                    slice.order(ByteOrder.LITTLE_ENDIAN);
                    return Pair.create(slice, Long.valueOf(capacity + ((long) i5)));
                }
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 2 + length2 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    private static void a(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    private static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162 A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.b.bq.a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] a(int[] iArr, av[] avVarArr) {
        long j2;
        int i2;
        int length;
        long j3 = 0;
        long j4 = 0;
        int i3 = 0;
        while (true) {
            j2 = 1048576;
            if (i3 >= 3) {
                break;
            }
            j4 += (avVarArr[i3].a() + 1048575) / 1048576;
            i3++;
        }
        if (j4 < 2097151) {
            int i4 = (int) j4;
            byte[][] bArr = new byte[iArr.length][];
            int i5 = 0;
            while (true) {
                length = iArr.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((c(iArr[i5]) * i4) + 5)];
                bArr2[0] = 90;
                a(i4, bArr2);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                String b2 = b(iArr[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(b2);
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(b2.concat(" digest not supported"), e2);
                }
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (i2 = 3; i7 < i2; i2 = 3) {
                av avVar = avVarArr[i7];
                long a2 = avVar.a();
                long j5 = 0;
                while (a2 > j3) {
                    int min = (int) Math.min(a2, j2);
                    a(min, bArr3);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    avVar = avVar;
                    try {
                        avVar.a(messageDigestArr, j5, min);
                        for (int i11 = 0; i11 < iArr.length; i11++) {
                            int i12 = iArr[i11];
                            byte[] bArr4 = bArr[i11];
                            int c2 = c(i12);
                            MessageDigest messageDigest = messageDigestArr[i11];
                            int digest = messageDigest.digest(bArr4, (i8 * c2) + 5, c2);
                            if (digest != c2) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        long j6 = (long) min;
                        j5 += j6;
                        a2 -= j6;
                        i8++;
                        j3 = 0;
                        j2 = 1048576;
                    } catch (IOException e3) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i8);
                        sb2.append(" of section #");
                        sb2.append(i9);
                        throw new DigestException(sb2.toString(), e3);
                    }
                }
                i9++;
                i7++;
                j3 = 0;
                j2 = 1048576;
            }
            byte[][] bArr5 = new byte[iArr.length][];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr6 = bArr[i13];
                String b3 = b(i14);
                try {
                    bArr5[i13] = MessageDigest.getInstance(b3).digest(bArr6);
                } catch (NoSuchAlgorithmException e4) {
                    throw new RuntimeException(b3.concat(" digest not supported"), e4);
                }
            }
            return bArr5;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j4);
        throw new DigestException(sb3.toString());
    }

    private static String b(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i2 <= byteBuffer.remaining()) {
                return b(byteBuffer, i2);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i2);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i2) {
        if (i2 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i3 = i2 + position;
            if (i3 < position || i3 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i3);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i3);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int c(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static byte[] c(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        } else if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i2);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> a2 = a(randomAccessFile);
            if (a2 != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.first;
                long longValue = ((Long) a2.second).longValue();
                long j2 = -20 + longValue;
                if (j2 >= 0) {
                    randomAccessFile.seek(j2);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new bn("ZIP64 APK not supported");
                    }
                }
                a(byteBuffer);
                long a3 = a(byteBuffer, byteBuffer.position() + 16);
                if (a3 < longValue) {
                    a(byteBuffer);
                    if (a(byteBuffer, byteBuffer.position() + 12) + a3 != longValue) {
                        throw new bn("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (a3 >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(a3 - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i2 = 8;
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            int i3 = 0;
                            long j3 = allocate.getLong(0);
                            if (j3 < ((long) allocate.capacity()) || j3 > 2147483639) {
                                StringBuilder sb = new StringBuilder(57);
                                sb.append("APK Signing Block size out of range: ");
                                sb.append(j3);
                                throw new bn(sb.toString());
                            }
                            int i4 = (int) (8 + j3);
                            long j4 = a3 - ((long) i4);
                            if (j4 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i4);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile.seek(j4);
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j5 = allocate2.getLong(0);
                                if (j5 == j3) {
                                    Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                                        int capacity = byteBuffer2.capacity() - 24;
                                        if (capacity >= 8) {
                                            int capacity2 = byteBuffer2.capacity();
                                            if (capacity <= byteBuffer2.capacity()) {
                                                int limit = byteBuffer2.limit();
                                                int position = byteBuffer2.position();
                                                try {
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(capacity);
                                                    byteBuffer2.position(8);
                                                    ByteBuffer slice = byteBuffer2.slice();
                                                    slice.order(byteBuffer2.order());
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    while (slice.hasRemaining()) {
                                                        i3++;
                                                        if (slice.remaining() >= i2) {
                                                            long j6 = slice.getLong();
                                                            if (j6 < 4 || j6 > 2147483647L) {
                                                                StringBuilder sb2 = new StringBuilder(76);
                                                                sb2.append("APK Signing Block entry #");
                                                                sb2.append(i3);
                                                                sb2.append(" size out of range: ");
                                                                sb2.append(j6);
                                                                throw new bn(sb2.toString());
                                                            }
                                                            int i5 = (int) j6;
                                                            int position2 = slice.position() + i5;
                                                            if (i5 > slice.remaining()) {
                                                                int remaining = slice.remaining();
                                                                StringBuilder sb3 = new StringBuilder(91);
                                                                sb3.append("APK Signing Block entry #");
                                                                sb3.append(i3);
                                                                sb3.append(" size out of range: ");
                                                                sb3.append(i5);
                                                                sb3.append(", available: ");
                                                                sb3.append(remaining);
                                                                throw new bn(sb3.toString());
                                                            } else if (slice.getInt() == 1896449818) {
                                                                X509Certificate[][] a4 = a(randomAccessFile.getChannel(), new bm(b(slice, i5 - 4), longValue2, a3, longValue, byteBuffer));
                                                                randomAccessFile.close();
                                                                return a4;
                                                            } else {
                                                                slice.position(position2);
                                                                i2 = 8;
                                                            }
                                                        } else {
                                                            StringBuilder sb4 = new StringBuilder(70);
                                                            sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                            sb4.append(i3);
                                                            throw new bn(sb4.toString());
                                                        }
                                                    }
                                                    throw new bn("No APK Signature Scheme v2 block in APK Signing Block");
                                                } catch (Throwable th) {
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    throw th;
                                                }
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(41);
                                                sb5.append("end > capacity: ");
                                                sb5.append(capacity);
                                                sb5.append(" > ");
                                                sb5.append(capacity2);
                                                throw new IllegalArgumentException(sb5.toString());
                                            }
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(38);
                                            sb6.append("end < start: ");
                                            sb6.append(capacity);
                                            sb6.append(" < ");
                                            sb6.append(8);
                                            throw new IllegalArgumentException(sb6.toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                } else {
                                    StringBuilder sb7 = new StringBuilder(103);
                                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                    sb7.append(j5);
                                    sb7.append(" vs ");
                                    sb7.append(j3);
                                    throw new bn(sb7.toString());
                                }
                            } else {
                                StringBuilder sb8 = new StringBuilder(59);
                                sb8.append("APK Signing Block offset out of range: ");
                                sb8.append(j4);
                                throw new bn(sb8.toString());
                            }
                        } else {
                            throw new bn("No APK Signing Block before ZIP Central Directory");
                        }
                    } else {
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(a3);
                        throw new bn(sb9.toString());
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(122);
                    sb10.append("ZIP Central Directory offset out of range: ");
                    sb10.append(a3);
                    sb10.append(". ZIP End of Central Directory offset: ");
                    sb10.append(longValue);
                    throw new bn(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new bn(sb11.toString());
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, bm bmVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer b2 = b(bmVar.f53137a);
                int i2 = 0;
                while (b2.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(a(b(b2), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    a(hashMap, fileChannel, bmVar.f53138b, bmVar.f53139c, bmVar.f53140d, bmVar.f53141e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static void a(Map<Integer, byte[]> map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            bl blVar = new bl(fileChannel, 0, j2);
            bl blVar2 = new bl(fileChannel, j3, j4 - j3);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            a(duplicate);
            int position = duplicate.position() + 16;
            if (j2 < 0 || j2 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j2);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j2);
            v vVar = new v(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i2 = 0;
            for (Integer num : map.keySet()) {
                iArr[i2] = num.intValue();
                i2++;
            }
            try {
                byte[][] a2 = a(iArr, new av[]{blVar, blVar2, vVar});
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = iArr[i3];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i4)), a2[i3])) {
                        throw new SecurityException(b(i4).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e2) {
                throw new SecurityException("Failed to compute digest(s) of contents", e2);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }
}
