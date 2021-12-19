package com.bytedance.apm.q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;

public final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f25257c = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: a  reason: collision with root package name */
    long f25258a;

    /* renamed from: b  reason: collision with root package name */
    long f25259b;

    /* renamed from: d  reason: collision with root package name */
    private final String f25260d;

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f25261e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f25262f;

    /* renamed from: g  reason: collision with root package name */
    private int f25263g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25264h;

    /* renamed from: i  reason: collision with root package name */
    private int f25265i;

    /* renamed from: j  reason: collision with root package name */
    private int f25266j;

    /* renamed from: k  reason: collision with root package name */
    private long f25267k;

    /* renamed from: l  reason: collision with root package name */
    private long f25268l;

    /* renamed from: m  reason: collision with root package name */
    private long f25269m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;

    private int b() {
        return (int) a(2);
    }

    private long c() {
        return a(4);
    }

    private long d() {
        return a(this.f25266j);
    }

    private long e() {
        return a(this.f25266j);
    }

    public final void a() {
        try {
            this.f25261e.close();
        } catch (IOException unused) {
        }
    }

    private int f() {
        return this.f25261e.read() & 255;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    static {
        Covode.recordClassIndex(14714);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25270a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25271b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25272c;

        static {
            Covode.recordClassIndex(14715);
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder append = new StringBuilder("Symbol[").append(this.f25270a).append(",");
            int i2 = this.f25271b;
            if (i2 == 0) {
                str = "LOCAL";
            } else if (i2 == 1) {
                str = "GLOBAL";
            } else if (i2 != 2) {
                str = "STB_??? (" + this.f25271b + ")";
            } else {
                str = "WEAK";
            }
            StringBuilder append2 = append.append(str).append(",");
            switch (this.f25272c) {
                case 0:
                    str2 = "NOTYPE";
                    break;
                case 1:
                    str2 = "OBJECT";
                    break;
                case 2:
                    str2 = "FUNC";
                    break;
                case 3:
                    str2 = "SECTION";
                    break;
                case 4:
                    str2 = "FILE";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    str2 = "COMMON";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    str2 = "TLS";
                    break;
                default:
                    str2 = "STT_??? (" + this.f25272c + ")";
                    break;
            }
            return append2.append(str2).append("]").toString();
        }

        a(String str, int i2) {
            this.f25270a = str;
            this.f25271b = (i2 >> 4) & 15;
            this.f25272c = i2 & 15;
        }
    }

    private String a(long j2) {
        long j3 = this.n;
        if (j3 == 0 || j2 < 0 || j2 >= this.o) {
            return null;
        }
        return b(j3 + j2);
    }

    private long a(int i2) {
        int i3 = 0;
        this.f25261e.readFully(this.f25262f, 0, i2);
        if (this.f25263g == 1) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                i3 = (i3 << 8) | (this.f25262f[i4] & 255);
            }
        } else {
            int i5 = i2 - 1;
            int i6 = 0;
            while (i3 <= i5) {
                i6 = (i6 << 8) | (this.f25262f[i3] & 255);
                i3++;
            }
            i3 = i6;
        }
        return (long) i3;
    }

    private String b(long j2) {
        long filePointer = this.f25261e.getFilePointer();
        this.f25261e.seek(j2);
        RandomAccessFile randomAccessFile = this.f25261e;
        byte[] bArr = this.f25262f;
        randomAccessFile.readFully(bArr, 0, (int) Math.min((long) bArr.length, randomAccessFile.length() - j2));
        this.f25261e.seek(filePointer);
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f25262f;
            if (i2 >= bArr2.length) {
                return null;
            }
            if (bArr2[i2] == 0) {
                return new String(this.f25262f, 0, i2);
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        int i2;
        HashSet<Long> hashSet = new HashSet();
        byte[] bArr = new byte[((int) Math.max(this.f25258a, this.f25259b))];
        this.f25261e.seek(this.f25267k);
        this.f25261e.readFully(bArr, 0, (int) this.f25258a);
        int i3 = 0;
        while (((long) i3) < this.f25258a) {
            long a2 = a(bArr, i3);
            int i4 = i3 + 4;
            int i5 = this.f25266j;
            if (i5 == 8) {
                i2 = bArr[i4] & 255;
                i3 = i4 + 1 + 19;
            } else {
                int i6 = i4 + i5 + 4;
                i2 = bArr[i6] & 255;
                i3 = i6 + 1 + 3;
            }
            if (a2 != 0 && (i2 & 15) == 2) {
                hashSet.add(Long.valueOf(a2));
            }
        }
        this.f25261e.seek(this.p);
        this.f25261e.readFully(bArr, 0, (int) this.f25259b);
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (Long l2 : hashSet) {
            int i7 = 0;
            while (i7 < length) {
                int longValue = (int) (((long) i7) + l2.longValue());
                if (((long) longValue) >= this.f25259b || bArr[longValue] != bytes[i7]) {
                    break;
                }
                i7++;
            }
            if (i7 == length && bArr[(int) (((long) i7) + l2.longValue())] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        if (r5 == 2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r5 == 2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0154, code lost:
        throw new java.io.IOException("Invalid e_machine/EI_CLASS ELF combination: " + r7 + "/" + ((int) r5) + ": " + r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    o(java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.o.<init>(java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        int f2;
        String str2;
        this.f25261e.seek(this.f25267k);
        while (this.f25261e.getFilePointer() < this.f25267k + this.f25258a) {
            long a2 = a(4);
            if (this.f25266j == 8) {
                f2 = f();
                f();
                a(2);
                e();
                a(this.f25266j);
            } else {
                e();
                a(4);
                f2 = f();
                f();
                a(2);
            }
            if (a2 != 0) {
                long j2 = this.p;
                long j3 = this.f25259b;
                if (j2 == 0 || a2 < 0 || a2 >= j3) {
                    str2 = null;
                } else {
                    str2 = b(j2 + a2);
                }
                if (TextUtils.equals(str, str2) && new a(str2, f2).f25272c == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private long a(byte[] bArr, int i2) {
        int i3 = 3;
        int i4 = 0;
        if (this.f25263g == 1) {
            do {
                i4 = (i4 << 8) | (bArr[i3 + i2] & 255);
                i3--;
            } while (i3 >= 0);
        } else {
            int i5 = 0;
            do {
                i5 = (i5 << 8) | (bArr[i4 + i2] & 255);
                i4++;
            } while (i4 <= 3);
            i4 = i5;
        }
        return (long) i4;
    }

    private void a(long j2, int i2, int i3, int i4) {
        this.f25261e.seek(j2 + ((long) (i4 * i3)));
        a(4);
        long a2 = a(4);
        a(this.f25266j);
        e();
        long d2 = d();
        long a3 = a(this.f25266j);
        if (a2 == 3) {
            this.n = d2;
            this.o = a3;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 != i4) {
                this.f25261e.seek(j2 + ((long) (i5 * i3)));
                long a4 = a(4);
                long a5 = a(4);
                a(this.f25266j);
                e();
                long d3 = d();
                long a6 = a(this.f25266j);
                if (a5 == 2 || a5 == 11) {
                    String a7 = a(a4);
                    if (".symtab".equals(a7)) {
                        this.f25267k = d3;
                        this.f25258a = a6;
                    } else if (".dynsym".equals(a7)) {
                        this.f25268l = d3;
                        this.f25269m = a6;
                    }
                } else if (a5 == 3) {
                    String a8 = a(a4);
                    if (".strtab".equals(a8)) {
                        this.p = d3;
                        this.f25259b = a6;
                    } else if (".dynstr".equals(a8)) {
                        this.q = d3;
                        this.r = a6;
                    }
                } else if (a5 == 6) {
                    this.f25264h = true;
                }
            }
        }
    }
}
