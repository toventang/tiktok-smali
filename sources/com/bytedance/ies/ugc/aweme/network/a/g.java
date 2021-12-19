package com.bytedance.ies.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

public final class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f35004a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f35005b = new byte[4096];

    /* renamed from: c  reason: collision with root package name */
    public int f35006c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f35007d = new byte[10240];

    /* renamed from: e  reason: collision with root package name */
    int f35008e;

    /* renamed from: f  reason: collision with root package name */
    int f35009f;

    /* renamed from: g  reason: collision with root package name */
    int f35010g;

    /* renamed from: h  reason: collision with root package name */
    int f35011h;

    /* renamed from: i  reason: collision with root package name */
    private int f35012i;

    /* renamed from: j  reason: collision with root package name */
    private int f35013j;

    /* renamed from: k  reason: collision with root package name */
    private int f35014k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35015l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35016m;
    private boolean n;

    static {
        Covode.recordClassIndex(21004);
    }

    private void c() {
        if (this.f35004a != null) {
            this.f35004a = null;
        }
    }

    public final void a() {
        if (this.n) {
            throw new IOException("stream is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final synchronized void close() {
        MethodCollector.i(7499);
        if (this.n) {
            MethodCollector.o(7499);
            return;
        }
        c();
        this.n = true;
        MethodCollector.o(7499);
    }

    private int d() {
        MethodCollector.i(7163);
        int available = this.f35004a.available();
        if (available > 0) {
            a(available);
            try {
                int read = this.f35004a.read(this.f35007d, this.f35009f, available);
                if (read < 0) {
                    this.f35016m = true;
                    MethodCollector.o(7163);
                    return -1;
                }
                this.f35009f += read;
                a(false);
            } catch (IOException e2) {
                this.f35016m = true;
                MethodCollector.o(7163);
                throw e2;
            }
        }
        int i2 = this.f35014k - this.f35006c;
        MethodCollector.o(7163);
        return i2;
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        MethodCollector.i(7474);
        a();
        int i2 = this.f35014k - this.f35006c;
        if (i2 > 0) {
            MethodCollector.o(7474);
            return i2;
        }
        int b2 = b(false);
        if (b2 < 0) {
            MethodCollector.o(7474);
            return 0;
        }
        MethodCollector.o(7474);
        return b2;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        MethodCollector.i(7390);
        a();
        if (this.f35006c < this.f35014k || b(true) > 0) {
            byte[] bArr = this.f35005b;
            int i2 = this.f35006c;
            this.f35006c = i2 + 1;
            int i3 = bArr[i2] & 255;
            MethodCollector.o(7390);
            return i3;
        }
        MethodCollector.o(7390);
        return -1;
    }

    private int e() {
        MethodCollector.i(7313);
        while (this.f35010g != 5) {
            a(32);
            try {
                InputStream inputStream = this.f35004a;
                byte[] bArr = this.f35007d;
                int i2 = this.f35009f;
                int read = inputStream.read(bArr, i2, bArr.length - i2);
                if (read >= 0) {
                    this.f35009f += read;
                    a(false);
                    int i3 = this.f35014k;
                    if (i3 > 0) {
                        int i4 = i3 - this.f35006c;
                        MethodCollector.o(7313);
                        return i4;
                    }
                } else {
                    this.f35016m = true;
                    IOException iOException = new IOException("Premature EOF");
                    MethodCollector.o(7313);
                    throw iOException;
                }
            } catch (IOException e2) {
                this.f35016m = true;
                MethodCollector.o(7313);
                throw e2;
            }
        }
        MethodCollector.o(7313);
        return -1;
    }

    public final int b() {
        int i2;
        MethodCollector.i(7550);
        if (this.f35010g == 5) {
            MethodCollector.o(7550);
            return -1;
        }
        if (this.f35006c >= this.f35014k) {
            this.f35014k = 0;
            this.f35006c = 0;
        }
        while (this.f35010g != 5) {
            a(32);
            try {
                if (!this.f35015l) {
                    long currentTimeMillis = System.currentTimeMillis();
                    InputStream inputStream = this.f35004a;
                    byte[] bArr = this.f35007d;
                    int i3 = this.f35009f;
                    i2 = inputStream.read(bArr, i3, bArr.length - i3);
                    this.f35011h = (int) (((long) this.f35011h) + (System.currentTimeMillis() - currentTimeMillis));
                } else {
                    i2 = this.f35009f - this.f35008e;
                }
                if (i2 >= 0) {
                    if (!this.f35015l) {
                        this.f35009f += i2;
                    }
                    this.f35015l = a(true);
                    int i4 = this.f35014k;
                    if (i4 > 0 && this.f35010g != 2) {
                        int i5 = i4 - this.f35006c;
                        MethodCollector.o(7550);
                        return i5;
                    }
                } else {
                    this.f35016m = true;
                    IOException iOException = new IOException("Premature EOF");
                    MethodCollector.o(7550);
                    throw iOException;
                }
            } catch (IOException e2) {
                this.f35016m = true;
                MethodCollector.o(7550);
                throw e2;
            }
        }
        MethodCollector.o(7550);
        return -1;
    }

    public g(InputStream inputStream) {
        MethodCollector.i(6680);
        this.f35004a = inputStream;
        MethodCollector.o(6680);
    }

    private int b(boolean z) {
        if (this.f35010g == 5) {
            return -1;
        }
        if (this.f35006c >= this.f35014k) {
            this.f35014k = 0;
            this.f35006c = 0;
        }
        if (z) {
            return e();
        }
        return d();
    }

    private void a(int i2) {
        int i3 = this.f35009f;
        int i4 = i3 + i2;
        byte[] bArr = this.f35007d;
        if (i4 > bArr.length) {
            int i5 = this.f35008e;
            int i6 = i3 - i5;
            int i7 = i2 + i6;
            if (i7 > bArr.length) {
                byte[] bArr2 = new byte[i7];
                if (i6 > 0) {
                    System.arraycopy(bArr, i5, bArr2, 0, i6);
                }
                this.f35007d = bArr2;
            } else if (i6 > 0) {
                System.arraycopy(bArr, i5, bArr, 0, i6);
            }
            this.f35009f = i6;
            this.f35008e = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00d1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.network.a.g.a(boolean):boolean");
    }

    private int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(6803);
        int i4 = this.f35012i - this.f35013j;
        if (i4 < i3) {
            i3 = i4;
        }
        if (i3 > 0) {
            try {
                int read = this.f35004a.read(bArr, i2, i3);
                if (read > 0) {
                    int i5 = this.f35013j + read;
                    this.f35013j = i5;
                    if (i5 >= this.f35012i) {
                        this.f35010g = 3;
                    }
                    MethodCollector.o(6803);
                    return read;
                }
                this.f35016m = true;
                IOException iOException = new IOException("Premature EOF");
                MethodCollector.o(6803);
                throw iOException;
            } catch (IOException e2) {
                this.f35016m = true;
                MethodCollector.o(6803);
                throw e2;
            }
        } else {
            MethodCollector.o(6803);
            return 0;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        MethodCollector.i(7468);
        a();
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.o(7468);
            throw indexOutOfBoundsException;
        } else if (i3 == 0) {
            MethodCollector.o(7468);
            return 0;
        } else {
            int i5 = this.f35014k - this.f35006c;
            if (i5 <= 0) {
                if (this.f35010g == 2) {
                    int a2 = a(bArr, i2, i3);
                    MethodCollector.o(7468);
                    return a2;
                }
                i5 = b(true);
                if (i5 < 0) {
                    MethodCollector.o(7468);
                    return -1;
                }
            }
            if (i5 < i3) {
                i3 = i5;
            }
            System.arraycopy(this.f35005b, this.f35006c, bArr, i2, i3);
            this.f35006c += i3;
            MethodCollector.o(7468);
            return i3;
        }
    }
}
